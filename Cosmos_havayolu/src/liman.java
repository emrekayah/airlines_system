import java.sql.SQLException;

public class liman extends database implements Idatabase{
    private static String liman_ad="",liman_sehir="",ik_ucret="";
    
    public liman()throws SQLException{ 
        connet_db();
    }
    
    public static void setAd(String ad){
        liman.liman_ad = ad;
    }
    public static String getAd(){
        return liman.liman_ad;
    }
    
    public static void setSehir(String sehir){
        liman.liman_sehir = sehir;
    }
    public static String getSehir(){
        return liman.liman_sehir;
    }
    
    public static void setIk(String ik){
        liman.ik_ucret = ik;
    }
    public String getIk(){
        return liman.ik_ucret;
    }
    
    static void ekle() throws SQLException{
        updateQuery("INSERT INTO `havayolu`.`limanlar` (`liman_ad`, `liman_sehir`, `ik_ucreti`) VALUES ('"+liman.liman_ad+"', '"+liman.liman_sehir+"', '"+liman.ik_ucret+"');");
    }

    @Override
    public void log() {
        System.out.println(liman_ad+" "+liman_sehir+" "+ik_ucret);
    }
}
