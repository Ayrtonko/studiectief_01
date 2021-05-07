import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    //test if the name and password are correct
    @Test
    public void account(){
        Account account = new Account("Ayrton", "kippensoep");
        assertEquals("Ayrton", account.getName);
        assertTrue(account.checkPassword("kippensoep"));
        assertFalse(account.checkPassword("autoband"));
    }

    //test if each Account obtains a new unique ID
    @Test
    public void uniqueID(){
        Account account1 = new Account("","");
        Account account2 = new Account("","");
        Account account3 = new Account("","");
        assertEquals(account1.getID, 1);
        assertEquals(account2.getID,2);
        assertEquals(account3.getID,3);
    }

    //test if an available day is set correctly
    @Test
    public void availability(){
        Account account1 = new Account("","");
        assertEquals(account1.getAvailability, "Tuesday");
        assertEquals(account1.getAvailability, "Wednesday");
    }

}