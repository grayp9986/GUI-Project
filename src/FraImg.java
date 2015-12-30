import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FraImg extends JComponent implements MouseMotionListener{
    
    static int nW = 200, nH = 200;
    int nGrid = 10;
    int nX, nY;
    Image imgPkmn;
    
    public FraImg(Image _imgPkmn){
        System.out.println("Currently at: Constructor");
        imgPkmn = _imgPkmn;
        addMouseMotionListener(this);
    }
    
    public void mouseDragged(MouseEvent e) {
        System.out.println("Currently at: mouseDragged");
        nX = e.getX();
        nY = e.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent e) {
        System.out.println("Currently at: mouseMoved");
    }

    public void paint(Graphics g) {
        System.out.println("Currently at: paint");
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(imgPkmn, nX, nY, this);
    }

    public void main() {
        System.out.println("Currently at: main");
        String sImageFile = "Pkmn.jpg";
        Image imgPkmn = Toolkit.getDefaultToolkit().getImage(
        FraImg.class.getResource(sImageFile));
        imgPkmn = imgPkmn.getScaledInstance(nW, nH, Image.SCALE_DEFAULT);
        JFrame frame = new JFrame("New Word");
        frame.getContentPane().add(new FraImg(imgPkmn));
        frame.setSize(300, 300);
        frame.setVisible(true);
        System.out.println("Currently at: end of main");
    }
}
