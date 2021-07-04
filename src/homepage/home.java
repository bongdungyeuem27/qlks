/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homepage;


/**
 * @author HP
 */

import taikhoan.DangNhapFrame;
import taikhoan.TaiKhoan;
import taikhoan.TaiKhoanDAO;
import dichvu.DichVuFrameNew;
import hoadon.HoaDonFrame;
import khachhang.KhachHangFrame;
import khuyenmai.KhuyenMaiFrame;
import nhanvien.NhanVien;
import nhanvien.NhanVienFrame;
import quydinh.QuyDinh;
import taikhoan.TaiKhoanFrame;
import thongke.ThongKeFrame;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author HP
 */
public class home extends javax.swing.JFrame {
    public static NhanVien nhanvien=new NhanVien();


    /**
     * Creates new form home
     */
    Thread threadGui;
    public static NhanVien getNhanVien()
    {
        System.out.println("nhanvien:"+nhanvien.toString());
        return nhanvien;
    }
    public home() {
        addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.out.println("Closed");
                TaiKhoanDAO.setThoat();
            }
        });

        if (TaiKhoanDAO.tuDongDangNhap()==false) {
            System.out.println("KOtudongdangnhap");
            DangNhapFrame child = new DangNhapFrame();
            child.setVisible(true);
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    {
                        synchronized (threadGui) {
                            // Pause
                            try { //code sau khi mở lại luồng chính
                                threadGui.wait();
                                nhanvien = child.getNhanVien();
                                init();
                            } catch (InterruptedException e) {
                            }
                        }

                    }
                }

            };

            threadGui = new Thread(runnable);
            child.setThread(threadGui);

            //từ đây trở lên là trước khi luồng chính bị đóng
            threadGui.start();
        }
        else {
            System.out.println("tudongdangnhap");
            nhanvien=TaiKhoanDAO.queryNVbyTK(TaiKhoanDAO.getTaikhoan());
            init();

        }

    }

    private void init()
    {

        TongQuan tq = new TongQuan();
        HoaDonFrame hdf = new HoaDonFrame();
        tq.setHDFtoTQF(hdf);
        hdf.setTQFtoHDF(tq);

        jPanelHD = hdf.getPanel();
        jPanelKH = new KhachHangFrame().getPanel();
        jPanelKM = new KhuyenMaiFrame().getPanel();
        jPanelTK = new TaiKhoanFrame().getPanel();
        jPanelP = tq.getPanel();

        if (nhanvien.getMAQL() == null) {
            jPanelDV = new DichVuFrameNew().getPanel();
            jPanelNV = new NhanVienFrame().getPanel();
            jPanelQD = new QuyDinh().getPanel();

            jPanelBCTK = new ThongKeFrame().getPanel();
        }

        initComponents();
        setVisible(true);
    }    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane5 = new javax.swing.JTabbedPane();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTabbedPane5.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane5.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane5.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTabbedPane5.setMinimumSize(new java.awt.Dimension(350, 150));
        jTabbedPane5.setPreferredSize(new java.awt.Dimension(1450, 768));
        jTabbedPane5.setRequestFocusEnabled(false);


        jTabbedPane5.addTab("Quản lý phòng       ", new javax.swing.ImageIcon(getClass().getResource("/icon/phong2.png")), jPanelP); // NOI18N


        jTabbedPane5.addTab("Quản lý hóa đơn         ", new javax.swing.ImageIcon(getClass().getResource("/icon/hoadon1.png")), jPanelHD); // NOI18N


        jTabbedPane5.addTab("Quản lý khách hàng       ", new javax.swing.ImageIcon(getClass().getResource("/icon/khachhang.png")), jPanelKH); // NOI18N


        jTabbedPane5.addTab("Quản lý khuyến mãi         ", new javax.swing.ImageIcon(getClass().getResource("/icon/giamgia.png")), jPanelKM); // NOI18N

        if (nhanvien.getMAQL() == null) {
            jTabbedPane5.addTab("Quản lý dịch vụ           ", new javax.swing.ImageIcon(getClass().getResource("/icon/dichvu.png")), jPanelDV); // NOI18N
            jTabbedPane5.addTab("Quản lý nhân viên          ", new javax.swing.ImageIcon(getClass().getResource("/icon/nhanvien.png")), jPanelNV); // NOI18N
            jTabbedPane5.addTab("Báo cáo thống kê        ", new javax.swing.ImageIcon(getClass().getResource("/icon/baocao1.png")), jPanelBCTK); // NOI18N
            jTabbedPane5.addTab("Quy định khách sạn       ", new javax.swing.ImageIcon(getClass().getResource("/icon/quydinh.png")), jPanelQD); // NOI18N

        }

        jTabbedPane5.addTab("Thông tin tài khoản     ", new javax.swing.ImageIcon(getClass().getResource("/icon/taikhoan.png")), jPanelTK); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelBCTK;
    private javax.swing.JPanel jPanelDV;
    private javax.swing.JPanel jPanelHD;
    private javax.swing.JPanel jPanelKH;
    private javax.swing.JPanel jPanelKM;
    private javax.swing.JPanel jPanelNV;
    private javax.swing.JPanel jPanelP;
    private javax.swing.JPanel jPanelQD;
    private javax.swing.JPanel jPanelTK;
    private javax.swing.JTabbedPane jTabbedPane5;
    // End of variables declaration//GEN-END:variables
}
