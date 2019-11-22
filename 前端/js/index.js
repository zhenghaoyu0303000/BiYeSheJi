/*
 * @Author: 冰彦糖
 * @Date: 2019-11-22 09:15:49
 * @LastEditTime: 2019-11-22 11:55:30
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \前端\js\index.js
 */
(window.onload = function() {
    var img_arr = new this.Array;
    // var img_tag = document.getElementsByClassName("main");
    var rand = Math.floor(Math.random() * 10);
    $(".main").css("backgroundImage","url(/image/index/"+ rand + ".jpg)");
})()