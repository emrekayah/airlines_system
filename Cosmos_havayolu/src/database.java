import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;

public class database implements Idatabase{
    private static Connection myConn;
    private static Statement myStat;
    public static final String host="34.90.248.215";
    public static final String port = "3306";
    public static final String veritabani = "havayolu";
    public static final String kullanici = "root";
    public static final String sifre = "1234";
    
    public database()throws SQLException{
        connet_db();
    }
    
    static void connet_db(){
        try{
            myConn = (Connection)DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+veritabani,kullanici,sifre);
            myStat = (Statement)myConn.createStatement();
        }catch (SQLException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static ArrayList<String> getData(String query)throws SQLException{
        ResultSet myRs = myStat.executeQuery(query);
        ResultSetMetaData rsmd = (ResultSetMetaData) myRs.getMetaData();
        int columnCount = rsmd.getColumnCount();
        ArrayList<String> output=new ArrayList<String>();
        output.add(String.valueOf(columnCount));
        for (int i = 1; i <= columnCount; i++ ) {
            output.add(rsmd.getColumnName(i));
        }
        while(myRs.next()){
            for (int j=1; j<=columnCount; j++) {
                output.add(myRs.getString(output.get(j)));
            }
        }
        return output;
    }
    
    static void updateQuery(String query)throws SQLException{
        myStat.executeUpdate(query);
    }
    
    static String getSingleData(int id,String idAdi,String sutun,String tablo)throws SQLException{
        String sorgu = "SELECT "+sutun+" FROM "+veritabani+"."+tablo+" WHERE "+idAdi+"='"+id+"';";
        ResultSet myRs = myStat.executeQuery(sorgu);
        ResultSetMetaData rsmd = (ResultSetMetaData) myRs.getMetaData();
        String cikti = null;
        while(myRs.next()){
            cikti = myRs.getString(sutun);
        }
        return cikti;
    }
    
    @Override
    public void log() {
        System.out.println(host+" "+port+" "+veritabani+" "+kullanici+" "+sifre);
    }
}
