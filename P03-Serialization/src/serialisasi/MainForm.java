/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package serialisasi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author USER
 */
public class MainForm extends javax.swing.JFrame {

    public static Product product;
    private final String path;

    /**
     * Creates new form NewJFrame
     */
    public MainForm() {
        initComponents();
        product = new Product("", "", new ArrayList<>(), "");
        path = System.getProperty("user.dir") + File.separator
                + "product.ser";
    }

    private void lihatHasilSerialization() {
        FileReader fileReader;
        BufferedReader bufferedReader;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            File file = new File(path);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append("\r\n");
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
        }
        AreaSerialization.setText(stringBuilder.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEntriData = new javax.swing.JButton();
        btnDoSerialization = new javax.swing.JButton();
        btnDoDeserialization = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaDeserialization = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        AreaSerialization = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnEntriData.setText("Edit Data Produk");
        btnEntriData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntriDataActionPerformed(evt);
            }
        });

        btnDoSerialization.setText("Lakukan Serialization");
        btnDoSerialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoSerializationActionPerformed(evt);
            }
        });

        btnDoDeserialization.setText("Lakukan Deserialization");
        btnDoDeserialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoDeserializationActionPerformed(evt);
            }
        });

        jSplitPane1.setDividerLocation(301);
        jSplitPane1.setOneTouchExpandable(true);

        jPanel1.setLayout(new java.awt.BorderLayout());

        AreaDeserialization.setColumns(20);
        AreaDeserialization.setRows(5);
        jScrollPane1.setViewportView(AreaDeserialization);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jSplitPane1.setRightComponent(jPanel1);

        jPanel2.setLayout(new java.awt.BorderLayout());

        AreaSerialization.setColumns(20);
        AreaSerialization.setRows(5);
        jScrollPane2.setViewportView(AreaSerialization);

        jPanel2.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jSplitPane1.setLeftComponent(jPanel2);

        jLabel1.setText("HASIL SERIALIZATION");

        jLabel3.setText("HASIL DESERIALIZATION");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSplitPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEntriData)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(btnDoSerialization)
                                .addGap(66, 66, 66)
                                .addComponent(btnDoDeserialization))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(jLabel3)))
                        .addGap(22, 87, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDoSerialization, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDoDeserialization, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEntriData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntriDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntriDataActionPerformed
        // TODO add your handling code here:
        AddProduct add = new AddProduct(this, true);
        add.setVisible(true);
    }//GEN-LAST:event_btnEntriDataActionPerformed

    private void btnDoSerializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoSerializationActionPerformed
        // TODO add your handling code here:
        FileOutputStream fos;
        ObjectOutputStream oos;
        try{
            fos = new FileOutputStream(new File(path));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(product);
            oos.close();
            fos.close();
            lihatHasilSerialization();
        }catch(FileNotFoundException e){   
        }catch(IOException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnDoSerializationActionPerformed

    private void btnDoDeserializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoDeserializationActionPerformed
        // TODO add your handling code here:
        FileInputStream fis;
        ObjectInputStream ois;
        try{
            fis = new FileInputStream(new File(path));
            ois = new ObjectInputStream(fis);
            Object obj=ois.readObject();
            Product k2=(Product) obj;
            AreaDeserialization.setText(k2.toString());
            ois.close();
            fis.close();
        }catch(FileNotFoundException e){   
        }catch(IOException |ClassNotFoundException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnDoDeserializationActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException |
                InstantiationException | UnsupportedLookAndFeelException e){    
        }
        java.awt.EventQueue.invokeLater(()-> {
                new MainForm().setVisible(true);
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaDeserialization;
    private javax.swing.JTextArea AreaSerialization;
    private javax.swing.JButton btnDoDeserialization;
    private javax.swing.JButton btnDoSerialization;
    private javax.swing.JButton btnEntriData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
