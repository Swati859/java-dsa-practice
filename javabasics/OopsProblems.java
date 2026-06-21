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

public class OopsProblems {
    public static void main(String [] args){
        Integer a =Integer.valueOf("100");

        System.out.println(a);
    }
}