package dat.friday.week1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnector {
    private static String URL = "jdbc:mysql://127.0.0.1:3306/startcode?serverTimezone=Europe/Rome";
    private static String USER = "dev";
    private static String PW = "ax2";
    
    private static Connection singleton;

    public static void setConnection( Connection con ) {
        singleton = con;
    }

    public static Connection connection() throws ClassNotFoundException, SQLException {
        if ( singleton == null ) {
            Class.forName( "com.mysql.cj.jdbc.Driver" );
            singleton = DriverManager.getConnection( URL, USER, PW );
        }
        return singleton;
    }
    
}

