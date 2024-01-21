
package onlinevoting;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class sqlcon {
    private Connection con;
    private Statement st;
    private ResultSet rs;
 //<----SQLCONNECTIONS   
    sqlcon(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinevoting","root","root");
            st=con.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    //<-----SEARCH_VOTE
    public ResultSet search(String search){
 
   String sql="select * from personal_info where NID='"+search+"'";
   try{
   rs=st.executeQuery(sql);
   }catch(Exception e){
   System.out.println(e);
   }
   return rs;   
     
 }

    public ResultSet login_vote(int NID, int year){
        
        try {
            String query="select * from personal_info where NID='"+NID+"' and Birth_Year='"+year+"' and Vote='yes' ";
            rs=st.executeQuery(query);
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }
    
    
    //<-----VOTE_DETAILS
    public ResultSet get_per(int id){
        
        try {
            String q="select * from personal_info where NID="+id;
            rs=st.executeQuery(q);
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }
    
    
    //<------VOTE
    public void vote(int field1, String name, String fname, int year, String city, String group){
    
        try {
            String q ="insert into voting(NID, Name, F_Name, DBO, City, Party_Vote, Done) VALUES ('"+field1+"','"+name+"','"+fname+"','"+year+"','"+city+"','"+group+"','done')";
            st.executeUpdate(q);
        }
        catch (Exception e) {
            System.out.println(e);
        }        
    }
    
    
    //<-----ADMIN_LOGIN
    public ResultSet admin_login(String username, String password){
        
        try {
            String query="select * from admin_login where Username='"+username+"' and Password='"+password+"'";
            rs=st.executeQuery(query);
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }
    
    
    //<------ADD_PEOPLE
    public void add_people(String name, String fname, int NID, String gender1, int year, String address, String city, String allow1){
    
        try {
            String q ="insert into personal_info(Name, F_Name, NID, Gender, Birth_Year, Address, City, Vote) VALUES ('"+name+"','"+fname+"',"+NID+",'"+gender1+"',"+year+",'"+address+"','"+city+"','"+allow1+"')";
            st.executeLargeUpdate(q);
        }
        catch (Exception e) {
            System.out.println(e);
        }        
    }
    
    
    //<------UPDATE_PEOPLE
    public void update_people(int id, String name, String fname,int NID, String gender1, int year, String address, String city, String vote1){
    
        String uq="update personal_info set Name='"+name+"', F_Name='"+fname+"',NID='"+NID+"',Gender='"+gender1+"',Birth_Year='"+year+"',Address='"+address+"',City='"+city+"',Vote='"+vote1+"' where Id='"+id+"' ";
        
        try {
            st.executeUpdate(uq);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    
    //<------FETCH_PEOPLE
    public ResultSet fetch_people(){
    
        String fq="select * from personal_info";
        
        try {
            rs=st.executeQuery(fq);
        } catch (SQLException ex) {
            Logger.getLogger(sqlcon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    
    //<------DELETE_PEOPLE
    public void delete_people(int id){
    
        try {
            String del="delete from personal_info where Id='"+id+"' ";
            st.executeUpdate(del);
        } catch (SQLException ex) {
            Logger.getLogger(sqlcon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    //<-----SEARCH_PEOPLE
    public ResultSet search1(String search1){
 
   String sql="select * from personal_info where NID like '"+search1+"'";
   try{
   rs=st.executeQuery(sql);
   }catch(Exception e){
   System.out.println(e);
   }
   return rs;   
     
 }
    
     //<-----COUNT
    public ResultSet count(){
 
   try {
            String q="SELECT COUNT(*) FROM voting";
            rs=st.executeQuery(q);
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;  
     
 }
    
    //<-----WINNER
    public ResultSet winner(){
 
   try {
            String q="SELECT MAX(Party_Vote) FROM voting";
            rs=st.executeQuery(q);
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;  
     
 }
    
    
    //<-----BAL
    public ResultSet bal(){
 
   try {
            String q="SELECT COUNT(Party_Vote) FROM voting WHERE Party_Vote = \"BAL\"";
            rs=st.executeQuery(q);
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;  
     
 }
    
    //<----WP
    public ResultSet wp(){
 
   try {
            String q="SELECT COUNT(Party_Vote) FROM voting WHERE Party_Vote = \"WP\"";
            rs=st.executeQuery(q);
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;  
     
 }//------->
    
    //<-----BML
    public ResultSet bml(){
 
   try {
            String q="SELECT COUNT(Party_Vote) FROM voting WHERE Party_Vote = \"BML\"";
            rs=st.executeQuery(q);
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;  
     
 }
    
    //<-----JASAD
    public ResultSet jasad(){
 
   try {
            String q="SELECT COUNT(Party_Vote) FROM voting WHERE Party_Vote = \"JASAD\"";
            rs=st.executeQuery(q);
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;  
     
 }
    
    //<-----JP
    public ResultSet jp(){
 
   try {
            String q="SELECT COUNT(Party_Vote) FROM voting WHERE Party_Vote = \"JP\"";
            rs=st.executeQuery(q);
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;  
     
 }
    
    //<-----LDP
    public ResultSet ldp(){
 
   try {
            String q="SELECT COUNT(Party_Vote) FROM voting WHERE Party_Vote = \"LDP\"";
            rs=st.executeQuery(q);
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;  
     
 }
    public ResultSet bnp(){
 
   try {
            String q="SELECT COUNT(Party_Vote) FROM voting WHERE Party_Vote = \"BNP\"";
            rs=st.executeQuery(q);
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;  
     
 }
    
}
