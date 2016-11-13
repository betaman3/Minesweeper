import java.awt.*;
import java.applet.Applet;
import java.util.*;
public class chaos extends Applet
{

    public void paint (Graphics g)
    {	
    	// These are the base X and Y coordinates of the 3 points of the largest triangle.
	int xt[] = {50, 300, 550};
	int yt[] = {500, 0, 500};
	
	int x = (int) (Math.random () * 499) + 1;
	int y = (int) (Math.random () * 499) + 1;
	
	for (int i = 0 ; i < 9000 ; i++)
	{

	    int z = (int) (Math.random () * 3);
	    
	    // Creates X and Y coordinates which are at a random interval of distance away 
	    // from the base X and Y coordinates defined earlier.
	    x = (xt [z] + x) / 2;
	    y = (yt [z] + y) / 2;
		
	    g.drawOval (x, y, 1, 1);
	
	    // Puts a delay between the drawing of each dot.
	    try
	    {
		Thread.sleep (1);
	    }
	    catch (InterruptedException ex)
	    {
		Thread.currentThread ().interrupt ();
	    }
	}
	
	// To indicate the program has finished executing.
	g.drawString ("Finished",280,320);

    }
}
