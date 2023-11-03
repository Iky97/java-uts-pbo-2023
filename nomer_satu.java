import java.util.Scanner;
public class nomer_satu {
    public static void main(String args[])
    {
        Scanner masuk = new Scanner(System.in);
        int jamAwal, menitAwal, detikAwal, jamAkhir, menitAkhir, detikAkhir, sisaJam, sisaMenit, sisaDetik, totalTelephone;
        System.out.println("==== Soal No 1 . Menghitung Lama Telephon Dan Biaya Telephon ====");
        System.out.print ("Masukan Jam Mulai : ");
        jamAwal = masuk.nextInt();
        System.out.print ("Masukan Menit Mulai : ");
        menitAwal = masuk.nextInt();
        System.out.print ("Masukan Menit Detik Mulai : ");
        detikAwal = masuk.nextInt();
   
        System.out.print ("Masukan Jam Selesai : ");
        jamAkhir = masuk.nextInt();
        System.out.print ("Masukan Menit Selesai : ");
        menitAkhir = masuk.nextInt();
        System.out.print ("Masukan Menit Detik Selesai : ");
        detikAkhir = masuk.nextInt();

        sisaJam = (jamAkhir *3600) - (jamAwal * 3600);
        sisaMenit = (menitAkhir*60) - (menitAwal * 60);
        sisaDetik = detikAkhir - detikAwal;
        totalTelephone = sisaJam + sisaMenit + sisaDetik;
  
        System.out.println("Waktu Mulai Telephone : "+jamAwal+":"+menitAwal+":"+detikAwal);
        System.out.println("Waktu Selesai Telephone : "+jamAkhir+":"+menitAkhir+":"+detikAkhir);
        System.out.println("Lama Waktu Telephone (Detik): " + totalTelephone+" Detik");
        System.out.println("Biaya Yang Harus Dibayarkan : " +"Rp. "+ ((totalTelephone/5)*150));
   }
}