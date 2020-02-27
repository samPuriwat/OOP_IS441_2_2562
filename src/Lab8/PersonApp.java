package Lab8;

public class PersonApp {
    public static void main(String[] args) {
        //create objects

        Person P1 = new Person("1111111111111",
                "Puriwat Lertkrai",
                "02/12/1986");
        System.out.println(P1.toString());

        Student S1 = new Student("2222222222222",
                "Piyapong Senanus",
                "05/08/1983",
                "STD001", "Information System");

        S1.running();  //running() อยู่ใน Class Person
        S1.addSubject();
        //P1.addSubject();
        // object ของ super-class ไม่สามารถเรียกใช้ method ของ sub-class ได้


    }
}
