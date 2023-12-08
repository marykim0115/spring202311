package exam01;

import java.sql.*;

public class Ex04 {
    public static void main(String[] args) throws ClassNotFoundException{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String username = "SPRING6";
        String password = "_aA123456";

        String sql = "insert into member(user_no, user_id, user_pw, user_name, email) " +
                "values (seq_member.nextval, ?, ?, ?, ?)";

        try(Connection conn = DriverManager.getConnection(url, username, password);
            PreparedStatement pstmt = conn.prepareStatement(sql, new String[] {"user_no"})) {

            pstmt.setString(1,"USER04");
            pstmt.setString(2,"123456");
            pstmt.setString(3,"사용자04");
            pstmt.setString(4,"user02@test.org");

            int result = pstmt.executeUpdate();

            ResultSet rs = pstmt.getGeneratedKeys();
            if(rs.next()){
                long userNo = rs.getLong(1);
                System.out.printf("user_no : %d%n", userNo);
            }


        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
