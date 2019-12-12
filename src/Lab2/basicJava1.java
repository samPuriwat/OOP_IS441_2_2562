package Lab2;

public class basicJava1 {

    public static void main(String[] args) {
        //Variables
        // integer - จำนวนเต็ม
        int x;
        x =10;
        System.out.println(x);
        int y = -100;
        System.out.println(y);
        int z = x+y;   // z = ?
        System.out.println(z);

        //floating - จำนวนจริง ตัวเลขที่ทศนิยม
        // float , double
        float n = 10.10f;
        System.out.println(n);
        double d = 50.55;
        System.out.println(d);
        System.out.println(n*d);

        //character  ตัวอักษร 1 อักขระ เท่านั้น
        char c = '#';
        System.out.println(c);

        //String ข้อความ คือ ตัวอักษรที่เรียงต่อกันตั้งแต่ 2 ตัวขึ้นไป
        //String เป็นคลาสใน Java ดังนั้นการประกาศตัวแปรคือการสร้าง object ของคลาส
        String s = "Puriwat Lertkrai";
        System.out.println(s);
        int count = s.length();
        System.out.println(count);
        System.out.println(s.length());
        System.out.println(s.toUpperCase());

        //concatenation String  การต่อ String
        String myAddress = "@SAIYAI";
        String msg = s +" "+ myAddress;  // msg = ?

        System.out.println(msg);
        System.out.println(s.concat(" "+myAddress));

        //Boolean ข้อมูลที่เป็นประเภท จริง (true) และ เท็จ (false)
        boolean b = true;
        boolean r = false;
        System.out.println(b+" "+r);




    }//main



}//class
