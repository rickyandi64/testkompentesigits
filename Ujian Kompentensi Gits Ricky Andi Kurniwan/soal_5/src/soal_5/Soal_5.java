package soal_5;
import java.util.Scanner;
public class Soal_5 {
    public static void main(String[] args) {
        String kataPertama, kataKedua = "";
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Inputkan Kata Untuk Mengecek Palindrome :");
        kataPertama = inputUser.next();
        int panjang = kataPertama.length();
        for (int index = panjang -1; index>=0; index--){
            kataKedua = kataKedua + kataPertama.charAt(index); 
        }
        if(kataPertama.equals(kataKedua)){
            System.out.println("Kata termasuk Palindrome");
        }else{
            System.out.println("Kata bukan termasuk Palindrome");
        }
    }
}
