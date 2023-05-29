/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OfficerModule.Attendece;

// import necessary packages

import OfficerModule.*;
import common.code.MyDbConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class InsertAttendence1 extends javax.swing.JFrame {
    
    
    private Officer officerAcc;
    private JTable updateTable;
    private MyDbConnector dbConnector;
    private Connection connection;
    
    public InsertAttendence1(Officer officerAcc) {
        initComponents();
        dbConnector = new MyDbConnector();
        connection = dbConnector.getMyConnection();
        this.officerAcc = officerAcc;
        
    }

    private InsertAttendence1() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_copy2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Sid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CourseId = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        AttendDate = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        TypeofLecture = new javax.swing.JComboBox<>();
        InsertBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        DepatmentCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        yearCombo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        Status = new javax.swing.JComboBox<>();
        result = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1260, 820));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(104, 164, 236));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 120));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_copy2.setBackground(new java.awt.Color(255, 255, 255));
        txt_copy2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_copy2.setForeground(new java.awt.Color(255, 255, 255));
        txt_copy2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_copy2.setText("© Faculty of Technology,University of Ruhuna.");
        jPanel1.add(txt_copy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, -1, -1));

        jLabel10.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(242, 242, 242));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText(" INSERT ATTENDENCE  PORTAL");
        jLabel10.setFocusable(false);
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel10.setInheritsPopupMenu(false);
        jLabel10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 370, 30));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/backbtn.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 20, 50, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 150));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setMinimumSize(new java.awt.Dimension(1070, 420));
        jPanel3.setPreferredSize(new java.awt.Dimension(1070, 420));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, 230));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Cource ID", "Date", "Session", "Depatment", "Level", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 990, 90));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Insert Attendence"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Student ID");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 110, -1));

        Sid.setFont(new java.awt.Font("Arial Narrow", 3, 12)); // NOI18N
        Sid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SidActionPerformed(evt);
            }
        });
        jPanel4.add(Sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 160, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("CourseID");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 110, -1));

        CourseId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "ICT01", "ICT02", "ICT03", "ICT04", "ICT05", "TMS01", " ", " ", " " }));
        jPanel4.add(CourseId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 160, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Date");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        AttendDate.setDateFormatString("yyyy-MM-dd");
        jPanel4.add(AttendDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 160, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Session");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        TypeofLecture.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Theory", "Practicle", "other" }));
        jPanel4.add(TypeofLecture, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 160, -1));

        InsertBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        InsertBtn.setText("INSERT");
        InsertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertBtnActionPerformed(evt);
            }
        });
        jPanel4.add(InsertBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, 160, 30));

        ResetBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ResetBtn.setText("RESET");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });
        jPanel4.add(ResetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 160, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Department");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 110, 20));

        DepatmentCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "ICT", "BST", "ET", " " }));
        jPanel4.add(DepatmentCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 160, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Level (year)");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        yearCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "L1S1", "LlS2", "L2S1", "L2S2", "L3S1", "L3S2", "L4S1", "L4S2" }));
        jPanel4.add(yearCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 160, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Status");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 80, -1));

        Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Absent", "Present" }));
        jPanel4.add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 160, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 990, 220));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1250, 500));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 650));

        result.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        result.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(result, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 640, 460, 30));

        setSize(new java.awt.Dimension(1266, 689));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SidActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        Sid.setText("");
        DepatmentCombo.setSelectedItem("Select");
        yearCombo.setSelectedItem("Select");
        Status.setSelectedItem("Select");
        TypeofLecture.setSelectedItem("Select");
        CourseId.setSelectedItem("Select");
        AttendDate.setDate(null);
        //ProgressBar.setVisible(false);
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0); 
        updateTable();
        
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void InsertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertBtnActionPerformed
        insertAttendance();
    }//GEN-LAST:event_InsertBtnActionPerformed
    public void insertAttendance() {
        String query = "INSERT INTO attendance (userID, Department, CourseID, Status, Year, Session, Date) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, Sid.getText());
            System.out.println("sdd +++++++++++++++++++++"+Sid.getText());
            statement.setString(2, (String) DepatmentCombo.getSelectedItem());
            System.out.println("sdd +++++++++++++++++++++"+(String) DepatmentCombo.getSelectedItem());
            statement.setString(3, (String) CourseId.getSelectedItem());
            System.out.println("sdd +++++++++++++++++++++"+(String) CourseId.getSelectedItem());
            statement.setString(4, (String) Status.getSelectedItem());
             System.out.println("sdd +++++++++++++++++++++"+(String) Status.getSelectedItem());
            statement.setString(5, (String) yearCombo.getSelectedItem());
             System.out.println("sdd +++++++++++++++++++++"+(String) yearCombo.getSelectedItem());
            statement.setString(6,(String) TypeofLecture.getSelectedItem());
            System.out.println("sdd +++++++++++++++++++++"+(String) TypeofLecture.getSelectedItem());
            java.util.Date selectedDate = AttendDate.getDate();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String dateString = dateFormat.format(selectedDate);
            System.out.println("sdd +++++++++++++++++++++"+dateString);
            
            statement.setString(7, dateString);

            statement.executeUpdate();
            System.out.println("Attendance record inserted successfully");
            updateTable();
        } catch (SQLException ex) {
            System.out.println("Error in inserting attendance record: " + ex.getMessage());
        }
    }

    public void updateTable() {
        System.out.println("Inside updateTable");
        try {
            Statement st = connection.createStatement();
            String sql1 = "SELECT * FROM attendance ORDER BY userID, Date";
            ResultSet rs = st.executeQuery(sql1);

            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                String userId = rs.getString("userID");
                String courseId = rs.getString("CourseID");
                String date = rs.getString("Date");
                String session = rs.getString("Session");
                String department = rs.getString("Department");
                String year = rs.getString("Year");
                String status = rs.getString("Status");
                String userID = rs.getString("userID");

                String tbData[] = {userID, courseId, date, session, department, year, status};

                model.addRow(tbData);
            }

            System.out.println("Exit updateTable");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        officerAcc.back(officerAcc);
        this.dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertAttendence1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser AttendDate;
    private javax.swing.JComboBox<String> CourseId;
    private javax.swing.JComboBox<String> DepatmentCombo;
    private javax.swing.JButton InsertBtn;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JTextField Sid;
    private javax.swing.JComboBox<String> Status;
    private javax.swing.JComboBox<String> TypeofLecture;
    private javax.swing.Box.Filler filler1;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel result;
    private javax.swing.JLabel txt_copy2;
    private javax.swing.JComboBox<String> yearCombo;
    // End of variables declaration//GEN-END:variables

    private void date(java.util.Date date) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}