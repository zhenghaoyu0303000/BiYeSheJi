//package city.yasuo.sxsj.util;
//
//import city.yasuo.sxsj.dao.Link;
//import java.sql.Connection;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @ProjectName: [BiYeShiXun]
// * @Package: [city.ysauo.sxsj.util.connect_sqlserver]
// * @ClassName: [Bingyantang]
// * @Description: [连接数据库中间件]
// * @Author: [Bingyantang]
// * @CreateDate: [2019.12.8 10.06]
// * @UpdateUser: [Bingyantang]
// * @UpdateDate: [2019.12.8 10.06]
// * @UpdateRemark: [说明本次修改内容]
// */
//public class connect {
//    public static void connect(){
//        String password = "";
//        public void getpassword(pwd){
//            this.pwd = password;
//        }
//        Link sql = new Link();
//        sql.LinkDrive();
//        List arry = new ArrayList();
//        arry = sql.Link("148.70.17.87","1433","LOL");
//        search_user User = new search_user();
//        System.out.println(User.search_user_ifnull((Statement)arry.get(0)));
//        User.Search_user_password((Statement)arry.get(0),password);
//        sql.chaxun((Statement)arry.get(0));
//        sql.closs((Statement)arry.get(0), (Connection)arry.get(1));
//    }
//}
