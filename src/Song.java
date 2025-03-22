// this class will describe the song

import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;

import java.io.File;
import java.lang.reflect.Field;

public class Song {
        private String songTitle;
        private String songArtist;
        private String songLength;
        private String filePath;

    public Song(String filePath){
            this.filePath = filePath;
            try{
                // use the jaudiotagger library to create an audiofile obj to read mp3 files info
                //  its present in the jar file we just added in the project
                AudioFile audioFile = AudioFileIO.read(new File(filePath));

                // reading the meta data from the audio file
                Tag tag = audioFile.getTag();

                if(tag != null){
                    songTitle = tag.getFirst(FieldKey.TITLE);
                    songArtist = tag.getFirst(FieldKey.ARTIST);
                }else{
                    // cant read through the mp3 file
                    songArtist = "N/A";
                    songTitle = "N/A";
                }
            }catch(Exception e){
                e.printStackTrace();
            }
    }
    // geeters
    public String getSongTitle() {
        return songTitle;
    }

    public String getSongArtist() {
        return songArtist;
    }

    public String getSongLength() {
        return songLength;
    }

    public String getFilePath() {
        return filePath;
    }

}
