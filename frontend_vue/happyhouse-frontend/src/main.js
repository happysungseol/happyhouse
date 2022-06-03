import Vue from "vue";
import App from "./App.vue";
import router from "./router";
import store from "./store";
import VueCookies from "vue-cookies";

import { BootstrapVue, IconsPlugin } from "bootstrap-vue";

// Import Bootstrap and BootstrapVue CSS files (order is important)
import "bootstrap/dist/css/bootstrap.css";
import "bootstrap-vue/dist/bootstrap-vue.css";

// Make BootstrapVue available throughout your project
Vue.use(BootstrapVue);
// Optionally install the BootstrapVue icon components plugin
Vue.use(IconsPlugin);
Vue.use(VueCookies);
Vue.config.productionTip = false;
window.Kakao.init("929551aadfc7f7f042a99f58cbd97041");
new Vue({
  router,
  store,
  render: (h) => h(App),
}).$mount("#app");
