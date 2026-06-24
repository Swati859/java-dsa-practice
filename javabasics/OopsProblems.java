package javabasics;

// Create a class
/*public class OopsProblems {
    int x = 5;
    }

 */


// Create an Object
/*public class OopsProblems {
    int x = 5;

    public static void main(String[] args) {
        OopsProblems myAge1 = new OopsProblems();
        System.out.println(myAge1.x);
    }
}
 */



// Create a class , objects and access attribute and also modify the attributes

/*public class OopsProblems {
    int x = 5;
    int y = 10;

    public static void main(String[] args) {
        OopsProblems myAge1 = new OopsProblems();
        OopsProblems myAge2 = new OopsProblems();
        myAge2.y = 25;

        System.out.println(myAge1.x);
        System.out.println(myAge2.y);
    }
}
 */

//_________________

//Access Methods With an Object

/*public class OopsProblems {

    static void myMethod(){
        System.out.println("Swati");
    }

    static void myAge(){
        System.out.println(22);
    }

    public static void main (String[]args){
        OopsProblems myName = new OopsProblems();
        OopsProblems myAgeNumber = new OopsProblems();

        myName.myMethod();
        myAgeNumber.myAge();
    }
}
 */

// Create a Constructor

/*public class OopsProblems {
    int x;

    public OopsProblems() {
        x = 10;
    }

    public static void main(String[] args) {

        OopsProblems myObj = new OopsProblems();

        System.out.println(myObj.x);
    }
}
*/

// Constructor Parameters

/*public class OopsProblems {
    String modelName ;
    int modelAge ;

    public OopsProblems(String name , int age) {
        modelName = name ;
        modelAge = age;
    }
    public static void main (String[]args){

        OopsProblems myObj = new OopsProblems("Swati" , 22);

        System.out.println(myObj.modelName + " " + myObj.modelAge);
    }
}
 */


// This Keyword

/*public class OopsProblems {

    String collegeName;
    int collegeYear;

    public OopsProblems(String collegeName){
        this (collegeName , 2023); // Call the two-parameter constructor to reuse code and set a default year
    }

    public OopsProblems(String collegeName, int collegeYear){
        this.collegeName = collegeName; // Use 'this' to assign values to the class variables
        this.collegeYear = collegeYear;
    }

    public static void main (String[]args){
        OopsProblems myObj = new OopsProblems("LNCTU" , 2023);

        System.out.println(myObj.collegeName + " " + myObj.collegeYear);
    }
}
 */

// Java Modifiers

//Protected Modifier

/*public class OopsProblems {
    protected String fname = "John";
    protected String lname = "Doe";
    protected String email = "john@doe.com";
    protected int age = 24;
}

class Student extends OopsProblems{
    private int graduationYear = 2018;
    public static void main(String[] args) {
        Student myObj = new Student();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Email: " + myObj.email);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
    }
}
 */
//-----------

// Non-Access Modifier - final keyword

/* final class Dummy{
    public final void someMethod()
    {  }
}

/*class MoreDummy extends Dummy { // Error : Java classes declared as final cannot be extended. Restricting inheritance .
    public void someMethod() // Error : Methods declared as final cannot be overridden.
    { }
}
 */

/*public class OopsProblems {
    private final int x ; //final instance member variable

    private final static int y; // final static member variable
       static
       {y = 4;}
    OopsProblems()
    {x=5;}

    public void fun(){
           final int k ; // final local variable
    }
    public static void main (String[] args){
           OopsProblems myObj = new OopsProblems();
    }
}
*/

// Wrapper Classes

/*public class OopsProblems {
    public static void main(String [] args){

        //1. valueOf() : Converts a primitive or String into a wrapper object
        Integer num = Integer.valueOf("100");
        System.out.println(num);

        //2. parseXxx() : Converts String to primitive value.

        int n = Integer.parseInt("100");
        double d = Double.parseDouble("12.5");
        System.out.println(n);
        System.out.println(d);


        //3. toString() : Converts value to String.
        Integer num1 = 5;
        Integer num2 = 10;

        String s = num1.toString(5) + num1.toString(10);
        System.out.println(s);

        // 4. compare() : Compares 2 value
        System.out.println(Integer.compare(10, 20));

    }
}

 */

// Command Line Arguments

// 1. Print : "Hello"
/*public class OopsProblems {
    public static void main(String[] args) {

        System.out.println(args[0]);
    }
}
 */


// 2. Print : All values entered by user.
/*public class OopsProblems {
    public static void main(String[] args) {
        for(int i = 0; i<args.length ; i++) {

            System.out.println(args[i]);
        }
    }
}
 */


// 3. Print : Sum of given no's

/*public class OopsProblems {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i<args.length ; i++) {
            sum = sum + Integer.parseInt(args[i]);

            System.out.println(sum);
        }
    }
}
 */

// Encapsulation

/*public class OopsProblems {

    private String name; // private = restricted access

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
}
 */

// Inheritance :

//In the example below, the Car class (subclass) inherits the attributes and methods from the Vehicle class (superclass):

/* public class OopsProblems {
        protected String brand = "Ford";        // Vehicle attribute
        public void myMethod() {                    // Vehicle method
            System.out.println("Tuut, tuut!");
        }
    }

    class Car extends OopsProblems {
        private String modelName = "Mustang";    // Car attribute
        public static void main(String[] args) {

            Car myCar = new Car();  // Create a myCar object

            myCar.myMethod();  // Call the myMethod() method (from the Vehicle class) on the myCar object


            // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
            System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
 */

// Initialization Block :

public class OopsProblems{
    protected int x;

    {
        System.out.println("Initialization Block : =" + x);
        x = 5;
    }

    public OopsProblems(){
        System.out.println("Constructor : x =" + x);
    }

    public static void main(String[]args){}

    OopsProblems t1 = new OopsProblems();
}

