package old.unitTests.RegExp.user.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import old.unitTests.RegExp.user.model.User;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User user;
    String email = "peter@mail.ru";
    String password = "123b456Ab!";


    @BeforeEach
    void setUp() throws Exception {
        user = new User(email, password);
    }

    @Test
    void testCorrectEmail() {
        String expected = "peter@mail.ru";
        user.setEmail("peter@mail.ru");
        assertEquals(expected, user.getEmail());
    }


    @Test
    void testWithoutAt() {
        user.setEmail("peter.mail.ru");
        assertEquals(email, user.getEmail());
    }

    //
    @Test
    void testDoubletAt() {
        user.setEmail("peter@ma@il.com");
        assertEquals(email, user.getEmail());
    }

    @Test
    void testDotAfterAt() {
        user.setEmail("peter@ma@ilru");
        assertEquals(email, user.getEmail());
    }

    @Test
    void testLastDot() {
        user.setEmail("peter@ma@ilr.u");
        assertEquals(email, user.getEmail());
        user.setEmail("peter@ma@ilru.");
        assertEquals(email, user.getEmail());
    }

    @Test
    void testIncorrectSymbol() {
        user.setEmail("pet!er@ma@ilr.u");
        assertEquals(email, user.getEmail());
    }

    // ============= password ================

    @Test
    void testCorrectPassword() {
        String inCorrectPassword = "23b456Ab!";
        user.setPassword(inCorrectPassword);
        assertEquals(inCorrectPassword, user.getPassword());
    }

    @Test
    void testPasswordLength() {
        user.setPassword("23b456");
        assertEquals(password, user.getPassword());
    }

    @Test
    void testPasswordUpper() {
        user.setPassword("23b456ab!"); // почему проходит если символов уже больше???
        assertEquals(password, user.getPassword());
    }

    @Test
    void testPasswordLower() {
        user.setPassword("QWSRTY%8");
        assertEquals(password, user.getPassword());
    }

    @Test
    void testPasswordDigits() {
        user.setPassword("As#hjjkkhb");
        assertEquals(password, user.getPassword());
    }

    @Test
    void testPasswordSymbol() {
        user.setPassword("23b456Ab");
        assertEquals(password, user.getPassword());
    }

}