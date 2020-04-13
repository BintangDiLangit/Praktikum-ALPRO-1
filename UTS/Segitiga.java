
package utsss;

public class Segitiga {
    public static void main(String[] args) {
        
    for(int i=1;i<10;i++){
        for (int j = 1; j < i; j++) {
            System.out.print("*");
        }System.out.println();
}
    for(int i=0;i<7;i++){
        for (int j = 0; j <=i; j++) {
            System.out.print(" ");
        }
        for (int j = 7; j > i; j--) {
            System.out.print("*");
        }
        System.out.println();
}
}}
