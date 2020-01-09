package Lab5;

import java.util.Scanner;

public class Array3 {

    public static void main(String[] args) {
        //Array 2D
        // ใช้เลข index 2 ตัวในการระบุต่ำแหน่งของ Array แบบ [row][column]

        Scanner sc = new Scanner(System.in);
        int x[][] = new int[2][3]; // ทุก block จะมีค่า = 0

        //input data to array2D
        x[0][0] = 10;
        x[1][2] = 50;
        System.out.println(x[0][0]);
        System.out.println(x[0][1]);
        System.out.println(x[1][2]);

        //input data from user
        for (int i = 0; i < x.length; i++) {  // วนลูปแถวแนวนอน
            for (int j = 0; j < x[i].length; j++) { // วนลูปแถวแนวตั้ง
                System.out.print("Enter an integer: ");
                x[i][j] = sc.nextInt();
            }

        }

        showDataArray2D(x);





    }//main

    private static void showDataArray2D(int[][] x) {
        System.out.println("Data in array 2D: ");
        for (int i = 0; i < x.length; i++) {  // วนลูปแถวแนวนอน
            for (int j = 0; j < x[i].length; j++) { // วนลูปแถวแนวตั้ง
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

}//class
