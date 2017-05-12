cordova.define("cordova-plugin-activity.ActivityPlugin", function(require, exports, module) {
var exec = require('cordova/exec');
var myFunc = function(){};

// arg1：成功回调
// arg2：失败回调
// arg3：服务标识，在xml/config.xml中配置的feature name
// arg4：调用的原生方法的动作，即插件的action
// arg5：参数，json array格式

// 启动一个新的Activity
myFunc.prototype.startNewActivity=function(success, error, activityClazz) {
    exec(success, error, "ActivityPlugin", "startNewActivity", [activityClazz]);
};

// 启动/跳转到MainActivity
myFunc.prototype.gotoMainActivity=function(success, error) {
    exec(success, error, "ActivityPlugin", "gotoMainActivity", []);
};

module.exports = new myFunc();
});
