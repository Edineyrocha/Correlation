package firstProject;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CalcOffsets {
	public static void main(String[] args) {
        ScreenButtons screen = new ScreenButtons();
        screen.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent evt) {
                // Encerra a aplicação
                System.exit(0);
        }
        });
    }
	

}
