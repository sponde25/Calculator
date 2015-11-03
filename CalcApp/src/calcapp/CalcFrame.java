/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcapp;

/**
 *
 * @author sponde
 */
public class CalcFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public CalcFrame() {
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

        ButtonFor3 = new javax.swing.JButton();
        ButtonFor0 = new javax.swing.JButton();
        ButtonForSub = new javax.swing.JButton();
        ButtonForDiv = new javax.swing.JButton();
        ButtonForMult = new javax.swing.JButton();
        ButtonForDeci = new javax.swing.JButton();
        ButtonForAns = new javax.swing.JButton();
        ButtonForAdd = new javax.swing.JButton();
        ButtonForMod = new javax.swing.JButton();
        ButtonFor9 = new javax.swing.JButton();
        ButtonFor8 = new javax.swing.JButton();
        ButtonFor7 = new javax.swing.JButton();
        ButtonFor6 = new javax.swing.JButton();
        ButtonFor5 = new javax.swing.JButton();
        ButtonFor4 = new javax.swing.JButton();
        ButtonFor2 = new javax.swing.JButton();
        ButtonForClear = new javax.swing.JButton();
        ButtonFor1 = new javax.swing.JButton();
        OutputField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ButtonFor3.setText("3");
        ButtonFor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClicked(evt);
            }
        });

        ButtonFor0.setText("0");
        ButtonFor0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClicked(evt);
            }
        });

        ButtonForSub.setText("-");
        ButtonForSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonForSubButtonClicked(evt);
            }
        });

        ButtonForDiv.setText("/");
        ButtonForDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonForDivButtonClicked(evt);
            }
        });

        ButtonForMult.setText("*");
        ButtonForMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonForMultButtonClicked(evt);
            }
        });

        ButtonForDeci.setText(".");
        ButtonForDeci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClicked(evt);
            }
        });

        ButtonForAns.setText("=");
        ButtonForAns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonForAnsButtonClicked(evt);
            }
        });

        ButtonForAdd.setText("+");
        ButtonForAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonForAddButtonClicked(evt);
            }
        });

        ButtonForMod.setText("%");
        ButtonForMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonForModButtonClicked(evt);
            }
        });

        ButtonFor9.setText("9");
        ButtonFor9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClicked(evt);
            }
        });

        ButtonFor8.setText("8");
        ButtonFor8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClicked(evt);
            }
        });

        ButtonFor7.setText("7");
        ButtonFor7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClicked(evt);
            }
        });

        ButtonFor6.setText("6");
        ButtonFor6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClicked(evt);
            }
        });

        ButtonFor5.setText("    5   ");
        ButtonFor5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClicked(evt);
            }
        });

        ButtonFor4.setText("4");
        ButtonFor4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClicked(evt);
            }
        });

        ButtonFor2.setText("2");
        ButtonFor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClicked(evt);
            }
        });

        ButtonForClear.setText("C");
        ButtonForClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonForClearButtonClicked(evt);
            }
        });

        ButtonFor1.setText("1");
        ButtonFor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClicked(evt);
            }
        });

        OutputField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        OutputField.setText("0");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Calculator v0.1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonFor9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonFor5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(ButtonFor1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonFor0, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ButtonFor8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ButtonFor4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ButtonFor7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ButtonFor3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ButtonFor2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ButtonFor6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonForAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonForSub, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonForDeci, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonForMod, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ButtonForDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonForAns, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButtonForMult, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(ButtonForClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OutputField)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OutputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonFor9)
                    .addComponent(ButtonFor8)
                    .addComponent(ButtonFor7)
                    .addComponent(ButtonFor6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonFor5)
                    .addComponent(ButtonFor4)
                    .addComponent(ButtonFor2)
                    .addComponent(ButtonFor3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonFor0)
                    .addComponent(ButtonFor1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonForAdd)
                    .addComponent(ButtonForSub)
                    .addComponent(ButtonForDiv)
                    .addComponent(ButtonForMult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonForDeci)
                    .addComponent(ButtonForAns)
                    .addComponent(ButtonForMod)
                    .addComponent(ButtonForClear))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonForSubButtonClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonForSubButtonClicked
        // TODO add your handling code here:
        if(!flag) {flag=true;
            OutputField.setText("");
            operator='-';
        }
        else{double tempOperation;
            tempOperation=Double.parseDouble(num1)-Double.parseDouble(num2);
            if(num1.contains(".")||num2.contains(".")||(""+tempOperation).contains(".")){
            num1=""+tempOperation;
            num2="";
            flag=false;
            }
            else{
            num1=""+(int)tempOperation;
            num2="";
            flag=false;
            }
            OutputField.setText(num1);
        }
        
    }//GEN-LAST:event_ButtonForSubButtonClicked

    private void ButtonForDivButtonClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonForDivButtonClicked
        // TODO add your handling code here:
        if(!flag) {flag=true;
            OutputField.setText("");
            operator='/';
        }
        else{double tempOperation;
            tempOperation=Double.parseDouble(num1)/Double.parseDouble(num2);
            if(num1.contains(".")||num2.contains(".")||(""+tempOperation).contains(".")){
            num1=""+tempOperation;
            num2="";
            flag=false;
            }
            else{
            num1=""+(int)tempOperation;
            num2="";
            flag=false;
            }
            OutputField.setText(num1);
        }
    }//GEN-LAST:event_ButtonForDivButtonClicked

    private void ButtonForMultButtonClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonForMultButtonClicked
        // TODO add your handling code here:
        if(!flag) {flag=true;
            OutputField.setText("");
            operator='*';
        }
        else{double tempOperation;
            tempOperation=Double.parseDouble(num1)*Double.parseDouble(num2);
            if(num1.contains(".")||num2.contains(".")||(""+tempOperation).contains(".")){
            num1=""+tempOperation;
            num2="";
            flag=false;
            }
            else{
            num1=""+(int)tempOperation;
            num2="";
            flag=false;
            }
            OutputField.setText(num1);
        }
    }//GEN-LAST:event_ButtonForMultButtonClicked

    private void ButtonForAnsButtonClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonForAnsButtonClicked
        // TODO add your handling code here:
        double tempOperation=0;
        switch(operator){
            case '-':
                tempOperation=Double.parseDouble(num1)-Double.parseDouble(num2);
                break;
            case '+':
                tempOperation=Double.parseDouble(num1)+Double.parseDouble(num2);
                break;
            case '/':
                tempOperation=Double.parseDouble(num1)/Double.parseDouble(num2);
                break;
            case '*':
                tempOperation=Double.parseDouble(num1)*Double.parseDouble(num2);
                break;
            case '%':
                tempOperation=Double.parseDouble(num1)%Double.parseDouble(num2);
                break;
        }
        
        if(num1.contains(".")||num2.contains(".")||(""+tempOperation).contains(".")){
        num1=""+tempOperation;
        num2="";
        flag=false;
        }
        else{
        num1=""+(int)tempOperation;
        num2="";
        flag=false;
        }
        OutputField.setText(num1);
    }//GEN-LAST:event_ButtonForAnsButtonClicked

    private void ButtonForAddButtonClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonForAddButtonClicked
        // TODO add your handling code here:
        if(!flag) {flag=true;
            OutputField.setText("");
            operator='+';
        }
        else{double tempOperation;
            tempOperation=Double.parseDouble(num1)+Double.parseDouble(num2);
            if(num1.contains(".")||num2.contains(".")||(""+tempOperation).contains(".")){
                num1=""+tempOperation;
                num2="";
                flag=false;
            }
            else{
                num1=""+(int)tempOperation;
                num2="";
                flag=false;
            }
            OutputField.setText(num1);
        }
    }//GEN-LAST:event_ButtonForAddButtonClicked

    private void ButtonForModButtonClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonForModButtonClicked
        // TODO add your handling code here:
        if(!flag) {flag=true;
            OutputField.setText("");
            operator='%';
        }
        else{double tempOperation;
            tempOperation=Double.parseDouble(num1)%Double.parseDouble(num2);
            if(num1.contains(".")||num2.contains(".")||(""+tempOperation).contains(".")){
            num1=""+tempOperation;
            num2="";
            flag=false;
            }
            else{
            num1=""+(int)tempOperation;
            num2="";
            flag=false;
            }
            OutputField.setText(num1);
        }
    }//GEN-LAST:event_ButtonForModButtonClicked

    private void ButtonClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonClicked
        // TODO add your handling code here:
        String buttonLabel=evt.getActionCommand();
        if(!flag) num1+=buttonLabel.trim();
        else num2+=buttonLabel.trim();
        if(!flag) OutputField.setText(num1);
        else OutputField.setText(num2);
    }//GEN-LAST:event_ButtonClicked

    private void ButtonForClearButtonClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonForClearButtonClicked
        // TODO add your handling code here:
        num1=""; num2="";
        flag=false;
        OutputField.setText("0");
    }//GEN-LAST:event_ButtonForClearButtonClicked

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
            java.util.logging.Logger.getLogger(CalcFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalcFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalcFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalcFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CalcFrame().setVisible(true);
        });
    }
    private String num1="",num2="";
    char operator;
    private boolean flag=false;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton ButtonFor0;
    protected javax.swing.JButton ButtonFor1;
    protected javax.swing.JButton ButtonFor2;
    protected javax.swing.JButton ButtonFor3;
    protected javax.swing.JButton ButtonFor4;
    protected javax.swing.JButton ButtonFor5;
    protected javax.swing.JButton ButtonFor6;
    protected javax.swing.JButton ButtonFor7;
    protected javax.swing.JButton ButtonFor8;
    protected javax.swing.JButton ButtonFor9;
    protected javax.swing.JButton ButtonForAdd;
    protected javax.swing.JButton ButtonForAns;
    private javax.swing.JButton ButtonForClear;
    protected javax.swing.JButton ButtonForDeci;
    protected javax.swing.JButton ButtonForDiv;
    private javax.swing.JButton ButtonForMod;
    protected javax.swing.JButton ButtonForMult;
    protected javax.swing.JButton ButtonForSub;
    private javax.swing.JTextField OutputField;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
