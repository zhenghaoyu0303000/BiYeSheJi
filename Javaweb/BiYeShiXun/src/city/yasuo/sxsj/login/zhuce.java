package city.yasuo.sxsj.login;

import city.yasuo.sxsj.dao.Link;
import city.yasuo.sxsj.util.search_user;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: [${project_name}]
 * @Package: [${package_name}.${file_name}]
 * @ClassName: [${type_name}]
 * @Description: [一句话描述该类的功能]
 * @Author: [${user}]
 * @CreateDate: [${date} ${time}]
 * @UpdateUser: [${user}]
 * @UpdateDate: [${date} ${time}]
 * @UpdateRemark: [说明本次修改内容]
 */
@WebServlet(name = "zhuce")
public class zhuce extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        boolean name;
        boolean pwd;
        String username = (String) request.getParameter("username");                    //拿到输入用户名
        String password = (String) request.getParameter("password");                    //拿到输入密码
        Link sql = new Link();                                                              //实例化对象Link
        List arry = new ArrayList();                                                        //声明集合
        arry = sql.Link("148.70.17.87","1433","LOL");                   //连接数据库
        search_user User = new search_user();                                               //实例化User对象
        name = User.search_user_ifnull((Statement)arry.get(0),username);                    //user是否为空
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("请重新提交注册");
    }
}
