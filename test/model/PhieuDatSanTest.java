/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Time;
import java.util.ArrayList;
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
public class PhieuDatSanTest {
    
    public PhieuDatSanTest() {
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
     * Test of getTongTien method, of class PhieuDatSan.
     */
    @Test
    public void testGetTongTien() {
        System.out.println("getTongTien");
        KhachHang kh = new KhachHang("123", "nam");
        SanBong sb = new SanBong("san 1", 10, 9, 100, "ha noi");
        KhungGio kg = new KhungGio(new Time(1),new Time(3));
        PhieuDatSan instance = new PhieuDatSan(1, kg, kh, sb, new Date(), new Date());
        int expResult = 0;
        int result = instance.getTongTien();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNgayBatDau method, of class PhieuDatSan.
     */
    @Test
    public void testGetNgayBatDau() {
        System.out.println("getNgayBatDau");
        KhachHang kh = new KhachHang("123", "nam");
        SanBong sb = new SanBong("san 1", 10, 9, 100, "ha noi");
        KhungGio kg = new KhungGio(new Time(1),new Time(3));
        PhieuDatSan instance = new PhieuDatSan(1, kg, kh, sb, new Date(), new Date());
        Date expResult = new Date();
        Date result = instance.getNgayBatDau();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getNgayKetThuc method, of class PhieuDatSan.
     */
    @Test
    public void testGetNgayKetThuc() {
        System.out.println("getNgayKetThuc");
        KhachHang kh = new KhachHang("123", "nam");
        SanBong sb = new SanBong("san 1", 10, 9, 100, "ha noi");
        KhungGio kg = new KhungGio(new Time(1),new Time(3));
        PhieuDatSan instance = new PhieuDatSan(1, kg, kh, sb, new Date(), new Date());
        Date expResult = new Date();
        Date result = instance.getNgayKetThuc();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getId method, of class PhieuDatSan.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        KhachHang kh = new KhachHang("123", "nam");
        SanBong sb = new SanBong("san 1", 10, 9, 100, "ha noi");
        KhungGio kg = new KhungGio(new Time(1),new Time(3));
        PhieuDatSan instance = new PhieuDatSan(1, kg, kh, sb, new Date(), new Date());
        int expResult = 1;
        int result = instance.getId();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getKhungGio method, of class PhieuDatSan.
     */
    @Test
    public void testGetKhungGio() {
        System.out.println("getKhungGio");
        KhachHang kh = new KhachHang("123", "nam");
        SanBong sb = new SanBong("san 1", 10, 9, 100, "ha noi");
        KhungGio kg = new KhungGio(new Time(1),new Time(3));
        PhieuDatSan instance = new PhieuDatSan(1, kg, kh, sb, new Date(), new Date());
        KhungGio expResult = new KhungGio();
        KhungGio result = instance.getKhungGio();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getKhachHang method, of class PhieuDatSan.
     */
    @Test
    public void testGetKhachHang() {
        System.out.println("getKhachHang");
        KhachHang kh = new KhachHang("123", "nam");
        SanBong sb = new SanBong("san 1", 10, 9, 100, "ha noi");
        KhungGio kg = new KhungGio(new Time(1),new Time(3));
        PhieuDatSan instance = new PhieuDatSan(1, kg, kh, sb, new Date(), new Date());
        KhachHang expResult = new KhachHang("123", "nam");
        KhachHang result = instance.getKhachHang();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getSanBong method, of class PhieuDatSan.
     */
    @Test
    public void testGetSanBong() {
        System.out.println("getSanBong");
        KhachHang kh = new KhachHang("123", "nam");
        SanBong sb = new SanBong("san 1", 10, 9, 100, "ha noi");
        KhungGio kg = new KhungGio(new Time(1),new Time(3));
        PhieuDatSan instance = new PhieuDatSan(1, kg, kh, sb, new Date(), new Date());
        SanBong expResult = new SanBong("san 1", 10, 9, 100, "ha noi");
        SanBong result = instance.getSanBong();
        assertEquals(expResult, result);
    }

    /**
     * Test of tongTien method, of class PhieuDatSan.
     */
    @Test
    public void testTongTien() {
        System.out.println("tongTien");
        KhachHang kh = new KhachHang("123", "nam");
        SanBong sb = new SanBong("san 1", 10, 9, 100, "ha noi");
        KhungGio kg = new KhungGio(new Time(1),new Time(3));
        PhieuDatSan instance = new PhieuDatSan(1, kg, kh, sb, new Date(), new Date());
        long expResult = 0L;
        long result = instance.tongTien();
        assertEquals(expResult, result);
        
        
    }
    
}
