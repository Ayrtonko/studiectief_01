import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        //demo studiectief
        Scanner scanner = new Scanner(System.in);
        boolean done = true;
        User user = new User("admin","admin");

        while(done){
            menu();
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    user.addUser();
                    break;

                case 2:
                    user.addDateNot();
                    break;

                case 3:
                    user.createDaySchedule();
                    break;

                case 4:
                    System.out.println(user.getMyStudySession());
                    break;

                case 5:
                    System.out.println(user.getAvailabilityList());
                    break;


        }
        }
    }
    public static void menu(){
        System.out.println("Menu");
        System.out.println("1) maak account");
        System.out.println("2) vul beschikbaarheid in");
        System.out.println("3) maak een dagplanning");
        System.out.println("4) toon mijn dagplanningen");
        System.out.println("5) toon dagen niet beschikbaar");
    }
}
