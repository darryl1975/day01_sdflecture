package sg.edu.nus.iss;

import java.io.Console;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Console con = System.console();
        String name = con.readLine("What is your name?");

        if (name.length() > 0) {
            // different ways to print the same content to console terminal
            System.out.printf("\nNice to meet you, %s", name);
            System.out.println("\nNice to meet you, " + name);
        } else {
            System.err.println("You have not told me your name");
        }

        Integer age = 80;
        System.out.printf("\n%s is %d years old.", name, age);
        System.out.println("\n" + name + " is " + age + " years old");

        String mother_name = "Esther";
        System.out.printf("\nMy name is %s. Mother is %s.", name, mother_name);

        // Slide 17
        // read input from keyboard
        String input = con.readLine("What is your hobby?");
        input = input.trim(); // " swim " --> "swim"

        if (input.equals("swim")) {
            System.out.println("The nearest swimming pool is Clementi");
        } else if (input.equals("jog")) {
            System.out.println("The nearest park is West Coast Park");
        } else if (input.equals("cycle")) {
            System.out.println("You could cycle along the PCN");
        } else {
            System.out.println("Seems like you are a boring person without hobby");
        }

        // Slide 18
        // Switch statement
        switch (input) {
            case "swim":
                System.out.println("The nearest swimming pool is Clementi");
                break;
            case "jog":
                System.out.println("The nearest park is West Coast Park");
                break;
            case "cycle":
                System.out.println("You could cycle along the PCN");
                break;
            default:
                System.out.println("Seems like you are a boring person without hobby");
                break;
        }


        // Slide 19
        Integer myAge = 0;
        String inputAge = con.readLine("What is your age?");

        myAge = Integer.parseInt(inputAge);

        if (myAge >= 0 && myAge <= 2) {
            System.out.println("you are a baby");
        } else if (myAge > 2 && myAge <= 4) {
            System.out.println("you are a toddler");
        } else if (myAge > 4 && myAge <= 12) {
            System.out.println("you are a child");
        } else if (myAge > 12 && myAge < 19) {
            System.out.println("You are a teen");
        } else {
            System.out.println("you are an adult");
        }

        // Slide 21 
        Integer i = 0;
        input = con.readLine("Type a phrase: ");

        while (i < input.length() + 1) {
            // do/process something here
            // e.g. Clementi --> BeginIndex = 0, C  EndIndex = 0 C
            // BeginIndex = 0, C   EndIndex = will increase based on 'i'
            // substring(beginIndex, endIndex)
            System.out.println(input.substring(0, i));

            // i = i + 1 --> i++
            // i = i - 1 --> i--
            i++;
        }


        for (int idx = 0; idx < input.length() + 1; idx++) {
            System.out.println(input.substring(0, idx));
        }


        // Slide 23
        String[] todo = new String[5];

        for(int pos = 0; pos < todo.length; pos++) {
            input = con.readLine("Enter Todo task " + (pos + 1) + ": ");
            todo[pos] = input;
        }

        for (int pos = 0; pos < todo.length; pos++) {
            System.out.println("Task " + (pos + 1) + "--> " + todo[pos]);
        }

        // Slide 24
        String strName = "NUS";

        if (args.length > 0) {
            strName = args[0];
        }
        System.out.println("Hello " + strName);

    }
}
