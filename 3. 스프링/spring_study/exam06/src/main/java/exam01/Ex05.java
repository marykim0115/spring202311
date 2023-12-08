package exam01;

import java.sql.*;
import java.time.LocalDateTime;

public class Ex05 {
    public static void main(String[] args) throws ClassNotFoundException{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String username = "SPRING6";
        String password = "_aA123456";

        String sql = "select * from member";

        try(Connection conn = DriverManager.getConnection(url, username, password);
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                long userNo = rs.getLong("user_no");
                String userId = rs.getString("user_id");
                String userName = rs.getString("user_name");
                LocalDateTime refDt = rs.getTimestamp("reg_dt").toLocalDateTime();
                String email = rs.getString("email");

                System.out.printf("userNo=%d, userId=%s, userName=%s, regDt=%s, email=%s%n",
                        userNo, userId, userName, refDt, email);
            }


        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
