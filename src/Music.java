import javax.swing.JFrame;

/**
 * You need to add an event handler that will switch the JPanels in the view
 * when the user clicks the button.
 * 
 * @author Tom Bylander
 */
public class Music {

    public static void main(String[] args) {
        MusicModel model = new MusicModel();
        MusicView view = new MusicView();
        MusicController controller = new MusicController(model,view);
	// PanelSwitcherController controller = new PanelSwitcherController(view, model);
        
         view.register(controller);

        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setSize(1000,800);
        view.setVisible(true);
    }

}