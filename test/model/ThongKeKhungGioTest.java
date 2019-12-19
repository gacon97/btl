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
public class ThongKeKhungGioTest {
    
    public ThongKeKhungGioTest() {
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
     * Test of getTong_luot method, of class ThongKeKhungGio.
     */
    @Test
    public void testGetTong_luot() {
        System.out.println("getTong_luot");
        ThongKeKhungGio instance = new ThongKeKhungGio(1, 0,new Time(1), new Time(3));
        int expResult = 1;
        int result = instance.getTong_luot();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getTong_tien method, of class ThongKeKhungGio.
     */
    @Test
    public void testGetTong_tien() {
        System.out.println("getTong_tien");
        ThongKeKhungGio instance = new ThongKeKhungGio(1, 100,new Time(1), new Time(3));
        int expResult = 100;
        int result = instance.getTong_tien();
        assertEquals(expResult, result);
    }


    
}
