import javax.swing.*;
import java.awt.*;

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
        JMenu playListMenu = new JMenu("PlayList");
        menuBar.add(playListMenu);

        // then add the items to the playlist menu
        JMenuItem createPlaylist = new JMenuItem("Create Playlist");
        playListMenu.add(createPlaylist);

        JMenuItem loadPlaylist = new JMenuItem("Load PlayList");
        playListMenu.add(loadPlaylist);

        add(toolBar);
    }



}
