import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * this class switches panels when the "switch panel" button is pressed
 * 
 * @author jmckinne
 *
 */
public class MusicController implements ActionListener{

	private MusicModel model;
	private MusicView view;

	public MusicController(MusicModel model, MusicView view) {
		this.model = model;
		this.view = view;
	}
	
	/**
	 * the method simpily just switches between panels
	 * 
	 */
	public void actionPerformed(ActionEvent e)
    {
        //Execute when button is pressed
        //System.out.println("here");
        //view.setVisible(false);
        model.switchPanel();
        view.displayPanel(model.whichPanel());
      //  view.setVisible(true);
        
        
    }
}


