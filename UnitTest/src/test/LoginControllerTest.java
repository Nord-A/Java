package test;

import com.osorio.LoginController;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginControllerTest {

    LoginController loginController;

    @Before
    public void setup(){
        // denne metode bliver kaldt HVER gang FØR en test køres
        loginController = new LoginController();
    }

    @Test
    public void testCreateUser(){
        boolean resultat = loginController.createUser("Ole","123");
        assertEquals(false,resultat);
        resultat = loginController.createUser("Ole", "123");
        assertEquals(true, resultat);
    }

}
