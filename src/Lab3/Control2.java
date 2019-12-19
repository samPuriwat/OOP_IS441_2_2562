package Lab3;

import java.util.Scanner;

public class Control2 {

    public static void main(String[] args) {
        //if-else : เลือกทำอย่างใดอย่างหนึ่ง  (ถ้า-แล้ว)
        //โครงสร้าง if-else

//        if(เงื่อนไข){
//            คำสั่งเมื่อ if เป็นจริง;
//        }else{
//            คำสั่งเมื่อ if เป็นเท็จ;
//        }

        int x = 10;
        if ((x/2)>5){  //T F
            System.out.println("x more than 5.");
        }else {
            System.out.println("x less than 5.");
        }
        // Are Old or young?  > 50 == old, <50 == young
        Scanner sc = new Scanner(System.in);
        System.out.print("How old are you? : ");
        int age = sc.nextInt();
        //test condition
        if (age>50){
            System.out.println("You are old.");
        }else {
            System.out.println("You are young.");
        }

    }//main
}
