/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerTest;

import controller.LoginController;
import model.TaiKhoan;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Anh Le
 */
public class LoginControllerTest {

    public LoginControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
    
    @Test
    public void testCheckLoginCustomerFalse() {
        System.out.println("Check function check login quan ly case false:");
        LoginController login_control = new LoginController();
        TaiKhoan taiKhoan = new TaiKhoan("quanly1", "quanly");
        boolean result =false;
         result= login_control.checkLogin(taiKhoan);
        boolean expResult = false;
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckLoginCustomerTrue() {
        System.out.println("Check function check login customer case true:");
        LoginController login_control = new LoginController();
        TaiKhoan taiKhoan = new TaiKhoan("q", "q");
        boolean result =false;
         result= login_control.checkLogin(taiKhoan);
        boolean expResult = true;
        assertEquals(expResult, result);
    }
}
