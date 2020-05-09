import java.util.*;

public class MainCall {
    public static void main(String[] args) {

        // AsciiChars.printNumbers();
        // AsciiChars.printUpperCase();
        // AsciiChars.printLowerCase();

        // ask for user to input values
        Scanner userInput = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = userInput.next();
        System.out.printf("Hello %s\n ", name);

        System.out.print("Do you wish to continue - yes or no ?");
        String choice = userInput.next();
        if (choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y")) {
            System.out.printf("Let's continue by answering below questions\n");
        } else if ("no".equalsIgnoreCase(choice) || "n".equalsIgnoreCase(choice)) {
            System.out.println("Please return later to complete the survey");
            System.exit(0);
        } else {
            System.out.printf("Please enter yes or no");
        }

        boolean repeat = true;

        do {
            String carName = "";
            String favPet = "";
            int randomNumber = 0;
            int agePet = 0;
            int jersey = 0;
            int model = 0;
            String actor = " ";
            int luckyNumber = 0;
            // loop for asking repeated question

            System.out.print("Do you have a red car?(yes or no): ");
            carName = userInput.next();
            System.out.print("Name of your favorite pet ");
            favPet = userInput.next();
            System.out.print("Age of your favorite pet ");
            agePet = userInput.nextInt();
            System.out.print("What is your lucky number? ");
            luckyNumber = userInput.nextInt();
            System.out.print("Do you have a favorite quarter back (yes/no)? ");
            String quarter = userInput.next();
            if (quarter.equalsIgnoreCase("yes") || (quarter.equalsIgnoreCase("y"))) {
                System.out.print("What is their jersey number?");
                jersey = userInput.nextInt();
            }
            System.out.print("What is the 2-digit model year of your car? ");
            model = userInput.nextInt();
            System.out.print("What is the first name of your favorite actor/actress? ");
            actor = userInput.next();
            System.out.print("Enter a random number between 1 and 50: ");
            randomNumber = userInput.nextInt();

            // Random number generation
            // Creating an object of Random class
            Random random = new Random();

            int randomNum1 = random.nextInt(65);
            System.out.println("Random integer : " + random.nextInt(65));
            int randomNum2 = random.nextInt(75);
            System.out.println("Random integer  " + random.nextInt(75));

            // Magic ball
            int magicBallNumber = luckyNumber * randomNum1;

            if (magicBallNumber > 75) {
                magicBallNumber = magicBallNumber - 75;
            }
            System.out.println("Magic Ball number: " + magicBallNumber);

            // lottery
            int lotteryNum1 = model + luckyNumber;

            int lotteryNum2 = randomNumber - randomNum2;
            if (lotteryNum2 < 1) {
                lotteryNum2 = lotteryNum2 + 65;
            }
            int lotteryNum3 = 42;
            int lotteryNum4 = agePet + model;
            int lotteryNum5 = actor.charAt(0);
            while (lotteryNum5 > 65) {
                lotteryNum5 = lotteryNum5 - 65;
            }

            System.out.printf("Lottery numbers : " + lotteryNum1 + ", " + lotteryNum2 + ", " + lotteryNum3 + ", "
                    + lotteryNum4 + ", " + lotteryNum5);

            System.out.println(" \nDo you like to generate another set of numbers? ");
            String repeatQuestion = userInput.next();
            if ((repeatQuestion.equalsIgnoreCase("yes")) || (repeatQuestion.equalsIgnoreCase("y"))) {
                repeat = true;
            } else {
                repeat = false;
            }

        } while (repeat);
        System.out.print("Thank you! Have a great day");
        System.exit(0);
    }

}
