package modul4bintangmh;

public class nomor2 {
    public static void main(String[] args) {
    
    //noa    
    int i= 1,i2=1;
    int hsl=1,hsl2=1;
    int nilai;
    int p=2,p1=3,p2=3,p3=5;
    while(i<=p1){
        hsl=hsl*p1;i++;
    }System.out.println(hsl);while(i2<=p){
        hsl2=hsl2*p3;i2++;
    }int hsl3=hsl+hsl2;
        System.out.println("4^3 + 5^2 ="+hsl3);
        
    //nob
    int angka=5,fak=1,angka2=4,fak2=1;
    for(int a=1;a<=angka;a++){
        fak=a*fak;
    }
    for(int b=1;b<=angka2;b++){
        fak2=b*fak2;
    }int fak3=fak+fak2;
        System.out.println("5! + 4! ="+fak3);
        
    //noc
    int ang=4,ang2=5,pkt=1,pkt2=2,hasil=1,hasil2=1,hasil3=1;
    for(int c=1;c<=pkt2;c++){
        hasil=hasil*ang;
    }
    for(int d=1;d<=pkt;d++){
        hasil2=hasil2*ang2;
    }
    for(int e=1;e<=pkt2;e++){
        hasil3=hasil3*ang;
    }float opr1=(hasil+hasil2),opr2=opr1/ang2,opr3=opr2+hasil3;
        System.out.println("(4^2 + 5^1)/5+4^2 = "+opr3);
}
}
