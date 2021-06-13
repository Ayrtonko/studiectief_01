import model.Account;
import model.Login;
import model.Profile;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    private Account account1;
    private Account account2;
    private Account account3;

    @Test
    public void loginTest(){
        Profile profile1 = new Profile("naam");
        Login login1 = new Login("a", "ww");
        account1 = (new Account(profile1, login1));

        //not logged in so it returns null.
        assertNull(Account.getLoggedUser());

        account1.login("b","b");
        assertFalse(account1.isEnabled());
        account1.login("a","ww");
        assertTrue(account1.isEnabled());

        //logged in with the method login, getLoggedInUser will return account1 that was just created.
        assertEquals(Account.getLoggedUser(), account1);
    }

    @Test
    public void storedAccountsTests(){
        Profile profile1 = new Profile("naam");
        Login login1 = new Login("b", "ww");
        account1 = (new Account(profile1, login1));

        int expected = 2;
        int actual = Account.getAllAccounts().size();
        assertEquals(expected, actual);
    }

    @Test
    public void loggedInTest(){

    }

}