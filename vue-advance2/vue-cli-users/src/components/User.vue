<template>
    <div>
        <h1>用户列表</h1>
        <table border="1">
            <tr>
                <th>编号</th>
                <th>姓名</th>
                <th>年龄</th>
                <th>工资</th>
                <th>电话</th>
                <th>操作</th>
            </tr>
            <tr v-for="user in users" :key="user.id">
                <td>{{ user.id }}</td>
                <td>{{ user.name }}</td>
                <td>{{ user.age }}</td>
                <td>{{ user.salary }}</td>
                <td>{{ user.phone }}</td>
                <td>
<!--                    把id传到修改模块-->
                    <a :href="'#/user/edit?id='+user.id">修改</a>
                    <a href="" @click.prevent="deleteUser(user.id)">删除</a>
                </td>
            </tr>
        </table>
        <!--        直接点添加就切换路由，会很突兀，所以把添加作为一个子路由-->
        <a href="#/user/add">添加</a>
        <router-view></router-view>
    </div>
</template>

<script>
export default {
    name: "User",
    data() {
        return {
            users: [
                // {id: 1, name: "dada", age: 23, salary: 2300, phone: "11111111111"},
                // {id: 2, name: "gaga", age: 19, salary: 4500, phone: "22222222222"},
                // {id: 3, name: "nana", age: 45, salary: 1388, phone: "33333333333"},
            ]
        }
    },
    methods: {
        findAll() {
            this.$http.get("http://localhost:8989/users/user/findAll")
                .then((res) => {
                    //使用=>时，this就是vue的this，不需要引入_this了
                    this.users = res.data;
                })
        },
        deleteUser(id) {
            if (window.confirm("确定要删除这条记录？")) {
                this.$http.get("http://localhost:8989/users/user/delete?id=" + id).then((res) => {
                    if (res.data.success) {
                        this.findAll();
                    } else {
                        alert(res.data.msg)
                    }
                })
            }
        }
    },
    components: {},
    watch: {
        //监听路由的变化，从user/add到user需要再发送一次查询所有，更新数据
        //router用来操作路由，跳转等。route用来获取路由信息，获取path等
        $route: {
            handler: function (val, oldVal) {
                if (val.path === "/user") {
                    //再执行一次查询
                    this.findAll();
                }
            },
            //深度观察监听
            deep: true
        }
    },
    created() {
        this.findAll();
    }
}
</script>

<style scoped>

</style>
