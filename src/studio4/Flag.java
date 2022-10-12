package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		//background
		StdDraw.setPenColor(253,238,220);
		StdDraw.filledRectangle(0, 0, 1, 1);
		
		//moutain1
		StdDraw.setPenColor(210, 218, 255);
		double [] x = {0.0, 0.25, 0.5};
		double [] y = {0.0, 0.4, 0.0};
		StdDraw.filledPolygon(x,y);
		
		//moutain2
		StdDraw.setPenColor(170, 196, 255);
		double [] x2 = {0.5, 0.75, 1};
		double [] y2 = {0.0, 0.4, 0.0};
		StdDraw.filledPolygon(x2, y2);
		
		//pineapple crown
		StdDraw.setPenColor(125, 206, 19);
		double [] x3 = {0.36, 0.4, 0.54};
		double [] y3 = {0.6, 0.9, 0.6};
		StdDraw.filledPolygon(x3, y3);
		
		//pineapple crown
		StdDraw.setPenColor(125, 235, 19);
		double [] x4 = {0.43, 0.54, 0.63};
		double [] y4 = {0.6, 0.9, 0.6};
		StdDraw.filledPolygon(x4, y4);
		
		//pineapple circle
		StdDraw.setPenColor(254,205,112);
		StdDraw.filledEllipse(0.5, 0.5, 0.185, 0.215);
		
		//black border
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(0.05);
		StdDraw.rectangle(0.5, 0.5, 0.5, 0.5);
	}
}
