
package cobaoperasistring;
import java.util.Locale;
public class CobaOperasiString {
    public static void main(String[] args) {
        String identitas = "ALYA SELVIA TAMZILA / X RPL 2 / 03";
        System.out.println("Identitas : "+ identitas);
        
        
        String x ="operasi";
        System.out.println("isi variable x : "+ x);
        System.out.println("\""+ x + "\" panjang karakter = "+ x.length());
        
        System.out.println("x adalah kosong : "+ x.isEmpty());
        
        String y = "";
        System.out.println("isi variable y : "+ y);
        System.out.println("y adalah kosong : "+ y.isEmpty());
        
        
        
        System.out.println("isi x sama dengan y : " + x.equals(y));
        
        String z = "Operasi";
        System.out.println("isi variable z : "+ z);
        System.out.println("isi x sama dengan z (Case Sensitive): " + x.equals(z));
        
        String r = "operasi";
        System.out.println("isi variable r : "+ r);
        System.out.println("isi x sama dengan r (Case Sensitive): " + x.equals(r));
        System.out.println("isi x sama dengan r (Not Case Sensitive): " + x.equalsIgnoreCase(r));
        
        
        
        System.out.println("perbandingan isi x dengan y : " + x.compareTo(y));
        System.out.println("perbandingan isi x dengan z (Case Sensitive): " + x.compareTo(z));
        System.out.println("perbandingan isi x dengan r (Case Sensitive): " + x.compareTo(r));
        System.out.println("perbandingan isi x dengan r (Not Case Sensitive): " + x.compareToIgnoreCase(r));
        
        String s = "operasi";
        System.out.println("isi variable s : "+ s);
        System.out.println("perbandingan isi r dengan s (Case Sensitive): " + x.compareTo(s));
        
        
        
    }
}