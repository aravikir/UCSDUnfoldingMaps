package GUI_module;

import processing.core.PApplet;

public class MyDisplay extends PApplet {
	
	public void setup() {
		//edits size of canvas
		size(400, 400);	//size(w, h)
		//changes background colour
		background(0,0,0);	//background(r, g, b)	check docs for more syntax
		
	}
	
	public void draw() {
		//prepare colour for drawing
		fill(255, 255, 0);	//set fill colour to yellow	fill(r, g, b)
		//draw an ellipse
		ellipse(200, 200, 390, 390);	//ellipse(x, y, w, h)
		//new fill colour
		fill(0,0,0);
		//left eye ellipse
		ellipse(120,130,50,70);
		//right eye ellipse
		ellipse(280,130,50,70);
		//making arc for smile
		arc(200,280,75,75,0,PI);
	}

}
