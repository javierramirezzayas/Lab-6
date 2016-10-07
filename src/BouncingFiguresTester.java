import javax.swing.JFrame;

public class BouncingFiguresTester {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		JFrame frame= new JFrame();
		frame.setTitle("Mr Fresh Window");
		frame.setSize(600, 620);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create a box to put all objects in
		BouncingBox box = new BouncingBox();
		
		// Add all the components to the box
		BouncingFigure figure1 = new BouncingRectangle(0, 0, 10, 10, 325.0, 100);
		box.add(figure1);
		BouncingFigure figure2 = new BouncingRectangle(0, 500, 10, 10, 45.0, 50);
		box.add(figure2);
		
		//ADDED for Q3
		BouncingFigure figure3 = new BouncingRectangle(50, 50, 10, 20, 222.0, 200);
		box.add(figure3);
		BouncingFigure figure4 = new BouncingRectangle(100, 200, 20, 20, 25.0, 500);
		box.add(figure4);
		//ADDED for Q3
		
		//ADDED for Q6
		BouncingFigure figure5 = new BouncingCircle(0, 0, 10, 10, 320.0, 200);
		box.add(figure5);
		BouncingFigure figure6 = new BouncingCircle(10, 20, 50, 50, 75.0, 100);
		box.add(figure6);
		//ADDED for Q6
		
		frame.add(box);
		
		// Make the frame visible
		frame.setVisible(true);
		
		// Continuously update the frame since some components will change position
		while(true) {
			try{
				Thread.sleep(100); // Wait for 0.1 second = 100 milliseconds
			}
			catch(InterruptedException e){}
			
			frame.repaint();
			
		} // end while

	}//end main

}//end class
