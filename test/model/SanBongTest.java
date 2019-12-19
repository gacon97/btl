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
public class SanBongTest {
    
    public SanBongTest() {
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
     * Test of getTen method, of class SanBong.
     */
    @Test
    public void testGetTen() {
        System.out.println("getTen");
        SanBong instance = null;
        String expResult = "";
        String result = instance.getTen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChieuDai method, of class SanBong.
     */
    @Test
    public void testGetChieuDai() {
        System.out.println("getChieuDai");
        SanBong instance = null;
        int expResult = 0;
        int result = instance.getChieuDai();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChieuRong method, of class SanBong.
     */
    @Test
    public void testGetChieuRong() {
        System.out.println("getChieuRong");
        SanBong instance = null;
        int expResult = 0;
        int result = instance.getChieuRong();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGia method, of class SanBong.
     */
    @Test
    public void testGetGia() {
        System.out.println("getGia");
        SanBong instance = null;
        int expResult = 0;
        int result = instance.getGia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiaDiem method, of class SanBong.
     */
    @Test
    public void testGetDiaDiem() {
        System.out.println("getDiaDiem");
        SanBong instance = null;
        String expResult = "";
        String result = instance.getDiaDiem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
