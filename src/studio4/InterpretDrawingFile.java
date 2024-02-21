package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shapeType = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		StdDraw.setPenColor(red,green,blue);
		
		
		boolean isFilled = in.nextBoolean();

		
		if(shapeType.equals("rectangle")) {
			double parameterOne = in.nextDouble();
			double parameterTwo = in.nextDouble();
			double parameterThree = in.nextDouble();
			double parameterFour = in.nextDouble();
			
			if(isFilled == true) {
				StdDraw.filledRectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
			}else {
				StdDraw.rectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
		}else if(shapeType.equals("ellipse")) {
			double parameterOne = in.nextDouble();
			double parameterTwo = in.nextDouble();
			double parameterThree = in.nextDouble();
			double parameterFour = in.nextDouble();

			if(isFilled == true) {
				StdDraw.filledEllipse(parameterOne, parameterTwo, parameterThree, parameterFour);
			}else {
				StdDraw.ellipse(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
		}else if(shapeType.equals("triangle")) {
			double parameterOne = in.nextDouble();
			double parameterTwo = in.nextDouble();
			double parameterThree = in.nextDouble();
			double parameterFour = in.nextDouble();
			double parameterFive = in.nextDouble();
			double parameterSix = in.nextDouble();
			
			double xParameters[] = {parameterOne, parameterThree, parameterFive};
			double yParameters[] = {parameterTwo, parameterFour, parameterSix};
			
			if(isFilled == true) {
				StdDraw.filledPolygon(xParameters, yParameters);
			}else {
				StdDraw.polygon(xParameters, yParameters);
			}
 		}
		
		
	}
}
