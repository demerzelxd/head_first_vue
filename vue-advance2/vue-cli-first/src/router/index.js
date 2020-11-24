import Vue from 'vue'
import Router from 'vue-router'
import Home from "../components/Home";
import User from "../components/User";
import Student from "../components/Student";

Vue.use(Router)
//配置路由
export default new Router({
    routes: [
        //默认组件
        {path: '/', redirect: '/home'},
        {path: '/home', name: 'Home', component: Home},
        {path: '/user', name: 'User', component: User},
        {path: '/student', name: 'Student', component: Student},
    ]
})
