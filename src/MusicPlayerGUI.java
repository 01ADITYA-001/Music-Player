import javax.swing.*;

public class MusicPlayerGUI extends JFrame{
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

        addGuiComponents();

    }

    private void addGuiComponents(){
        JToolBar toolBar = new JToolBar();
        toolBar.setBounds(0,0,getWidth() , 25);

        // preventing rh etool bar from moving
        toolBar.setFloatable(false);

        //adding the drop down menu
        JMenuBar menuBar = new JMenuBar();
        toolBar.add(menuBar);

        //new adding a song menu where we will place the loading song option
        JMenu songMenu =new JMenu("Song");
        menuBar.add(songMenu);

        //adding the load song item in the song menu
        JMenuItem loadSong = new JMenuItem("Load Songs");


        add(toolBar);
    }



}
