import java.awt.*;
import java.awt.event.*;
import javax.swing.*;





//just made an actionlistener method

/**
 * All this is missing here is a method to register the event handler with
 * the button.  You might need a couple changes so that the method can access
 * the button.
 * 
 * @author Tom Bylander
 */
public class MusicView extends JFrame {
    private JPanel panel1, panel2;

    JButton button;
    int i = 0;
   
    
    public MusicView() {
        super("Musical Design");

        Font font = new Font("SansSerif", Font.BOLD, 30);
        panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());
//Menu stuff
        JMenuBar menuBar = new JMenuBar();
        JMenu instruments = new JMenu("Instruments");
        JMenu songs = new JMenu("Songs");
        JMenu menu = new JMenu("Menu"); 
        
        menuBar.add(menu);
        menuBar.add(instruments);
        menuBar.add(songs);
        
        setJMenuBar(menuBar);
       
        JMenuItem bass = new JMenuItem("Bass");
        bass.setMnemonic('B');
        instruments.add(bass);
        
        JMenuItem guitar = new JMenuItem("Guitar");
        guitar.setMnemonic('G');
        instruments.add(guitar);
        
        JMenuItem viola = new JMenuItem("Viola");
        guitar.setMnemonic('V');
        instruments.add(viola);
        
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setMnemonic('E');
        menu.add(exitItem);
//End Menu        
       
//start instrument panel        
      
      
        
//end instrument panel        
        
//start panel1        
        JLabel label = new JLabel("four", JLabel.CENTER);
        label = new JLabel("Instruments", JLabel.CENTER);
        label.setBackground(Color.GREEN);
        label.setFont(font);
        label.setOpaque(true);
        panel1.add(label, BorderLayout.NORTH);

        label = new JLabel("JLabels", JLabel.CENTER);
        label.setBackground(Color.YELLOW);
        label.setFont(font);
        label.setOpaque(true);
        panel1.add(label, BorderLayout.WEST);

        label = new JLabel("for", JLabel.CENTER);
        label.setBackground(Color.ORANGE);
        label.setFont(font);
        label.setOpaque(true);
        panel1.add(label, BorderLayout.CENTER);

        label = new JLabel("this", JLabel.CENTER);
        label.setBackground(Color.PINK);
        label.setFont(font);
        label.setOpaque(true);
        panel1.add(label, BorderLayout.EAST);

        label = new JLabel("panel", JLabel.CENTER);
        label.setBackground(Color.RED);
        label.setFont(font);
        label.setOpaque(true);
        panel1.add(label, BorderLayout.SOUTH);
        
        
//end panel1
        
        panel2 = new JPanel();
        panel2.setLayout(new BorderLayout());

        label = new JLabel("Songs", JLabel.CENTER);
        label.setBackground(Color.GREEN);
        label.setFont(font);
        label.setOpaque(true);
        panel2.add(label, BorderLayout.NORTH);

        label = new JLabel("JLabels", JLabel.CENTER);
        label.setBackground(Color.YELLOW);
        label.setFont(font);
        label.setOpaque(true);
        panel2.add(label, BorderLayout.WEST);

        label = new JLabel("for", JLabel.CENTER);
        label.setBackground(Color.ORANGE);
        label.setFont(font);
        label.setOpaque(true);
        panel2.add(label, BorderLayout.CENTER);

        label = new JLabel("this", JLabel.CENTER);
        label.setBackground(Color.PINK);
        label.setFont(font);
        label.setOpaque(true);
        panel2.add(label, BorderLayout.EAST);

        label = new JLabel("panel", JLabel.CENTER);
        label.setBackground(Color.RED);
        label.setFont(font);
        label.setOpaque(true);
        panel2.add(label, BorderLayout.SOUTH);

        font = new Font("Monospaced", Font.BOLD + Font.ITALIC, 30);
         button = new JButton("Panel Switch");
        button.setFont(font);
        add(button, BorderLayout.NORTH);

        add(panel1, BorderLayout.CENTER);

	
	 


    }
   

    /**
     * just made a ActionListener for the button on the panels
     * 
     * @param controller
     */
    public void register(MusicController controller){
    	
    
    	
    	button.addActionListener(controller);
    	
    		/*button.addActionListener(new ActionListener() {
    		 
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
                System.out.println("You clicked the button");
                i++;
                
            }
        });  */    

    	
    	
        
        
    }
    /**
     * This seems to be a way to switch JPanels.  Let me know of any bugs
     * or more elegant ways of doing the same task.
     * 
     * @param whichPanel Should panel1 or panel2 be displayed?
     */
    public void displayPanel(int whichPanel) {
        remove(panel1); // doesn't seem to mind trying to remove
        remove(panel2); // components that are not displayed
        if (whichPanel == 1) {
            System.out.println("Should display panel1");
            add(panel1, BorderLayout.CENTER);
        } else {
            System.out.println("Should display panel2");
            add(panel2, BorderLayout.CENTER);
        }
        validate();
        repaint();
    }
}
