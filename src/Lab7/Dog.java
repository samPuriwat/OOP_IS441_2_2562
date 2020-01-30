package Lab7;

public class Dog {
    // Attributes คือ คุณลักษณะของ object
    private String name;
    private int age;
    private String hairColor;
    // Constructor คือ เมธอดที่มีชื่อเดียวกันกับชื่อคลาส เมื่อมีการสร้าง object จะมีการเรียกใช้ constructor เสมอ
    //1. Default Constructor
    public Dog(){}
    //2. Design Constructor
    public Dog(String name, int age, String hairColor){
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
    }
    // Behaviors คือ พฤติกรรมของ object ซึ่งจะนิยามด้วยเมธอดที่อยู่ภายในคลาส
    public void sleeping(){
        System.out.println("Dog Sleeping");
    }
    public void eating(){
        System.out.println("Dog Eating");
    }
    public void running(){
        System.out.println("Dog Running");
    }
    // getter and setter methods,
    // getter ใช้อ่านข้อมูลของ object ,
    // setter ใช้ปรับปรังข้อมูลของ object
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getHairColor(){
        return this.hairColor;
    }
    public void setHairColor(String hairColor){
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {
        return "[Name:" + this.name +
                " Age:" + this.age +
                " Color:" + this.hairColor + "]\n";
    }
}
