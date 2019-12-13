package city.yasuo.sxsj.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import city.yasuo.sxsj.dao.Link;
import city.yasuo.sxsj.util.*;

@javax.servlet.annotation.WebServlet(name = "login",urlPatterns = "/login")
public class login extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        boolean name;
        boolean pwd;
//        connect sql = new connect();                                                      //新疆connect数据库连接中间间
//        sql.connect();                                                                    //数据库连接并操作
        String username = (String) request.getParameter("username");                    //拿到输入用户名
        String password = (String) request.getParameter("password");                    //拿到输入密码
        Link sql = new Link();                                                              //实例化对象Link
        List arry = new ArrayList();                                                        //声明集合
        sql.LinkDrive();                                                                    //加载驱动
        arry = sql.Link("148.70.17.87","1433","LOL");                   //连接数据库
        search_user User = new search_user();                                               //实例化User对象
        name = User.search_user_ifnull((Statement)arry.get(0),username);                    //user是否为空
        pwd = User.Search_user_password((Statement)arry.get(0),username,password);          //判断密码
        sql.closs((Statement)arry.get(0), (Connection)arry.get(1));                         //关闭数据库连接

        if (name == true) {
            out.print("user:" + username);
            out.print("<br>");
            if (pwd == true) {
                out.print("password:" + password);
            } else {
                out.print("密码错误");
            }
        } else {
            out.print("用户名不存在");
        }
    }
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("请重新提交登陆");
    }
}
