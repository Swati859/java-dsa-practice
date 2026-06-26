package dsaproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//To add elements to an ArrayList
/* public class ArrayListProblems {

        public static void main(String[]args) {

            ArrayList<String> cars = new ArrayList<String>();

            cars.add("Maruti");  // Add Element
            cars.add("Honda");

            cars.add(0 , "Suzuki"); // Insert Element

            cars.set(0 , "Swift"); //Modify an Element

            for(int i=0; i<cars.size(); i++){
                System.out.println(cars.get(i));
            }

            System.out.println(cars);

            System.out.println(cars.get(2)); // Get Element

        }
    }
 */

// Loop through an ArrayList with the for - each loop:

/*public class ArrayListProblems {
    public static void main(String[]args) {

        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Maruti");
        cars.add("Suzuti");

        for (String i : cars){
            System.out.println(i);
        }
    }
}
 */

//Sort an ArrayList of Strings
//Another useful class in the java.util package is the Collections class,
// which include the sort() method for sorting lists alphabetically or numerically:

/*public class ArrayListProblems {
    public static void main(String[]args){
        ArrayList <String> cars = new ArrayList<String>();

        cars.add("Maruti");
        cars.add("Suzuki");
        cars.add("Honda");
        cars.add("Tata");

        Collections.sort(cars);

        for(String i : cars){
            System.out.println(i);
        }
    }
}
 */

// var keyword : Use the var keyword to declare an ArrayList variable without writing the type twice

/* public class ArrayListProblems {
    public static void main(String[]args) {

        // ArrayList<String> cars = new ArrayList<String>();
        var cars = new ArrayList<String>();

        cars.add("Maruti");
        cars.add("Suzuti");

        for (String i : cars){
            System.out.println(i);
        }
    }
}
 */

// The List Interface:
// This means the variable (cars) is declared as a List (the interface),
// but it stores an ArrayList object (the actual list).
// Since ArrayList implements the List interface, this is possible.

public class ArrayListProblems {
    public static void main(String[] args) {

        // ArrayList<String> cars = new ArrayList<String>();
        List<String> cars = new ArrayList<>();

        cars.add("Maruti");
        cars.add("Suzuti");

        for (String i : cars) {
            System.out.println(i);
        }
    }
}

