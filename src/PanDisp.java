import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.*;
import java.awt.event.KeyListener;
import javax.swing.*;

public class PanDisp extends JPanel {

    JLabel lblOutput;
    JLabel lblGuess;
    JButton btnUpdateLabel;
    Image imgPkmn;
    FraImg fraImg;
    String sSecret;

    public PanDisp() {//Constructor
        KeyInput keyInput = new KeyInput();
        KeyInput.LabelChangeListener labelChange = keyInput.new LabelChangeListener();
        sSecret = "*******";
        lblGuess = new JLabel("Type will go here");
        lblOutput = new JLabel(sSecret);
        btnUpdateLabel = new JButton("Enter");
        add(lblOutput);
        add(btnUpdateLabel);
        addKeyListener(new KeyInput());
        setFocusable(true);
        btnUpdateLabel.addActionListener(labelChange);
        fraImg = new FraImg(imgPkmn);
        //fraImg.main();
    }

    public void GameOver() {

    }

    class KeyInput implements KeyListener {

        String sInput;
        String sWord = "pikachu";
        String sSecret = "*******";
        char chInput;

        /*keyPressed - when the key goes down
        keyReleased - when the key comes up
        keyTyped - when the unicode character represented by this key is sent by the keyboard to system input.*/
        @Override
        public void keyTyped(KeyEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void keyPressed(KeyEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            chInput = (char) e.getKeyChar();
            sInput = String.valueOf(chInput); // convert the char to a String
            lblOutput.setText(sInput);
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }

        class LabelChangeListener implements ActionListener {

            char cWord;
            int nCorrect, nIncorrect, nNum;
            //PanDisp panDisp = new PanDisp();

            public void actionPerformed(ActionEvent event) {
                //for (int i = 0; i < sWord.length(); i++) {
                //if (sInput.charAt(0) == sWord.charAt(i)) {
                //lblOutput.setText("*******");
                //}
                if (sWord.contains(sInput)) {
                    for (int i = 0; i < sWord.length(); i++) {
                        sSecret.replace(sSecret.charAt(i), sWord.charAt(i));
                        //if (sWord.charAt(i) == sInput.charAt(0)){
                        //nNum = i;
                        //}
                    }
                    nCorrect += 1;
                    /*
                    if(nNum == 0){
                        lblOutput.setText(sSecret);
                    }
                    if(nNum == 1){
                        lblOutput.setText("*i*****");
                    }
                    if(nNum == 2){
                        lblOutput.setText("**k****");
                    }
                    if(nNum == 3){
                        lblOutput.setText("***a***");
                    }
                    if(nNum == 4){
                        lblOutput.setText("****c*");
                    }
                    if(nNum == 5){
                        lblOutput.setText("*****h*");
                    }
                    if(nNum == 6){
                        lblOutput.setText("******u");
                    }*/
                }
                else {
                    nIncorrect += 1;
                    if (nIncorrect == 7) {
                        GameOver();
                    }
                }
            }
        }
    }
}
