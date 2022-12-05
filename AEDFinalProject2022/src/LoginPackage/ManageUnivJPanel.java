/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package LoginPackage;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author anamikaverma
 */
public class ManageUnivJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUnivJPanel
     */
    public ManageUnivJPanel() {
        initComponents();
    }
    
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        UniID = new javax.swing.JTextField();
        UniName = new javax.swing.JTextField();
        UniPwd = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        UniUserName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setText("Manage Universities");

        jLabel2.setText("University ID");

        jLabel3.setText("University Name");

        jLabel4.setText("Password");

        UniPwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UniPwdActionPerformed(evt);
            }
        });

        Add.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        Add.setText("Add a University");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "University ID", "University Name"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel5.setText("User Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(UniID)
                                        .addComponent(UniName)
                                        .addComponent(UniPwd, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                                    .addComponent(UniUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(256, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(UniID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(UniName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UniUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(UniPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Final_Project","root","Ankita@22");
            PreparedStatement add= Con.prepareStatement("insert into Uni_Dir values(?,?,?,?)");
            add.setString(1, UniID.getText());
            add.setString(2, UniName.getText());
            add.setString(3,UniUserName.getText());
            add.setString(4,UniPwd.getText());
            int row=add.executeUpdate();
            PreparedStatement add1= Con.prepareStatement("insert into Credentials values(?,?,?)");
            add1.setString(1, UniUserName.getText());
            add1.setString(2, UniPwd.getText());
            add1.setString(3, "University Admin");
            int row1=add1.executeUpdate();
            JOptionPane.showMessageDialog(this, "University Added Successfully");
            Con.close();
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_AddActionPerformed

    private void UniPwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UniPwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UniPwdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    public javax.swing.JTextField UniID;
    public javax.swing.JTextField UniName;
    public javax.swing.JTextField UniPwd;
    private javax.swing.JTextField UniUserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
