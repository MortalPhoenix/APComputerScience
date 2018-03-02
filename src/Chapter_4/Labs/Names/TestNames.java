package Chapter_4.Labs.Names;

import java.util.Scanner;

public class TestNames {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a name (press enter between first, middle, and last): ");

        String first1 = input.next();
        String middle1 = input.next();
        String last1 = input.next();

        Name name1 = new Name(first1, middle1, last1);

        System.out.println(name1.getFirstMiddleLast());
        System.out.println(name1.getLastFirstMiddle());
        System.out.println(name1.initials());
        System.out.println(name1.length());

        System.out.println("Enter a name (press enter between first, middle, and last): ");

        String first2 = input.next();
        String middle2 = input.next();
        String last2 = input.next();

        Name name2 = new Name(first2, middle2, last2);

        System.out.println(name2.getFirstMiddleLast());
        System.out.println(name2.getLastFirstMiddle());
        System.out.println(name2.initials());
        System.out.println(name2.length());

        System.out.println("The names are equal: " + name1.getEquals(name2.getFirstMiddleLast()));
    }
}
