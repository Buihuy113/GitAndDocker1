/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.chaythu.dockerandgit1.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author duchuy
 */
public class UserTest {
    
   @Test
    public void TestUpDateEmail(){
        User user=new User("1","buihuy@gmail.com");
        user.updateEmail("duchuybui68@gmial.com");
        assertEquals("duchuybui68@gmial.com",user.getEmail());
    }
    @Test
public void testUpdateEmailInvalid() {
    User user = new User("1", "test@gmail.com");
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
        user.updateEmail("invalid-email");
    });
    assertTrue(exception.getMessage().contains("Email không hợp lệ"));
}
    @Test
    public void testGetEmail() {
        User user = new User("1", "test@gmail.com");
        assertEquals("test@gmail.com", user.getEmail());
    }
    
}
