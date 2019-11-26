/*
 * @Author: 冰彦糖
 * @Date: 2019-11-22 09:15:49
 * @LastEditTime: 2019-11-26 14:48:34
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \前端\js\index.js
 */
//const
(window.onload = function() {
    yiyan();
    this.bgc();
})()
$(".main")[0].style.height = document.documentElement.clientHeight + "px";
window.onresize = function() {//窗口变化
    updatebgc();
}
function bgc() {
    var img_arr = new this.Array;
    var rand = Math.floor(Math.random() * 10);
    $(".main").css("backgroundImage","url(image/index/"+ rand + ".jpg)");
}
function updatebgc() {
    if (document.documentElement.clientHeight < screen.height * 0.9) {
        $(".main")[0].style.height = screen.height/10 + "rem";
    } else {
        $(".main")[0].style.height = document.documentElement.clientHeight/10 + "rem";
    }
    // if (document.documentElement.clientWidth < screen.width * 0.9) {
    //     $(".main")[0].style.width = screen.width/10 + "rem";
    // } else {
    //     $(".main")[0].style.width = document.documentElement.clientWidth/10 + "rem";
    // }
}
function yiyan() {
    fetch('https://v1.hitokoto.cn')
    .then(function (res){
        return res.json();
    })
    .then(function (data) {
        $("#yiyan")[0].innerText = data.hitokoto; 
    })
    .catch(function (err) {
        console.error(err);
    })
}