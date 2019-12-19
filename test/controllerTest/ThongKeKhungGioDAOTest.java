/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerTest;

import controller.ThongKeKhungGioDAO;
import java.util.ArrayList;
import model.ThongKeKhungGio;
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
public class ThongKeKhungGioDAOTest {

    public ThongKeKhungGioDAOTest() {
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
    public void getDanhSachTest()
    {
        System.out.println("check get danh sach thong ke khung gio");
        ThongKeKhungGioDAO tkkg = new ThongKeKhungGioDAO();
        ArrayList<ThongKeKhungGio> dsKhungGio = new ArrayList<>();
        dsKhungGio = tkkg.getDanhSach("2018-01-01", "2019-12-30");
        int result = dsKhungGio.size();
        int expResult = 9;
        assertEquals(expResult, result);
    }
}
