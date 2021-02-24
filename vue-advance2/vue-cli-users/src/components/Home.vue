<template>
    <div>
        <h1>欢迎进入我们的网站!</h1>
        <!--methods调用需要写括号calCount()-->
        <!--<h3>总数：{{calCount()}}</h3>-->
        <!--<h3>总数：{{calCount()}}</h3>-->
        <!--<h3>总数：{{calCount()}}</h3>-->
        <!--<h3>总数：{{calCount()}}</h3>-->
        <!--<h3>总数：{{calCount()}}</h3>-->
        <!--<h3>总数：{{calCount()}}</h3>-->

        <!--computed调用不需要写括号-->
        <h3>总数：{{calCount}}</h3>
        <h3>总数：{{calCount}}</h3>
        <h3>总数：{{calCount}}</h3>
        <h3>总数：{{calCount}}</h3>
        <h3>总数：{{calCount}}</h3>
        <h3>总数：{{calCount}}</h3>

        <!--vuex值获取-->
        <h3>用户名：{{this.$store.state.username}}</h3>
        <h3>Vuex的count：{{this.$store.getters.incrCount}}</h3>
        <h3>Vuex的count：{{this.$store.getters.incrCount}}</h3>
        <input type="button" value="点我修改共享数据username" @click="myChange">
        <input type="button" value="点我修改共享数据username为指定值" @click="myChangeDefine('nana')">
    </div>
</template>

<script>
export default {
    name: "Home",
    methods: {
        // calCount() {
        //     // methods计算，会调用多次计算方法，而computed可以将计算结果缓存
        //     console.log("执行计算方法");
        //     return 1;
        // }

        // vuex的mutation方法
        myChange() {
            // 调用changeUsername修改共享数据
            this.$store.commit('changeUsername');
        },
        myChangeDefine(name) {
            this.$store.commit('changeUsernameDefine', name);
        }
    },
    computed: {
        // 计算属性，用来书写计算相关方法
        calCount() {
            // methods计算，会调用多次计算方法，而computed可以将计算结果缓存
            console.log("执行计算方法");
            return 1;
        }
    }
}
</script>

<style scoped>

</style>
