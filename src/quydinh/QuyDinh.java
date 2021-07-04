/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quydinh;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author HP
 */
public class QuyDinh extends javax.swing.JFrame {

    /**
     * Creates new form QuyDinh
     */
    public QuyDinh() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabelAVT2 = new javax.swing.JLabel();
        ButtonCapNhat = new javax.swing.JButton();
        ButtonLuu = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        qdnv = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        qdkm = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        qdp = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        qddv = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        qdhd = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poster/Quydinh.png"))); // NOI18N

        jLabelAVT2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/taikhoan/avatar/NV.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAVT2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelAVT2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ButtonCapNhat.setBackground(new java.awt.Color(51, 204, 0));
        ButtonCapNhat.setText("Cập nhật quy định");
        ButtonCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCapNhatActionPerformed(evt);
            }
        });

        ButtonLuu.setBackground(new java.awt.Color(51, 204, 0));
        ButtonLuu.setText("Lưu");
        ButtonLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLuuActionPerformed(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        qdnv.setColumns(20);
        qdnv.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        qdnv.setRows(5);
        qdnv.setText("1. Mỗi nhân viên được cấp một tài khoản để đăng nhập vào hệ thống\n2.Nhân viên đảm bảo đi làm đúng giờ, mặc đúng đồng phục khách sạn đã cung cấp");
        qdnv.setEnabled(false);
        jScrollPane1.setViewportView(qdnv);

        jTabbedPane1.addTab("Quy định nhân viên", jScrollPane1);

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));

        qdkm.setColumns(20);
        qdkm.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        qdkm.setRows(5);
        qdkm.setText("1.Khuyến mãi sẽ được quản lý bởi người quản lý, nhân viên chỉ có quyền xem các thông tin khuyến mãi mà không được sửa đổi.\n2.Khuyến mãi sẽ áp dụng theo 2 hình thức: khuyến mãi theo loại khách hàng, khuyến mãi theo ngày lễ lớn.");
        qdkm.setEnabled(false);
        jScrollPane5.setViewportView(qdkm);

        jTabbedPane1.addTab("Quy định khuyến mãi", jScrollPane5);

        jScrollPane6.setBackground(new java.awt.Color(255, 255, 255));

        qdp.setColumns(20);
        qdp.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        qdp.setRows(5);
        qdp.setText("1. Có hai loại phòng là đôi và đơn\n2. Khi số người thuê vượt số người của loại phòng đó thì cứ thêm 1 người phụ thu là 20% giá phòng đó.\n(Ví dụ 2 khách thuê 1 phòng đơn thì giá phòng là 120% giá niêm yết.)\n3. Một khách hàng có thể 1 lúc thuê được nhiều phòng\n\n\n");
        qdp.setEnabled(false);
        jScrollPane6.setViewportView(qdp);

        jTabbedPane1.addTab("Quy định phòng", jScrollPane6);

        jScrollPane7.setBackground(new java.awt.Color(255, 255, 255));

        qddv.setColumns(20);
        qddv.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        qddv.setRows(5);
        qddv.setText("1. Khi khách đặt thuê phòng thì mới được thuê dịch vụ.");
        qddv.setEnabled(false);
        jScrollPane7.setViewportView(qddv);

        jTabbedPane1.addTab("Quy định dịch vụ", jScrollPane7);

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));

        qdhd.setColumns(20);
        qdhd.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        qdhd.setRows(5);
        qdhd.setText("1. Khi khách hàng thuê phòng thì 1 hóa đơn sẽ được tạo trước, kèm theo phiếu thuê phòng chứa thông tin các phòng được thuê và phiếu dịch vụ (nếu có) \nchứa thông tin các dịch vụ được thuê.");
        qdhd.setEnabled(false);
        jScrollPane4.setViewportView(qdhd);

        jTabbedPane1.addTab("Quy định hóa đơn", jScrollPane4);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(ButtonCapNhat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonLuu)
                .addGap(171, 171, 171))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCapNhat)
                    .addComponent(ButtonLuu))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCapNhatActionPerformed
        qdnv.enable(true);
        qddv.enable(true);
        qdhd.enable(true);
        qdkm.enable(true);
        qdp.enable(true);
        JOptionPane.showMessageDialog(this, "VUI LONG CAP NHAT LAI QUY DINH TREN!");

        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonCapNhatActionPerformed

    private void ButtonLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLuuActionPerformed
        qdnv.enable(false);
        qddv.enable(false);
        qdhd.enable(false);
        qdkm.enable(false);
        qdp.enable(false);
        JOptionPane.showMessageDialog(this, "BAN DA XAP NHAT THANH CONG!");// TODO add your handling code here:
    }//GEN-LAST:event_ButtonLuuActionPerformed

    public JPanel getPanel()
    {
        return jPanel6;
    }
    /**
     * @param args the command line arguments
     */
/*
    public static void main(String args[]) {
        */
/* Set the Nimbus look and feel *//*

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        */
/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         *//*

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuyDinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuyDinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuyDinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuyDinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        */
/* Create and display the form *//*

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuyDinh().setVisible(true);
            }
        });
    }
*/
    public static void main(String[] args) {
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCapNhat;
    private javax.swing.JButton ButtonLuu;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelAVT2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea qddv;
    private javax.swing.JTextArea qdhd;
    private javax.swing.JTextArea qdkm;
    private javax.swing.JTextArea qdnv;
    private javax.swing.JTextArea qdp;
    // End of variables declaration//GEN-END:variables
}
