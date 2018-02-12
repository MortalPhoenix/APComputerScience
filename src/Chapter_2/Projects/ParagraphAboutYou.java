package Chapter_2.Projects;

import java.util.Scanner;

public class ParagraphAboutYou {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("How old are you?");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("What college do you go to?");
        String college = input.nextLine();

        System.out.println("What is your pets name?");
        String petName = input.nextLine();

        System.out.println("Hello, my name is" + name + "and I am " + age + "years");
        System.out.println("old. I'm enjoying my time at " + college + ", though");
        System.out.println("I miss my pet" + petName + "very much!");
    }
}
