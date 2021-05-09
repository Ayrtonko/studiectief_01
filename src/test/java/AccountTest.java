import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    public void testCreateSchedule() {
        Account account011 = new Account("test", "password");
        Account account101 = new Account("test", "password");
        Account account110 = new Account("test", "password");
        Account account111 = new Account("test", "password");

        account011.setAvailability();
        account011.createSchedule();

        account101.login();
        account101.setAvailability();

        account110.login();
        account110.createSchedule();

        account111.login();
        account111.setAvailability();
        account111.createSchedule();

        assertEquals(account011.checklist(), 2);
        assertEquals(account101.checklist(), 2);
        assertEquals(account110.checklist(), 2);
        assertEquals(account111.checklist(), 3);

    }

}