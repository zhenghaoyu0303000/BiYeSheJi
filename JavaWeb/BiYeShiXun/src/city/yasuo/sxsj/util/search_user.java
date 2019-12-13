package city.yasuo.sxsj.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @ProjectName: [BiYeShiXun]
 * @Package: [city.yasuo.sxsj.util.search_user]
 * @ClassName: [Bingyantang]
 * @Description: [查询用户名称及密码]
 * @Author: [Bingyantang]
 * @CreateDate: [2019.12.8 11.36]
 * @UpdateUser: [Bingyantang]
 * @UpdateDate: [2019.12.8 11.36]
 * @UpdateRemark: [说明本次修改内容]
 */
public class search_user {

    // 创建表
//            System.out.println("开始创建表");
//            String query = "create table TABLE1(ID NCHAR(2),NAME NCHAR(10))";// 创建表SQL语句
//            stmt.executeUpdate(query);// 执行SQL命令对象
//            System.out.println("表创建成功");

    // 输入数据
//            System.out.println("开始插入数据");
//            String a1 = "INSERT INTO users VALUES('12','233')";// 插入数据SQL语句
//            stmt.executeUpdate(a1);// 执行SQL命令对象
//            stmt.executeUpdate(a2);
//            stmt.executeUpdate(a3);
//        System.out.println("插入数据成功");
    public boolean search_user_ifnull(Statement stmt,String username){
        // 读取数据
        System.out.println("开始读取数据");
        boolean bool = false;
        try {
            ResultSet rs = null;
            rs = stmt.executeQuery("select * from users where name = '" + username +"'");
//            while (rs.next()){
//                System.out.println("输出1");
//                System.out.println(rs.getString(1));//ID
//                System.out.println("输出2");
//                System.out.println(rs.getString(2));//num
//                System.out.println("输出3");
//                System.out.println(rs.getString(3));//password
//                System.out.println("输出username");
//                System.out.println(rs.getString("username"));
//            }
            while (rs.next()){
                System.out.println(rs.getString(3));
            }
            if (rs != null){
                bool = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bool;
    }
    public boolean Search_user_password(Statement stmt,String username,String password){
        boolean bool = false;
        try {
            ResultSet rs = null;
            String pwd = null;
            rs = stmt.executeQuery("select * from users where name = '" + username +"'");
            while(rs.next()){
                 pwd = rs.getString(3);
            }
            if (password.equals(pwd)){
                System.out.println("登陆成功");
                bool = true;
            }else{
                System.out.println("密码错误");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bool;
    }
}
