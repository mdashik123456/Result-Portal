/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package result_portal_system.admin;

import result_portal_system.admin.AddCourse;
import java.sql.*;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import result_portal_system.result.InsertResult;
/**
 *
 * @author Mohammad Ashiq
 */
public class AddStudent extends javax.swing.JFrame {

    /**
     * Creates new form AdminPage
     */
    public AddStudent() {
        initComponents();
        AutoCompleteDecorator.decorate(degree);
        AutoCompleteDecorator.decorate(department);
        AutoCompleteDecorator.decorate(batch);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addCourse = new javax.swing.JButton();
        redistredStrudent = new javax.swing.JButton();
        addStudent = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        degree = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        home = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        batch = new javax.swing.JComboBox<>();
        name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        department = new javax.swing.JComboBox<>();
        submit = new javax.swing.JButton();
        insertResult = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        AdminHomePageImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addCourse.setBackground(new java.awt.Color(153, 153, 255));
        addCourse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addCourse.setForeground(new java.awt.Color(255, 255, 255));
        addCourse.setText("Add Course");
        addCourse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCourseActionPerformed(evt);
            }
        });
        getContentPane().add(addCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 160, -1));

        redistredStrudent.setBackground(new java.awt.Color(6, 165, 165));
        redistredStrudent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        redistredStrudent.setForeground(new java.awt.Color(255, 255, 255));
        redistredStrudent.setText("Registered Student");
        redistredStrudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        redistredStrudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redistredStrudentActionPerformed(evt);
            }
        });
        getContentPane().add(redistredStrudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 160, -1));

        addStudent.setBackground(new java.awt.Color(0, 0, 0));
        addStudent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addStudent.setForeground(new java.awt.Color(255, 255, 255));
        addStudent.setText("Add Student");
        addStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(addStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 160, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Degree");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 180, -1));

        degree.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BSc", "MSc", "BA", "MA", "PhD" }));
        getContentPane().add(degree, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 180, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gender");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contact");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, -1, -1));

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/result_portal_system/ImageFiles/homeButonIcon.png"))); // NOI18N
        home.setText("Home");
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Batch");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));
        getContentPane().add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 180, -1));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 180, -1));

        batch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 ", "9 ", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50" }));
        getContentPane().add(batch, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 180, -1));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 180, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Department");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, -1));

        department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Software Engineering", "Computer Science and Engineering", "Civil Engineering", "It", "Mechanical Engineering", "English", "Sociology", "History", "Psychology" }));
        getContentPane().add(department, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 180, -1));

        submit.setText("Submit");
        submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 120, -1));

        insertResult.setBackground(new java.awt.Color(255, 102, 0));
        insertResult.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        insertResult.setForeground(new java.awt.Color(255, 255, 255));
        insertResult.setText("Insert Result");
        insertResult.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        insertResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertResultActionPerformed(evt);
            }
        });
        getContentPane().add(insertResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 160, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0, 80));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 300, 480));

        AdminHomePageImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/result_portal_system/ImageFiles/AdminPanelPage.jpg"))); // NOI18N
        getContentPane().add(AdminHomePageImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/resultportal","root","");
            
            Statement st = con.createStatement();
            st.executeUpdate("INSERT INTO student (`ID`, `Name`, `Degree`, `Department`, `Batch`, `Gender`, `Contact`) VALUES ('"+id.getText()+"', '"+name.getText()+"', '"+degree.getSelectedItem().toString()+"', '"+department.getSelectedItem().toString()+"', '"+batch.getSelectedItem().toString()+"', '"+gender.getSelectedItem().toString()+"', '"+contact.getText()+"')");
            JOptionPane.showMessageDialog(null, "Add Successfull");
            
            con.close();
            st.close();
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "This id is already exist", "error", 0);
        }
    }//GEN-LAST:event_submitActionPerformed

    private void addCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCourseActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new AddCourse().setVisible(true);
    }//GEN-LAST:event_addCourseActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new AdminHomePage().setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

    private void redistredStrudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redistredStrudentActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ViewRegisteredStudent().setVisible(true);
    }//GEN-LAST:event_redistredStrudentActionPerformed

    private void insertResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertResultActionPerformed
        // TODO add your handling code here:
        new InsertResult().setVisible(true);
    }//GEN-LAST:event_insertResultActionPerformed

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
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminHomePageImage;
    private javax.swing.JButton addCourse;
    private javax.swing.JButton addStudent;
    private javax.swing.JComboBox<String> batch;
    private javax.swing.JTextField contact;
    private javax.swing.JComboBox<String> degree;
    private javax.swing.JComboBox<String> department;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JButton home;
    private javax.swing.JTextField id;
    private javax.swing.JButton insertResult;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    private javax.swing.JButton redistredStrudent;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
