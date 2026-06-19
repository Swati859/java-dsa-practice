package javabasics;

/*public class StringProblems {

    static String[] splitString(String str) {

        int n = str.length();

        int frontLen, middleLen, endLen;

        if (n % 3 == 0) {
            frontLen = middleLen = endLen = n / 3;
        }
        else if (n % 3 == 1) {
            frontLen = n / 3;
            middleLen = n / 3 + 1;
            endLen = n / 3;
        }
        else {
            frontLen = n / 3 + 1;
            middleLen = n / 3;
            endLen = n / 3 + 1;
        }

        String front = str.substring(0, frontLen);
        String middle = str.substring(frontLen, frontLen + middleLen);
        String end = str.substring(frontLen + middleLen);

        return new String[]{front, middle, end};
    }
}
 */

public class StringProblems{

    public static void main(String[] args) {
        OopsProblems myCar = new OopsProblems();     // Create a myCar object
        myCar.fullThrottle();      // Call the fullThrottle() method
        myCar.speed(200);          // Call the speed() method
    }
}
