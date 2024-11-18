import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        int age = 0;
        int favNum = 0;
        double salary = 0;
        double constrained = 0; // must be between 100 and 10000


/*
        firstName = getNonZeroLenString(in, "Enter your first name ");

        System.out.println("First name is " + firstName);



        age = getInt(in, "Enter your age ");
        System.out.println("Your age is " + age);


        salary = getDouble(in, "Enter your salary ");
        System.out.println("Your salary is: " + salary);


    favNum = getRangedInt(in, "Enter your favorite number", 1,10);
        System.out.println("Your favorite number is " + favNum);



        constrained = getRangedDouble(in, "Enter the constrained double",100,10000);
        System.out.println("Your constrained double is " + constrained);

 */


    }

    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retVal = "";

        do {
            System.out.print(prompt + ": ");
            retVal = pipe.nextLine();

            if (retVal.isEmpty())
                System.out.println("You must enter at least 1 character!");

        } while (retVal.length() == 0);

        return retVal;

    }


    /**
     * gets an int value from the user at the console with no constraint
     *
     * @param pipe   A scanner used to get the input
     * @param prompt tells the user what ot input
     * @return returns the input of any value
     */

    public static int getInt(Scanner pipe, String prompt) {
        int retVal = 0;
        boolean done = false;
        String trash = "";


        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("Enter a valid integer, not " + trash);
            }


        } while (!done);

        return retVal;
    }

    /**
     *  gets an double value from the user at the console with no constraint
     * @param pipe A scanner used to get the input
     * @param prompt tells the user what ot input
     * @return returns a double of any value
     */

    public static double getDouble (Scanner pipe, String prompt)
    {
        double retVal = 0;
        boolean done = false;
        String trash = "";


        do
        {
            System.out.print(prompt + ": ");
            if(pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("Enter a valid double, not " + trash);
            }


        }while(!done);

        return retVal;
    }

    /**
     * Gets an integer from the user via the console within a specified range
     *
     * @param pipe the scanner to use
     * @param prompt the prompt to tell the user what to do
     * @param low the inclusive low bound
     * @param high the inclusive high bound
     * @return an int between the range of numbers
     */

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = 0;
        boolean done = false;
        String trash = "";


        do
        {
            System.out.print(prompt + " [" + low + "-" + high + "]: ");
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if(retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a value within the range [" + low + " - " + high + "]");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("Enter a valid integer, not " + trash);
            }


        }while(!done);

        return retVal;
    }

    /**
     * Gets a double from the user via the console within a specified range
     *
     * @param pipe the scanner to use
     * @param prompt the prompt to tell the user what to do
     * @param low the inclusive low bound
     * @param high the inclusive high bound
     * @return a double between the range of numbers
     */


    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retVal = 0;
        boolean done = false;
        String trash = "";


        do
        {
            System.out.print(prompt + " [" + low + "-" + high + "]: ");
            if(pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                if(retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a value within the range [" + low + " - " + high + "]");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("Enter a valid double, not " + trash);
            }


        }while(!done);

        return retVal;
    }

    /**
     * Gets a Yes or No form the user and returns the equivalent true or false
     *
     * @param pipe scanner to use for input
     * @param prompt tells the user what ot enter
     * @return returns true or false based oin y or n
     */


    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        String input;
        boolean validInput;

        do {
            System.out.print(prompt + "[Y/N]: ");
            input = pipe.next().toLowerCase();
            validInput = input.equals("y") || input.equals("n");

            if (!validInput) {
                System.out.println("You must enter [Y/N]");
            }
        } while (!validInput);
        return input.equals("y");
    }

    public static String getRegExString (Scanner pipe, String prompt, String regEx)
    {
        String retString;
        do
        {
            retString = getNonZeroLenString(pipe, prompt);
        } while (!retString.matches(regEx));
        return retString;
    }
}




