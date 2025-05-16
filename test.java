import java.util.Scanner;
import java.util.*; 
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class test
     */
    public test()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("You stand at the gate of the old museum with one purpose: to steal the largest diamond in the world ‘the-heart-of-my-boot'.\n You see two entrances to your left is the main entrance and to the right is the sewer entrance.");
        String[] rooms = {"0","0R","0L","0LL","0LR","0RL","0RR","0LLL","0LLR","0LRL","0LRR","0RRL","0RRR","0LLLL","0LLLR","0LLRL","0LLRR","0RRRL","0RRRR","0LLRRL","0LLRRR","0RRRRL","0RRRRR","0RRRRLR","0RRRRLL"};
        String[] roomData = {
        "You stride confidently through the main entrance there are two corridors one to your left and one to the right",
        "You climb into the dingy sewers, the smell almost knocking you out but you persist, you see two ways, \n a long shaft to your left and a small crawl space to the right.",
        "You boldly walk through the museum entrance, the guards don’t suspect a thing to your left you see a long winding corridor, to your right is a broken ventilation shaft that you think you might be able to crawl into.",
        "You silently sneak your way under the guards desk without him even noticing, to your left you see a long winding hallway, to your right a what seems to be a broken ventilation shaft.",
        "You descend deep into the shaft but then your rope runs out and you fall 50 meters to your death.",
        "You nimbly crawl into the small crawl space coming out at a ladder that takes you into a \n  maintenance closet, to your left you see a backup generator humming loudly, to your right you \n see a light creeping in from a door that leads to the diamond room.",
        "You boldly walk through the museum entrance, the guards don’t suspect a thing to your \n left you see a long winding corridor, to your right is a broken ventilation shaft that you think you \n  might be able to crawl into.",
        "You silently sneak your way under the guards desk without him even noticing, to your left \n you see a long winding hallway, to your right a what seems to be a broken ventilation shaft. ", 
        "You walk up to the still humming generator and attempt to sabotage it, but while doing so \n  you manage to electrocute yourself, you body zapping to the point where the sleeping janitor  \n next to you wakes up and sees your skeleton, then you drop to the floor, dead as a \n dormouse, your corpse still sparking.",
        "You sneak into the hallway and to your luck no guards are around and find yourself \n standing underneath a huge glass box suspended in the air holding the precious diamond, now \n you have two options 1 , Use item WIP,(R)  or see if you can scale up to the diamond and \n climb into the box.",
        "you walk down the long winding corridor coming to an end at two doors. The one on the \n left is labeled ‘Staff only’ and the one on the right is labeled Rare minerals exhibit.",
        "You slide into the ventilation shaft, snug as can be, you crawl along it until it reaches a \n fork, you think your odds are around 50/50 that you’ll end up in the diamond room.", 
        "You start your trek down the hallway but end up getting extremely lost until you reach an \n unlabeled room, thinking to yourself that this surely has to be something you enter, as you \n walk into the room you accidentally bump something, but in the dark you don’t think too much \n of it. That moment a large T-Rex skeleton starts falling straight towards you, its head coming \n down to trap you. Immediately two guards run into the room being alerted by the noise and \n arrest you.",
        
    
    
    
    
    
    
    
};
        String input = "0"; 
        while(true){
            String input2 = sc.next(); 
            input = input+input2;
            for(int i = 0; i<rooms.length; i++){
            if(rooms[i].equals(input)){
            System.out.println(roomData[i]);
            }
            }
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
