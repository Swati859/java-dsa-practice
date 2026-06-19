package javabasics;

//A method can also be called multiple times:

 /*public class MethodBasics {
    static void myMethod(){
        System.out.println("Hello");
    }
    public static void main(String[]args){
        myMethod();
        myMethod();
        myMethod();
    }
}
*/


 /*public class MethodBasics {
     static void myMethod(String name , int age){
         System.out.println(name + " " + "is" + " " + age);
     }
     public static void main(String []args){
         myMethod( "Swati" , 22);
         myMethod("Aarti" , 24);
         myMethod("Satya", 26);
     }
 }
  */


//A Method with If...Else
/*public class MethodBasics {
    static void checkMyAge(int age){

        if (age>18){
            System.out.println("Access Granted");
        }else{
            System.out.println("Access Denied");
        }
    }
    public static void main(String[]args){
        checkMyAge(20);
    }
}
 */


//Java Return

/*public class MethodBasics {
    static int myMethod(int x) {
        return x * 2;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            System.out.println("Double Of" + " " + i + " " + "is" +" " +myMethod(i));
        }
    }
}
 */


// Find sum of sums of digits of a given no. (582109)
/*import java.util.Scanner;

public class MethodBasics {
        public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);

                    String num = sc.next();
                    int total = 0;

                    for (int i = 0; i < num.length(); i++) {
                        int digit = num.charAt(i) - '0';
                        total += digit * (i + 1);
                    }

                    System.out.println(total);

                    sc.close();
                }
            }
 */

//Method Overloading

//Consider two methods that add numbers of different type:

/*public class MethodBasics {
    static int addInt(int x, int y) {
        return x + y;
    }

    static double addDouble(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = addInt(3, 5);
        double myNum2 = addDouble(3.5, 5.6);

        System.out.println(myNum1);
        System.out.println(myNum2);
    }
}
 */

//Instead of defining two methods that should do the same thing, it is better to overload one.
//In the example below, we overload the myMethod method to work for both int and double:

/*public class MethodBasics {
    static int myMethod ( int x , int y){
        return x + y;
    }
    static double myMethod ( double x , double y){
        return x + y;
    }

    public static void main (String[]args){
        int myNum1 = myMethod(3 , 5);
        double myNum2 = myMethod(3.5 , 5.5);

        System.out.println(myNum1);
        System.out.println(myNum2);
    }
}
 */

// Recursion


/*public class MethodBasics {
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }
}
 */


// Factorial

/*public class MethodBasics {
    static int factorial(int n) {

        if (n == 0) {
            return 1 ;
        } else {
            return n * factorial(n-1);
        }
    }

        public static void main (String[]args){
            int result = factorial(4);
            System.out.println(result);
        }
    }
*/

//Factorials for 1 to 5

/*public class MethodBasics {
    static int factorial(int n){

        if (n==0){
            return 1;
        } else {
           return n * factorial(n-1);
        }
    }
    public static void main(String []args){
        int f1 = factorial(1);
        int f2 = factorial(2);
        int f3 = factorial(3);
        int f4 = factorial(4);
        int f5 = factorial(5);

        System.out.println(f1 +" "+  f2 + " "+ f3 + " "+ f4 + " "+ f5);

    }
}
 */

// Fibonacci Sequence - Recursive

/*public class MethodBasics {
    static int fib(int n){

        if ( n <= 1){
            return n ;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main (String []args){

        int  result = fib(4);
        System.out.println(result);
    }
}
 */

// Exponentiation - Calculate x^n

/*public class MethodBasics {
    static int power(int x, int n){

        if (n == 0){
            return 1;
        }else {
            return x *power(x, n-1);
        }
    }

    public static void main(String[]args){
        System.out.println(power(5, 8));
    }
}
 */

// Exponentiation - Method 2

/*public class MethodBasics {
    static int power(int x, int n){

        if (n == 0){
            return 1;
        }else if(n%2 == 0) {
            int y = power(x, n / 2);
            return y * y;
        } else {
            return x *power(x, n-1);
        }
    }

    public static void main(String[]args){
        System.out.println(power(5, 8));
    }
}
 */

// Modular exponentiation - x^n mod m

/*public class MethodBasics {
    static int Mod(int x, int n, int m) {

        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            int y = Mod(x, n / 2, m);
            return y * y;
        } else {
            return ((x %m) * Mod (x ,n-1, m)) % m ;
        }
    }

    public static void main ( String [] args){
        System.out.println(Mod(5,3,8));
    }
}
 */

// Find Fibonacci no. 50

public class MethodBasics {

    static long [] F = new long [51];

    static long fib(int n){


        if ( n <= 1){
            return n ;
        }
        if (F[n] !=-1){
            return F[n];
        }else {
             F[n] = fib(n-1) + fib(n-2);
             return F[n];
        }
    }
    public static void main (String []args){
        for(int i =0; i<51; i++){
            F[i] =-1;
        }
        long  result = fib(50);
        System.out.println(result);
    }
}

