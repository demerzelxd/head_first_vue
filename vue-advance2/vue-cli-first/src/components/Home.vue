<template>
    <div>
        <h1>主页模块Home</h1>
        <div style="width: 100%;height: 300px;background-color: red">
            内容
        </div>
        <!--    使用Footer组件-->
        <Footer></Footer>
    </div>
</template>

<script>
//声明引用Footer组件
import Footer from "./Footer";

export default {
    name: "Home",
    components: {
        Footer,//注册Footer组件，主页就能用了
    }
}
</script>

<style scoped>

</style>
