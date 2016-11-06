package manage;

import java.util.ArrayList;

/**
 * Created by Nga Nga on 10/31/2016.
 */
public class manage1 {
    public void arr ( ArrayList <student> arrSv) {
        for (int i=0; i<arrSv.size(); i++) {
            for (int j=0; j<arrSv.size(); j++) {
                if (arrSv.get(i).getPoint()< arrSv.get(j).getPoint()) {
                    student sv= new student();
                    sv= arrSv.get(i);
                    arrSv.set(i,arrSv.get(j));
                    arrSv.set(j,sv);
                }

            }
        }

    }
 public  void showarr (ArrayList<student>arr) {
     for (int i=0; i<arr.size(); i++) {
         arr.get(i).output();
     }
 }
    public static void main(String[] args) {
        int x;
        System.out.println("mời bạn chọn tính năng");
        System.out.println("1. nhập thông tin sinh viên");
        System.out.println("2. hiện thị thông tin sinh viên");
        System.out.println("3. thoát");
        switch (x){
            case 1: ;
                break;
            case 2: ;
                break;
            case 3: ;
                break;


        }
    }


}
