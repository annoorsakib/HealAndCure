
package HealAndCure;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PatientDBConnect {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public PatientDBConnect(){
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
     public void insertIntoPatient(ArrayList row)
    {
        try
        {
         String query="insert into Patient(docname,pid,pname,page,psex,pcontact)values('"+ row.get(0)+"' ,"
                + row.get(1)+" ,'"+row.get(2)+"', "+row.get(3)+" ,'"+row.get(4)+"' ,'"+row.get(5)+"')";
         System.out.println(query);
         st.executeUpdate(query);
         JOptionPane.showMessageDialog(null,"Patient Info added successfully.");
         }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Insert into Patient Exception: "+e);
            System.out.println(e);
        }
    } 
    public ResultSet getResultPatient(String dname)
    {
        try {
            String query="select * from Patient where docname='"+dname+"'";
            rs=st.executeQuery(query);
        } catch (Exception e) {
            System.out.println("error : "+e);
            e.printStackTrace();
        }
        return rs;
    }  
    public ResultSet getResultSetBySearch(String pid,String dname)
    {
        try{
            
            String query="select * from patient where pid ="+pid+" and docname='"+dname+"'";
            rs=st.executeQuery(query);
            
           
        } catch (Exception e) {
            System.out.println("error : "+e);
            e.printStackTrace();
        }
        return rs;
    }
    public void deletePatient(ArrayList row)
    {
        try
        {
            String query="Delete from patient where pid="+row.get(0)+" and docname='"+row.get(1)+"'";
            st.executeUpdate(query);
        }
        catch(Exception e)
        {
            System.out.println("error : "+e);
            e.printStackTrace();
        }
        
    }
    public void updatePatient(ArrayList row)
    {
        try
        {
            String query="UPDATE patient SET pname='"+row.get(2)+"', page="+row.get(3)+", psex='"+row.get(4)+"', pcontact='"+row.get(5)+"' WHERE pid="+row.get(0)+" and docname='"+row.get(1)+"'";
            System.out.println(query);
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Patient Info updated Successfully.");
        }
        catch(Exception e)
        {
            System.out.println("error : "+e);
            e.printStackTrace();
        }
    }
}
