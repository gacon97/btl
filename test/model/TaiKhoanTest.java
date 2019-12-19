/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Anh Le
 */
public class TaiKhoanTest {
    
    public TaiKhoanTest() {
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

    /**
     * Test of getUsername method, of class TaiKhoan.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        TaiKhoan instance = null;
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class TaiKhoan.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        TaiKhoan instance = null;
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRole method, of class TaiKhoan.
     */
    @Test
    public void testGetRole() {
        System.out.println("getRole");
        TaiKhoan instance = null;
        String expResult = "";
        String result = instance.getRole();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class TaiKhoan.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        TaiKhoan instance = null;
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class TaiKhoan.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        TaiKhoan instance = null;
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRole method, of class TaiKhoan.
     */
    @Test
    public void testSetRole() {
        System.out.println("setRole");
        String role = "";
        TaiKhoan instance = null;
        instance.setRole(role);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
