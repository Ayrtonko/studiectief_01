public class Main {
    public static void main(String[]args){
        System.out.println("hi");
        Profile profile1 = new Profile("naam");
        Login login1 = new Login("b", "ww");
        Account account = new Account(profile1, login1);


        account.login("b","ww");
        Account accountCast = Account.getLoggedUser();
        accountCast.addNotAvailableDayToAccount();

        System.out.println(accountCast.getNotAvailable());
    }
}
