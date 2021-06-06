import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean done = true;
        Scanner scanner = new Scanner(System.in);

        while (done) {

            menu();
            switch (choice) {
                int choice = scanner.nextInt();
                case 1:
                    String nameInput = scanner.nextLine();
                    String pw = scanner.nextLine();
                    Account.login(nameInput, pw );
                    break;

                case 2:
                    Account.createAccount();
                    break;

                case 3:

                    break;

                case 4:
                    break;

                case 5:
                    break;


            }
        }
    }
    public static void menu(){
        System.out.println("1)Login");
        System.out.println("2)Create account");
        System.out.println("3)add day not available");
        System.out.println("4)Not available days");

    }
}
