import java.util.Scanner;
import java.util.*; 
/**
 * Write a description of class test here.
 *
 * @author Marlon Ehrmann
 * @version 18/05/25
 */
public class Heist
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class test
     */
    public Heist()
    {
        Scanner sc = new Scanner(System.in);
        String[] rooms = {"0","0L","0R","0LL","0LR","0RL","0RR","0RRL","0RRR","0LLL","0LLR","0LRL","0LRR","0LLLL","0LLLR","0LLRL","0LLRR","0RRRL","0RRRR","0LLRRL","0LLRRR","0RRRRL","0RRRRR","0RRRRLR","0RRRRLL"};
        String[] roomData = {
        "You stand at the gate of the old museum with one purpose: to steal the largest diamond in the world ‘the-heart-of-my-boot'.\n You see two entrances to your left is the main entrance and to the right is the sewer entrance.",
        "You stride confidently towards the main entrance, you have two options sneak in (R) or continue walking as bold as you are(L)",
        "You climb into the dingy sewers, the smell almost knocking you out but you persist, you see two ways, \n a long shaft to your left and a small crawl space to the right.",
        "You boldly walk through the museum entrance, the guards don’t suspect a thing to your left you see a long winding corridor, to your right is a broken ventilation shaft that you think you might be able to crawl into.",
        "You silently sneak your way under the guards desk without him even noticing, to your left you see a long winding hallway, to your right a what seems to be a broken ventilation shaft.",
        "You descend deep into the shaft but then your rope runs out and you fall 50 meters to your death.",
        "You nimbly crawl into the small crawl space coming out at a ladder that takes you into a \n  maintenance closet, to your left you see a backup generator humming loudly, to your right you \n see a light creeping in from a door that leads to the diamond room.", 
        "You walk up to the still humming generator and attempt to sabotage it, but while doing so \n  you manage to electrocute yourself, you body zapping to the point where the sleeping janitor  \n next to you wakes up and sees your skeleton, then you drop to the floor, dead as a \n dormouse, your corpse still sparking.",
        "You sneak into the hallway and to your luck no guards are around and find yourself \n standing underneath a huge glass box suspended in the air holding the precious diamond, now \n you have two options 1 , Use item WIP,(R)  or see if you can scale up to the diamond and \n climb into the box.",
        "You walk down the long winding corridor coming to an end at two doors. The one on the \n left is labeled ‘Staff only’ and the one on the right is labeled Rare minerals exhibit.",
        "You slide into the ventilation shaft, snug as can be, you crawl along it until it reaches a \n fork, you think your odds are around 50/50 that you’ll end up in the diamond room.", 
        "You start your trek down the hallway but end up getting extremely lost until you reach an \n unlabeled room, thinking to yourself that this surely has to be something you enter, as you \n walk into the room you accidentally bump something, but in the dark you don’t think too much \n of it. That moment a large T-Rex skeleton starts falling straight towards you, its head coming \n down to trap you. Immediately two guards run into the room being alerted by the noise and \n arrest you.",
        "You Stare for a long time at the ventilation shaft contemplating, but in the end you decide \n to just steal the sleeping entrance guards wallet and call it a day. ( Petty theft ending )", 
        "You walk into the room labeled staff only, in it you find a guards uniform that you decide to put on, as you finish putting on the uniform another guard walks into the room and says ‘you must be the new guy let me show you the ropes’ (Double agent ending )",
        "You enter the Rare Minerals exhibit and find yourself staring at a block of uraninite for far to long in that moment you realise that you are extremely susceptible to radiation poisoning and stumble run out of the museum to the nearest hospital as fast as you can ( I tried so hard and got so far but in the end it didn’t even matter ending)",
        "You take a left thinking that going left has never let you down before, as you are thinking that the vent collapses, dropping you right into the middle of a crowded guards room who instantly arrest you.",
        "You take a right sticking to your pattern you take a right and before you know it you end up in the middle of the diamond room, now you sit directly above the floating case that holds the diamond, you think that (ITEM)  will help you so you decide to use it (R ), otherwise you think you might be able to climb down and open the case that way (L).",    
        "As you ascend the flimsy rope you brought to the diamond you think that you might not reach it. As you think that you reach the top. Relieved, you haul up your rope and attempt to open the case. At that moment an alarm goes off, guards run into the room and turrets descend from the ceiling. You get arrested.",
        "You use the sonic blaster, unbeknownst to you, you had it facing round the wrong way, the guard standing behind you gets evaporated and a large exit hole is created you  could leave now (R ) or you can attempt to open the diamond case another way.",
        "You use the glass cutter extremely effectively, plucking the diamond out of the case and sneaking away through the ventilation shaft. (Henry Stickman Robbery ending )",
        "You clumsy attempt to climb down to the case as you reach the top of the floating case turrets descend from the ceiling and alarms go off. An armada of guards storm into the room and arrest you.",
        "You attempt to open the glass case with the keycard you find on the smouldering guards outfit to your surprise it opens. At that moment a patrol of 4 guards enter the room but don’t see you yet to your right is a big hole you’ve created and to your left is the room with the manhole from which you emerged.",
        "You decide to leave knowing that you were responsible for the murder of an innocent man you flee into the night never to be seen again (Audiological assassin ending)",
        "As you sprint towards the large hole in the wall that you’ve created the guards spot you. One pulls out his weapon and shoots you three times in the legs, you fall clutching your legs and are promptly arrested.",
        "You Sprint toward the sewer grate that you luckily forgot to close. close the grate above you and run like the wind, diamond under your arm.  (Slimy sewer stealer ending)."
    };
    int [] itemID = {0,0,0,0,1,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    String [] view={};
    boolean [] endings  = {false,false,false,false,false,false}; 
    
    
    {
        String input = ""; 
        boolean validInput = false;// to check if the input is valid
        boolean gameStart = false;
        boolean gameRunning = true;
        if(input.equals("")){
                System.out.println("Controls are L, R, B or Back and Reset. Type 0 to start your adventure");
                }
        while(gameRunning){
                String input2 = sc.next(); 
                input2 = input2.toUpperCase(); 
                boolean end = false; 
                if (end == true){
                    input = "";
                    System.out.println("You have finished the adventure and have been reset. Press 0 to start again or type 'stop' to close the game");
                    gameStart = false; 
                }
                if (input2.equals("0")&& gameStart == false&& input.equals("")){
                gameStart = true;
                input = input+input2;
                validInput = true;
                if(!input2.equals("0")){
                System.out.println("please enter 0");
                }
                }else if(input2.equals("BACK")||input2.equals("B")&& gameStart == true){
                if(input.length()>1){
                    input = input.substring(0 , input.length() - 1);
                }
                validInput = true; 
                }else if(input2.equals("L") && gameStart == true|| input2.equals("R") && gameStart == true){
                input  = input+input2;      
                validInput = true; 
                }else if(input2.equals("STOP")){
                System.out.println("Thanks for playing");
                gameRunning = false; 
                }else if (input2.equals("RESET") && gameStart == true){ 
                    validInput = true; 
                    input = "";
                    System.out.println("You have reset, press 0 to start");
                    gameStart = false; 
                }
                else{
                if (gameStart == true){System.out.println("Overcome with the weight of this decision you decide to see if harry potter has any more train stations \n hidden around here and run headfirst into a wall. You wake up in the prison infirmary"); 
                gameStart = false;}
                else if(gameStart == false){
                 System.out.println("this is not a valid input");  
                }
                }
                
                if(validInput){
                for(int i = 0; i<rooms.length; i++){
                    if(rooms[i].equals(input)){
                        System.out.println(roomData[i]);
                }}
                if(input.equals("0RRRRLL")|| input.equals("0RRRRR")|| input.equals("0LLRRL")||input.equals("0LLLR")||input.equals("0LLLL")||input.equals("LLR")){
                    end = true; 
            
                }
                }
            }                    
    }}

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
public void endings(boolean [] endings)
    {
        for(int i = 0; i<endings.length-1; i++){
            if(endings[i] = false){
            endings[i] = true; }
        }}
public boolean endings2(boolean [] endings){
    for(int j=0; j<endings.length;j++){
            if(!endings[j]) return false;  
                } 
            return true; 
        }
    }
    

