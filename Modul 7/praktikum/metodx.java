
package praktikummodul7;

public class metodx {
    //fungsi
public double luas_lingkaran(int diameter){
    int jari2=diameter/2;
    double luas=Math.PI*Math.pow(jari2, 2);
    return luas;
}
    //prosedur

public void hitungLuasLingkaran(int jari2){
    double luas=Math.PI*Math.pow(jari2, 2);
    System.out.println(luas);
}
    public static void main(String[] args) {
        metodx mt=new metodx();
        mt.hitungLuasLingkaran(10);
        System.out.println(mt.luas_lingkaran(20));
        System.exit(0);
                
    }
    
}

