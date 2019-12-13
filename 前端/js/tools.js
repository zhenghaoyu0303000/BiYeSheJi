/*
 * @Author: 冰彦糖
 * @Date: 2019-11-27 10:22:39
 * @LastEditTime: 2019-12-12 19:56:27
 * @LastEditors: Please set LastEditors
 * @Description: tools
 * @FilePath: \前端\js\tools.js
 */
function updatebgc() {
    if (window.innerHeight < screen.height * 1) {
        $(".main")[0].style.height = screen.height/10 + "rem";
    } else {
        $(".main")[0].style.height = window.innerHeight/10 + "rem";//window.innerHeight
    }
    // if (document.documentElement.clientWidth < screen.width * 0.9) {
    //     $(".main")[0].style.width = screen.width/10 + "rem";
    // } else {
    //     $(".main")[0].style.width = document.documentElement.clientWidth/10 + "rem";
    // }
}