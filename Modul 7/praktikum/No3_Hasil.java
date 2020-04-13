package praktikummodul7;

public class No3_Hasil {

    public static void main(String[] args) {
        No_3 n = new No_3();
        System.out.println("=========Persegi Panjang=========");
        int p = n.InputNilai("panjang");
        int l = n.InputNilai("lebar");
        n.LPP(p, l);
        System.out.println("=========Segitiga=========");
        int a = n.InputNilai("Alas");
        int t = n.InputNilai("Tinggi");
        n.LS(a, t);
        System.out.println("========Lingkaran========");
        int jari = n.InputNilai("Jari Jari");
        n.LL(jari);

    }
}
