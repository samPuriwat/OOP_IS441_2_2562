package Lab6;

import java.util.StringTokenizer;

public class ExStringToken {
    public static void main(String[] args) {

        StringTokenizer tokenizer =
                new StringTokenizer("I live in Thungsong.");

        System.out.println(tokenizer.countTokens());

        while (tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());
            //สลับตัวอักษรในแต่ละคำโดยใช้ StringBuilder
            System.out.println(new StringBuffer(tokenizer.nextToken()).reverse());

        }

       // StringBuilder str = new StringBuilder(tokenizer.nextToken());
       // System.out.println(str.reverse());




    }
}
