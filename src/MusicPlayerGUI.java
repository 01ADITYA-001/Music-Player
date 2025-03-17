import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;

public class MusicPlayerGUI extends JFrame{

    // color configuration
    public static final Color FRAME_COLOR = Color.BLACK;
    public static final Color TEXT_COLOR = Color.WHITE;

    public MusicPlayerGUI(){
        super("Music Player");

        // seeting size and width
        setSize(400 , 600);

        // end the project when the project is closed
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // to launch the aap in the middle of the screen
        setLocationRelativeTo(null);

        // to prevent from resizing trhe aap
        setResizable(false);

        //seeting the layout to null to alow us to control the (x,y) coordinates of the components
        // and also set teh height and width
        setLayout(null);

        // seeting the background Color
        getContentPane().setBackground(FRAME_COLOR) ;

        addGuiComponents();

    }
    private void addGuiComponents(){
        // add tool bar
        addToolBar();

        JLabel songImage = new JLabel(loadImage("src/assets/record.png"));
        songImage.setBounds(0 , 50 , getWidth() -20 , 225);
        add(songImage);

        //song title
        JLabel songTitle = new JLabel("Song Title");
        songTitle.setBounds(0 , 285 , getWidth() - 10 , 30);
        songTitle.setFont(new Font("Dialog" , Font.BOLD , 24));
        songTitle.setForeground(TEXT_COLOR);
        songTitle.setHorizontalAlignment(SwingConstants.CENTER);
        add(songTitle);

        //song artist
        JLabel songArtist = new JLabel("Artist");
        songArtist.setBounds(0 , 315 , getWidth() - 10 , 30);
        songArtist.setFont(new Font("Dialog" , Font.BOLD , 24 ));
        songArtist.setForeground(TEXT_COLOR);
        songArtist.setHorizontalAlignment(SwingConstants.CENTER);
        add(songArtist);

        //playback slider
        JSlider playbackSlider = new JSlider(JSlider.HORIZONTAL , 0 , 100 , 0);
        playbackSlider.setBounds(getWidth()/2 - 300/2 , 365 , 300 , 40);
        playbackSlider.setBackground(null);
        add(playbackSlider);

        // playbck buttons
        addPlaybackButtons();
    }

    private void addPlaybackButtons(){
        JPanel playBackButtons = new JPanel();
        playBackButtons.setBounds(0 , 435 , getWidth() - 10 , 80);
        playBackButtons.setBackground(null);


        //previous buttons
        JButton prevButton = new JButton(loadImage("out/production/Music player/assets/previous.png"));
        prevButton.setBorderPainted(false);
        prevButton.setBackground(null);
        playBackButtons.add(prevButton);

        // play button
        JButton playButton = new JButton(loadImage("out/production/Music player/assets/play.png"));
        playButton.setBorderPainted(false);
        playButton.setBackground(null);
        playBackButtons.add(playButton);

        //pause button
        JButton pauseButton = new JButton(loadImage("out/production/Music player/assets/pause.png"));
        pauseButton.setBorderPainted(false);
        pauseButton.setBackground(null);
        playBackButtons.add(pauseButton);

        //next button
        JButton nextButton = new JButton(loadImage("out/production/Music player/assets/next.png"));
        nextButton.setBorderPainted(false);
        nextButton.setBackground(null);
        playBackButtons.add(nextButton);

        add(playBackButtons);

    }

    private void addToolBar(){
        JToolBar toolBar = new JToolBar();
        toolBar.setBounds(0,0,getWidth() , 25);

        // preventing rh etool bar from moving
        toolBar.setFloatable(false);

        //adding  the drop down menu
        JMenuBar menuBar =  new JMenuBar();
        toolBar.add(menuBar);

        //new adding a song menu where we will place the loading song option
        JMenu songMenu =new JMenu("Song");
        menuBar.add(songMenu);

        //adding the load song item in the song menu
        JMenuItem loadSong = new JMenuItem("Load Songs");
        songMenu.add(loadSong);

        // now adding the playlist menu
        JMenu playListMenu = new JMenu("Playlist");
        menuBar.add(playListMenu);

        // then add the items to the playlist menu
        JMenuItem createPlaylist = new JMenuItem("Create Playlist");
        playListMenu.add(createPlaylist);

        JMenuItem loadPlaylist = new JMenuItem("Load PlayList");
        playListMenu.add(loadPlaylist);

        add(toolBar);
    }

    private ImageIcon loadImage(String imagePath){
        try{
            // reading the image from the path
            BufferedImage image = ImageIO.read(new File(imagePath));

            // returns an image so the component can render the image
            return new ImageIcon(image);
        }catch(Exception e){
            e.printStackTrace();
        }

        // could not find the result
        return null;
    }
}
