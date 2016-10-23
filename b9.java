import java.util.Scanner;

/**
 * Created by Nga Nga on 10/19/2016.
 */
public class b9 {
    public static void main(String[] args) {

//
//        String [][] arr= new String[5][2];
//        Scanner name= new Scanner (System.in);
//        for (int i=0; i<arr.length;i++)
//        for (int j=0; j<arr.length; j++)
//        {
//            System.out.println("nhập tên ");
//            String a=name.nextLine();
//            arr [i][0]=a;
//            System.out.println("nhập tuổi");
//            String a1=name.nextLine();
//            arr [i][1]=a1;
//        }
//
//        for(int i=0; i<5; i++){
//            for (int j=0; j<2; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println(" ");
//        }
        String [][] arr= new String[5][2];
        Scanner name= new Scanner (System.in);
        for (int i=0; i<5;i++) {
            for (int j =0; j<2; j++) {
                String a=name.nextLine();
                arr[i][j]=a;
            }
        }

        for(int i=0; i<5; i++){
            for (int j=0; j<2; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }







    }}
