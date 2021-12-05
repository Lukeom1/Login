import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class verifyTest {

    @Test
    public void emailATVerification(){
        verify email = new verify();
        assertTrue(email.verifyEmail("me@gmail.com"));
    }

    @Test
    public void emailDotVerification(){
        verify email = new verify();
        assertTrue(email.verifyEmail("me@gmail.com"));
    }

    @Test
    public void passwordLengthVerification(){
        verify password = new verify();
        assertTrue(password.verifyPassword());
    }
}