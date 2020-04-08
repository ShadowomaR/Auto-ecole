
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OMAR
 */
public class ConBD {
    public static Color color;
    public ConBD(){}
    public static final Connection getConnection(){
        Connection con = null;        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/autoecole?autoReconnect=true&useSSL=false","root","");              
            load_param();
        } catch (SQLException ex) {  
            JOptionPane.showMessageDialog(null,"ERREU des connextion avec la base de donner");
        }
        return con;
    }
    public static final void load_param(){
        color=Color.MAGENTA;
    }
}
