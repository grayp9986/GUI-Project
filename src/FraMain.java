import javax.swing.JFrame;

public class FraMain extends JFrame{
    public FraMain(){
        //throw new UnsupportedOperationException("Not supported yet.");
        PanMain panMain = new PanMain();
        add(new PanMain());
        setTitle("StringMan by Porter Gray");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200,400);
        this.setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
