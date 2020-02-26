
package HealAndCure;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DrugDBConnect {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public DrugDBConnect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Heal&Cure","root","");
            st=con.createStatement();        
        }
        catch(Exception e)
        {
            System.out.println("Error: "+e);
            e.printStackTrace();
        }
    }
    public void insertIntoDrug(ArrayList row)
    {
        try
        {
         String query="insert into Drug(drugname,drugdose,drugadvice,duration)values('"+
                 row.get(0)+"','"+row.get(1)+"','"+row.get(2)+"','"+row.get(3)+"');";
         System.out.println(query);
         st.executeUpdate(query);
         JOptionPane.showMessageDialog(null,"Drug added successfully.");
         }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Insert into Drug Exception: "+e);
            System.out.println(e);
        }
    } 
    public ResultSet getDrug()
    {
        try {
            String query="select drugname,drugdose,drugadvice,duration from Drug;";
            rs=st.executeQuery(query);
        } catch (Exception e) {
            System.out.println("error : "+e);
            e.printStackTrace();
        }
        return rs;
    }
    public void deleteDrug(ArrayList row)
    {
        try
        {
            String query="Delete from drug where drugname='"+row.get(0)+"'";
            st.executeUpdate(query);
        }
        catch(Exception e)
        {
            System.out.println("error : "+e);
            e.printStackTrace();
        }
        
    }
}
