package ch20.oracle.sec09.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserSelectExam {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.OracleDriver");

            conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/xe",
                    "hr",
                    "12345"
            );

            String sql = "" +
                    "SELECT employee_id, first_name " +
                    "FROM employees " +
                    "WHERE first_name=?";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "David");

            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {                        //1개의 데이터 행을 가져왔을 경우
                User user = new User();
                user.setRegionId(rs.getString("employee_id"));
                user.setRegionName(rs.getString("first_name"));

                System.out.println(user);
//            } else {
//                System.out.println("오류");
            }
            rs.close();

            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(conn != null) {
                try {
                    //연결 끊기
                    conn.close();
                } catch (SQLException e) {}
            }
        }
    }
}
