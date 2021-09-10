package com.company;

public class Main {

    public static void main(String[] args) {

        // ex. 1

        int A = 1, B = 50, C= 0;

        int result = A;
        if (B > result)
            result = B;
        if (C > result)
            result = C;

        System.out.println(result);



        // ex. 2

//        int y = -7, x = 5, m = 0, result = 0;
//        if (y < 0)
//        {
//            y = -y;
//            m = -1;
//        }
//        else
//            m = 1;
//
//        while (y > 0) {
//            if (y % 2 == 0)
//            {
//                x = x + x;
//                y = y / 2;
//            }
//            else
//            {
//                result = result + x;
//                y = y - 1;
//            }
//        }
//
//        if (m < 0)
//            result = -result;
//
//        System.out.println(result);
        
    }
}
