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

public class OopsProblems {
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
