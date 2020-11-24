<template>
    <div>
        <h1>用户添加</h1>
        <form>
            姓名：<input v-model="user.name" type="text"><br>
            年龄：<input v-model="user.age" type="text"><br>
            工资：<input v-model="user.salary" type="text"><br>
            电话：<input v-model="user.phone" type="text"><br>
            <input type="button" @click="saveUser" value="添加">
        </form>
    </div>
</template>

<script>
export default {
    name: "UserAdd",
    data() {
        return {
            user: {}
        }
    },
    methods: {
        saveUser() {
            // console.log(this.user);
            //发送axios请求
            this.$http.post("http://localhost:8989/users/user/save", this.user).then((res) => {
                if(res.data.success)
                {
                    //添加成功，更新页面列表
                    //也就是将user/add切换到user
                    this.$router.push("/user");//切换路由
                    //清空user
                    this.user = {}
                }
                else
                {
                    alert("添加失败!"+res.data.msg)
                }
            })
        }
    },
}
</script>

<style scoped>

</style>
