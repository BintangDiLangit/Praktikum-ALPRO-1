package github;

public class gaji_bersih {

    public static void main(String[] args) {

        double gajikotor = 1000000;
        double pajak = 0.1;
        double potongan = pajak * gajikotor;
        double gajibersih = gajikotor - potongan;
        System.out.println(gajibersih);
    }
}
