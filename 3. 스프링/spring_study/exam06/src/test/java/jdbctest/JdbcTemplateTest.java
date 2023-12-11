package jdbctest;

import config.AppCtx;
import models.member.Member;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppCtx.class)
public class JdbcTemplateTest {
    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    @DisplayName("DataSource를 통한 DB 연결 테스트")
    void connectionTest() {
        try (Connection conn = dataSource.getConnection()){
            System.out.println(conn);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("insert 테스트")
    void insertTest() {
        String sql = "insert into member (user_no, user_id, user_pw, user_name, email)" +
                "values (seq_member.nextval, ?, ?,?,?)";
        int affectedRows = jdbcTemplate.update(sql, "user99","123456","사용자100", "user99@test.org");

        System.out.println(affectedRows);
    }

    @Test
    @DisplayName("목록 출력 테스트")
    void selectTest() {
        String sql = "select * from member";
        List<Member> members = jdbcTemplate.query(sql, this::mapper);
        for(Member member : members){
            System.out.println(member);
        }
    }

    private Member mapper(ResultSet rs, int i) throws SQLException {
        return Member.builder()
                .userNo(rs.getLong("user_no"))
                .userId(rs.getString("user_id"))
                .userPw(rs.getString("user_pw"))
                .userName(rs.getString("user_name"))
                .email(rs.getString("email"))
                .regDt(rs.getTimestamp("reg_dt").toLocalDateTime())
                .build();
    }
}
