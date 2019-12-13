package city.yasuo.sxsj.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: [BiYeShiXun]
 * @Package: [city.ysauo.sxsj.dao]
 * @ClassName: [Bingyantang]
 * @Description: [连接数据库]
 * @Author: [Bingyantang]
 * @CreateDate: [2019.12.8 10.06]
 * @UpdateUser: [Bingyantang]
 * @UpdateDate: [2019.12.8 10.06]
 * @UpdateRemark: [说明本次修改内容]
 */
public class Link {
//    public static void main(String[] args) {
    String JDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";// SQL数据库引擎
//    String dizhi = "148.70.17.87";
//    String port = "1433";
//    String DBname = "LOL";
    public static void LinkDrive(){
        /**
         * @FunctionName: LinkDrive
         * @Description: 连接数据库驱动
         * @author: Bingyantang
         * @date:
         */
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");// 加载数据库引擎，返回给定字符串名的类
        } catch (ClassNotFoundException e) {
//             e.printStackTrace();
            System.out.println("加载数据库引擎失败");
            System.exit(0);
        }
        System.out.println("数据库驱动成功");
    }
     public List Link(String dizhi, String port, String DBname){
        /**
         * @FunctionName:Link
         * @Description: 拼接连接地址字符串
         * @author: Bingyantang
         * @date:  
         * @Param: String dizhi 地址
         * @Param: String port 端口
         * @Param: String DBname 数据库名称
         * @Return: 连接地址字符串
         */
         String connectDB = "jdbc:sqlserver://"+ dizhi +":"+ port +";DatabaseName="+ DBname;// 数据源
         try {
             String user = "Jinx";
             String password = "Jinx16521";
             Connection con = DriverManager.getConnection(connectDB, user, password);// 连接数据库对象
             System.out.println("连接数据库成功");
             Statement stmt = con.createStatement();// 创建SQL命令对象
             List arry = new ArrayList();
             arry.add(stmt);
             arry.add(con);
             return arry;
         } catch (SQLException e) {
             e.printStackTrace();
             System.out.println("数据库连接错误");
             System.exit(0);
         }
         return null;
     }
        public void chaxun(Statement stmt){
            // 读取数据
            System.out.println("开始读取数据");
            try {
                ResultSet rs = null;// 返回SQL语句查询结果集(集合)
                rs = stmt.executeQuery("SELECT * FROM users");
            // 循环输出每一条记录
            while (rs.next()) {
                // 输出每个字段
                System.out.println(rs.getString("num")+ "\t" +rs.getString("name") + "\t" + rs.getString("password"));
            }
            System.out.println("读取完毕");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    public void closs(Statement stmt,Connection con){
        /**
         * @FunctionName: closs
         * @Description: 关闭数据库
         * @author: Bingyantang
         * @date:
         * @Param: Statement stmt 命令对象
         * @Param: Connection con   数据库连接
         */
            // 关闭连接
        try {
            stmt.close();// 关闭命令对象连接
            con.close();// 关闭数据库连接
        } catch (SQLException e) {
            System.out.println("数据连接异常，关闭失败");
            e.printStackTrace();
        }
    }
//    }
}
