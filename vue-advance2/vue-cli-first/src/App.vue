<template>
    <div id="app">
        <!--    <img src="./assets/logo.png">-->
        <!--有router-view，会根据router下index.js的路由规则展示/根路径下的路由，路由到HelloWorld.vue组件-->
        <a href="#/home">主页模块</a>
        <a href="#/user">用户模块</a>
        <a href="#/student">学生模块</a>
        <router-view/>
        <!--    <h1 class="aa">欢迎：{{msg}}</h1>-->
    </div>
</template>

<script>
export default {  //es6语法，暴露当前组件对象App
    name: 'App',
    // data() {
    //   return {
    //     msg: "dada"
    //   }
    // }
}
</script>

<style>
.aa {
    background-color: aquamarine;
}
</style>
