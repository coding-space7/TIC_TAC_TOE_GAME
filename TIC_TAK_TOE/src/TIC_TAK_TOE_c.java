
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Bharat
 */


public class TIC_TAK_TOE_c extends javax.swing.JFrame {

    private String turn = "O";
    private int xcount = 0;
    private int ocount = 0;
    
    public TIC_TAK_TOE_c() {
        initComponents();
    }
    
    private void choosePlayer(){
        if(turn.equalsIgnoreCase("X"))
            turn = "O";
        else
            turn = "X";
    }
    
    private void SetScore(){
        playerxscore.setText(String.valueOf(xcount));
        playeroscore.setText(String.valueOf(ocount));

    }

    private void reset(){
        
        
        txtbutton1.setText("");
        txtbutton2.setText("");
        txtbutton3.setText("");
        txtbutton4.setText("");
        txtbutton5.setText("");
        txtbutton6.setText("");
        txtbutton7.setText("");
        txtbutton8.setText("");
        txtbutton9.setText("");
        
        txtbutton1.setBackground(Color.LIGHT_GRAY);
        txtbutton2.setBackground(Color.LIGHT_GRAY);
        txtbutton3.setBackground(Color.LIGHT_GRAY);
        txtbutton4.setBackground(Color.LIGHT_GRAY);
        txtbutton5.setBackground(Color.LIGHT_GRAY);
        txtbutton6.setBackground(Color.LIGHT_GRAY);
        txtbutton7.setBackground(Color.LIGHT_GRAY);
        txtbutton8.setBackground(Color.LIGHT_GRAY);
        txtbutton9.setBackground(Color.LIGHT_GRAY);
        
    }
    private void Timer(){
        Timer timer = new Timer(300, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent arg0) {            
            reset();
        }
        });
        timer.setRepeats(false);
        timer.start();
    }
    private void gameWinner(){
        String button1 =txtbutton1.getText();
        String button2 =txtbutton2.getText();
        String button3 =txtbutton3.getText();
        String button4 =txtbutton4.getText();
        String button5 =txtbutton5.getText();
        String button6 =txtbutton6.getText();
        String button7 =txtbutton7.getText();
        String button8 =txtbutton8.getText();
        String button9 =txtbutton9.getText();
        
        String msg;
        if((button1.equals(button5)) && (button5.equals(button9)) && !button1.equals("")){
            if(turn.equalsIgnoreCase("O")){
                msg = "Player O Wins";
                ocount++;
            }
            else{
                msg = "Player X Wins";
                xcount++;
            }
                
                
           JOptionPane.showMessageDialog(this,msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           
           txtbutton1.setBackground(Color.orange);
           txtbutton5.setBackground(Color.orange);
           txtbutton9.setBackground(Color.orange);
           SetScore();
           Timer();
        }
        else if ((button1.equals(button2)) && (button2.equals(button3)) && !button1.equals("")){
            if(turn.equalsIgnoreCase("O")){
                msg = "Player O Wins";
                ocount++;
            }
            else{
                msg = "Player X Wins";
                xcount++;
            }
                
                
           JOptionPane.showMessageDialog(this,msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           
           txtbutton1.setBackground(Color.orange);
           txtbutton2.setBackground(Color.orange);
           txtbutton3.setBackground(Color.orange);
           SetScore();
           Timer();
        }
        else if((button4.equals(button5)) && (button5.equals(button6)) && !button4.equals("")){
            if(turn.equalsIgnoreCase("O")){
                msg = "Player O Wins";
                ocount++;
            }
            else{
                msg = "Player X Wins";
                xcount++;
            }
                
                
           JOptionPane.showMessageDialog(this,msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           
           txtbutton4.setBackground(Color.orange);
           txtbutton5.setBackground(Color.orange);
           txtbutton6.setBackground(Color.orange);
           SetScore();
           Timer();
        }
        else if((button7.equals(button8)) && (button8.equals(button9)) && !button7.equals("")){
             if(turn.equalsIgnoreCase("O")){
                msg = "Player O Wins";
                ocount++;
            }
            else{
                msg = "Player X Wins";
                xcount++;
            }
                
                
           JOptionPane.showMessageDialog(this,msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           
           txtbutton7.setBackground(Color.orange);
           txtbutton8.setBackground(Color.orange);
           txtbutton9.setBackground(Color.orange);
           SetScore();
           Timer();

        }
        else if((button3.equals(button5)) && (button5.equals(button7)) && !button7.equals("")){
             if(turn.equalsIgnoreCase("O")){
                msg = "Player O Wins";
                ocount++;
            }
            else{
                msg = "Player X Wins";
                xcount++;
            }
                
                
           JOptionPane.showMessageDialog(this,msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           
           txtbutton3.setBackground(Color.orange);
           txtbutton5.setBackground(Color.orange);
           txtbutton7.setBackground(Color.orange);
           SetScore();
           Timer();
 
        }
        else if((button1.equals(button4)) && (button4.equals(button7)) && !button7.equals("")){
             if(turn.equalsIgnoreCase("O")){
                msg = "Player O Wins";
                ocount++;
            }
            else{
                msg = "Player X Wins";
                xcount++;
            }
                
                
           JOptionPane.showMessageDialog(this,msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           
           txtbutton1.setBackground(Color.orange);
           txtbutton4.setBackground(Color.orange);
           txtbutton7.setBackground(Color.orange);
           SetScore();
           Timer();
        }
        else if ((button2.equals(button5)) && (button5.equals(button8)) && !button2.equals("")){
            if(turn.equalsIgnoreCase("O")){
                msg = "Player O Wins";
                ocount++;
            }
            else{
                msg = "Player X Wins";
                xcount++;
            }
                
                
           JOptionPane.showMessageDialog(this,msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           
           txtbutton2.setBackground(Color.orange);
           txtbutton5.setBackground(Color.orange);
           txtbutton8.setBackground(Color.orange);
           SetScore();
           Timer();
        }
        else if((button3.equals(button6)) && (button6.equals(button9)) && !button3.equals("")){
            if(turn.equalsIgnoreCase("O")){
                msg = "Player O Wins";
                ocount++;
            }
            else{
                msg = "Player X Wins";
                xcount++;
            }
                
                
           JOptionPane.showMessageDialog(this,msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           
           txtbutton3.setBackground(Color.orange);
           txtbutton6.setBackground(Color.orange);
           txtbutton9.setBackground(Color.orange);
           SetScore();
           Timer();
        }
        else if (!button1.equals("") && !button2.equals("") && !button3.equals("") 
                && !button4.equals("") && !button5.equals("") && !button6.equals("")
                && !button7.equals("") && !button8.equals("") && !button9.equals("")){
            
            msg = "NO ONE WIN'S !!";
            JOptionPane.showMessageDialog(this,msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
           txtbutton1.setBackground(Color.orange);
           txtbutton2.setBackground(Color.orange);
           txtbutton3.setBackground(Color.orange);
           txtbutton4.setBackground(Color.orange);
           txtbutton5.setBackground(Color.orange);
           txtbutton6.setBackground(Color.orange);
           txtbutton7.setBackground(Color.orange);
           txtbutton8.setBackground(Color.orange);
           txtbutton9.setBackground(Color.orange);
           SetScore();
           Timer();
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

        headerpanal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbutton1 = new javax.swing.JButton();
        txtbutton2 = new javax.swing.JButton();
        txtbutton3 = new javax.swing.JButton();
        txtbutton6 = new javax.swing.JButton();
        txtbutton5 = new javax.swing.JButton();
        txtbutton4 = new javax.swing.JButton();
        txtbutton9 = new javax.swing.JButton();
        txtbutton8 = new javax.swing.JButton();
        txtbutton7 = new javax.swing.JButton();
        exitbutton = new javax.swing.JButton();
        resetbutton = new javax.swing.JButton();
        scorepanal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        playerxscore = new javax.swing.JLabel();
        playeroscore = new javax.swing.JLabel();
        nextgamebutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC_TAK_TOE");
        setPreferredSize(new java.awt.Dimension(700, 520));
        setResizable(false);

        headerpanal.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIC TAC TOE GAME");

        javax.swing.GroupLayout headerpanalLayout = new javax.swing.GroupLayout(headerpanal);
        headerpanal.setLayout(headerpanalLayout);
        headerpanalLayout.setHorizontalGroup(
            headerpanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerpanalLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerpanalLayout.setVerticalGroup(
            headerpanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerpanalLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        txtbutton1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbutton1ActionPerformed(evt);
            }
        });

        txtbutton2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbutton2ActionPerformed(evt);
            }
        });

        txtbutton3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbutton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbutton3ActionPerformed(evt);
            }
        });

        txtbutton6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbutton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbutton6ActionPerformed(evt);
            }
        });

        txtbutton5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbutton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbutton5ActionPerformed(evt);
            }
        });

        txtbutton4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbutton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbutton4ActionPerformed(evt);
            }
        });

        txtbutton9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbutton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbutton9ActionPerformed(evt);
            }
        });

        txtbutton8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbutton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbutton8ActionPerformed(evt);
            }
        });

        txtbutton7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbutton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbutton7ActionPerformed(evt);
            }
        });

        exitbutton.setBackground(new java.awt.Color(255, 0, 51));
        exitbutton.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        exitbutton.setText("EXIT");
        exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttonActionPerformed(evt);
            }
        });

        resetbutton.setBackground(new java.awt.Color(0, 153, 255));
        resetbutton.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        resetbutton.setText("RESET");
        resetbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbuttonActionPerformed(evt);
            }
        });

        scorepanal.setBackground(new java.awt.Color(0, 255, 255));
        scorepanal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel2.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jLabel2.setText("PLAYER X  :");

        jLabel3.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jLabel3.setText("PLAYER O  :");

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SCORECARD");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18))
        );

        playerxscore.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        playerxscore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerxscore.setText("0");

        playeroscore.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        playeroscore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playeroscore.setText("0");

        javax.swing.GroupLayout scorepanalLayout = new javax.swing.GroupLayout(scorepanal);
        scorepanal.setLayout(scorepanalLayout);
        scorepanalLayout.setHorizontalGroup(
            scorepanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(scorepanalLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(scorepanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(scorepanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerxscore, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playeroscore, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );
        scorepanalLayout.setVerticalGroup(
            scorepanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scorepanalLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addGroup(scorepanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(playerxscore))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(scorepanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(playeroscore))
                .addGap(32, 32, 32))
        );

        nextgamebutton.setBackground(new java.awt.Color(0, 153, 0));
        nextgamebutton.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        nextgamebutton.setText("Next Game");
        nextgamebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextgamebuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerpanal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbutton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbutton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbutton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbutton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbutton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbutton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbutton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbutton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(resetbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(scorepanal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(nextgamebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerpanal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(scorepanal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(nextgamebutton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resetbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtbutton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtbutton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtbutton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtbutton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtbutton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtbutton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbutton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbutton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbutton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(43, Short.MAX_VALUE))))
        );

        txtbutton2.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbutton2ActionPerformed
        // TODO add your handling code here:
        if(!txtbutton2.getText().equals("")){
            return;
        }
        txtbutton2.setText(turn);
        if(turn.equalsIgnoreCase("X"))
            txtbutton2.setForeground(Color.red);
        else
            txtbutton2.setForeground(Color.MAGENTA);
        gameWinner();
        choosePlayer();
    }//GEN-LAST:event_txtbutton2ActionPerformed

    private void txtbutton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbutton5ActionPerformed
        // TODO add your handling code here:
        if(!txtbutton5.getText().equals("")){
            return;
        }
        txtbutton5.setText(turn);
        if(turn.equalsIgnoreCase("X"))
            txtbutton5.setForeground(Color.red);
        else
            txtbutton5.setForeground(Color.MAGENTA);
        gameWinner();
        choosePlayer();
    }//GEN-LAST:event_txtbutton5ActionPerformed

    private void txtbutton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbutton8ActionPerformed
        // TODO add your handling code here:
        if(!txtbutton8.getText().equals("")){
            return;
        }
        txtbutton8.setText(turn);
        if(turn.equalsIgnoreCase("X"))
            txtbutton8.setForeground(Color.red);
        else
            txtbutton8.setForeground(Color.MAGENTA);
        gameWinner();
        choosePlayer();
    }//GEN-LAST:event_txtbutton8ActionPerformed

    private void txtbutton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbutton4ActionPerformed
        // TODO add your handling code here:
        if(!txtbutton4.getText().equals("")){
            return;
        }
        txtbutton4.setText(turn);
        if(turn.equalsIgnoreCase("X"))
            txtbutton4.setForeground(Color.red);
        else
            txtbutton4.setForeground(Color.MAGENTA);
        gameWinner();
        choosePlayer();
    }//GEN-LAST:event_txtbutton4ActionPerformed

    private void txtbutton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbutton6ActionPerformed
        // TODO add your handling code here:
        if(!txtbutton6.getText().equals("")){
            return;
        }
        txtbutton6.setText(turn);
        if(turn.equalsIgnoreCase("X"))
            txtbutton6.setForeground(Color.red);
        else
            txtbutton6.setForeground(Color.MAGENTA);
        gameWinner();
        choosePlayer();
    }//GEN-LAST:event_txtbutton6ActionPerformed

    private void resetbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbuttonActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_resetbuttonActionPerformed

    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit ?","Tic Tac Toe",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            reset();
            String msg;
            if(xcount > ocount)
                msg = "Player X Win's The Round !! ";
            else if (xcount < ocount)
                msg = "Player O Win's The Round !!";
            else
                msg = "It Was A Draw , Better Try Next Time ";

            JOptionPane.showMessageDialog(this,msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }//GEN-LAST:event_exitbuttonActionPerformed

    private void txtbutton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbutton7ActionPerformed
        // TODO add your handling code here:
        if(!txtbutton7.getText().equals("")){
            return;
        }
        txtbutton7.setText(turn);
        if(turn.equalsIgnoreCase("X"))
            txtbutton7.setForeground(Color.red);
        else
            txtbutton7.setForeground(Color.MAGENTA);
        gameWinner();
        choosePlayer();
    }//GEN-LAST:event_txtbutton7ActionPerformed

    private void txtbutton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbutton9ActionPerformed
        // TODO add your handling code here:
        if(!txtbutton9.getText().equals("")){
            return;
        }
        txtbutton9.setText(turn);
        if(turn.equalsIgnoreCase("X"))
            txtbutton9.setForeground(Color.red);
        else
            txtbutton9.setForeground(Color.MAGENTA);
        gameWinner();
        choosePlayer();
    }//GEN-LAST:event_txtbutton9ActionPerformed

    private void txtbutton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbutton3ActionPerformed
        // TODO add your handling code here:
        if(!txtbutton3.getText().equals("")){
            return;
        }
        txtbutton3.setText(turn);
        if(turn.equalsIgnoreCase("X"))
            txtbutton3.setForeground(Color.red);
        else
            txtbutton3.setForeground(Color.MAGENTA);
        gameWinner();
        choosePlayer();
    }//GEN-LAST:event_txtbutton3ActionPerformed

    private void txtbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbutton1ActionPerformed
        // TODO add your handling code here:
        if(!txtbutton1.getText().equals("")){
            return;
        }
        txtbutton1.setText(turn);
        if(turn.equalsIgnoreCase("X"))
            txtbutton1.setForeground(Color.red);
        else
            txtbutton1.setForeground(Color.MAGENTA);
        gameWinner();
        choosePlayer();
    }//GEN-LAST:event_txtbutton1ActionPerformed

    private void nextgamebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextgamebuttonActionPerformed
        // TODO add your handling code here:
        reset();
        String msg;
        if(xcount > ocount)
            msg = "Player X Win's The Round !! ";
        else if (xcount < ocount)
            msg = "Player O Win's The Round !!";
        else
            msg = "It Was A Draw , Better Try Next Time ";
        
        JOptionPane.showMessageDialog(this,msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        
        xcount =0;
        ocount =0;
        SetScore();
    }//GEN-LAST:event_nextgamebuttonActionPerformed

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
            java.util.logging.Logger.getLogger(TIC_TAK_TOE_c.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIC_TAK_TOE_c.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIC_TAK_TOE_c.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIC_TAK_TOE_c.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIC_TAK_TOE_c().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitbutton;
    private javax.swing.JPanel headerpanal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton nextgamebutton;
    private javax.swing.JLabel playeroscore;
    private javax.swing.JLabel playerxscore;
    private javax.swing.JButton resetbutton;
    private javax.swing.JPanel scorepanal;
    private javax.swing.JButton txtbutton1;
    private javax.swing.JButton txtbutton2;
    private javax.swing.JButton txtbutton3;
    private javax.swing.JButton txtbutton4;
    private javax.swing.JButton txtbutton5;
    private javax.swing.JButton txtbutton6;
    private javax.swing.JButton txtbutton7;
    private javax.swing.JButton txtbutton8;
    private javax.swing.JButton txtbutton9;
    // End of variables declaration//GEN-END:variables
}
