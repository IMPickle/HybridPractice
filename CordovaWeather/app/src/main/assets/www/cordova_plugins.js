cordova.define('cordova/plugin_list', function(require, exports, module) {
// module.exports = [];
module.exports = [
    {
        "file": "plugins/ActivityPlugin.js",
        "id": "cordova-plugin-activity.ActivityPlugin",
        "clobbers": [
            "activityPlugin.activity"
        ]
    },
    {
        "file": "plugins/ToastPlugin.js",
        "id": "cordova-plugin-toast.ToastPlugin",
        "clobbers": [
            "toastPlugin.toast"
        ]
    }
];

module.exports.metadata = 
// TOP OF METADATA
{
    "cordova-plugin-whitelist": "1.2.2",
    "cordova-plugin-crosswalk-webview": "1.6.1",
    "cordova-plugin-activity": "0.0.1",
    "cordova-plugin-toast": "0.0.1"
};
// BOTTOM OF METADATA
});