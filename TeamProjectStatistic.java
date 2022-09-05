import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TeamProjectStatistic {
    public TeamProjectStatistic(Statement stmt) {
    }

    public String StatisticFunction() throws SQLException{
        
        final String USER = "root";
        final String PASS = "tbrs00002b";
        final String DB_URL = "jdbc:mysql://localhost/iphones_datebase";
                
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement(); 
        

        return null;
    }

}