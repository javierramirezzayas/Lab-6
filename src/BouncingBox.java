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

			// Add code here for Lab Q4 (START)
			if(f.rightBorderCollision(this.getWidth()) || f.leftBorderCollision()){
				f.setTrajectory(-(f.getTrajectory()) + 180);
			}
			if (f.upperBorderCollision() || f.lowerBorderCollision(this.getHeight())){
				f.setTrajectory(-(f.getTrajectory()));
			}
			// Add code here for Lab Q4 (END)

			f.draw(g); 
			f.move();

		}
	}
}

