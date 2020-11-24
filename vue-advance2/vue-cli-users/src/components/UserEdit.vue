<template>
    <div>
        <h1>用户修改</h1>
        <form>
            姓名：<input v-model="user.name" type="text"><br>
            年龄：<input v-model="user.age" type="text"><br>
            工资：<input v-model="user.salary" type="text"><br>
            电话：<input v-model="user.phone" type="text"><br>
            <input type="button" @click="saveUser" value="修改">
        </form>
    </div>
</template>

<script>
export default {
    name: "UserEdit",
    data() {
        return {
            user: {}
        }
    },
    methods: {
        findUser() {
            this.$http.get("http://localhost:8989/users/user/query?id=" + this.user.id).then((res) => {
                this.user =res.data;
            })
        },
        saveUser() {
            // console.log(this.user);
            //发送axios请求
            this.$http.post("http://localhost:8989/users/user/save", this.user).then((res) => {
                if(res.data.success)
                {
                    //修改成功，更新页面列表
                    //也就是将user/edit切换到user
                    this.$router.push("/user");//切换路由
                    //清空user
                    this.user = {}
                }
                else
                {
                    alert("修改失败!"+res.data.msg)
                }
            })
        }
    },
    created() {
        // console.log(this.$route.query.id);  //用于获取 ?id=3
        // console.log(this.$route.params.id);  用于获取 /3
        // 每次新建组件都会获取用户编号
        this.user.id = this.$route.query.id;
        // 每次新建组件都会发送查询用户请求，回写
        this.findUser();
    }
}
</script>

<style scoped>

</style>
