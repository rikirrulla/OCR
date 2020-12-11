/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektiocr;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class ConnectionDB {

    Connection con = null;

    public Connection getConnection() {

        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/list", "root", "");
//            JOptionPane.showMessageDialog(null, "opp");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(OcrGui.class.getName()).log(Level.SEVERE, null, ex);
            return null;

        }

    }

    public static java.sql.Connection ConnecrDb() throws SQLException {
        try {

            java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/list", "root", "");
            return conn;
        } catch (Exception e) {

        }
        return null;
    }

}
