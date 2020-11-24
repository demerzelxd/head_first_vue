<template>
    <div>
        <h1>用户模块User</h1>
        <table border="1">
            <tr>
                <th>id</th>
                <th>name</th>
                <th>age</th>
                <th>salary</th>
                <th>操作</th>
            </tr>
            <tr v-for="user in users" :key="user.id">
                <td>{{ user.id }}</td>
                <td>{{ user.name }}</td>
                <td>{{ user.age }}</td>
                <td>{{ user.salary }}</td>
                <td><a href="">删除</a><a href="">修改</a></td>
            </tr>
        </table>
        <Footer></Footer>
    </div>
</template>

<script>
import Footer from "./Footer";

export default {
    name: "User",
    data() {
        return {
            users: [
                {id: 1, name: "dada", age: 23, salary: 3400},
                {id: 2, name: "gaga", age: 23, salary: 3400},
                {id: 3, name: "papa", age: 23, salary: 3400},
            ]
        }
    },
    components: {
        Footer,
    },
    created() {
        //发axios请求获取users
    }
}
</script>

<style scoped>

</style>
