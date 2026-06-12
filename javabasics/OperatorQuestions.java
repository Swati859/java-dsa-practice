package javabasics;


//Arithmetic Operator
/*public class OperatorQuestions {
    public static void main (String[]args){

        int x = 10;
        int y = 5;

        int a = x + y;
        int b = x - y;
        int c = x * y;
        int d = x / y;
        int e = x % y;
        int f = x++; //Post-increment, 1st fetch =10 , then increment=10+1=11
        int g = ++x; //Pre-increment, 1st increment=11+1=12 , then fetch =12
         x += 2; // x = x+2 , current x value = 12+2 = 14
         y += 2; // y = y+2

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(x);
        System.out.println(y);
    }
}
 */

// Relational Operator
/*public class OperatorQuestions {
    public static void main(String[] args) {
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

//Logical Operator

public class OperatorQuestions {
    public static void main(String[] args) {

        int x = 5;
        int y = 6;
        int a = 7;
        int b = 8;

        boolean r = x > y && a < b;
        boolean s = x < y && a < b;

        boolean t = x >y || a < b;
        boolean u = ! (a>b);

        System.out.println(r);
        System.out.println(s);
        System.out.println(t);
        System.out.println(u);

    }
}
