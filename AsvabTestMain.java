import java.util.Scanner;

public class AsvabTestMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            Question.beginning();

            String firstInput = scanner.nextLine();
    
            if (firstInput.equalsIgnoreCase("A")) {
                Question.vocabQuestions();
            } else if (firstInput.equalsIgnoreCase("B")) {
                Question.subjectsList();
                String secondInput = scanner.nextLine();
                
                switch (secondInput) {
                    case "1":
                        Question.vocabQuestions();
                        break;
                    case "2":
                        break;
                    case "3":
                        break;
                    case "4":
                        break;
                    case "5":
                        break;
                    case "6":
                        break;
                    case "7":
                        break;
                    default:
                        Question.beginning();
                }
            } else if (firstInput.equalsIgnoreCase("C")) {
                Question.DLABInfo();
                String thirdInput = scanner.nextLine();
                System.out.println("You said " + thirdInput + " :3");
            } else if (firstInput.equalsIgnoreCase("D")) {
    
            } else {
                System.out.println("Invalid >:(");
                Question.waitASec(1000);
                System.out.println("Exiting program (3, 2, 1)");
                Question.waitASec(3000);
                System.exit(0);
            }
        }
    }

}