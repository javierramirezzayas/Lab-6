import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JComponent;

public class BouncingBox extends JComponent {

	private ArrayList<BouncingFigure> figures = new ArrayList<BouncingFigure>();

	public void add(BouncingFigure f) {
		figures.add(f);
	}

	public void paintComponent(Graphics g) {
		for (BouncingFigure f : figures) {
			// Add code here for Lab Q5
			if (f.rightBorderCollision(getWidth()) || f.lowerBorderCollision(getHeight())){
				f.setTrajectory(-10);
			}
			f.draw(g); f.move();
			//
		}
	}
}
