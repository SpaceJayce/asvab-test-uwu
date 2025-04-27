import java.util.Scanner;

public class Question {
    public static int points;
    public static int amtQuestions;

    public static void waitASec(int howLong) {
        try {
            Thread.sleep(howLong); // Example: Sleep for 1 second
        } catch (InterruptedException e) {
            // Handle the interruption
            System.out.println();
        }
    }

    public static void beginning() {
        System.out.println("Hello!! Welcome to my shitty test :3");
        waitASec(1000);
        System.out.println("These questions and answers are taken directly from 'ASVAB: 1001 Practice Questions for Dummies (+ Online Practice)'");
        waitASec(1000);
        System.out.println("Except this is graded and stuff. Its fun. idk. have fun. :33");
        waitASec(1000);
        System.out.println("There are literally 995 questions btw fr have fun");
        waitASec(1000);
        System.out.println();
        System.out.println("Anyways which test would you like to take??");

        System.out.println("A. Start me from the beginning (vocab)");
        System.out.println("B. Take me to a specific subject pls");
        System.out.println("C. DLAB info pls!");
    }


    public static void subjectsList() {
        System.out.println("The subjects go as followed: ");
        waitASec(1500);
        System.out.println("1: Word Knowledge/Vocabulary");
        waitASec(500);
        System.out.println("2: Paragraph Comprehension (understanding and analyzing written concepts)");
        waitASec(500);
        System.out.println("3. Math..... its just math");
        waitASec(500);
        System.out.println("4. Math but word problems!!");
        waitASec(500);
        System.out.println("5. General Science");
        waitASec(500);
        System.out.println("6. Auto and shop?? Workshop basics");
        waitASec(500);
        System.out.println("7. Mechanical Comprehension, Electronic Principles");
        waitASec(500);
        System.out.println("8. Assembling Objects (its crazy this is an asvab subject but ok. apparently coding speed is too, for the Navy??)");

        waitASec(1000);
        System.out.println();
        System.out.println("Which one would you like to go to? (1-6, or anything else to go back)");
    }

    public static void vocabQuestions() {
        points = 0;
        waitASec(1000);
        System.out.println();
        System.out.println("Part 1: Synonyms\n");
        waitASec(1000);

        System.out.println();

        String[] questions = {
            "Ardent", "Hamper", "Quaff", "Savory", "Vagary", "Wean", 
            "Yen", "Amenable", "Orate", "Superlative", "Mirth", "Munificent"};
        String[] answers = {
            "Trustworthy \nIgnorant \nPassionate \nDiligent", //ardent
            "Regulate \nPrevent \nPrevail \nDiscourage", //hamper
            "Duck \nEmbarrassment \nDrink \nLoud", //quaff
            "Flavorful \nTasty \nSpicy \nSweet", //savory
            "Hardship \nValiant \nFury \nChange", //vagary
            "Whisper \nHalt \nCare \nAdmit", //wean
            "Hatred \nChinese \nDesire \nCalming", //yen
            "Amended \nPrepared \nGuided \nCooperative", //amenable
            "Speak \nDecorate \nHygine \nAssign", //orate
            "Unfortunate \nDilapidated \nAverage \nExceptional", //superlative
            "Spice \nJoy \nSatisfaction \nSolemn", //mirth
            "Magnificent \nHelpful \nGlowing \nGenerous"}; //munificent
        String[] correctAnswers = {"C", "B", "C", "C", "D", "B", "C", "D", "A", "D", "B", "D"};

        for (amtQuestions = 0; amtQuestions < 11; amtQuestions++) {
            System.out.println();
            System.out.println(">> " + questions[amtQuestions] + " most nearly means: \n");
            System.out.println(answers[amtQuestions]);
            
            waitASec(1000);
            System.out.println();

            Scanner scanner = new Scanner(System.in);
            System.out.print("(A, B, C, D): ");
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase(correctAnswers[amtQuestions])) {
                points += 10;
                System.out.println(points);
                System.out.println("Correct!");
            } else {
                System.out.println(points);
                System.out.println(";(");
            }
            

            System.out.println("Continue? (y)/n>> ");
            String nextInput = scanner.nextLine();
            if (nextInput.equalsIgnoreCase("y")) {
                continue;
            } else if (nextInput.equalsIgnoreCase("")) {
                continue;
            } else {
                break;
            }
            
        }
        
        int totalQuestions = 11;
        System.out.println(points);

        int questionsCorrect = points / 10;
        System.out.println("Your total score was " + (questionsCorrect/totalQuestions) * 100);
        
    }

    public static void DLABInfo() {
        System.out.println("YIPPEEE!!!");
        waitASec(1000);
        System.out.println("The DLAB is also known as the Defense Language Aptitude Battery.");
        waitASec(2000);
        System.out.println("It's typically taken before you enter bootcamp, but after the ASVAB.");
        waitASec(1000);
        System.out.println("Scores range from like 93 to 164. Most people usually get around 120 or more.");
        waitASec(3000);
        System.out.println("If say, you were going into a language related job or training, the languages you can take go as followed: ");
        waitASec(1200);

        System.out.println();
        System.out.println("Category I languages (95+ on DLAB):");
        waitASec(1000);
        System.out.println("    Dutch, French, Italian, Portuguese, and Spanish");
        waitASec(1000);

        System.out.println();
        System.out.println("Category II & III languages (100-105+ on DLAB):");
        waitASec(1000);
        System.out.println("    German (weirdly, this is the only one with only 100+), \n"
        + "     Hebrew, Russian, Tagalog, Thai, and Vietnamese");
        waitASec(1000);

        System.out.println();
        System.out.println("Category IV languages (110+ on DLAB):");
        waitASec(1000);
        System.out.println("    Arabic, Chinese, Japanese, and Korean");
        waitASec(1500);

        System.out.println("So as you can see it's not that hard to get all of them.");
        waitASec(1000);
        System.out.println("The test itself consists of made up grammar rules and trying to figure out words.");
        waitASec(3000);
        System.out.println("If you know basic grammar rules or have any experience learning languages, you're probably good (but do study or whatever).");
        waitASec(1000);

        System.out.println("So, that's all I have on the dlab, as I fear no one asked.");
        waitASec(1000);
        System.out.println("Would you like to go back?");
        waitASec(4000);
        System.out.println("((You really have no choice...))");
    }

}

