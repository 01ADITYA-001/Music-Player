import javax.swing.*;

public class Aap {
    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable(){
        @Override
            public void run(){
                new MusicPlayerGUI().setVisible(true);

//                Song song = new Song("assets/Wind Riders - Asher Fulero.mp3");
//                System.out.println(song.getSongTitle());
//                System.out.println(song.getSongArtist());
        }
        });
    }
}
