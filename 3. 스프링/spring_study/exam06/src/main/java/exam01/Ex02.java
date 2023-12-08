package exam01;

import java.sql.*;

public class Ex02 {
    public static void main(String[] args) throws ClassNotFoundException{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String username = "SPRING6";
        String password = "_aA123456";

        try(Connection conn = DriverManager.getConnection(url,username, password);
            Statement stmt = conn.createStatement()) {

            String userId = "USER01";

            String sql = "insert into member (user_no, user_id, user_pw, user_name, email)" +
                    "values(seq_member.nextval, '" + userId + "','123456','사용자1','user01@test.org')";

            int result = stmt.executeUpdate(sql);
            System.out.println(result);

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
