import java.util.Scanner;
public class nomer_dua {
    public static void main(String args[])
    {
        Scanner masuk = new Scanner(System.in);
        float berat, tinggi, bmi, bmiTinggi;
        System.out.println("PROGRAM JAVA MENGHITUNG BERAT BADAN IDEAL DENGAN BMI & RUMUS BROCA");
        System.out.print ("Masukan Berat: ");
        berat = masuk.nextFloat();
        System.out.print ("Masukan Tinggi: ");
        tinggi = masuk.nextFloat();
        bmiTinggi=tinggi/100;
   
        bmi=(berat/(bmiTinggi*bmiTinggi));
  
        System.out.print("BMI : "+bmi+" ");
        
        if (bmi<18.5){
            System.out.println("(Kurus)");
        }else if (bmi<=24.9){
            System.out.println("(Normal)");
        }else {
            System.out.println("(Overweight)"); 
        }
   }
}