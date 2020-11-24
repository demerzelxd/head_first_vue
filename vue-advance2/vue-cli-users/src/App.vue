<template>
    <div>
        <router-link to="/home" tag="button">主页</router-link>
        <router-link to="/user" tag="button">用户管理</router-link>
        <router-link to="/student" tag="button">学生管理</router-link>
        <router-view/>
    </div>
</template>

<script>
export default {
    name: 'App'
}
</script>

<style>

</style>
