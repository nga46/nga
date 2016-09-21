import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Nga Nga on 9/19/2016.
 */
public class b4 {
    public static void main(String[] args) {
        System.out.println("mời bạn nhập tháng");
        Scanner thang=new Scanner(System.in);
        int x=thang.nextInt();
        System.out.println("mời bạn nhập năm");
        int y=thang.nextInt();
        if( 0>x || x>12 || y<0){
            System.out.println(" giá trị tháng và năm không hợp lệ ");}
            else {
            if (y % 4 == 0) {
                System.out.println("đây là năm nhuận ");
            }
            if (y % 4 > 0) {
                System.out.println(" đây là năm thường tháng ");
            }
            switch (x) {
                case 1:
                    System.out.println("tháng 1 :31 ngày");
                    break;
                case 2:
                    if (y % 4 == 0) {
                        System.out.println("tháng 2: 29 ngày");
                    }
                    if (y % 4 > 0) {
                        System.out.println(" tháng 2: 28 ngày ");
                    }
                    break;
                case 3:
                    System.out.println("tháng 3: 31 ngày");
                    break;
                case 4:
                    System.out.println("tháng 4: 30 ngày");
                    break;
                case 5:
                    System.out.println("tháng 5: 31 ngày");
                    break;
                case 6:
                    System.out.println("tháng 6: 30 ngày");
                    break;
                case 7:
                    System.out.println("tháng 7: 21 ngày");
                    break;
                case 8:
                    System.out.println("tháng 8: 30 ngày");
                    break;
                case 9:
                    System.out.println("tháng 9: 31 ngày");
                    break;
                case 10:
                    System.out.println("tháng 10: 30 ngày");
                    break;
                case 11:
                    System.out.println("tháng 11: 31 ngày");
                    break;
                case 12:
                    System.out.println("tháng 12: 30 ngày");
                    break;
                default:
                    System.out.println("bạn đã nhập sai tháng");
            }
        }



    }
}
