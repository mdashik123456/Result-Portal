/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package result_portal_system.result;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Mohammad Ashiq
 */
public class ViewResult extends javax.swing.JFrame {

    /**
     * Creates new form StudentPage
     */
    public ViewResult() {
        initComponents();
        semesters();
            
    }
    
    public void semesters(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/resultportal","root","");
            
            Statement st = con.createStatement();
//            st.executeUpdate("");
            ResultSet rs = st.executeQuery("SELECT * FROM Semester ORDER BY Semester_Name");
            while(rs.next()){
                sem.addItem(rs.getString(1));
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

        sem = new javax.swing.JComboBox<>();
        searchTF = new javax.swing.JTextField();
        showResult = new javax.swing.JButton();
        s_batch = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        s_id = new javax.swing.JLabel();
        s_department = new javax.swing.JLabel();
        s_name = new javax.swing.JLabel();
        rtwert = new javax.swing.JLabel();
        course1 = new javax.swing.JLabel();
        course2 = new javax.swing.JLabel();
        course3 = new javax.swing.JLabel();
        course4 = new javax.swing.JLabel();
        tsdg = new javax.swing.JLabel();
        credit1 = new javax.swing.JLabel();
        credit2 = new javax.swing.JLabel();
        credit3 = new javax.swing.JLabel();
        credit4 = new javax.swing.JLabel();
        sdfgaer = new javax.swing.JLabel();
        cg1 = new javax.swing.JLabel();
        cg2 = new javax.swing.JLabel();
        cg3 = new javax.swing.JLabel();
        cg4 = new javax.swing.JLabel();
        tsdg1 = new javax.swing.JLabel();
        grade1 = new javax.swing.JLabel();
        grade2 = new javax.swing.JLabel();
        grade3 = new javax.swing.JLabel();
        grade4 = new javax.swing.JLabel();
        avgSGPA = new javax.swing.JLabel();
        fdgdf = new javax.swing.JLabel();
        fdgdf1 = new javax.swing.JLabel();
        totalCreadit0 = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        sem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(sem, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 140, 30));

        searchTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchTF.setForeground(new java.awt.Color(153, 153, 153));
        searchTF.setText("Enter Student ID");
        searchTF.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTFMouseClicked(evt);
            }
        });
        getContentPane().add(searchTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 390, 30));

        showResult.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        showResult.setText("Show Result");
        showResult.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        showResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showResultActionPerformed(evt);
            }
        });
        getContentPane().add(showResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 120, -1));

        s_batch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        s_batch.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(s_batch, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student Info:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Department:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Batch:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Name:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        s_id.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        s_id.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(s_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        s_department.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        s_department.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(s_department, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        s_name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        s_name.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(s_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        rtwert.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        rtwert.setForeground(new java.awt.Color(255, 255, 255));
        rtwert.setText("Course Code");
        getContentPane().add(rtwert, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 90, -1));

        course1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        course1.setForeground(new java.awt.Color(255, 255, 255));
        course1.setText("Course");
        getContentPane().add(course1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 60, -1));

        course2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        course2.setForeground(new java.awt.Color(255, 255, 255));
        course2.setText("Course");
        getContentPane().add(course2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 50, -1));

        course3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        course3.setForeground(new java.awt.Color(255, 255, 255));
        course3.setText("Course");
        getContentPane().add(course3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 60, -1));

        course4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        course4.setForeground(new java.awt.Color(255, 255, 255));
        course4.setText("Course");
        getContentPane().add(course4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, 50, -1));

        tsdg.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        tsdg.setForeground(new java.awt.Color(255, 255, 255));
        tsdg.setText("Credit");
        getContentPane().add(tsdg, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 60, -1));

        credit1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        credit1.setForeground(new java.awt.Color(255, 255, 255));
        credit1.setText("0");
        getContentPane().add(credit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 70, -1));

        credit2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        credit2.setForeground(new java.awt.Color(255, 255, 255));
        credit2.setText("0");
        getContentPane().add(credit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 70, -1));

        credit3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        credit3.setForeground(new java.awt.Color(255, 255, 255));
        credit3.setText("0");
        getContentPane().add(credit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, 70, -1));

        credit4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        credit4.setForeground(new java.awt.Color(255, 255, 255));
        credit4.setText("0");
        getContentPane().add(credit4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 550, 70, -1));

        sdfgaer.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        sdfgaer.setForeground(new java.awt.Color(255, 255, 255));
        sdfgaer.setText("CGPA");
        getContentPane().add(sdfgaer, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 390, 70, -1));

        cg1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        cg1.setForeground(new java.awt.Color(255, 255, 255));
        cg1.setText("0.00");
        getContentPane().add(cg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 430, 70, -1));

        cg2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        cg2.setForeground(new java.awt.Color(255, 255, 255));
        cg2.setText("0.00");
        getContentPane().add(cg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 470, 70, -1));

        cg3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        cg3.setForeground(new java.awt.Color(255, 255, 255));
        cg3.setText("0.00");
        getContentPane().add(cg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 510, 70, -1));

        cg4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        cg4.setForeground(new java.awt.Color(255, 255, 255));
        cg4.setText("0.00");
        getContentPane().add(cg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 550, 70, -1));

        tsdg1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        tsdg1.setForeground(new java.awt.Color(255, 255, 255));
        tsdg1.setText("Grade");
        getContentPane().add(tsdg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 90, -1));

        grade1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        grade1.setForeground(new java.awt.Color(255, 255, 255));
        grade1.setText("-");
        getContentPane().add(grade1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 70, -1));

        grade2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        grade2.setForeground(new java.awt.Color(255, 255, 255));
        grade2.setText("-");
        getContentPane().add(grade2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, 70, -1));

        grade3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        grade3.setForeground(new java.awt.Color(255, 255, 255));
        grade3.setText("-");
        getContentPane().add(grade3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 510, 70, -1));

        grade4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        grade4.setForeground(new java.awt.Color(255, 255, 255));
        grade4.setText("-");
        getContentPane().add(grade4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 550, 70, -1));

        avgSGPA.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        avgSGPA.setForeground(new java.awt.Color(204, 255, 255));
        avgSGPA.setText("0.00");
        getContentPane().add(avgSGPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 610, 50, -1));

        fdgdf.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        fdgdf.setForeground(new java.awt.Color(204, 255, 255));
        fdgdf.setText("Average SGPA:");
        getContentPane().add(fdgdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 610, 110, -1));

        fdgdf1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        fdgdf1.setForeground(new java.awt.Color(204, 255, 255));
        fdgdf1.setText("Total Creadit:");
        getContentPane().add(fdgdf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 610, 110, -1));

        totalCreadit0.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        totalCreadit0.setForeground(new java.awt.Color(204, 255, 255));
        totalCreadit0.setText("0");
        getContentPane().add(totalCreadit0, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 610, 50, -1));

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/result_portal_system/ImageFiles/Product.png"))); // NOI18N
        getContentPane().add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 680));

        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void showResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showResultActionPerformed
        // TODO add your handling code here:
        String studentID = searchTF.getText();
        String semName = (String) sem.getSelectedItem();
        String course1Mark = "s", course2Mark = "s", course3Mark = "s", course4Mark = "s";
        int totalCreadit = 0;
        
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/resultportal","root","");
            
            Statement stmt = con.createStatement();  
            
            ResultSet rs1 = stmt.executeQuery("SELECT * FROM student WHERE ID = '"+studentID+"'");
            while(rs1.next()){
                s_name.setText(rs1.getString(2));
                s_id.setText(rs1.getString(1));
                s_department.setText(rs1.getString(4) + " (" + rs1.getString(3) + ")");
                s_batch.setText(rs1.getString(5));
            }
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM result WHERE ID = '"+studentID+"' AND Semester = '"+semName+"'");
            while(rs.next()){
                course1.setText(rs.getString("Course_1"));
                course2.setText(rs.getString("Course_2"));
                course3.setText(rs.getString("Course_3"));
                course4.setText(rs.getString("Course_4"));
                
                credit1.setText(rs.getString("Course_1_Cr"));
                totalCreadit += Integer.parseInt(rs.getString("Course_1_Cr"));
                credit2.setText(rs.getString("Course_2_Cr"));
                totalCreadit += Integer.parseInt(rs.getString("Course_2_Cr"));
                credit3.setText(rs.getString("Course_3_Cr"));
                totalCreadit += Integer.parseInt(rs.getString("Course_3_Cr"));
                credit4.setText(rs.getString("Course_4_Cr"));
                totalCreadit += Integer.parseInt(rs.getString("Course_4_Cr"));
                
                course1Mark = rs.getString("Course_1_mark");
                course2Mark = rs.getString("Course_2_mark");
                course3Mark = rs.getString("Course_3_mark");
                course4Mark = rs.getString("Course_4_mark");
                
            }
            
            //Total Creadit
            totalCreadit0.setText(Integer.toString(totalCreadit));
            
            
            //Set Course 1 CGPA and Grade
            if(Integer.parseInt(course1Mark) >= 80 && Integer.parseInt(course1Mark) <= 100){
                cg1.setText("4.00");
                grade1.setText("A+");
            }
            else if(Integer.parseInt(course1Mark) >= 75 && Integer.parseInt(course1Mark) <= 79)
            {
                cg1.setText("3.75");
                grade1.setText("A");
            }
            else if(Integer.parseInt(course1Mark) >= 70 && Integer.parseInt(course1Mark) <= 74)
            {
                cg1.setText("3.50");
                grade1.setText("A-");
            }
            else if(Integer.parseInt(course1Mark) >= 65 && Integer.parseInt(course1Mark) <= 69)
            {
                cg1.setText("3.25");
                grade1.setText("B+");
            }
            else if(Integer.parseInt(course1Mark) >= 60 && Integer.parseInt(course1Mark) <= 64)
            {
                cg1.setText("3.00");
                grade1.setText("B");
            }
            else if(Integer.parseInt(course1Mark) >= 55 && Integer.parseInt(course1Mark) <= 69)
            {
                cg1.setText("2.75");
                grade1.setText("B");
            }
            else if(Integer.parseInt(course1Mark) >= 50 && Integer.parseInt(course1Mark) <= 54)
            {
                cg1.setText("2.50");
                grade1.setText("C+");
            }
            else if(Integer.parseInt(course1Mark) >= 45 && Integer.parseInt(course1Mark) <= 49)
            {
                cg1.setText("2.25");
                grade1.setText("C");
            }
            else if(Integer.parseInt(course1Mark) >= 40 && Integer.parseInt(course1Mark) <= 44)
            {
                cg1.setText("2.00");
                grade1.setText("D");
            }
            else if(Integer.parseInt(course1Mark) >= 1 && Integer.parseInt(course1Mark) <= 39)
            {
                cg1.setText("0.00");
                grade1.setText("F");
            }
            else{
                cg1.setText("0.00");
                grade1.setText("-");
            }
            
            
            
            //Set Course 2 CGPA and Grade
            
            if(Integer.parseInt(course2Mark) >= 80 && Integer.parseInt(course2Mark) <= 100){
                cg2.setText("4.00");
                grade2.setText("A+");
            }
            else if(Integer.parseInt(course2Mark) >= 75 && Integer.parseInt(course2Mark) <= 79)
            {
                cg2.setText("3.75");
                grade2.setText("A");
            }
            else if(Integer.parseInt(course2Mark) >= 70 && Integer.parseInt(course2Mark) <= 74)
            {
                cg2.setText("3.50");
                grade2.setText("A-");
            }
            else if(Integer.parseInt(course2Mark) >= 65 && Integer.parseInt(course2Mark) <= 69)
            {
                cg2.setText("3.25");
                grade2.setText("B+");
            }
            else if(Integer.parseInt(course2Mark) >= 60 && Integer.parseInt(course2Mark) <= 64)
            {
                cg2.setText("3.00");
                grade2.setText("B");
            }
            else if(Integer.parseInt(course2Mark) >= 55 && Integer.parseInt(course2Mark) <= 69)
            {
                cg2.setText("2.75");
                grade2.setText("B-");
            }
            else if(Integer.parseInt(course2Mark) >= 50 && Integer.parseInt(course2Mark) <= 54)
            {
                cg2.setText("2.50");
                grade2.setText("C+");
            }
            else if(Integer.parseInt(course2Mark) >= 45 && Integer.parseInt(course2Mark) <= 49)
            {
                cg2.setText("2.25");
                grade2.setText("C");
            }
            else if(Integer.parseInt(course2Mark) >= 40 && Integer.parseInt(course2Mark) <= 44)
            {
                cg2.setText("2.00");
                grade2.setText("D");
            }
            else if(Integer.parseInt(course2Mark) >= 1 && Integer.parseInt(course2Mark) <= 39)
            {
                cg2.setText("0.00");
                grade2.setText("F");
            }
            else{
                cg2.setText("0.00");
                grade2.setText("-");
            }
            
            
            //Set Course 3 CGPA and Grade
            
            if(Integer.parseInt(course3Mark) >= 80 && Integer.parseInt(course3Mark) <= 100){
                cg3.setText("4.00");
                grade3.setText("A+");
            }
            else if(Integer.parseInt(course3Mark) >= 75 && Integer.parseInt(course3Mark) <= 79)
            {
                cg3.setText("3.75");
                grade3.setText("A");
            }
            else if(Integer.parseInt(course3Mark) >= 70 && Integer.parseInt(course3Mark) <= 74)
            {
                cg3.setText("3.50");
                grade3.setText("A-");
            }
            else if(Integer.parseInt(course3Mark) >= 65 && Integer.parseInt(course3Mark) <= 69)
            {
                cg3.setText("3.25");
                grade3.setText("B+");
            }
            else if(Integer.parseInt(course3Mark) >= 60 && Integer.parseInt(course3Mark) <= 64)
            {
                cg3.setText("3.00");
                grade3.setText("B");
            }
            else if(Integer.parseInt(course3Mark) >= 55 && Integer.parseInt(course3Mark) <= 69)
            {
                cg3.setText("2.75");
                grade3.setText("B-");
            }
            else if(Integer.parseInt(course3Mark) >= 50 && Integer.parseInt(course3Mark) <= 54)
            {
                cg3.setText("2.50");
                grade3.setText("C+");
            }
            else if(Integer.parseInt(course3Mark) >= 45 && Integer.parseInt(course3Mark) <= 49)
            {
                cg3.setText("2.25");
                grade3.setText("C");
            }
            else if(Integer.parseInt(course3Mark) >= 40 && Integer.parseInt(course3Mark) <= 44)
            {
                cg3.setText("2.00");
                grade3.setText("D");
            }
            else if(Integer.parseInt(course3Mark) >= 1 && Integer.parseInt(course3Mark) <= 39)
            {
                cg3.setText("0.00");
                grade3.setText("F");
            }
            else{
                cg3.setText("0.00");
                grade3.setText("-");
            }
            
            //Set Course 4 CGPA and Grade
            
            if(Integer.parseInt(course4Mark) >= 80 && Integer.parseInt(course4Mark) <= 100){
                cg4.setText("4.00");
                grade4.setText("A+");
            }
            else if(Integer.parseInt(course4Mark) >= 75 && Integer.parseInt(course4Mark) <= 79)
            {
                cg4.setText("3.75");
                grade4.setText("A");
            }
            else if(Integer.parseInt(course4Mark) >= 70 && Integer.parseInt(course4Mark) <= 74)
            {
                cg4.setText("3.50");
                grade4.setText("A-");
            }
            else if(Integer.parseInt(course4Mark) >= 65 && Integer.parseInt(course4Mark) <= 69)
            {
                cg4.setText("3.25");
                grade4.setText("B+");
            }
            else if(Integer.parseInt(course4Mark) >= 60 && Integer.parseInt(course4Mark) <= 64)
            {
                cg4.setText("3.00");
                grade4.setText("B");
            }
            else if(Integer.parseInt(course4Mark) >= 55 && Integer.parseInt(course4Mark) <= 69)
            {
                cg4.setText("2.75");
                grade4.setText("B-");
            }
            else if(Integer.parseInt(course4Mark) >= 50 && Integer.parseInt(course4Mark) <= 54)
            {
                cg4.setText("2.50");
                grade4.setText("C+");
            }
            else if(Integer.parseInt(course4Mark) >= 45 && Integer.parseInt(course4Mark) <= 49)
            {
                cg4.setText("2.25");
                grade4.setText("C");
            }
            else if(Integer.parseInt(course4Mark) >= 40 && Integer.parseInt(course4Mark) <= 44)
            {
                cg4.setText("2.00");
                grade4.setText("D");
            }
            else if(Integer.parseInt(course4Mark) >= 1 && Integer.parseInt(course4Mark) <= 39)
            {
                cg4.setText("0.00");
                grade4.setText("F");
            }
            else{
                cg4.setText("0.00");
                grade4.setText("-");
            }
            
            
            float c_cgp1 = Float.parseFloat(cg1.getText());
            float c_cgp2 = Float.parseFloat(cg2.getText());
            float c_cgp3 = Float.parseFloat(cg3.getText());
            float c_cgp4 = Float.parseFloat(cg4.getText());
            
            float c_creadit1 = Float.parseFloat(credit1.getText());
            float c_creadit2 = Float.parseFloat(credit2.getText());
            float c_creadit3 = Float.parseFloat(credit3.getText());
            float c_creadit4 = Float.parseFloat(credit4.getText());
            
            float totalCGPA = ((c_cgp1 * c_creadit1) + (c_cgp2 * c_creadit2) + (c_cgp3 * c_creadit3) + (c_cgp4 * c_creadit4))/totalCreadit;
            avgSGPA.setText(String.format("%.2f", totalCGPA));
            
            stmt.close();
            rs.close();
            rs1.close();
            con.close();  
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e, "Error", 0);
        }  
    }//GEN-LAST:event_showResultActionPerformed

    private void searchTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTFMouseClicked
        // TODO add your handling code here:
        if(searchTF.getText().equals("Enter Student ID")){
            searchTF.setText("");
            searchTF.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_searchTFMouseClicked

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
            java.util.logging.Logger.getLogger(ViewResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avgSGPA;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JLabel cg1;
    private javax.swing.JLabel cg2;
    private javax.swing.JLabel cg3;
    private javax.swing.JLabel cg4;
    private javax.swing.JLabel course1;
    private javax.swing.JLabel course2;
    private javax.swing.JLabel course3;
    private javax.swing.JLabel course4;
    private javax.swing.JLabel credit1;
    private javax.swing.JLabel credit2;
    private javax.swing.JLabel credit3;
    private javax.swing.JLabel credit4;
    private javax.swing.JLabel fdgdf;
    private javax.swing.JLabel fdgdf1;
    private javax.swing.JLabel grade1;
    private javax.swing.JLabel grade2;
    private javax.swing.JLabel grade3;
    private javax.swing.JLabel grade4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel rtwert;
    private javax.swing.JLabel s_batch;
    private javax.swing.JLabel s_department;
    private javax.swing.JLabel s_id;
    private javax.swing.JLabel s_name;
    private javax.swing.JLabel sdfgaer;
    private javax.swing.JTextField searchTF;
    private javax.swing.JComboBox<String> sem;
    private javax.swing.JButton showResult;
    private javax.swing.JLabel totalCreadit0;
    private javax.swing.JLabel tsdg;
    private javax.swing.JLabel tsdg1;
    // End of variables declaration//GEN-END:variables
}
