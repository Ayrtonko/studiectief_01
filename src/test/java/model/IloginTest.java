package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IloginTest {

    @Test
    public void checkUniqueName(){
        assertTrue(LoginCreator.checkUniqueUsername("luiaard"));
        assertTrue(LoginCreator.checkUniqueUsername("vis"));
        assertTrue(LoginCreator.checkUniqueUsername("koe"));
    }

    @Test
    public void createTest(){
        LoginCreator.loginCreate("aap","password");
        LoginCreator.loginCreate("kip","password");
        LoginCreator.loginCreate("varken","password");
        //dubbel om te kijken of het toegevoegd wordt
        LoginCreator.loginCreate("varken","password");
        assertEquals(3, Ilogin.allLogin.size());
    }

}