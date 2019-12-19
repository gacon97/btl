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
public class NguoiTest {
    
    public NguoiTest() {
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
     * Test of getTen method, of class Nguoi.
     */
    @Test
    public void testGetTen() {
        System.out.println("getTen");
        Nguoi instance = new Nguoi("nam", "nam@gmail.com", "123");
        String expResult = "nam";
        String result = instance.getTen();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSoDT method, of class Nguoi.
     */
    @Test
    public void testGetSoDT() {
        System.out.println("getSoDT");
        Nguoi instance = new Nguoi("nam", "nam@gmail.com", "123");
        String expResult = "123";
        String result = instance.getSoDT();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEmail method, of class Nguoi.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Nguoi instance = new Nguoi("nam", "nam@gmail.com", "123");
        String expResult = "nam@gmail.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTen method, of class Nguoi.
     */
    @Test
    public void testSetTen() {
        System.out.println("setTen");
        String ten = "";
        Nguoi instance = new Nguoi("nam", "nam@gmail.com", "123");
        instance.setTen(ten);
    }

    /**
     * Test of setSoDT method, of class Nguoi.
     */
    @Test
    public void testSetSoDT() {
        System.out.println("setSoDT");
        String soDT = "";
        Nguoi instance = new Nguoi("nam", "nam@gmail.com", "123");
        instance.setSoDT(soDT);
    }

    /**
     * Test of setEmail method, of class Nguoi.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Nguoi instance = new Nguoi("nam", "nam@gmail.com", "123");
        instance.setEmail(email);
    }
    
}
