
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author grayp9986
 */
public class PanStats extends JPanel{
    
    PanDisp panDisp;
    JLabel lblCountF;//Counts failures
    JLabel lblCountS;//Counts successes
    JLabel lblLetters;//Counts guessed letters
    
    public PanStats(PanDisp _panDisp){
        panDisp = _panDisp;
    }
}
