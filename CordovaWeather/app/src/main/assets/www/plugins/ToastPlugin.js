cordova.define("cordova-plugin-toast.ToastPlugin", function(require, exports, module) {
var exec = require('cordova/exec');
var myFunc = function(){};

// arg1：成功回调
// arg2：失败回调
// arg3：服务标识，在xml/config.xml中配置的feature name
// arg4：调用的原生方法的动作，即插件的action
// arg5：参数，json array格式

// 显示正在操作的toast
myFunc.prototype.showShortToast=function(success, error, msg) {
     exec(success, error, "ToastPlugin", "showShortToast", [msg]);
};

// 显示正在操作的toast
myFunc.prototype.showLoadingToast=function(success, error) {
    exec(success, error, "ToastPlugin", "showLoadingToast", []);
};

module.exports = new myFunc();
});