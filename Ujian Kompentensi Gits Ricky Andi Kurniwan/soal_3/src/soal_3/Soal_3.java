package soal_3;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Soal_3 {

    public static void main(String[] args) {
         Date waktu = new Date();
    System.out.println(waktu);
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/YY");
    System.out.println(simpleDateFormat.format(waktu));
    String dateFormat = DateFormat.getInstance().format(waktu);
    System.out.println("Waktu Sekarang adalah :" + dateFormat );
    
    }
}
