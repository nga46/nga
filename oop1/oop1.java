package oop1;

/**
 * Created by Nga Nga on 10/30/2016.
 */
public class oop1 {
    public static void main(String[] args) {
        person student= new person();
        student.setName("nga");
        student.setAge(21);
        student.setWeight(56);
        System.out.println("name: " +  student.getName());
        System.out.println("age: " + student.getAge());
        System.out.println("weight: " + student.getWeight());

    }
}

class person {
    public String name;
    public int age;
    public int weight;

    public void setName (String Name1)
    { this.name=Name1;}

    public void setAge (int Age1)
    { this.age= Age1;}

    public void setWeight (int weight1)
    { this.weight=weight1;}

    public String getName()
    {
        return this.name;
    }

    public  int getAge()
    {
        return this.age;
    }

    public int getWeight()
    {
        return this.weight;
    }


}
