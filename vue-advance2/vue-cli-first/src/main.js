// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'  //在页面中引入vue.js
import App from './App' //引入自定义组件App.vue，一个.vue就是一个组件
import router from './router' //引入自定义的vue router实例

Vue.config.productionTip = false

/* eslint-disable no-new */
// main.js是一个入口，并没有const app = new Vue()
// 这样就把Vue实例保护起来了，暴露出来App，相当于App.vue作为一个入口，也就是主应用组件
new Vue({  //Vue全局实例
    el: '#app',  //绑定Vue实例的全局作用范围
    router,    //注册路由对象
    components: {App},  //注册App组件
    template: '<App/>'  //其实就类似于在div中展示<App></App>组件
})
