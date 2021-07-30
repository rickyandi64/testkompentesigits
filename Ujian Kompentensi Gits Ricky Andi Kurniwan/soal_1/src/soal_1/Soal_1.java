package soal_1;
import javax.swing.JOptionPane;

public class Soal_1 {

    public static void main(String[] args) {
      // Deklarasi variabel
      String strNilai, strDibagi3;
      int nilai;

      // Input nilai srtNilai dari kotak dialok input
      strNilai = JOptionPane.showInputDialog(null, "Masukkan nilai integer",
         "Yang bisa dibagi 3 dan 5 ", JOptionPane.QUESTION_MESSAGE);

      // Mengkonversi nilai string ke integer
      nilai = Integer.parseInt(strNilai);

      // Menentukan apakah bilangan tersebut bisa dibagi 3 dan 5
      if (nilai % 5 == 0 && nilai % 3 == 0)
         strDibagi3 = "Hello World";
      else if (nilai % 5 == 0)
         strDibagi3 = "World";
      else if (nilai % 3 == 0)
          strDibagi3 = "Hello";
      else
          strDibagi3 = "Angka ini tidak bisa di bagi 3 dan 5";
      // Menampilkan hasil di kotak dialok pesan
      JOptionPane.showMessageDialog(null, "Nilai " + nilai + " adalah "
         + strDibagi3, "Bilangan Anda adalah", JOptionPane.INFORMATION_MESSAGE);
         
      // Mengakiri aplikasi GUI
      System.exit(0);
    }
}
