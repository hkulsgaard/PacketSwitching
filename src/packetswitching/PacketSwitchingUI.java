package packetswitching;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;


public class PacketSwitchingUI extends javax.swing.JFrame {

    public PacketSwitchingUI() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        dialogNonexistentFile = new javax.swing.JDialog();
        dialogNonexistentFile.setLocationRelativeTo(null);
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        panelSimulator = new javax.swing.JPanel();
        labelInput = new javax.swing.JLabel();
        labelOutput = new javax.swing.JLabel();
        textFieldNetworkInput = new javax.swing.JTextField();
        textFieldLogOutput = new javax.swing.JTextField();
        buttonNetworkInput = new javax.swing.JButton();
        buttonLogOutput = new javax.swing.JButton();
        buttonSimulate = new javax.swing.JButton();
        panelGrapher = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textFieldLogInput = new javax.swing.JTextField();
        buttonLogInput = new javax.swing.JButton();
        buttonGraphicate = new javax.swing.JButton();
        menubarTop = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        itemFileOpen = new javax.swing.JMenuItem();
        itemFileSave = new javax.swing.JMenuItem();
        menuAbout = new javax.swing.JMenu();

        fileChooser.setPreferredSize(new java.awt.Dimension(900, 500));

        dialogNonexistentFile.setTitle("WARNING!");
        dialogNonexistentFile.setIconImage(null);
        dialogNonexistentFile.setMinimumSize(new java.awt.Dimension(210, 100));
        dialogNonexistentFile.setResizable(false);
        dialogNonexistentFile.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                dialogNonexistentFileWindowDeactivated(evt);
            }
        });

        jLabel1.setText("Error: Nonexistent file/s");

        javax.swing.GroupLayout dialogNonexistentFileLayout = new javax.swing.GroupLayout(dialogNonexistentFile.getContentPane());
        dialogNonexistentFile.getContentPane().setLayout(dialogNonexistentFileLayout);
        dialogNonexistentFileLayout.setHorizontalGroup(
            dialogNonexistentFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogNonexistentFileLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        dialogNonexistentFileLayout.setVerticalGroup(
            dialogNonexistentFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogNonexistentFileLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Packet Switching - Comunicacion de Datos 1");
        setResizable(false);

        panelSimulator.setBorder(javax.swing.BorderFactory.createTitledBorder("Simulator"));

        labelInput.setText("Network Input");

        labelOutput.setText("Log Output");

        textFieldNetworkInput.setText("D:\\Proyectos\\Netbeans\\PacketSwitching\\network.txt");
        textFieldNetworkInput.setToolTipText("");

        textFieldLogOutput.setText("D:\\");
            textFieldLogOutput.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    textFieldLogOutputActionPerformed(evt);
                }
            });

            buttonNetworkInput.setText("...");
            buttonNetworkInput.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    buttonNetworkInputActionPerformed(evt);
                }
            });

            buttonLogOutput.setText("...");
            buttonLogOutput.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    buttonLogOutputActionPerformed(evt);
                }
            });

            buttonSimulate.setText("Simulate");
            buttonSimulate.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    buttonSimulateActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout panelSimulatorLayout = new javax.swing.GroupLayout(panelSimulator);
            panelSimulator.setLayout(panelSimulatorLayout);
            panelSimulatorLayout.setHorizontalGroup(
                panelSimulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSimulatorLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panelSimulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelSimulatorLayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(buttonSimulate, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelSimulatorLayout.createSequentialGroup()
                            .addGroup(panelSimulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panelSimulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textFieldNetworkInput, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                                .addComponent(textFieldLogOutput))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panelSimulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(buttonNetworkInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonLogOutput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap())
            );
            panelSimulatorLayout.setVerticalGroup(
                panelSimulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelSimulatorLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panelSimulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelInput)
                        .addComponent(textFieldNetworkInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonNetworkInput))
                    .addGap(18, 18, 18)
                    .addGroup(panelSimulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelOutput)
                        .addComponent(textFieldLogOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonLogOutput))
                    .addGap(18, 18, 18)
                    .addComponent(buttonSimulate)
                    .addContainerGap(20, Short.MAX_VALUE))
            );

            panelGrapher.setBorder(javax.swing.BorderFactory.createTitledBorder("Grapher"));
            panelGrapher.setEnabled(false);

            jLabel2.setText("Log Input");
            jLabel2.setEnabled(false);

            textFieldLogInput.setText("D:\\log_ps_cd1.txt");
            textFieldLogInput.setEnabled(false);

            buttonLogInput.setText("...");
            buttonLogInput.setEnabled(false);
            buttonLogInput.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    buttonLogInputActionPerformed(evt);
                }
            });

            buttonGraphicate.setText("Graphicate");
            buttonGraphicate.setEnabled(false);
            buttonGraphicate.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    buttonGraphicateActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout panelGrapherLayout = new javax.swing.GroupLayout(panelGrapher);
            panelGrapher.setLayout(panelGrapherLayout);
            panelGrapherLayout.setHorizontalGroup(
                panelGrapherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGrapherLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panelGrapherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelGrapherLayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(buttonGraphicate, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelGrapherLayout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(textFieldLogInput, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonLogInput, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
            );
            panelGrapherLayout.setVerticalGroup(
                panelGrapherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelGrapherLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panelGrapherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(textFieldLogInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonLogInput))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                    .addComponent(buttonGraphicate)
                    .addContainerGap())
            );

            menuFile.setText("File");

            itemFileOpen.setText("Open");
            itemFileOpen.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    itemFileOpenActionPerformed(evt);
                }
            });
            menuFile.add(itemFileOpen);

            itemFileSave.setText("Save to");
            itemFileSave.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    itemFileSaveActionPerformed(evt);
                }
            });
            menuFile.add(itemFileSave);

            menubarTop.add(menuFile);

            menuAbout.setText("About");
            menubarTop.add(menuAbout);

            setJMenuBar(menubarTop);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(panelGrapher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelSimulator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelSimulator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(panelGrapher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void itemFileOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemFileOpenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemFileOpenActionPerformed

    private void itemFileSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemFileSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemFileSaveActionPerformed

    private void textFieldLogOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldLogOutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldLogOutputActionPerformed

    private void buttonLogOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogOutputActionPerformed
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        if (!textFieldLogOutput.getText().isEmpty()){
            fileChooser.setCurrentDirectory(new File(textFieldLogOutput.getText()));
        }
        if (fileChooser.APPROVE_OPTION == fileChooser.showSaveDialog(panelSimulator)){
            textFieldLogOutput.setText(fileChooser.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_buttonLogOutputActionPerformed

    private void buttonNetworkInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNetworkInputActionPerformed
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        if (!textFieldNetworkInput.getText().isEmpty()){
            fileChooser.setCurrentDirectory(new File(textFieldNetworkInput.getText()));
        }
        if (fileChooser.APPROVE_OPTION == fileChooser.showOpenDialog(panelSimulator)){
            textFieldNetworkInput.setText(fileChooser.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_buttonNetworkInputActionPerformed

    private void buttonSimulateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimulateActionPerformed
        File input = new File(textFieldNetworkInput.getText());
        File output = new File(textFieldLogOutput.getText());
        if(!input.exists() || !output.exists()){
            setEnabled(false);
            dialogNonexistentFile.setVisible(true);
            return;
        }
        
        try {
            NetworkSimulator ns = new NetworkSimulator(input.getAbsolutePath());
            if (output.isFile()){
                ns.setLogPath(output.getAbsolutePath());
            }
            else{
                ns.setLogPath(output.getAbsolutePath()+"\\log_ps_cd1.txt");
            }

            ns.simulate();
            new Painter(ns.getNetwork());
        }catch (IOException e) {System.err.println("Caught IOException: " + e.getMessage());}
    }//GEN-LAST:event_buttonSimulateActionPerformed

    private void dialogNonexistentFileWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_dialogNonexistentFileWindowDeactivated
        dialogNonexistentFile.setVisible(false);
        setEnabled(true);
        setVisible(true);
    }//GEN-LAST:event_dialogNonexistentFileWindowDeactivated

    private void buttonLogInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonLogInputActionPerformed

    private void buttonGraphicateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGraphicateActionPerformed

    }//GEN-LAST:event_buttonGraphicateActionPerformed

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
            java.util.logging.Logger.getLogger(PacketSwitchingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PacketSwitchingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PacketSwitchingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PacketSwitchingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PacketSwitchingUI().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonGraphicate;
    private javax.swing.JButton buttonLogInput;
    private javax.swing.JButton buttonLogOutput;
    private javax.swing.JButton buttonNetworkInput;
    private javax.swing.JButton buttonSimulate;
    private javax.swing.JDialog dialogNonexistentFile;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JMenuItem itemFileOpen;
    private javax.swing.JMenuItem itemFileSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelInput;
    private javax.swing.JLabel labelOutput;
    private javax.swing.JMenu menuAbout;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuBar menubarTop;
    private javax.swing.JPanel panelGrapher;
    private javax.swing.JPanel panelSimulator;
    private javax.swing.JTextField textFieldLogInput;
    private javax.swing.JTextField textFieldLogOutput;
    private javax.swing.JTextField textFieldNetworkInput;
    // End of variables declaration//GEN-END:variables
}
