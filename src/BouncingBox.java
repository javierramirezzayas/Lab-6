import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JComponent;

public class BouncingBox extends JComponent {

	private ArrayList<BouncingFigure> figures = new ArrayList<BouncingFigure>();

	public void add(BouncingFigure f) {
		figures.add(f);
	}

	public void paintComponent(Graphics g) {

		//		System.out.println("getWidth = " + getWidth());

		for (BouncingFigure f : figures) {

			// Add code here for Lab Q5 (START)
			if(f.rightBorderCollision(getWidth()) || f.leftBorderCollision()){
				f.setTrajectory((-1 * f.getTrajectory()) + 180);
			}
			else{
				if (f.upperBorderCollision() || f.lowerBorderCollision(getHeight())){
					f.setTrajectory(-1 * f.getTrajectory());

					System.out.println("Collision");
				}

				System.out.println("getTrajectory = " + f.getTrajectory());
				// Add code here for Lab Q5 (END)

				f.draw(g); 
				f.move();

			}
		}
	}
}
