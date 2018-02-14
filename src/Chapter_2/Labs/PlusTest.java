package Chapter_2.Labs;
// ************************************************************ // PlusTest.java
//
// Demonstrate the different behaviors of the + operator
// ************************************************************

public class PlusTest  {

    public static void main(String[] args) {
        System.out.println("This is a long string that is the " + "concatenation of two shorter strings.");
        System.out.println("The first computer was invented about" + 55 + "years ago.");

        System.out.println("8 plus 5 is " + 8 + 5); //Printed: 8 plus 5 is 85
        //Order of operations: String + 8 --> Results in a String, String + 5 --> Results in a String

        System.out.println("8 plus 5 is " + (8 + 5)); //Printed: 8 plus 5 is 13
        //Order of operations: 5 + 8 --> Results in a Int, 13 + String --> Results in a String

        System.out.println(8 + 5 + " equals 8 plus 5."); //Printed: 13 equals 8 plus 5.
        //Order of operations: 8 + 5 --> Results in a Int, 13 + String --> Results in a String
    }
}
