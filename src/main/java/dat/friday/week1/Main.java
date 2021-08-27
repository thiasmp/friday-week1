package dat.friday.week1;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.*;
import org.eclipse.persistence.config.PersistenceUnitProperties;

public class Main {

    public static ArrayList<String> getAllUserNames() throws SQLException {
        ArrayList<String> FName = new ArrayList<>();
        try {
            Connection con = DBconnector.connection();
            String SQL = "SELECT fname FROM usertable";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String name = rs.getString("fname");
               
                FName.add(name);    
            }
            return FName;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return FName;
    }

    static User getUserDetails(int id) throws SQLException {
          User user = null;
        try {
            Connection con = DBconnector.connection();
            String SQL = "SELECT * FROM usertable WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next())  {
            user = new User(rs.getInt("id"), rs.getString("fname"),rs.getString("lname"), rs.getString("pw"), rs.getString("phone"), rs.getString("address"));
            
            }
                
            }
            

         catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
    }


