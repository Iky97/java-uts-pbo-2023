class Phi {
    protected int jariJari;
    public Phi(int jariJari){
        this.jariJari = jariJari;
    }

    public void info(){
        System.out.println("======== Soal No 4. Perhitungan Keliling Dan Luas Lingkaran ========");
        System.out.println("Jari-Jari Lingkatan = "+ this.jariJari);
        System.out.println("Keliling Lingkaran = "+ this.jariJari * 2  * 3.14);
        System.out.println("Luas Lingkatan = "+ this.jariJari * this.jariJari * 3.14);
    }
}
public class nomer_empat {
    public static void main(String[] args) {
        Phi phi = new Phi(10);
        phi.info();
    }
}
