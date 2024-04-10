
import java.awt.Color;
import java.util.HashMap;

//A utility a class for making as many questions as i like
class Round {

    public String question;
    public String answer;
    public String[] possibleAnswers;

    public Round(String question, String answer, String[] possibleAnswers) {
        this.question = question;
        this.answer = answer;
        this.possibleAnswers = possibleAnswers;
    }
}

public class MainFrame extends javax.swing.JFrame {

    private Round[] rounds;
    private Round currentRound;
    private int currentRoundNumber;
    private int totalRounds;
    
    private int correctAnswers;
    private int incorrectAnswers;
    
    private final Color Answer1Color;
    private final Color Answer2Color;
    private final Color Answer3Color;
    private final Color Answer4Color;
    
    private final Color Answer1FalseColor;
    private final Color Answer2FalseColor;
    private final Color Answer3FalseColor;
    private final Color Answer4FalseColor;
    
    public MainFrame() {
        initComponents();
        this.getContentPane().setBackground(Color.white);

        rounds = new Round[]{
            new Round("What is the Mitochondria of the cell?", "", new String[]{"Hello there","160, 184, 152","160, 184, 152","160, 184, 152"}),
            new Round("", "", new String[]{"","","",""}),
            new Round("", "", new String[]{"","","",""}),
            new Round("", "", new String[]{"","","",""}),
            new Round("", "", new String[]{"","","",""}),
        };
        
        totalRounds = rounds.length;
        currentRound = rounds[0];
        currentRoundNumber = 1;
        
        //Initialize first questions;
        setRoundDisplay(currentRound);
        
        RoundNumberLabel.setText("1/" + String.valueOf(totalRounds));
        
        //Set each of the default colors to what is set in the design
        Answer1Color = AnswerPanel1.getBackground();
        Answer2Color = AnswerPanel2.getBackground();
        Answer3Color = AnswerPanel3.getBackground();
        Answer4Color = AnswerPanel4.getBackground();
        
        Answer1FalseColor = new Color(230, 129, 122);
        Answer2FalseColor = new Color(114, 147, 184);
        Answer3FalseColor = new Color(227, 204, 161);
        Answer4FalseColor = new Color(160, 184, 152);
    }
    
    private void setRoundDisplay(Round round) {
        QuestionLabel.setText(round.question);
        
        AnswerLabel1.setText(round.possibleAnswers[0]);
        AnswerLabel2.setText(round.possibleAnswers[1]);
        AnswerLabel3.setText(round.possibleAnswers[2]);
        AnswerLabel4.setText(round.possibleAnswers[3]);
    }
    
    private void updateAnswerColors() { 
        if (currentRound.answer == currentRound.possibleAnswers[0]) {
            AnswerPanel2.setBackground(Answer2FalseColor);
            AnswerPanel3.setBackground(Answer3FalseColor);
            AnswerPanel4.setBackground(Answer4FalseColor);            
        } else if (currentRound.answer == currentRound.possibleAnswers[0]) {
            AnswerPanel1.setBackground(Answer1FalseColor);
            AnswerPanel3.setBackground(Answer3FalseColor);
            AnswerPanel4.setBackground(Answer4FalseColor);   
        } else if (currentRound.answer == currentRound.possibleAnswers[0]) {
            AnswerPanel1.setBackground(Answer1FalseColor);
            AnswerPanel2.setBackground(Answer2FalseColor);
            AnswerPanel4.setBackground(Answer4FalseColor);   
        } else {
            AnswerPanel1.setBackground(Answer1FalseColor);
            AnswerPanel2.setBackground(Answer2FalseColor);
            AnswerPanel3.setBackground(Answer3FalseColor);   
        }
    }
    
    private void setDefaultColors() {
        AnswerPanel1.setBackground(Answer1Color);
        AnswerPanel2.setBackground(Answer2Color);
        AnswerPanel3.setBackground(Answer3Color);
        AnswerPanel4.setBackground(Answer4Color);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        QuestionPanel = new javax.swing.JPanel();
        QuestionLabel = new javax.swing.JLabel();
        AnswerPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        AnswerLabel1 = new javax.swing.JLabel();
        AnswerPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        AnswerLabel2 = new javax.swing.JLabel();
        AnswerPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        AnswerLabel3 = new javax.swing.JLabel();
        AnswerPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        AnswerLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        RoundNumberLabel = new javax.swing.JLabel();
        AnswerField = new javax.swing.JTextField();
        SubmitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.white);
        setPreferredSize(new java.awt.Dimension(1000, 630));
        setResizable(false);

        QuestionPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        QuestionLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        QuestionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuestionLabel.setText("Question HERE");

        javax.swing.GroupLayout QuestionPanelLayout = new javax.swing.GroupLayout(QuestionPanel);
        QuestionPanel.setLayout(QuestionPanelLayout);
        QuestionPanelLayout.setHorizontalGroup(
            QuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QuestionPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(QuestionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        QuestionPanelLayout.setVerticalGroup(
            QuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuestionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(QuestionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        AnswerPanel1.setBackground(new java.awt.Color(235, 64, 52));
        AnswerPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("▲");

        AnswerLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AnswerLabel1.setForeground(java.awt.Color.white);
        AnswerLabel1.setText("Answer");

        javax.swing.GroupLayout AnswerPanel1Layout = new javax.swing.GroupLayout(AnswerPanel1);
        AnswerPanel1.setLayout(AnswerPanel1Layout);
        AnswerPanel1Layout.setHorizontalGroup(
            AnswerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AnswerPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AnswerLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addContainerGap())
        );
        AnswerPanel1Layout.setVerticalGroup(
            AnswerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AnswerPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(AnswerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(AnswerLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        AnswerPanel2.setBackground(new java.awt.Color(31, 103, 181));
        AnswerPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        jLabel3.setFont(new java.awt.Font("Segoe UI Variable", 0, 70)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("♦");

        AnswerLabel2.setBackground(new java.awt.Color(52, 140, 235));
        AnswerLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AnswerLabel2.setForeground(java.awt.Color.white);
        AnswerLabel2.setText("Answer");

        javax.swing.GroupLayout AnswerPanel2Layout = new javax.swing.GroupLayout(AnswerPanel2);
        AnswerPanel2.setLayout(AnswerPanel2Layout);
        AnswerPanel2Layout.setHorizontalGroup(
            AnswerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AnswerPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AnswerLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addContainerGap())
        );
        AnswerPanel2Layout.setVerticalGroup(
            AnswerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AnswerPanel2Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(AnswerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AnswerPanel2Layout.createSequentialGroup()
                        .addComponent(AnswerLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AnswerPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );

        AnswerPanel3.setBackground(new java.awt.Color(237, 186, 90));
        AnswerPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 90)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("●");

        AnswerLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AnswerLabel3.setForeground(java.awt.Color.white);
        AnswerLabel3.setText("Answer");

        javax.swing.GroupLayout AnswerPanel3Layout = new javax.swing.GroupLayout(AnswerPanel3);
        AnswerPanel3.setLayout(AnswerPanel3Layout);
        AnswerPanel3Layout.setHorizontalGroup(
            AnswerPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AnswerPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AnswerLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addContainerGap())
        );
        AnswerPanel3Layout.setVerticalGroup(
            AnswerPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AnswerPanel3Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(AnswerPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AnswerLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        AnswerPanel4.setBackground(new java.awt.Color(78, 145, 55));
        AnswerPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("■");

        AnswerLabel4.setBackground(new java.awt.Color(78, 145, 55));
        AnswerLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AnswerLabel4.setForeground(java.awt.Color.white);
        AnswerLabel4.setText("Answer");

        javax.swing.GroupLayout AnswerPanel4Layout = new javax.swing.GroupLayout(AnswerPanel4);
        AnswerPanel4.setLayout(AnswerPanel4Layout);
        AnswerPanel4Layout.setHorizontalGroup(
            AnswerPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AnswerPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AnswerLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addContainerGap())
        );
        AnswerPanel4Layout.setVerticalGroup(
            AnswerPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AnswerPanel4Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(AnswerPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(AnswerLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(0, 0, 0)));

        RoundNumberLabel.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        RoundNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RoundNumberLabel.setText("1/5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RoundNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RoundNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addContainerGap())
        );

        AnswerField.setForeground(java.awt.Color.gray);
        AnswerField.setText("Enter your answer here");
        AnswerField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AnswerFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AnswerFieldFocusLost(evt);
            }
        });
        AnswerField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerFieldActionPerformed(evt);
            }
        });

        SubmitButton.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(QuestionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AnswerPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AnswerPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AnswerPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AnswerPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AnswerField, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SubmitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(QuestionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AnswerPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AnswerPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AnswerPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AnswerPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AnswerField)
                    .addComponent(SubmitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AnswerFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AnswerFieldFocusGained
        if (AnswerField.getText().equals("Enter your answer here")) {
            AnswerField.setText("");
            AnswerField.setForeground(Color.black);
        }
    }//GEN-LAST:event_AnswerFieldFocusGained

    private void AnswerFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnswerFieldActionPerformed

    private void AnswerFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AnswerFieldFocusLost
        if (AnswerField.getText().equals("")) {
            AnswerField.setText("Enter your answer here");
            AnswerField.setForeground(Color.gray);
        }
    }//GEN-LAST:event_AnswerFieldFocusLost

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        if (AnswerField.getText().equals("Enter your answer here") || AnswerField.getText().equals("")) return;
        
        int inputGuess = Integer.parseInt(AnswerField.getText());
        
        if (currentRound.possibleAnswers[inputGuess - 1] == currentRound.answer) {
            correctAnswers++;
        } else {
            incorrectAnswers++;
        }
        
        updateAnswerColors();
        
        currentRoundNumber++;
        currentRound = rounds[currentRoundNumber - 1];
        RoundNumberLabel.setText(String.valueOf(currentRoundNumber) + "/" + String.valueOf(totalRounds));
        AnswerField.setText("");
    }//GEN-LAST:event_SubmitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AnswerField;
    private javax.swing.JLabel AnswerLabel1;
    private javax.swing.JLabel AnswerLabel2;
    private javax.swing.JLabel AnswerLabel3;
    private javax.swing.JLabel AnswerLabel4;
    private javax.swing.JPanel AnswerPanel1;
    private javax.swing.JPanel AnswerPanel2;
    private javax.swing.JPanel AnswerPanel3;
    private javax.swing.JPanel AnswerPanel4;
    private javax.swing.JLabel QuestionLabel;
    private javax.swing.JPanel QuestionPanel;
    private javax.swing.JLabel RoundNumberLabel;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
