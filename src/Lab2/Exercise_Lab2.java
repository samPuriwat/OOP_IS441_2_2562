package Lab2;

import java.util.Scanner;

public class Exercise_Lab2 {
    public static void main(String[] args) {
        //ให้นักศึกษาเขียนโปรแกรมเพื่อคำนวนค่า Body Mess Index (BMI) โดยใช้สมการต่อไปนี้
        //Body Mass Index (BMI) มีสูตรการคำนวณ = น้ำหนักตัว[Kg] / (ส่วนสูง[m] ยกกำลังสอง)

        //Step 1: input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight: ");
        double w = sc.nextDouble();
        System.out.print("Enter your height(meter): ");
        double h = sc.nextDouble();
        //Step 2: calculate
        double bmi = w / (h * h);
        //step 3: print result
        System.out.println("Your BMI: "+bmi);
    }


}
