package View;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GameWindow extends JFrame
{
	private static final long serialVersionUID = 3314871466872557666L;
	private static final int FRAME_WIDTH = 800; 
	private static final int FRAME_HEIGHT = 600;
	
	public GameWindow()
	{
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
      setLocation(0, 0);
      setResizable(true);
      setTitle("Czwórki");
      setUndecorated(false);
      setVisible(true);
      setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
      
      addWindowListener(new WindowAdapter()
      {
      	public void windowClosing(WindowEvent we)
         {
      		if(JOptionPane.showConfirmDialog(null, "Are you sure?") == JOptionPane.OK_OPTION)
      		{
               setVisible(false);
               System.exit(0);
      		}
         }
      });
      //Container contentPane = getContentPane();
	}
}
