import java.util.Scanner;


/**
 * Created by Nga Nga on 9/6/2016.
 */

public class nga1 {
    public static void main(String[] args) {
        //System.out.println("moi ban nhap gia tri a");
        // Scanner nga= new Scanner(System.in);
        //  int a=nga.nextInt();
        // System.out.println("moi ban nhap gia tri b");
        // int b=nga.nextInt();
        // System.out.println("moi ban nhap gia tri c");
        // int c=nga.nextInt();
        // System.out.println("ket qua cua ban la bang");
        // int z=(a+b+c);
        // System.out.println(z);


//        System.out.println("moi ban nhap gia tri x");
//        Scanner nga=new Scanner(System.in);
//        int x=nga.nextInt();
//        System.out.println("moi ban nhap gia tri y");
//        int y=nga.nextInt();
//        System.out.println("hieu cua ban la z=");
//        int z=(x-y);
//        System.out.println(z);


//        System.out.println("moi ban nhap gia tri a");
//        Scanner ngot=new Scanner(System.in);
//        int a=ngot.nextInt();
//        System.out.println("moi ban nhap gia tri b");
//        int b=ngot.nextInt();
//        System.out.println("thuong cua ban la c=");
//        int c=(a*b);
//        System.out.println(c);


//        Scanner ngao=new Scanner(System.in);
//        System.out.println("moi ban nhap gia tri x");
//        int x=ngao.nextInt();
//        System.out.println("moi ban nhap gia tri y");
//        int y=ngao.nextInt();
//        System.out.println("ket qua cua ban la z=");
//        System.out.println(x/y);


//        Scanner hcn=new Scanner(System.in);
//        System.out.println("moi ban nhap chieu rong hinh chu nhat");
//        int a=hcn.nextInt();
//        System.out.println("moi ban nhap chieu dai hinh chu nhat");
//        int b=hcn.nextInt();
//        System.out.println("dien tich hinh chu nhat la ");
//        System.out.println(a*b);


//        Scanner hhcn=new Scanner(System.in);
//        System.out.println("moi ban nhap chieu cao hinh hop chu nhat");
//        int h=hhcn.nextInt();
//        System.out.println("moi ban nhap chieu rong hinh hop chu nhat");
//        int a=hhcn.nextInt();
//        System.out.println("moi ban nhap chieu dai hinh hop chu nhat ");
//        int b=hhcn.nextInt();
//        System.out.println(a*b*h);

//        Scanner htr=new Scanner(System.in);
//        System.out.println("moi ban nhap ban kinh hinh tron");
//        int r=htr.nextInt();
//        System.out.println("dien tich hinh tròn là");
//        System.out.println(r*r*3.14);


//        Scanner htr1=new Scanner(System.in);
//        System.out.println("moi ban nhap chieu cao hinh tron");
//        int h=htr1.nextInt();
//        System.out.println("moi ban nhap ban kinh hinh tron");
//        int r=htr1.nextInt();
//        System.out.println("the tich hinh tron la");
//        System.out.println(h*r*r*3.14);

//          Scanner hv=new Scanner(System.in);
//          System.out.println("moi ban nhap độ dài cạnh hình vuông");
//          int a=hv.nextInt();
//          System.out.println("dien tich hinh vuông là");
//          System.out.println(a*4);

//          Scanner hv1=new Scanner(System.in);
//          System.out.println("moi ban nhap độ dài cạnh hình vuông");
//          int b=hv1.nextInt();
//          System.out.println("the tich hinh vuông là");
//          System.out.println(b*3);

//        Scanner name=new Scanner(System.in);
//        System.out.println("moi ban nhap ten ");
//        String s=name.nextLine();
//        System.out.println("xin chao" +s);

//        System.out.println(" hôm nay học về if else");
//        Scanner nga=new Scanner(System.in);
//        System.out.println(" hôm nay học bài gì:");
//        String a=nga.nextLine();
//        System.out.println("hôm nay học bài" +a);

//        System.out.println(" bây giờ là mấy giờ ");
//        Scanner time=new Scanner(System.in);
//        int h=time.nextInt();
//        if (h<12) {
//            System.out.println(" CHÀO BUỔI SÁNG");
//        }
//        if (h>12) {
//            System.out.println("chào buổi chiều");}
//        System.out.println(" tên bạn là gì:");
//        Scanner name=new Scanner (System.in);
//        String ng=name.nextLine();
//        System.out.println(" bây giờ là mấy giờ:");
//        Scanner time=new Scanner (System.in);
//        int h=time.nextInt();
//        String n="nga";
//        if(ng.equals("nga")) {
//            if (h < 12) {
//                System.out.println("chào buổi sáng" + n);
//            }
//            if (h >= 12) {
//                System.out.println("chào buổi chiều" + n);
//            }
//        }

//        System.out.println(" mời bạn nhập giá trị a");
//        Scanner nga=new Scanner(System.in);
//        float a=nga.nextFloat();
//        System.out.println("mời bạn nhập giá trị b");
//        float b=nga.nextFloat();
//        System.out.println("mời bạn nhập giá trị c");
//        float c=nga.nextFloat();
//        if(a==0) {
//            System.out.println("phương trình vô nghiệm");
//        }
//        if (a!=0){
//            System.out.println("kết quả của bạn là :");
//            Float z=(c-b)/a;
//            System.out.println(z);
//
//        }

        System.out.println("giải phương trình bậc 2: ax^2+bx+c=0");
        System.out.println(" mời bạn nhập giá trị a");
        Scanner nga=new Scanner(System.in);
        Float a=nga.nextFloat();
        System.out.println("mời bạn nhập giá trị b");
        Float b=nga.nextFloat();
        System.out.println("mời bạn nhập giá trị c");
        Float c=nga.nextFloat();
        if(a==0) {Float x=(-c/b);
            System.out.println("thì x=" +x);
        }
        if(a!=0) {
            Float d=(b*b-4*a*c);
            if (d<0) {
                System.out.println(" Phương trình vô nghiệm");}
                  if(d==0){
                    Float x=(-b/2*a);
                    System.out.println("Phương trình có nghiệm x="+x);}
                    if (d!=0)
                    { Float x1= (float)(-b+ Math.sqrt(d)/2*a);
                        Float x2=(float)(-b- Math.sqrt(d)/2*a);
            System.out.println( " phương trình có 2 nghiệm x1=" +x1 );
                        System.out.println( " phương trình có 2 nghiệm x2=" + x2);}



        }


    }
}