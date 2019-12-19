/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
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
public class HoaDonTest {
    
    public HoaDonTest() {
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
     * Test of getPhieuDatSan method, of class HoaDon.
     */
    @Test
    public void testGetPhieuDatSan() {
        System.out.println("getPhieuDatSan");
        HoaDon instance = null;
        PhieuDatSan expResult = null;
        PhieuDatSan result = instance.getPhieuDatSan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNgayThanhToan method, of class HoaDon.
     */
    @Test
    public void testGetNgayThanhToan() {
        System.out.println("getNgayThanhToan");
        HoaDon instance = null;
        Date expResult = null;
        Date result = instance.getNgayThanhToan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTienThanhToan method, of class HoaDon.
     */
    @Test
    public void testGetTienThanhToan() {
        System.out.println("getTienThanhToan");
        HoaDon instance = null;
        int expResult = 0;
        int result = instance.getTienThanhToan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNhanVien method, of class HoaDon.
     */
    @Test
    public void testGetNhanVien() {
        System.out.println("getNhanVien");
        HoaDon instance = null;
        NhanVien expResult = null;
        NhanVien result = instance.getNhanVien();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhieuDatSan method, of class HoaDon.
     */
    @Test
    public void testSetPhieuDatSan() {
        System.out.println("setPhieuDatSan");
        PhieuDatSan phieuDatSan = null;
        HoaDon instance = null;
        instance.setPhieuDatSan(phieuDatSan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNgayThanhToan method, of class HoaDon.
     */
    @Test
    public void testSetNgayThanhToan() {
        System.out.println("setNgayThanhToan");
        Date ngayThanhToan = null;
        HoaDon instance = null;
        instance.setNgayThanhToan(ngayThanhToan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTienThanhToan method, of class HoaDon.
     */
    @Test
    public void testSetTienThanhToan() {
        System.out.println("setTienThanhToan");
        int tienThanhToan = 0;
        HoaDon instance = null;
        instance.setTienThanhToan(tienThanhToan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNhanVien method, of class HoaDon.
     */
    @Test
    public void testSetNhanVien() {
        System.out.println("setNhanVien");
        NhanVien nhanVien = null;
        HoaDon instance = null;
        instance.setNhanVien(nhanVien);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
