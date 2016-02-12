/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package YourNameHere;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author singk4158
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City ();
        
        //Robot karel= new Robot (kw, 3, 4, Direction.SOUTH);  
        
        Robot Tina=
                new Robot (kw, 1, 3, Direction.SOUTH);

        new Wall(kw,3 ,4 , Direction.SOUTH);
        new Wall (kw,3 ,4 , Direction.SOUTH);
        new Wall (kw, 4,3, Direction.WEST);
        //new Wall(kw,, , Direction.WEST );
    }
    
}
        


 