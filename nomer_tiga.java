import java.util.Scanner;

public class nomer_tiga {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int jumlah = 10; //Jumlah Array Yang Akan Diinput
    int[] angka = new int[jumlah];

    
    System.out.println("==== Soal No 3. Menjumlahkan Array Dari Input User ====");
    //Menginput 10 bilangan int ke dalam array
    for (int i = 0; i < jumlah; i++) {
      System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
      angka[i] = input.nextInt();
    }

    //Menjumlahkan Array 
    int jumlahAngka = 0;
    for (int i = 0; i < jumlah; i++) {
      jumlahAngka += angka[i];
    }

    // Cetak hasil penjumlahan
    System.out.println("Hasil Penjumlahan Array Yang Diinput User = " + jumlahAngka);
  }
}