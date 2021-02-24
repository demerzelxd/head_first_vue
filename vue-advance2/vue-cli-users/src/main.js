// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
// 引入axios
import axios from 'axios'
// 引入vuex
import store from './store'

// 配置axios，将axios改写为vue的原型属性，替换掉$http
// 这样用this.$http.get()就能发axios请求了
Vue.prototype.$http = axios
Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
    el: '#app',
    router,
    components: {App},
    template: '<App/>',
    store,  // 注册vuex状态管理
})
