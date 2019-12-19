/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Time;
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
public class KhungGioTest {
    
    public KhungGioTest() {
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
     * Test of getGioBatDau method, of class KhungGio.
     */
    @Test
    public void testGetGioBatDau() {
        System.out.println("getGioBatDau");
        KhungGio instance = null;
        Time expResult = null;
        Time result = instance.getGioBatDau();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGioKetThuc method, of class KhungGio.
     */
    @Test
    public void testGetGioKetThuc() {
        System.out.println("getGioKetThuc");
        KhungGio instance = null;
        Time expResult = null;
        Time result = instance.getGioKetThuc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGioBatDau method, of class KhungGio.
     */
    @Test
    public void testSetGioBatDau() {
        System.out.println("setGioBatDau");
        Time gioBatDau = null;
        KhungGio instance = null;
        instance.setGioBatDau(gioBatDau);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGioKetThuc method, of class KhungGio.
     */
    @Test
    public void testSetGioKetThuc() {
        System.out.println("setGioKetThuc");
        Time gioKetThuc = null;
        KhungGio instance = null;
        instance.setGioKetThuc(gioKetThuc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
