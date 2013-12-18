package packetswitching;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;


public class PacketSwitchingUI extends javax.swing.JFrame {
    
    //ATRIBUTOS ESTATICOS
    public static final int MIN_SCALE = 20;
    public static final int MAX_SCALE = 100000;
    public static final int MIN_MULTI = 1;
    public static final int MAX_MULTI = 10000;
    
    
    public PacketSwitchingUI() {
        initComponents();
        setLocationRelativeTo(null);
        fileChooser.setCurrentDirectory(new java.io.File( "." ));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        dialogErrorMsj = new javax.swing.JDialog();
        dialogErrorMsj.setLocationRelativeTo(null);
        labelErrorMsj = new javax.swing.JLabel();
        dialogAbout = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
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
        panelSettings = new javax.swing.JPanel();
        labelScale = new javax.swing.JLabel();
        textFieldScale = new javax.swing.JTextField();
        labelScaleMulti = new javax.swing.JLabel();
        textFieldScaleMulti = new javax.swing.JTextField();
        labelUnit = new javax.swing.JLabel();
        comboBoxUnitTime = new javax.swing.JComboBox();
        menubarTop = new javax.swing.JMenuBar();
        menuAbout = new javax.swing.JMenu();

        fileChooser.setCurrentDirectory(null);
        fileChooser.setPreferredSize(new java.awt.Dimension(900, 500));

        dialogErrorMsj.setTitle("ERROR!");
        dialogErrorMsj.setIconImage(null);
        dialogErrorMsj.setMinimumSize(new java.awt.Dimension(150, 100));
        dialogErrorMsj.setResizable(false);
        dialogErrorMsj.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                dialogErrorMsjWindowDeactivated(evt);
            }
        });

        javax.swing.GroupLayout dialogErrorMsjLayout = new javax.swing.GroupLayout(dialogErrorMsj.getContentPane());
        dialogErrorMsj.getContentPane().setLayout(dialogErrorMsjLayout);
        dialogErrorMsjLayout.setHorizontalGroup(
            dialogErrorMsjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogErrorMsjLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(labelErrorMsj)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        dialogErrorMsjLayout.setVerticalGroup(
            dialogErrorMsjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogErrorMsjLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(labelErrorMsj)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        dialogAbout.setTitle("About");
        dialogAbout.setMinimumSize(new java.awt.Dimension(370, 200));
        dialogAbout.setPreferredSize(new java.awt.Dimension(370, 200));
        dialogAbout.setResizable(false);
        dialogAbout.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                dialogAboutWindowDeactivated(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Trabajo Final - Comunicación de Datos I\n\nAutores:\n\t*Külsgaard, Hernán\n\t*Ortiz, Augusto\n\nAño 2013");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout dialogAboutLayout = new javax.swing.GroupLayout(dialogAbout.getContentPane());
        dialogAbout.getContentPane().setLayout(dialogAboutLayout);
        dialogAboutLayout.setHorizontalGroup(
            dialogAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogAboutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                .addContainerGap())
        );
        dialogAboutLayout.setVerticalGroup(
            dialogAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogAboutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Packet Switching - Comunicacion de Datos 1");
        setResizable(false);

        panelSimulator.setBorder(javax.swing.BorderFactory.createTitledBorder(" Simulator and Grapher"));

        labelInput.setText("Network Input");

        labelOutput.setText("Log Output");

        textFieldNetworkInput.setToolTipText("");

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

        jLabel2.setText("Log Input");

        buttonLogInput.setText("...");
        buttonLogInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogInputActionPerformed(evt);
            }
        });

        buttonGraphicate.setText("Graphicate");
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

        panelSettings.setBorder(javax.swing.BorderFactory.createTitledBorder("Settings"));

        labelScale.setText("Scale(ms)");

        textFieldScale.setText("10000");

        labelScaleMulti.setText("Scale Multiplier");

        textFieldScaleMulti.setText("100");

        labelUnit.setText("Unit of time");

        comboBoxUnitTime.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "s", "ms" }));

        javax.swing.GroupLayout panelSettingsLayout = new javax.swing.GroupLayout(panelSettings);
        panelSettings.setLayout(panelSettingsLayout);
        panelSettingsLayout.setHorizontalGroup(
            panelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSettingsLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(labelScale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldScale, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelScaleMulti)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldScaleMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(labelUnit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxUnitTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        panelSettingsLayout.setVerticalGroup(
            panelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelScale)
                        .addComponent(textFieldScale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelScaleMulti)
                        .addComponent(textFieldScaleMulti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelUnit)
                        .addComponent(comboBoxUnitTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuAbout.setText("About");
        menuAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAboutMouseClicked(evt);
            }
        });
        menubarTop.add(menuAbout);

        setJMenuBar(menubarTop);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelGrapher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSimulator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelSimulator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelGrapher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        int scale = 0, scalemulti = 0;
        try {
            
            if(!checkSettings()){
                return;
            }
            
            if(!input.exists() || (output.isDirectory() && !output.exists()) || (!output.isDirectory() && !output.isFile() && !output.createNewFile())){
                showErrorMsj("Nonexistent file");
                return;
            }
            
            NetworkSimulator ns = new NetworkSimulator(input.getAbsolutePath());
            if(ns.loadNetworkFromFile(input.getAbsolutePath())==NetworkSimulator.FAIL_FILE_LOAD){
                showErrorMsj("Incorrect format file");
                return;
            }
            
            if (output.isFile()){
                ns.setLogPath(output.getAbsolutePath());
                
            }
            else if(output.isDirectory()){
                ns.setLogPath(output.getAbsolutePath()+"\\log_ps_cd1.txt");
            }
            
            ns.simulate();
            new Painter(ns.getNetwork(),Integer.valueOf(textFieldScale.getText()),Float.valueOf(textFieldScaleMulti.getText()),(String)comboBoxUnitTime.getSelectedItem());
            
        }catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
            showErrorMsj("Incorrect path");
            return;
        }
        
        
    }//GEN-LAST:event_buttonSimulateActionPerformed

    private void dialogErrorMsjWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_dialogErrorMsjWindowDeactivated
        dialogErrorMsj.setVisible(false);
        setEnabled(true);
        setVisible(true);
    }//GEN-LAST:event_dialogErrorMsjWindowDeactivated

    private void buttonLogInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogInputActionPerformed
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        if (!textFieldLogInput.getText().isEmpty()){
            fileChooser.setCurrentDirectory(new File(textFieldLogInput.getText()));
        }
        if (fileChooser.APPROVE_OPTION == fileChooser.showOpenDialog(panelSimulator)){
            textFieldLogInput.setText(fileChooser.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_buttonLogInputActionPerformed

    private void buttonGraphicateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGraphicateActionPerformed
        File input = new File(textFieldLogInput.getText());
        if(!input.exists()){
            setEnabled(false);
            showErrorMsj("Nonexistent log file");
            return;
        }
        
        if(!checkSettings()){
            return;
        }
                
        try {
            new Painter(input.getAbsolutePath(),Integer.valueOf(textFieldScale.getText()),Float.valueOf(textFieldScaleMulti.getText()),(String)comboBoxUnitTime.getSelectedItem());
        }catch (IOException e) {System.err.println("Caught IOException: " + e.getMessage());}
    }//GEN-LAST:event_buttonGraphicateActionPerformed

    private void menuAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAboutMouseClicked
        setEnabled(false);
        dialogAbout.setLocationRelativeTo(null);
        dialogAbout.setVisible(true);
    }//GEN-LAST:event_menuAboutMouseClicked

    private void dialogAboutWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_dialogAboutWindowDeactivated
        dialogAbout.setVisible(false);
        setEnabled(true);
        setVisible(true);
    }//GEN-LAST:event_dialogAboutWindowDeactivated
    
    private void showErrorMsj(String error){
        setEnabled(false);
        labelErrorMsj.setText(error);
        dialogErrorMsj.setSize(50 + error.length()*5, 100);
        dialogErrorMsj.setVisible(true);
    }
    
    private boolean checkSettings(){
               
        if(!textFieldScale.getText().matches("d*\\.?\\d+")){
            showErrorMsj("Invalid value of Scale");
            return false;
        }
        
        if(!textFieldScaleMulti.getText().matches("d*\\.?\\d+")){
            showErrorMsj("Invalid value of Scale Multiplier");
            return false;
        }
        
        if(Integer.valueOf(textFieldScale.getText()) < MIN_SCALE || Integer.valueOf(textFieldScale.getText())>MAX_SCALE){
            showErrorMsj("Incorrect value of Scale ("+MIN_SCALE+"-"+MAX_SCALE+")");
            return false;
        }
        if(Integer.valueOf(textFieldScaleMulti.getText()) < MIN_MULTI || Integer.valueOf(textFieldScaleMulti.getText())>MAX_MULTI){
            showErrorMsj("Incorrect value of Scale Multiplier ("+MIN_MULTI+"-"+MAX_MULTI+")");
            return false;
        }
        
        return true;
    }
    
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
    private javax.swing.JComboBox comboBoxUnitTime;
    private javax.swing.JDialog dialogAbout;
    private javax.swing.JDialog dialogErrorMsj;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelErrorMsj;
    private javax.swing.JLabel labelInput;
    private javax.swing.JLabel labelOutput;
    private javax.swing.JLabel labelScale;
    private javax.swing.JLabel labelScaleMulti;
    private javax.swing.JLabel labelUnit;
    private javax.swing.JMenu menuAbout;
    private javax.swing.JMenuBar menubarTop;
    private javax.swing.JPanel panelGrapher;
    private javax.swing.JPanel panelSettings;
    private javax.swing.JPanel panelSimulator;
    private javax.swing.JTextField textFieldLogInput;
    private javax.swing.JTextField textFieldLogOutput;
    private javax.swing.JTextField textFieldNetworkInput;
    private javax.swing.JTextField textFieldScale;
    private javax.swing.JTextField textFieldScaleMulti;
    // End of variables declaration//GEN-END:variables
}
