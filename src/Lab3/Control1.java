package Lab3;

public class Control1 {

    public static void main(String[] args) {

        //if

//        if(เงื่อนไข) {
//            คำสั่งการทำงาน;
//            คำสั่งการทำงาน;
//        }
        int x = 10;
        if (x > 5) { //T
            System.out.println("x more than 5.");
        }
        if (x > 20) {//F
            System.out.println("x less than 20.");
            System.out.println("Good Bye.");
        }

        if (x*10 == 100){ //T
            System.out.println("Yes, 10*10 = 100.");
        }

    }//main


}//class
