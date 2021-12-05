import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class verifyTest {

    @Test
    public void emailVerification(){
        verify email = new verify();
        assertTrue(email.verifyEmail().matches("(.*)@(.*)"));
    }
}