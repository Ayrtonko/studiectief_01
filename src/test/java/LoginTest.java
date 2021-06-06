import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    @Test
    public void UniqueUsername(){
        Login login1 = new Login("aap","b");
        assertTrue(Login.checkUniqueUsername("leeuw"));
        assertFalse(Login.checkUniqueUsername("aap"));
    }

}