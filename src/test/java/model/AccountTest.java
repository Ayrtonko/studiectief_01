package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    public void testAccountcreation(){

        Account account1 = new Account(Profile.createProfile("yo"), LoginCreator.loginCreate("a", "b"));
        Account account2 = new Account(Profile.createProfile("yo"), LoginCreator.loginCreate("b", "b"));
        Account account3 = new Account(Profile.createProfile("yo"), LoginCreator.loginCreate("c", "b"));
        assertEquals(3, Account.getAllAccounts().size());
    }

    @Test
    public void testLoggedAccount(){
        Account account4 = new Account(Profile.createProfile("test"), LoginCreator.loginCreate("test", "b"));
        account4.getLogin().login();
        assertEquals("test", Account.getLoggedAccount().getProfileFirstname());
    }

}