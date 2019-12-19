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
public class KhachHangTest {
    
    public KhachHangTest() {
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
     * Test of getCmt method, of class KhachHang.
     */
    @Test
    public void testGetCmt() {
        System.out.println("getCmt");
        KhachHang instance = new KhachHang("123", "nam");
        String expResult = "123";
        String result = instance.getCmt();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTen method, of class KhachHang.
     */
    @Test
    public void testGetTen() {
        System.out.println("getTen");
        KhachHang instance = new KhachHang("123", "nam");
        String expResult = "nam";
        String result = instance.getTen();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSoDT method, of class KhachHang.
     */
    @Test
    public void testGetSoDT() {
        System.out.println("getSoDT");
        KhachHang instance = new KhachHang("123", "nam");
        String expResult = "";
        String result = instance.getSoDT();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEmail method, of class KhachHang.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        KhachHang instance = new KhachHang("123", "nam");
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCmt method, of class KhachHang.
     */
    @Test
    public void testSetCmt() {
        System.out.println("setCmt");
        String cmt = "";
        KhachHang instance = new KhachHang("123", "nam");
        instance.setCmt(cmt);
    }

    /**
     * Test of setTen method, of class KhachHang.
     */
    @Test
    public void testSetTen() {
        System.out.println("setTen");
        String ten = "";
        KhachHang instance = new KhachHang("123", "nam");
        instance.setTen(ten);
    }

    /**
     * Test of setSoDT method, of class KhachHang.
     */
    @Test
    public void testSetSoDT() {
        System.out.println("setSoDT");
        String soDT = "";
        KhachHang instance = new KhachHang("123", "nam");
        instance.setSoDT(soDT);
    }

    /**
     * Test of setEmail method, of class KhachHang.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        KhachHang instance = new KhachHang("123", "nam");
        instance.setEmail(email);
    }
    
}
