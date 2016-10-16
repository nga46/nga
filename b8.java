import java.util.Scanner;

/**
 * Created by Nga Nga on 10/10/2016.
 */
public class b8 {
    public static void main(String[] args) {
//        int [][] table=new int[9][9];
//        int x=(int)(Math.random()*8+1);
//        for (int i=0; i<=9; i++) {
//            for (int j =0; j<9 ; j++){
//                System.out.print(table[i][j]+" ");}
//            System.out.println("");
//        }
//        int j=77;
//        char c=(char)j;
//        System.out.println(c);
//        char x;
//        String n= "nga";
//             char b=n.charAt(3);
//        System.out.println(b);


//        char x;
//        char n []=new char[3];
//        Scanner h= new Scanner(System.in);
//        for(int i=0; i<3; i++){
//        System.out.println( "nhập tên");
//         n[i]=h.next().charAt(0);}
//            for (int i=0; i<2; i++ )
//                for (int j=i+1; j<3; j++)
//                    if (n[j]<n[i]) {
//                    x=n[i];
//                        n[i]=n[j];
//                        n[j]=x;}
//        for (int i=0; i<3; i++) {
//            System.out.println(n[i]);
//        }


        String x;
        int i;
        int j;
        String n []=new String[3];
        Scanner h= new Scanner(System.in);
        for(i=0; i<3; i++){
        System.out.println( "nhập tên");
            String a=h.nextLine();
            n[i]=a;
        }
        for ( i=0; i<2; i++ )
                for ( j=i+1; j<3; j++){
                    if (n[i].charAt(0)>n[j].charAt(0))  {
                    x=n[i];
                        n[i]=n[j];
                        n[j]=x;}}
        for ( i=0; i<3; i++) {
            System.out.println(n[i]);}








}}
