import java.lang.reflect.Array;
import java.util.*;
import java.util.Collections;
import java.util.Arrays;
/**
 * Created by Nga Nga on 10/3/2016.
 */
public class b6 {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i = i + 1) {
//            System.out.println("toi la nga");
//        }
//        String[] a=new String[10];
//                a[0]="nga";
//                a[1]="hang";
//        a[2]="chi";
//        a[3]="thanh";
//        a[4]="phung";
//        for (int i=0; i<10; i=i+1){
//            System.out.println(a[i]);
//        }

//        String[] g = new String[3];
//        Scanner name = new Scanner(System.in);
//        for (int i = 0; i < 3; i = i + 1) {
//            System.out.println("nhap ten");
//            String a = name.nextLine();
//            g[i] = a;
//        }
//        for (int i = 0; i < 3; i = i + 1) {
//            System.out.println(g[i]);
//        }


//        for (int i =0; i<3; i++) {
//            for (int x=0; x<i; x++) {
//                System.out.println("*");}
//            System.out.println();}


        int max;
        int min;

        int[] a =new int[10];
        Scanner num=new Scanner(System.in);
        for(int i= 0; i<10; i++) {
            System.out.println("nhập số");
            int h = num.nextInt();
            a[i]=h;
        }
        max = min= a[0];
        for (int i= 0; i<10; i++)
        {  if (max<a[i]) { max=a[i];}
        if (min> a[i])  {min=a[i];}}
            System.out.println("max" +max);
            System.out.println("min"+min);



















    }}




