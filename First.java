import java.util.Scanner; 
import java.util.Arrays; 
/**
 * Write a description of class Heist here.
 *
 * @author Marlon Ehrmann
 * @version 14/05/2025
 */
public class First
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Heist
     */
    public First()
    { 
        Scanner sc = new Scanner(System.in);
       
        System.out.println("controls are up ,down ,back, look, grab and use");
        while(true){
        System.out.print("You stand outside the old museum looking up at it knowing your goal to steal the precious diamond 'the heart-of-my-boot' looking you spot two posible entrances through the main entrance or into the sewer");
        boolean inSewer = IntoSewer();
        String input = sc.next(); 
        boolean mainEntrance = MainEntrance(); 
        if(mainEntrance == true){
        System.out.println("You strut confidently through the main entrance");
        }else if(inSewer == true){
        System.out.println("You decent deep into the sewers hoping to enter the museum that way");
        }
        if(inSewer == true && input.contains("look")){
        System.out.println("As you look around the dingy sewer you spot a few things one. most notably a glass cutter");
        }
            
        }
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean MainEntrance()
    {
        Scanner sc  = new Scanner(System.in); 
        String input = sc.next();  
        if(input.contains("up")){
            return true;
        }else{
            return false; 
        }    
    }

    public boolean IntoSewer()
    {
        Scanner sc  = new Scanner(System.in); 
        String input = sc.next();    
        if(input.contains("down")){
            return true;
        }else
            return false;
    }
   
}

