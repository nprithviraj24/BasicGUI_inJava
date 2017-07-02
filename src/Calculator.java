
import java.util.Objects;
import java.io.*;
import javax.swing.JOptionPane;

public class Calculator extends javax.swing.JFrame {

    double first, second,x;
    String operator="";
    String check;
    int flag=0, dotFlag=0;
    
      
    public Calculator() {
        initComponents();
    }
    
   
    
    public void equal(){
        if( Objects.equals(operator, "+") ){
            x = first+second;
            System.out.println("\n"+first+ " + "+second+" = "+x);
            first=first+second;
            //System.out.println("Entered into +");
        } else if( Objects.equals(operator,"-")){
            x=first-second;
            System.out.println("\n"+first+ " - "+second+" = "+x);
            first=first-second;
        } else if( Objects.equals( operator,"*")){
            x = first*second;
            System.out.println("\n"+first+ " * "+second+" = "+x);
            first=first*second;
        } else if(  Objects.equals(operator,"/")){
            x=first/second;
            System.out.println("\n"+first+ " / "+second+" = "+x);
            first=first/second;
        }
        
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        display = new javax.swing.JTextField();
        number1 = new javax.swing.JButton();
        number2 = new javax.swing.JButton();
        number3 = new javax.swing.JButton();
        number4 = new javax.swing.JButton();
        number5 = new javax.swing.JButton();
        number6 = new javax.swing.JButton();
        number7 = new javax.swing.JButton();
        number8 = new javax.swing.JButton();
        number9 = new javax.swing.JButton();
        enter = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        number0 = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        plusminus = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        delete = new javax.swing.JButton();
        dot = new javax.swing.JButton();
        log = new javax.swing.JButton();
        jOptionPane1 = new javax.swing.JOptionPane();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Source Sans Pro Light", 3, 48)); // NOI18N
        jLabel1.setText("Calculator");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, 39));

        display.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        display.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });
        getContentPane().add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 80, 467, 53));

        number1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        number1.setText("1");
        number1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number1ActionPerformed(evt);
            }
        });
        getContentPane().add(number1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 186, 60, 45));

        number2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        number2.setText("2");
        number2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number2ActionPerformed(evt);
            }
        });
        getContentPane().add(number2, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 186, 60, 45));

        number3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        number3.setText("3");
        number3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number3ActionPerformed(evt);
            }
        });
        getContentPane().add(number3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 186, 60, 45));

        number4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        number4.setText("4");
        number4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number4ActionPerformed(evt);
            }
        });
        getContentPane().add(number4, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 281, 60, 47));

        number5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        number5.setText("5");
        number5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number5ActionPerformed(evt);
            }
        });
        getContentPane().add(number5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 60, 47));

        number6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        number6.setText("6");
        number6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number6ActionPerformed(evt);
            }
        });
        getContentPane().add(number6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 284, 60, 47));

        number7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        number7.setText("7");
        number7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number7ActionPerformed(evt);
            }
        });
        getContentPane().add(number7, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 381, 60, 45));

        number8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        number8.setText("8");
        number8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number8ActionPerformed(evt);
            }
        });
        getContentPane().add(number8, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 381, 60, 45));

        number9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        number9.setText("9");
        number9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number9ActionPerformed(evt);
            }
        });
        getContentPane().add(number9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 381, 60, 45));

        enter.setFont(new java.awt.Font("Traditional Arabic", 1, 36)); // NOI18N
        enter.setText("=");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });
        getContentPane().add(enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 576, 84, 52));

        plus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });
        getContentPane().add(plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 183, 60, 45));

        minus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        minus.setText("-");
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });
        getContentPane().add(minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 281, 60, 47));

        multiply.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        multiply.setText("*");
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });
        getContentPane().add(multiply, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 381, 60, 45));

        number0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        number0.setText("0");
        number0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number0ActionPerformed(evt);
            }
        });
        getContentPane().add(number0, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 479, 60, 53));

        divide.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        divide.setText("/");
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });
        getContentPane().add(divide, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 481, 60, 48));

        plusminus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        plusminus.setText("+/-");
        plusminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusminusActionPerformed(evt);
            }
        });
        getContentPane().add(plusminus, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 479, -1, 53));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("C");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 476, 67, 53));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 208, -1, -1));

        buttonGroup1.add(jRadioButton2);
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 302, -1, -1));

        buttonGroup1.add(jRadioButton3);
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 405, -1, -1));

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 511, -1, -1));

        delete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        delete.setText("DEL");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 576, -1, 46));

        dot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dot.setText(".");
        dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotActionPerformed(evt);
            }
        });
        getContentPane().add(dot, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 576, 60, 48));

        log.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        log.setText("log");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });
        getContentPane().add(log, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 576, 65, 49));
        getContentPane().add(jOptionPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 660, -1, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void number4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number4ActionPerformed

        String x1 = display.getText();
    if( new String(operator).equals(x1)){        
        display.setText("4");
    }else{
//        System.out.println(x1);
        display.setText(x1+"4");
    }       // TODO add your handling code here:
    }//GEN-LAST:event_number4ActionPerformed

    private void number9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number9ActionPerformed
//String operation= display.getText();
//        if( operation == "+" || operation == "-" || operation == "*" || operation == "/" ){
//            operator = operation; 
//            display.setText("");
//        }
        String x1 = display.getText();
    if( new String(operator).equals(x1)){        
        display.setText("9");
    }else{
//        System.out.println(x1);
        display.setText(x1+"9");
    };// TODO add your handling code here:
    }//GEN-LAST:event_number9ActionPerformed

    private void number8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number8ActionPerformed
//String operation= display.getText();
//        if( operation == "+" || operation == "-" || operation == "*" || operation == "/" ){
//            operator = operation; 
//            display.setText("");
//        }
       String x1 = display.getText();
    if( new String(operator).equals(x1)){        
        display.setText("8");
    }else{
//        System.out.println(x1);
        display.setText(x1+"8");
    }       // TODO add your handling code here:
    }//GEN-LAST:event_number8ActionPerformed

    private void number7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number7ActionPerformed
//String operation = String.valueOf(display.getText());
//
//        if( operation == "+" || operation == "-" || operation == "*" || operation == "/" ){
//            System.out.println("entering 7");
//            operator = operation; 
//            display.setText("");
//        }
//        System.out.println("entering 7sasfasfdsfdsvdsvdvad");
        String x1 = display.getText();
    if( new String(operator).equals(x1)){        
        display.setText("7");
    }else{
//        System.out.println(x1);
        display.setText(x1+"7");
    }       // TODO add your handling code here:
    }//GEN-LAST:event_number7ActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        jRadioButton1.setSelected(true);
        
        check = display.getText();
                       
        dotFlag=0;           
       
        if(check != null && flag == 0){            
            first = Double.parseDouble(String.valueOf(display.getText()));
            display.setText("+");
            flag = 1;
            System.out.println("\nYour first number: "+first);
            operator="+";
            System.out.println("Operator is "+ operator);
        } 
        else if(check!= null && flag >= 1){
            if( flag>1 ){
                System.out.println("\nYour first number is: "+x);
                System.out.println("Operator is "+ operator);
            }
//            System.out.println("Operator is "+ operator);
            second = Double.parseDouble(String.valueOf(display.getText()));
            System.out.println("Your 2nd number is: " +second);
             equal();
             operator="+";
             display.setText("+");
             flag++;
            
            // System.out.println(x+ " - "+second+" = "+ first);
        } else {
        System.out.println("Not working!");
        }
       
//        display.setText(String.valueOf(first+5));
        // TODO add your handling code here:
    }//GEN-LAST:event_plusActionPerformed

    private void number1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number1ActionPerformed
String x1 = display.getText();
    if( new String(operator).equals(x1)){        
        display.setText("1");
    }else{
       // System.out.println(x1);
        display.setText(x1+"1");
    }
//        if(operator==null){
//            display.setText("");
//          } 
//           String x = display.getText();
//            display.setText(x+"1");
       
        // TODO add your handling code here:
    }//GEN-LAST:event_number1ActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed
       jRadioButton3.setSelected(true);
        check = display.getText();
       //isplay1.setText(String.valueOf(first));
                        
       dotFlag=0;
        if(check != null && flag == 0){            
        first = Double.parseDouble(String.valueOf(display.getText()));
        display.setText("*");
        flag = 1;
        System.out.println("\nYour first number: "+first);
            operator="*";
         System.out.println("Operator is "+ operator);
        } 
        else if(check!= null && flag >= 1){
            
            if(flag >1 ){
                   
                    System.out.println("\nYour first number is: "+x);
                     System.out.println("Operator is "+ operator);
            }
            //System.out.println("Operator is "+ operator);
            second = Double.parseDouble(String.valueOf(display.getText()));
            System.out.println("Your 2nd number is: " +second);
             equal();
             operator="*";
             display.setText("*");
             flag++;
//             dotFlag=1;
//             flag = 0;
            // System.out.println(x+ " - "+second+" = "+ first);
        } else {
            System.out.println("Not working!");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_multiplyActionPerformed

    private void number2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number2ActionPerformed
String x1 = display.getText();
    if( new String(operator).equals(x1)){        
        display.setText("2");
    }else{
//        System.out.println(x1);
        display.setText(x1+"2");
    }
//       String operation= display.getText();
//        if( operation == "+" || operation == "-" || operation == "*" || operation == "/" ){
//            operator = operation; 
//            display.setText("");             
//       } 
//           String x = display.getText();
//            display.setText(x+"2");
 // TODO add your handling code here:
    }//GEN-LAST:event_number2ActionPerformed

    private void number3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number3ActionPerformed

           String x1 = display.getText();
    if( new String(operator).equals(x1)){        
        display.setText("3");
    }else{
//        System.out.println(x1);
        display.setText(x1+"3");
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_number3ActionPerformed

    private void number5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number5ActionPerformed

        String x1 = display.getText();
    if( new String(operator).equals(x1)){        
        display.setText("5");
    }else{
//        System.out.println(x1);
        display.setText(x1+"5");
    }        // TODO add your handling code here:
    }//GEN-LAST:event_number5ActionPerformed

    private void number6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number6ActionPerformed

        String x1 = display.getText();
    if( new String(operator).equals(x1)){        
        display.setText("6");
    }else{
//        System.out.println(x1);
        display.setText(x1+"6");
    }        // TODO add your handling code here:
    }//GEN-LAST:event_number6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        display.setText("");
        flag = 0;
        operator="";
        dotFlag=0;
       
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void plusminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusminusActionPerformed
      
        first = Double.parseDouble(String.valueOf(display.getText()));
        if(first != 0){
            display.setText(String.valueOf(first*(-1)));
        }
// TODO add your handling code here:
    }//GEN-LAST:event_plusminusActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
//display1.setText(String.valueOf(first));
        jRadioButton4.setSelected(true);
        
        check = display.getText();
        //splay1.setText(String.valueOf(first));
                       
         dotFlag=0;             
    if(check != null && flag == 0){            
        first = Double.parseDouble(String.valueOf(display.getText()));
        display.setText("/");
        flag = 1;
        System.out.println("\nYour first number: "+first);
        operator="/";
        System.out.println("Operator is "+ operator);
        } 
        else if(check!= null && flag >= 1){
            if(flag > 1 ){
                    
                    System.out.println("\nYour first number is: "+x);
                    System.out.println("Operator is "+ operator);
            }
            //System.out.println("Operator is "+ operator);
            second = Double.parseDouble(String.valueOf(display.getText()));
            System.out.println("Your 2nd number is: " +second);
            equal();
            operator="/";
            display.setText("/");
            flag++;
//            dotFlag=1;
            // System.out.println(x+ " - "+second+" = "+ first);
        } else {
            System.out.println("Not working!");
        }
        
     
        // TODO add your handling code here:
    }//GEN-LAST:event_divideActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        jRadioButton2.setSelected(true);
        check = display.getText();
       // display1.setText(String.valueOf(first));
                       
       dotFlag=0;
     if(check != null && flag == 0){            
        first = Double.parseDouble(String.valueOf(display.getText()));
        display.setText("-");
        flag = 1;
        System.out.println("\nYour first number: "+first);
            operator="-";
          System.out.println("Operator is "+ operator);
        } 
        else if(check!= null && flag >= 1){
            if( flag > 1 ){
                    
                    System.out.println("\nYour first number is: "+x);
                    System.out.println("Operator is "+ operator);
            }
//            System.out.println("Operator is "+ operator);
            second = Double.parseDouble(String.valueOf(display.getText()));
            System.out.println("Your 2nd number is: " +second);
             equal();
             operator="-";
             display.setText("-");
             flag++;
//             dotFlag=1;
//             flag = 0;
            // System.out.println(x+ " - "+second+" = "+ first);
        } else {
        System.out.println("Not working!");
        }

//        if(""== display.getText()){
//            display.setText("-");
//        } else {
//            first = Double.parseDouble(display.getText());
//            display.setText("-");
//        }
        // TODO add your handling code here:
    }//GEN-LAST:event_minusActionPerformed

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        
        second = Double.parseDouble(String.valueOf(display.getText()));
        System.out.println("Your 2nd number is: " +second);
        equal();
        display.setText(String.valueOf(first));
        System.out.println("Answer is:  "+first+"\n\n");
        flag=0;
        dotFlag=1;
        

// TODO add your handling code here:
    }//GEN-LAST:event_enterActionPerformed

    private void number0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number0ActionPerformed
//String operation= display.getText();
//        if( operation == "+" || operation == "-" || operation == "*" || operation == "/" ){
//            operator = operation; 
//            display.setText("");
//        }
 String x1 = display.getText();
    if( new String(operator).equals(x1)){        
        display.setText("0");
    }else{
//        System.out.println(x1);
        display.setText(x1+"0");
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_number0ActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        display.setEditable(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_displayActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    @SuppressWarnings("empty-statement")
    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
         String message = "\nLog of negative numbers is undefined.\n";
         
        double number= Double.parseDouble(String.valueOf(display.getText()));
    
    if(number<0){
       
        JOptionPane.showMessageDialog(null, message + "\tlog("+number+")?" );;
    } else {
        display.setText(String.valueOf(Math.log(number)));
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_logActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        check=String.valueOf(display.getText());
        if(check != null){
            int length = check.length();
            display.setText(check.substring(0,length-1));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotActionPerformed
        check=String.valueOf(display.getText());
       // int length = check.length();
       // String dot = check.substring();
       
       //System.out.println( check.matches("(.*).(.*)"));
       
        if(check.equals("")){
            display.setText("0.");
            dotFlag=1;
        }
        else if( dotFlag == 1 ){
              String message = "Only one decimal point.";
            JOptionPane.showMessageDialog(null, message);
            
        } else {
            dotFlag=1;
            display.setText(check+".");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_dotActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Calculator().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton delete;
    private javax.swing.JTextField display;
    private javax.swing.JButton divide;
    private javax.swing.JButton dot;
    private javax.swing.JButton enter;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JButton log;
    private javax.swing.JButton minus;
    private javax.swing.JButton multiply;
    private javax.swing.JButton number0;
    private javax.swing.JButton number1;
    private javax.swing.JButton number2;
    private javax.swing.JButton number3;
    private javax.swing.JButton number4;
    private javax.swing.JButton number5;
    private javax.swing.JButton number6;
    private javax.swing.JButton number7;
    private javax.swing.JButton number8;
    private javax.swing.JButton number9;
    private javax.swing.JButton plus;
    private javax.swing.JButton plusminus;
    // End of variables declaration//GEN-END:variables
}
