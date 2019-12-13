/*
 * @Author: your name
 * @Date: 2019-11-26 15:08:54
 * @LastEditTime: 2019-12-13 16:55:00
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \前端\js\login.js
 */
window.onresize = function() {//窗口变化
    updatebgc();
}


// 表单验证
function isuser() {
    var name = $('.input_user')[0].value;
    var rex_pwd = /.{8,20}/;
    rex_pwd.test(name);
    //动画定格
    console.log(name != "");
    if(name != ""){
        $('.label_input_user')[0].style.transform = "translate3d(0,-40%,0)";
        $('.label_input_user')[0].style.fontWeight = "bolder";
        $('.label_input_user')[0].style.fontSize = "1.2rem";
    }
}
function ispwd() {
    var pwd = $('.input_pwd')[0].value;
    var rex_user = /[a-zA-Z]+([0-9a-zA-Z]){5,11}/;
    rex_user.test(pwd);
    //动画定格
    if(pwd != ""){
        $('.pwd')[0].style.transform = "translate3d(0,-40%,0)";
        $('.pwd')[0].style.fontWeight = "bolder";
        $('.pwd')[0].style.fontSize = "1.2rem";
    }
}
// onSubmit 表单提交事件
// (window.onload = function () {
// }
// )()
