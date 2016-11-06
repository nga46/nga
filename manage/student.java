package manage;

import java.util.Scanner;

/**
 * Created by Nga Nga on 11/3/2016.
 */
 class student {
    private  String ID;
    private String name;
    private  int age;
    private  float point;

    public void input () {
        Scanner data= new Scanner(System.in) ;
        System.out.println("nhập mã sinh viên");
        ID =data.nextLine();
        System.out.println("nhập tên sinh viên");
        name=data.nextLine();
        System.out.println("tuổi sinh viên");
        age=data.nextInt();
        System.out.println("nhập điểm sinh viên");
        point=data.nextFloat();

    }

    public void output () {
        System.out.println("Thông tin sinh viên: mã sinh viên: " +ID +",Tên: "+ name +" ,"+ age + " tuổi "+ ",được " + point+ " điểm"  );

    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getPoint() {
        return point;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPoint(float point) {
        this.point = point;
    }
}
