package javabasics;

// Without public get and set methods :
/*
public class Second {

    public static void main(String[] args){
        OopsProblems myObj = new OopsProblems();
        myObj.name = "John";  // error
        System.out.println(myObj.name); // error
    }
}
 */

// Use public get and set methods :

/*public class Second{

    public static void main(String[] args) {
        OopsProblems myObj = new OopsProblems();
        myObj.setName("John");  // no - error : Sets the value
        System.out.println(myObj.getName()); // no - error
    }
}
 */
