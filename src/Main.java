import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

                Scanner in = new Scanner(System.in);
                int age;

                System.out.print("Enter your age: ");
                if (in.hasNextInt()) {
                    age = in.nextInt();
                    in.nextLine();

                    if (age >= 21) {
                        System.out.println("You get a wristband.");
                    }
                } else {
                    String trash = in.nextLine();
                    System.out.println("Invalid input. Please enter a valid age.");
                }
            }
        }