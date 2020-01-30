package Lab4;

public class Method1 {

    public static void main(String[] args) {
        System.out.println("Hello from Main method");
        //calling method
        A();
        System.out.println("Hello from Main method 2");
        A();
        A();
        //calling B() method
        B("SAM");  //B("SAM");

        //calling C() method
        //1. ประกาศตัวแปรชนิดเดียวกันกับค่าที่ส่งมาจากเมธอดเพื่อเก็บค่าข้อมูลนั้นไว้
        String myName = C("Puriwat", "Lertkrai");
        System.out.println(myName);
        //2. กรณีที่ไม่ต้องการเก็บค่าที่ส่งมาจากเมธอด สามารถแสดงค่าข้อมูลนั้นด้วยคำสั่ง print() หรือ println() ได้เลย
        System.out.println(C("Puriwat","Lertkrai"));
    }
    // Method type 1: no parameter, no return value
    public static void A(){
        System.out.println("Hello from A method.");
    }
    // Method type 2: 1 or more parameters, no return value
    public static void B(String msg){ //msg เป็น local variable หรือ ตัวแปรเฉพาะที่
        System.out.println("Hello from B method. "+msg);
    }
    // Method type 3: 1 or more parameters, return 1 value
    public static String C(String fName,String Lname){
        System.out.println("Hello from C method.");
        String myName = fName + " " + Lname;

        return myName;
    }



}//class
