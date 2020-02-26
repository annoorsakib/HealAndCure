
package HealAndCure;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DBconnect {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public DBconnect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/heal&cure","root","");
            st=con.createStatement();        
        }
        catch(Exception e)
        {
            System.out.println("Error: "+e);
            e.printStackTrace();
        }
    }
    public void insertIntoDoctor(ArrayList row)
    {
        try
        {
         String query="insert into Doctor(dname,dinfo,dpassword,demail,dcontact)values('"+row.get(0)+"','"+row.get(1)+"','"+row.get(2)+"','"+row.get(3)+"','"+row.get(4)+"');";
         System.out.println(query);
         st.executeUpdate(query);
         JOptionPane.showMessageDialog(null,"Doctor Info added successfully.");
         }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Insert into Doctor Exception: "+e);
            System.out.println(e);
        }
    }
    public ResultSet getResultDoctor()
    {
        try {
            String query="select dname,dinfo,demail,dcontact from doctor;";
            rs=st.executeQuery(query);
        } catch (Exception e) {
            System.out.println("error : "+e);
            e.printStackTrace();
        }
        return rs;
    }
    public ResultSet getPassword(String dname)
    {
        
        try{
            String query= "SELECT dname,dpassword FROM doctor where dname='"+dname+"'";
            rs =st.executeQuery(query);
        } catch (Exception e) {
            System.out.println("error : "+e);
            e.getMessage();
        }
        return rs;
    }
    public void updateDoctor(ArrayList row)
    {
        try
        {
            String query="UPDATE doctor SET dinfo='"+row.get(1)+"' ,demail='"+row.get(2)+"' ,dcontact='"+row.get(3)+"' WHERE dname='"+row.get(0)+"'";
            System.out.println(query);
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Doctor Info updated Successfully.");
        }
        catch(Exception e)
        {
            System.out.println("error : "+e);
            e.getMessage();
        }
    }
     public void updatePassword(ArrayList row)
    {
        try
        {
            String query="UPDATE doctor SET dpassword='"+row.get(1)+"' WHERE dname='"+row.get(0)+"'";
            System.out.println(query);
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Password changed");
        }
        catch(Exception e)
        {
            System.out.println("error : "+e);
            e.getMessage();
        }
    }

}




