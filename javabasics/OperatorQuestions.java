package javabasics;

//Arithmetic Operators
      /* public class OperatorQuestions {
                public static void main (String []args){

        int num1 = 10;
        int num2 = 5;

        int a = num1 + num2 ;
        int b = num1 - num2 ;
        int c = num1 * num2 ;
        int d = num1 / num2 ;
        int e = num1 % num2 ;
        int f = num1++; // 1st fetch = 10 , then increment = 10+1 =11
        int g = ++num1; // 1st increment = 11+1=12 , then fetch =12
        num1 += 5;  //num1 = num1 + 5 (Current value of num1 = 12)


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(num1);
    }
}
 */


//Relational Operators
/* public class OperatorQuestions {
    public static void main(String[]args){

        int x = 5;
        int y = 6;

        boolean a = x == y;
        boolean b = x != y;
        boolean c = x > y;
        boolean d = x < y;
        boolean e = x >= y;
        boolean f = x <= y;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

    }
}
 */

// Logical Operators

public class OperatorQuestions {
    public static void main(String[]args){

        int a = 5;
        int b = 6;

        int x = 9;
        int y = 10;

        boolean r = a<b && x<y ;
        boolean s = a>b || x<y ;
        boolean t = ! (a>b);


        System.out.println(r);
        System.out.println(s);
        System.out.println(t);
    }
}