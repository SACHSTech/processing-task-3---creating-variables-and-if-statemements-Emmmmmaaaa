import processing.core.PApplet;
import java.util.Random;
import java.lang.Math;

public class Sketch extends PApplet {
	//define veribles 
	int intRandom;
  int min;
  int max; 
  int length; 
  int width;
  int intHours;
  int intMinutes; 
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }
  
  public void setup() {
    background(138, 181, 237);
    // add random 
    min = 0; 
    max = 101; 
    intRandom = (int)Math.floor(Math.random() * (max - min + 1) + min); 
  }
  public void draw() {
    //House 
      // Define text size and colour
      textSize(25);
      fill(0,0,0); 

      intHours = hour(); 
      intMinutes = minute(); 

      text(intHours, 10,30);
      text(intMinutes, 50, 30);

	    // verible 
      length = 400; 
      width = 400;  

      if (intRandom <= 51 && intRandom >= 0) {
            // background
          fill(21, 153, 51);
          rect(0,(float)(width *0.625),length, width);

      // roof
          fill(150,58,38);
          triangle((float)(length * 0.25), (float)(width * 0.5), (float)(length * 0.5), (float)(width*0.2),(float)(length*0.75),(float)(width*0.5));  

        //main part of house
          fill(255,77,207);
          rect((float)(length*0.25),(float)(width*0.5),(float)(length*0.5),(float)(width*0.5));

        // window 
          fill (247, 188, 224);
        rect((float)(length*0.325), (float)(width*0.6), (float)(length*0.175), (float)(width*0.175));

      //door 
          fill (211, 188, 247);
          rect((float)(length*0.575), (float)(width*0.775), (float)(length*0.15), (float)(width*0.25));

          //door knob
        fill(205, 219, 96);
        ellipse((float)(length*0.625), (float)(width*0.9), (float)(width*0.025), (float)(length*0.025));
       } 
      else {
        // background
        fill(35, 37, 54);
        rect(0,(float)(width *0.625),length, width);
  
        // roof
        fill(107,92,76);
        triangle((float)(length * 0.25), (float)(width * 0.5), (float)(length * 0.5), (float)(width*0.2),(float)(length*0.75),(float)(width*0.5));  
  
       //main part of house
        fill(238, 187, 240);
        rect((float)(length*0.25),(float)(width*0.5),(float)(length*0.5),(float)(width*0.5));
  
       // window 
        fill (93, 27, 150);
       rect((float)(length*0.325), (float)(width*0.6), (float)(length*0.175), (float)(width*0.175));
  
       //door 
        fill (117, 102, 82);
        rect((float)(length*0.575), (float)(width*0.775), (float)(length*0.15), (float)(width*0.25));
  
        //door knob
        fill(253, 255, 145);
       ellipse((float)(length*0.625), (float)(width*0.9), (float)(width*0.025), (float)(length*0.025));
    }
  }   
}