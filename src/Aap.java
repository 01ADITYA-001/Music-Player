import javax.swing.*;


public class Aap {
    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable(){
        @Override
            public void run(){
                new MusicPlayerGUI().setVisible(true);
            }
        });
    }
}
