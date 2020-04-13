
package praktikummodul6;

public class No_3 {
    public static void main(String[] args) {
         String data[][]={
             {"ABDUL","085646668991","KEDIRI\t"},
             {"KUSNO","085646668992","TRENGGALEK"},
             {"PONIRAN","085646668993","BOJONEGORO"}};
        System.out.println("NAMA\t\t|" + "Alamat\t\t\t|" + "Nomor\t\t|");
        
        System.out.println("----------------------------------------------------------");
        for (int i = 0; i < data.length; i++) {
                System.out.print(data[i][0]+"\t\t|");
                System.out.print(data[i][2]+"\t\t|");
                System.out.print(data[i][1]+"\t|");
            
            System.out.println();
        }
        System.out.println("----------------------------------------------------------");
    }
}
