import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    public void testCreateSchedule(){
        Account account011 = new Account("test","password");
        Account account101 = new Account("test","password");
        Account account110 = new Account("test","password");
        Account account111 = new Account("test","password");



        assertEquals(checklist(), 20);
        assertEquals(checklist(), 200);
        assertEquals(checklist(), 2000);
        assertEquals(checklist(), 3);




    }


}