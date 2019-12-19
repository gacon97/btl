/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerTest;

import controller.ThongKeDatSanDAO;
import controller.ThongKeKhungGioDAO;
import java.util.ArrayList;
import model.HoaDon;
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
public class ThongKeDatSanDAOTest {

    public ThongKeDatSanDAOTest() {
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
    public void getDanhSachTest() {
        System.out.println("check get danh sach chi tiet thong ke khung gio");
        ThongKeDatSanDAO tkkg = new ThongKeDatSanDAO();
        ArrayList<HoaDon> dsKhungGio = new ArrayList<>();
        dsKhungGio = tkkg.getDanhSach(1, "2018-01-01", "2019-12-30");
        int result = dsKhungGio.size();
        int expResult = 3;
        assertEquals(expResult, result);
    }

    @Test
    public void searchKhungGio() {
        System.out.println("check get khung gio");
        ThongKeDatSanDAO tkkg = new ThongKeDatSanDAO();
        tkkg.seachKhungGio("04:00:00", "06:00:00");
        int result = tkkg.seachKhungGio("04:00:00", "06:00:00");
        int expResult = 1;
        assertEquals(expResult, result);
    }
}
