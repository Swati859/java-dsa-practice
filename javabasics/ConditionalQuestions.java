package javabasics;


//Print Hello (compare 1 value)
/**public class ConditionalQuestions {
    public static void main (String[]args){

        int a = 5;

        if (a>1){
            System.out.println("Hello");
        }
    }
}
 */

/*public class ConditionalQuestions {
    public static void main (String[]args){

        int a = 10;

        if (a > 5 && a != 15){
            System.out.println("Hello");
        }
    }
}
 */

    //if...else statement (compare 2 value)
/*public class ConditionalQuestions {
    public static void main(String[] args) {

        int x = 8;
        int y = 6;

        if(x>y) {
            System.out.println(x);
            System.out.println("Thankyou");
        }else {
            System.out.println(y);
        }
    }
}
*/



/*public class ConditionalQuestions {
    public static void main(String[] args) {

        int x = 5;
        int y = 6;

        if (x>y){
            System.out.println(x);
            System.out.println("Hello");
        }else {
            System.out.println("Hi");
        }
    }
}
 */

// if..else if...else(compare 3 value)

/*public class ConditionalQuestions {
    public static void main(String[] args) {

        int x = 8;
        int y = 7;
        int z = 9;

        if (x>y && x>z){
            System.out.println(x);
            System.out.println("Thankyou");
        }else if (y>z){   //we already check x is smaller from y and z.So, no need to check again y>x (y>x&&y>z)
            System.out.println(y);
        }else{
            System.out.println(z);
        }
    }
}
 */

//check a given no. is even or odd

/*public class ConditionalQuestions {
    public static void main(String[] args) {

        int n = 5;
        int result = 0;

        //if (n%2==0){ //n=4
          //  result = 10;
        //}else{
          //  result = 20;
        //}

        if (n%2 ==0){
            result =10;
        }else {
            result =20;
        }
        System.out.println(result);
    }
}
 */

//Ternary operator (check a given no. is even or odd)

/*public class ConditionalQuestions {
    public static void main(String[] args) {

        int n = 4;
        int result = 0;

        System.out.println( (n % 2 == 0) ? "even" : "odd");

    }
}
 */

/*public class ConditionalQuestions {
    public static void main(String[] args) {

        int n = 5;
        int result = 0;

        System.out.println((n % 2 == 0) ? "10" : "20");
    }
}
 */


/*public class ConditionalQuestions {
    public static void main(String[] args) {

        int n = 5;
        int result = 0;

        result = (n % 2 == 0) ? 10 : 20;
        System.out.println(result);
    }
}
 */

// Logical operator

//In real programs, logical operators are often used for access control. For example, to get access to a system, there are specific requirements:
//You must be logged in, and then you either need to be an admin, or have a high security clearance (level 1 or 2):

/*public class ConditionalQuestions {
    public static void main(String[] args) {

        boolean isLoggedIn = true ;
        boolean isAdmin = false;
        int securtyLevel = 2; // 1 = highest

        if (isLoggedIn && (isAdmin||securtyLevel>=1)){
            System.out.println("Access Granted");
        }else{
            System.out.println("Access Denied");
        }
    }
}
 */

// For Practice

//(1) Shows how you can use if..else to "open a door" if the user enters the correct code:
/*public class ConditionalQuestions {
    public static void main(String[] args) {
        int doorCode = 1337;

        if (doorCode == 1337) {
            System.out.println("Correct code. The door is now open.");
        } else {
            System.out.println("Wrong code. The door remains closed.");
        }
    }
}
 */

//(2) Find out if a person is old enough to vote, and if they are a citizen (using nested if statements):
/*public class ConditionalQuestions {
    public static void main(String[] args) {

        int age = 20;
        boolean isCitizen = true;

        if (age >= 18) {
            System.out.println("Old enough to vote.");

            if (isCitizen) {
                System.out.println("And you are a citizen, so you can vote!");
            } else {
                System.out.println("But you must be a citizen to vote.");
            }
        } else {
            System.out.println("Not old enough to vote.");
        }
    }
}
*/

//(3)Check temperature:

/*public class ConditionalQuestions {
    public static void main(String[] args) {

        int temperature = 30;

        if (temperature < 0) {
            System.out.println("It's freezing!");
        } else if (temperature < 20) {
            System.out.println("It's cool.");
        } else {
            System.out.println("It's warm.");
        }
    }
}
 */

// Switch statement

/*public class ConditionalQuestions {
    public static void main(String[] args) {

        int day = 4;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default :
                System.out.println("No match found");
        }
    }
}
*/

/* public class ConditionalQuestions {
    public static void main(String[] args) {

        String day = "Monday";

        switch (day){

            case "Saturday" , "Sunday" :
                System.out.println("6am");
                break ;

            case "Monday" :
                System.out.println("8am");
                break;

            default:
                System.out.println("10am");
        }
    }
}
 */

// Instead of using break; , Use arrow (->)

/*public class ConditionalQuestions {
    public static void main(String[] args) {

        String day = "Monday";

        switch (day){

            case "Saturday" , "Sunday" -> System.out.println("6am");

            case "Monday" -> System.out.println("8am");

            default -> System.out.println("10am");
        }
    }
}
 */

//While loop in java

/*public class ConditionalQuestions {
    public static void main(String[] args) {
        int i =0;

        while (i<5){
            System.out.println( i);
            i++;
        }
    }
}
 */

//practical example of the while loop combined with an if else statement, let's say we play a game of Yatzy:
//Print "Yatzy!" If the dice number is 6:

/*public class ConditionalQuestions {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 6) {
            if (i < 6) {
                System.out.println("Not Yatzy");
            } else {
                System.out.println("Yatzy!");
            }
            i++;
        }
    }
}
 */

//Nested while loop

/*public class ConditionalQuestions {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 4) {
            System.out.println("Hi" + i);

            int j = 1;
            while (j <= 3) {
                System.out.println("Hello" + j);
                j++;
            }
            i++;
      }
    }
  }
 */

//The for loop

/*public class ConditionalQuestions {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
 */

//Nested for loop (for day and time )

/*public class ConditionalQuestions {
    public static void main(String[] args) {
        // Outer loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // Executes 2 times

            // Inner loop
            for (int j = 1; j <= 2; j++) {
                System.out.println(" Inner: " + j); // Executes 4 times (2 * 2)
            }
        }
    }
}
 */



/*public class ConditionalQuestions {
    public static void main(String[] args) {

        for (int i=1; i<5; i++ ){
            System.out.println("Day"+i);

            for (int j = 1; j<9; j++){
                System.out.println(" " +(j+8)+" "+(j+9));
            }
        }

    }
}
 */

/*public class ConditionalQuestions {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
 */

/*public class ConditionalQuestions {
    public static void main(String[] args) {

        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i + "," + j +" ");
            }
        }
    }
}
 */
    //Use a loop to calculate the factorial of a given number:
public class ConditionalQuestions {
    public static void main(String[] args) {

        int n = 5;
        int fact = 1;

        for ( int i = 1; i <=5; i++){
            fact *= i;
        }

        System.out.println(fact);
    }
}