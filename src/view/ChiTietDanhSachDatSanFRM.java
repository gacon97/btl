/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ThongKeDatSanDAO;
import controller.ThongKeKhungGioDAO;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.HoaDon;
import model.PhieuDatSan;

/**
 *
 * @author Anh Le
 */
public class ChiTietDanhSachDatSanFRM extends javax.swing.JFrame {

    static String khungGio;
    static String BD;
    static String KT;

    /**
     * Creates new form PhieuDatSan
     */
    public ChiTietDanhSachDatSanFRM(String khungGio, String ngayBD, String ngayKT) {
        initComponents();
        khungGio = khungGio;
        BD = ngayBD;
        KT = ngayKT;
        String[] gio = khungGio.split("-");
        ThongKeDatSanDAO dsds = new ThongKeDatSanDAO();
        int idkhungGio = dsds.seachKhungGio(gio[0], gio[1]);
        ArrayList<HoaDon> danhSachDatSan = new ArrayList<>();

        danhSachDatSan = dsds.getDanhSach(idkhungGio, BD, KT);

        DefaultTableModel model = (DefaultTableModel) tblDanhSach.getModel();
        Font font = tblDanhSach.getTableHeader().getFont().deriveFont(Font.BOLD);
        tblDanhSach.getTableHeader().setFont(font); // Bold header font
        for (int i = 0; i < danhSachDatSan.size(); i++) {
            model.addRow(new Object[]{
                danhSachDatSan.get(i).getPhieuDatSan().getId(),
                danhSachDatSan.get(i).getPhieuDatSan().getKhachHang().getTen(),
                danhSachDatSan.get(i).getPhieuDatSan().getSanBong().getTen(),
                danhSachDatSan.get(i).getPhieuDatSan().getNgayBatDau(),
                danhSachDatSan.get(i).getPhieuDatSan().getNgayKetThuc(),
                danhSachDatSan.get(i).getPhieuDatSan().getKhungGio().getGioBatDau() + "-" + danhSachDatSan.get(i).getPhieuDatSan().getKhungGio().getGioKetThuc(),
                danhSachDatSan.get(i).getPhieuDatSan().getSanBong().getGia(),
                danhSachDatSan.get(i).getTienThanhToan(),
            });
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhSach = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên Khách", "Tên Sân", "Ngày bắt đầu", "Ngày Kết thúc", "Khung giờ", "Giá", "Tổng tiền"
            }
        ));
        jScrollPane1.setViewportView(tblDanhSach);

        jLabel1.setText("Chi tiết danh sách đặt sân");

        btnBack.setText("Quay lại");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addComponent(btnBack)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        ThongKeKhungGioDAO ntgController = new ThongKeKhungGioDAO();
        KhungGioThueNhieuFRM kgtn = new KhungGioThueNhieuFRM(ntgController.getDanhSach(BD, KT), BD, KT);
        kgtn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PhieuDatSan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhieuDatSan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhieuDatSan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhieuDatSan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChiTietDanhSachDatSanFRM(khungGio, BD, KT).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDanhSach;
    // End of variables declaration//GEN-END:variables
}
