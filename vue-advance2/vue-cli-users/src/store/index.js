import Vue from 'vue'  // 引入vue
import Vuex from 'vuex'  // 引入vuex

Vue.use(Vuex);

// 创建store对象
const store = new Vuex.Store({
    // state属性用来全局管理共享数据
    state: {
        count: 1,
        username: "dada"
    },
    // mutations用来书写对共享数据的修改方法
    mutations: {
        changeUsername(state) {
            state.username = "gaga"
        },
        changeUsernameDefine(state, name) {
            state.username = name
        }
    },
    // getters用来对共享数据计算属性，相当于computed
    getters: {
        incrCount(state) {
            // 调用计算方法
            console.log("vue执行getters");
            return state.count * 2;
        }
    }
});
// 暴露store对象
export default store;
