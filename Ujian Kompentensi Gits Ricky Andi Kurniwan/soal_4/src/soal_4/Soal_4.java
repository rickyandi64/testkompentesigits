package soal_4;
import java.util.*;
public class Soal_4 {
    public static void main(String[] args) {
        String kataNormal;
        String kataBalik ="";
        
        Scanner input = new Scanner(System.in);
        System.out.println("Input kata atau kalimat disini :");
        kataNormal = input.nextLine();
        for(int kata = kataNormal.length() -1; kata>=0; kata--){
            kataBalik += kataNormal.charAt(kata);
        }
        System.out.println("Hasil kata yang di balik :" + kataBalik);
    }
}
