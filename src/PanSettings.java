import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JLabel;

public class PanSettings extends JPanel{

    PanDisp panDisp;
    static int nW = 200, nH = 200;
    int nGrid = 10;
    int nX, nY;
    Image imgPkmn;
    JButton btnNewWord;

    public PanSettings(PanDisp _panDisp){
        panDisp = _panDisp;
        //imgPkmn = _imgPkmn;
        btnNewWord = new JButton("New Word");
        System.out.println("Made it to the constructor");
        //add(new main());
        //add(new FraImg(imgPkmn));
    }

    //class main extends JPanel implements MouseMotionListener {

        /*public void DragImage() {
            System.out.println("Made it to DragImage");
            addMouseMotionListener(this);
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            System.out.println("Made it to mouseDragged");
            nX = e.getX();
            nY = e.getY();
            repaint();
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            System.out.println("Made it to mouseMoved");
        }

        @Override
        public void paint(Graphics g) {
            System.out.println("Made it to paint");
            Graphics2D g2 = (Graphics2D) g;
            g2.drawImage(imgPkmn, nX, nY, this);
            main();
        }
        public void main() {
            System.out.println("Made it to main");
            String sImageFile = "Pkmn.jpg";
            Image imgPkmn = Toolkit.getDefaultToolkit().getImage(
                    PanSettings.class.getResource(sImageFile));
            imgPkmn = imgPkmn.getScaledInstance(nW, nH, Image.SCALE_DEFAULT);
            /*JFrame frame = new JFrame("DragImage");
            frame.getContentPane().add(new PanSettings(panDisp, imgPkmn));
            frame.setSize(300, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);*/
            //FraImg fraImg = new FraImg();
            //System.out.println("Made it to the end");
        //}
    //}
}
