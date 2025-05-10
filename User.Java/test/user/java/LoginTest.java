/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package user.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author princ
 */
public class LoginTest 
{
    Login login = new Login();
    public LoginTest() {}
    
    
    public void testGetLogin()
    {
        String expected = "Welcome";
        String actual = login.getLogin();
                
        assertEquals(expected,actual);
    }      
}
