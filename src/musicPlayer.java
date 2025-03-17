import javazoom.jl.player.advanced.AdvancedPlayer;

import java.io.FileInputStream;

public class musicPlayer {
    // this class will store the song details
    private  Song currentSong;

    // useing JPlayer library to create an advanced object which will handle paying the music
    private AdvancedPlayer advancedPlayer;


    //constructor
    public musicPlayer(){

    }

    public void loadSong(Song song){
        currentSong = song;

        // play the curretn song if not null
        if(currentSong != null){
            playCurrentSong();
        }
    }

    public void playCurrentSong(){
        try{
            //read  mp3 audio data
            FileInputStream fileInputStream =  new FileInputStream(currentSong.getFilePath());

            //start music
            startMusicThread();


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    // this thread will handle the music
    private void startMusicThread(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try{

                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
