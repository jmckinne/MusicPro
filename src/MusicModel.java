//NO CHANGES MADE


public class MusicModel {
    /**
     * Either 1 or 2 is stored in panel.
     */
    private int panel;

    /**
     * After weeks of meetings, it was decided to initialize panel to 1.
     */
    public MusicModel() {
        panel = 1;
    }

    /**
     * @return the value of panel
     */
    public int whichPanel() {
        return panel;
    }

    /**
     * Switch panel from 1 to 2 or from 2 to 1, but not from any other number
     * any other other number.
     */
    public void switchPanel() {
        if (panel == 1)
            panel = 2;
        else
            panel = 1;
    }
}
