import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean playAgain;

        System.out.println("🎓 Welcome to the Java Quiz App!");
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Start Quiz");
            System.out.println("2. Exit");
            System.out.print("Enter your choice (1 or 2): ");
            int choice = sc.nextInt();

            if (choice == 2) {
                System.out.println("\n Thank you for using the Quiz App. Goodbye!");
                break;
            } else if (choice != 1) {
                System.out.println(" Invalid choice. Please enter 1 or 2.");
                continue;
            }

            do {
                // Questions, options, answers, and explanations
                String[] questions = {
                    "1. What is the size of int in Java?",
                    "2. Which keyword is used to inherit a class in Java?",
                    "3. What does JVM stand for?",
                    "4. Which method is the entry point in a Java program?",
                    "5. Which of the following is not a Java keyword?",
                    "6. Which collection class allows you to grow or shrink its size and provides indexed access to its elements?",
                    "7. What is the default value of a boolean variable in Java?",
                    "8. Which of the following is not part of OOPs in Java?",
                    "9. Which operator is used for object reference comparison?",
                    "10. What is the extension of a compiled Java file?"
                };

                String[][] options = {
                    {"a) 2 bytes", "b) 4 bytes", "c) 8 bytes", "d) 1 byte"},
                    {"a) this", "b) super", "c) extends", "d) implements"},
                    {"a) Java Virtual Method", "b) Java Very Main", "c) Java Virtual Machine", "d) Java Visual Manager"},
                    {"a) start()", "b) begin()", "c) main()", "d) run()"},
                    {"a) class", "b) try", "c) Integer", "d) final"},
                    {"a) ArrayList", "b) HashMap", "c) TreeMap", "d) HashSet"},
                    {"a) true", "b) false", "c) 0", "d) null"},
                    {"a) Encapsulation", "b) Abstraction", "c) Compilation", "d) Inheritance"},
                    {"a) .", "b) equals()", "c) == ", "d) !="},
                    {"a) .exe", "b) .java", "c) .class", "d) .javac"}
                };

                char[] answers = {'b', 'c', 'c', 'c', 'c', 'a', 'b', 'c', 'c', 'c'};

                String[] explanations = {
                    "int in Java takes 4 bytes (32 bits).",
                    "The 'extends' keyword is used to inherit a class in Java.",
                    "JVM stands for Java Virtual Machine – it runs Java bytecode.",
                    "'main()' is the entry point of every Java program.",
                    "'Integer' is a class, not a keyword in Java.",
                    "ArrayList is a dynamic array and supports index-based access.",
                    "Default value of boolean in Java is false.",
                    "Compilation is a process, not an OOP concept.",
                    "'==' checks reference equality (same object).",
                    "Java source files compile into .class bytecode files."
                };

                int score = 0;

                for (int i = 0; i < questions.length; i++) {
                    System.out.println("\n" + questions[i]);
                    for (String option : options[i]) {
                        System.out.println(option);
                    }

                    System.out.print("Your answer (a/b/c/d): ");
                    char userAnswer = sc.next().toLowerCase().charAt(0);

                    if (userAnswer == answers[i]) {
                        System.out.println(" Correct!");
                        score++;
                    } else {
                        System.out.println(" Incorrect!");
                        System.out.println("Correct Answer: " + answers[i]);
                        System.out.println("Explanation: " + explanations[i]);
                    }
                }

                // Final results
                double percentage = (score / 10.0) * 100;
                System.out.println("\n Quiz Completed!");
                System.out.println("Correct Answers: " + score + "/10");
                System.out.printf("Your Score: %.2f%%\n", percentage);

                // Ask to retry
                System.out.print("\nDo you want to try again? (yes/no): ");
                playAgain = sc.next().equalsIgnoreCase("yes");

            } while (playAgain);
        }

        sc.close();
    }
}
