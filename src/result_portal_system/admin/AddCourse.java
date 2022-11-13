/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package result_portal_system.admin;

import java.sql.*;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import result_portal_system.result.InsertResult;

/**
 *
 * @author Mohammad Ashiq
 */
public class AddCourse extends javax.swing.JFrame {

    /**
     * Creates new form AdminPage
     */
    public AddCourse() {
        initComponents();
        AutoCompleteDecorator.decorate(course1ComboBox);
        AutoCompleteDecorator.decorate(course2ComboBox);
        AutoCompleteDecorator.decorate(course3ComboBox);
        AutoCompleteDecorator.decorate(course4ComboBox);
        AutoCompleteDecorator.decorate(semesterComboBox);
        
        semesters();
        courses_fun();
        
    }
    public void courses_fun(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/resultportal","root","");
            
            Statement st = con.createStatement();
//            st.executeUpdate("");
            ResultSet rs = st.executeQuery("SELECT * FROM Courses ORDER BY CourseCode");
            while(rs.next()){
                course1ComboBox.addItem(rs.getString(1));
                course2ComboBox.addItem(rs.getString(1));
                course3ComboBox.addItem(rs.getString(1));
                course4ComboBox.addItem(rs.getString(1));
            }
//            JOptionPane.showMessageDialog(null, "Course add Successfull");
            con.close();
            st.close();
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e, "error", 0);
        }
    }
    
    public void semesters(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/resultportal","root","");
            
            Statement st = con.createStatement();
//            st.executeUpdate("");
            ResultSet rs = st.executeQuery("SELECT * FROM Semester ");
            while(rs.next()){
                semesterComboBox.addItem(rs.getString(1));
            }
//            JOptionPane.showMessageDialog(null, "Course add Successfull");
            con.close();
            st.close();
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e, "error", 0);
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

        addCourse = new javax.swing.JButton();
        registeredStudent = new javax.swing.JButton();
        home = new javax.swing.JButton();
        addStudent = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        course2ComboBox = new javax.swing.JComboBox<>();
        course3ComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        course1ComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        semesterComboBox = new javax.swing.JComboBox<>();
        submitButton = new javax.swing.JButton();
        course4ComboBox = new javax.swing.JComboBox<>();
        idTextF = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        id0 = new javax.swing.JLabel();
        c8 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        batch = new javax.swing.JLabel();
        c6 = new javax.swing.JLabel();
        c7 = new javax.swing.JLabel();
        department = new javax.swing.JLabel();
        CrComboBox2 = new javax.swing.JComboBox<>();
        insertResult = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        CrComboBox1 = new javax.swing.JComboBox<>();
        CrComboBox4 = new javax.swing.JComboBox<>();
        CrComboBox3 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        AdminHomePageImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addCourse.setBackground(new java.awt.Color(0, 0, 0));
        addCourse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addCourse.setForeground(new java.awt.Color(255, 255, 255));
        addCourse.setText("Add Course");
        addCourse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(addCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 160, -1));

        registeredStudent.setBackground(new java.awt.Color(6, 165, 165));
        registeredStudent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        registeredStudent.setForeground(new java.awt.Color(255, 255, 255));
        registeredStudent.setText("Registered Student");
        registeredStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registeredStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registeredStudentActionPerformed(evt);
            }
        });
        getContentPane().add(registeredStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 160, -1));

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/result_portal_system/ImageFiles/homeButonIcon.png"))); // NOI18N
        home.setText("Home");
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, -1, -1));

        addStudent.setBackground(new java.awt.Color(86, 168, 5));
        addStudent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addStudent.setForeground(new java.awt.Color(255, 255, 255));
        addStudent.setText("Add Student");
        addStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentActionPerformed(evt);
            }
        });
        getContentPane().add(addStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 160, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Semester");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, -1, -1));

        course2ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        getContentPane().add(course2ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 130, -1));

        course3ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        getContentPane().add(course3ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 130, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Course 3");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Course 4");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Course 2");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        course1ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        getContentPane().add(course1ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 130, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Course 1");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        semesterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        getContentPane().add(semesterComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 230, -1));

        submitButton.setText("Submit");
        submitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 120, -1));

        course4ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        getContentPane().add(course4ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 130, -1));
        getContentPane().add(idTextF, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 150, -1));

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, -1, -1));

        id0.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        id0.setForeground(new java.awt.Color(255, 255, 255));
        id0.setText("ID");
        getContentPane().add(id0, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        c8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        c8.setForeground(new java.awt.Color(255, 255, 255));
        c8.setText("Name");
        getContentPane().add(c8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        batch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        batch.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(batch, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, -1, -1));

        c6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        c6.setForeground(new java.awt.Color(255, 255, 255));
        c6.setText("Batch");
        getContentPane().add(c6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        c7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        c7.setForeground(new java.awt.Color(255, 255, 255));
        c7.setText("Department");
        getContentPane().add(c7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        department.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        department.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(department, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, -1));

        CrComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
        getContentPane().add(CrComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 90, -1));

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

        CrComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
        getContentPane().add(CrComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 90, -1));

        CrComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
        getContentPane().add(CrComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 90, -1));

        CrComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
        getContentPane().add(CrComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 90, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Credit");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, -1, -1));

        AdminHomePageImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/result_portal_system/ImageFiles/AdminPanelPage.jpg"))); // NOI18N
        getContentPane().add(AdminHomePageImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        String id = idTextF.getText();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/resultportal","root","");
            
            Statement st = con.createStatement();
            st.executeUpdate("INSERT INTO result (ID, Semester, Course_1, Course_2, Course_3, Course_4, Course_1_Cr, Course_2_Cr, Course_3_Cr, Course_4_Cr) VALUES ('"+idTextF.getText()+"', '"+semesterComboBox.getSelectedItem().toString()+"' , '"+course1ComboBox.getSelectedItem().toString()+"', '"+course2ComboBox.getSelectedItem().toString()+"', '"+course3ComboBox.getSelectedItem().toString()+"', '"+course4ComboBox.getSelectedItem().toString()+"', '"+CrComboBox1.getSelectedItem().toString()+"', '"+CrComboBox2.getSelectedItem().toString()+"', '"+CrComboBox3.getSelectedItem().toString()+"', '"+CrComboBox4.getSelectedItem().toString()+"' )");
            JOptionPane.showMessageDialog(null, "Course add Successfull");
            
            con.close();
            st.close();
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e, "error", 0);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void addStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentActionPerformed
        // TODO add your handling code here:
        new AddStudent().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addStudentActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String id = idTextF.getText();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/resultportal","root","");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT Name, Batch, Department FROM student WHERE ID = '"+id+"' ");

            if (rs.next()){
                name.setText(rs.getString("Name"));
                batch.setText(rs.getString("Batch"));
                department.setText(rs.getString("Department"));
                
                con.close();
                st.close();
            } else{
                JOptionPane.showMessageDialog(null, "ID not found", "error", 0);
                con.close();
                st.close();
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e, "error", 0);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void registeredStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registeredStudentActionPerformed
        // TODO add your handling code here:
        new ViewRegisteredStudent().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_registeredStudentActionPerformed

    private void insertResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertResultActionPerformed
        // TODO add your handling code here:
        new InsertResult().setVisible(true);
    }//GEN-LAST:event_insertResultActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new AdminHomePage().setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

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
            java.util.logging.Logger.getLogger(AddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminHomePageImage;
    private javax.swing.JComboBox<String> CrComboBox1;
    private javax.swing.JComboBox<String> CrComboBox2;
    private javax.swing.JComboBox<String> CrComboBox3;
    private javax.swing.JComboBox<String> CrComboBox4;
    private javax.swing.JButton addCourse;
    private javax.swing.JButton addStudent;
    private javax.swing.JLabel batch;
    private javax.swing.JLabel c6;
    private javax.swing.JLabel c7;
    private javax.swing.JLabel c8;
    private javax.swing.JComboBox<String> course1ComboBox;
    private javax.swing.JComboBox<String> course2ComboBox;
    private javax.swing.JComboBox<String> course3ComboBox;
    private javax.swing.JComboBox<String> course4ComboBox;
    private javax.swing.JLabel department;
    private javax.swing.JButton home;
    private javax.swing.JLabel id0;
    private javax.swing.JTextField idTextF;
    private javax.swing.JButton insertResult;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name;
    private javax.swing.JButton registeredStudent;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> semesterComboBox;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}