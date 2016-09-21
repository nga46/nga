import com.sun.org.apache.xpath.internal.SourceTree;

import javax.jws.soap.SOAPBinding;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * Created by Nga Nga on 9/20/2016.
 */
public class b5 {
    public static void main(String[] args) {
        int max;
        int min;
        Scanner nu=new Scanner(System.in);
        System.out.println("mời bạn nhập a");
        int a=nu.nextInt();
        System.out.println(" mời bạn nhập số b");
        int b=nu.nextInt();
        System.out.println(" mời bạn nhập số c");
        int c=nu.nextInt();
        max=Math.max(Math.max(a,b),c);
        min=Math.min(Math.min(a,b),c);
        System.out.println("Max là:"+max);
        System.out.println("Min là:"+min);


        Scanner nu1=new Scanner(System.in);
        System.out.println("nhap canh O");
        int o=nu1.nextInt();
        System.out.println("nhap canh P");
        int p=nu1.nextInt();
        System.out.println("nhap canh Q");
        int q=nu1.nextInt();
        if (o+p>q || q+p>o || q+o>q){
            System.out.println(" day la 1 tam giac");}
            else {
            System.out.println(" day khong phai la tam giac");}







    }
}
