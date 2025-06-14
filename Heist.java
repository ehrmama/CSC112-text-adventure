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
        "You descend deep into the shaft but then your rope runs out and you fall 50 meters to your death. \n Type 'B' to go back a step or type 'Reset' to restart",
        "You nimbly crawl into the small crawl space coming out at a ladder that takes you into a \n  maintenance closet, to your left you see a backup generator humming loudly, to your right you \n see a light creeping in from a door that leads to the diamond room.", 
        "You walk up to the still humming generator and attempt to sabotage it, but while doing so \n  you manage to electrocute yourself, you body zapping to the point where the sleeping janitor  \n next to you wakes up and sees your skeleton, then you drop to the floor, dead as a \n dormouse, your corpse still sparking. \n Type 'B' to go back a step or type 'Reset' to restart",
        "You sneak into the hallway and to your luck no guards are around and find yourself \n standing underneath a huge glass box suspended in the air holding the precious diamond, \n since you don't seem to have an item to help you your only option is to see if you can scale up to the diamond and \n climb into the box.",
        "You walk down the long winding corridor coming to an end at two doors. The one on the \n left is labeled ‘Staff only’ and the one on the right is labeled Rare minerals exhibit.",
        "You slide into the ventilation shaft, snug as can be, you crawl along it until it reaches a \n fork, you think your odds are around 50/50 that you’ll end up in the diamond room.", 
        "You start your trek down the hallway but end up getting extremely lost until you reach an \n unlabeled room, thinking to yourself that this surely has to be something you enter, as you \n walk into the room you accidentally bump something, but in the dark you don’t think too much \n of it. That moment a large T-Rex skeleton starts falling straight towards you, its head coming \n down to trap you. Immediately two guards run into the room being alerted by the noise and \n arrest you. \n Type 'B' to go back a step or type 'Reset' to restart",
        "You Stare for a long time at the ventilation shaft contemplating, but in the end you decide \n to just steal the sleeping entrance guards wallet and call it a day. ( Petty theft ending )", 
        "You walk into the room labeled staff only, in it you find a guards uniform that you decide to \n put on, as you finish putting on the uniform another guard walks into the room and says \n‘you must be the new guy let me show you the ropes’ (Double agent ending )",
        "You enter the Rare Minerals exhibit and find yourself staring at a block of uraninite for far to \n long in that moment you realise that you are extremely susceptible to radiation poisoning \n and stumble run out of the museum to the nearest hospital as fast as you can ( I tried so hard and got so far but in the end it didn’t even matter ending)",
        "You take a left thinking that going left has never let you down before, as you are thinking that \n the vent collapses, dropping you right into the middle of a crowded guards room who \n instantly arrest you. \n Type 'B' to go back a step or type 'Reset' to restart",
        "You take a right sticking to your pattern you take a right and before you know it you end up in \n the middle of the diamond room, now you sit directly above the floating case that holds \n the diamond since you don't have an item that will help you otherwise you think you might be able to climb down and open the case that way (L).",    
        "As you ascend the flimsy rope you brought to the diamond you think that you might not reach it. \n As you think that you reach the top. Relieved, you haul up your rope and attempt to open \n the case. At that moment an alarm goes off, guards run into the room and turrets descend from the ceiling. You get arrested. \n Type 'B' to go back a step or type 'Reset' to restart",
        "You use the sonic blaster, unbeknownst to you, you had it facing round the wrong way, the guard \n standing behind you gets evaporated and a large exit hole is created you  could leave \n now (R ) or you can attempt to open the diamond case another way.",
        "You use the glass cutter extremely effectively, plucking the diamond out of the case and sneaking \n away through the ventilation shaft. (Henry Stickman Robbery ending )",
        "You clumsy attempt to climb down to the case as you reach the top of the floating case turrets \n descend from the ceiling and alarms go off. An armada of guards storm into the room \n and arrest you. \n Type 'B' to go back a step or type 'Reset' to restart",
        "You attempt to open the glass case with the keycard you find on the smouldering guards outfit to \n your surprise it opens. At that moment a patrol of 4 guards enter the room but \n don’t see you yet to your right is a big hole you’ve created and to your left is the room with the manhole from which you emerged.",
        "You decide to leave knowing that you were responsible for the murder of an innocent man you flee \n into the night never to be seen again (Audiological assassin ending)",
        "As you sprint towards the large hole in the wall that you’ve created the guards spot you. One pulls \n out his weapon and shoots you three times in the legs, you fall clutching your \n legs and are promptly arrested. \n Type 'B' to go back a step or type 'Reset' to restart",
        "You Sprint toward the sewer grate that you luckily forgot to close. close the grate above you and \n run like the wind, diamond under your arm.  (Slimy sewer stealer ending)."
    };
    String[] view =  {"0", "0R", "0L","0RR", "0LL", "0LR", "0RRR", "0LLL", "0RRRR","0RRRRL"};
    String [] viewID={"You see a nice ornate building towering in front of you. To your left you see a very \n grandiose entrance with pillars and everything, to your right you see a very dirty \n looking sewer \n entrance that you can smell from where you're standing."
    ,"You are standing in a very dirty and smelly sewer. to your left you see an incredibly deep shaft for \n transferring waste water from the surface sewer to a deeper part of the sewer you can’t \n even make out the bottom, to your right is a very small shaft maybe a little wider \n than your torso looking ahead there is a huge river of waste that is wide enough you are sure you cannot \n  cross it without getting caught in the current. "
    , "Now that you’re a little closer to the entrance you see 2 guards standing at the entrance not really \n  paying attention through the door you see a security counter with a slumbering guard in \n the chair. "
    , "The room buzzes with the sound of a generator. To your left, the machine hums loudly. To your \n right, light leaks from a heavy door to the diamond room. Resting on a nearby shelf is a sleek, \n glowing weapon — a sonic blaster."
    ,"The guard sitting behind the front desk is still asleep and nobody seems to suspect you due \n  to your boldness, to your left is a hallway , to your right a broken ventilation shaft sits. "
    , "You’re hidden under a cluttered desk. Papers, keys, and an empty coffee cup litter the \n surface. To the left is a hallway; to the right, a broken vent beckons."
    , "You stand under a huge floating ornate glass cabinet that holds the huge diamond \n  you've been looking for, above it you see a mess of cables holding it up."
    ,"You see two doors in front of you one is labeled rare minerals exhibit whereas the other \n is labeled ‘Staff Only’. You notice to your left is a shiny tool sitting on the ground that you might \n be able to use." 
    ,"There is now  a huge smoldering exit hole with some red mist floating around."
    ,"There's a huge hole and a door. You don’t see much since adrenalin."};
    String [] endingsID = {"0RRRRLL","0RRRRR","0LLRRL","0LLLR","0LLLL","0LRR"};
    boolean [] endings  = {false,false,false,false,false,false}; 
    System.out.println("Controls are L, R, B or Back, V or View, G or Grab and Reset. Type 0 to start your adventure");
        boolean validInput = false;// to check if the input is valid
        boolean gameStart = false;
        boolean gameRunning = true;
        boolean hasCutter = false; 
        boolean hasBlaster = false; 
        boolean look = false; 
        boolean foundView = false;
        String input = "";
    while(gameRunning){
        String input2 = sc.next(); 
        input2 = input2.toUpperCase(); 
        boolean end = false;
        if(input2.equals("STOP")){
        System.out.println("Thanks for playing");
        gameRunning = false;
        break;}  
        if(!gameStart){
        if (input2.equals("0")&& !gameStart){
        input = input+input2;
        validInput = true;
        gameStart = true; 
        System.out.println(roomData[0]);
        continue;    
        }else{
        System.out.println("This is not a valid input, please enter 0 to start the game");
        continue;
        }}
        /*if(!gameStart){
            System.out.println("Please enter 0 to start the game");
        }*/
        if (input2.equals("RESET") && gameStart == true){ 
            validInput = true; 
            input = "";
            System.out.println("You have reset, press 0 to start");
            gameStart = false; 
            }  
    if(input2.equals("VIEW")||input2.equals("V")){
        validInput = true;  
        for(int y  = 0; y < view.length; y++){
          if(input.equals(view[y])){
            System.out.println(viewID[y] + "\n" );
            foundView = true; 
            look = true; 
            }
        }
    } else if ((input2.equals("VIEW")||input2.equals("V")) && foundView == false){
        System.out.println("You can't see anything");
    } 
    if(input2.equals("GRAB")||input2.equals("G")){
            if(!look){
        System.out.println("You haven't looked around");}
    else{
        if(input.equals("0LLL")){
            hasCutter = true;
                System.out.println("You have obtained the glass cutter");
                roomData[16] = "You take a right sticking to your pattern you take a right and before you know it you end up in the middle of the diamond room, now you sit directly above the floating case that holds the diamond, you think that the glass cutter you found will help you so you decide to use it (L), otherwise you think you might be able to climb down and open the case that way (R).";   
                validInput = true; }
        else if(input.equals("0RR")){
                hasBlaster = true; 
                System.out.println("You have obtained the sonic blaster");
                roomData[8] = "You sneak into the hallway and to your luck no guards are around and find yourself \n standing underneath a huge glass box suspended in the air holding the precious diamond, now \n you have two options, Use item the sonic blaster to blast open the case or see if you can scale up to the diamond and \n climb into the box.";
                validInput = true; 
        } else {
        System.out.println("There's nothing to grab here"); 
        }
    }}
    if((input2.equals("BACK")||input2.equals("B"))&& gameStart == true){
            if(input.length()>1){
            input = input.substring(0 , input.length() - 1);
            validInput = true; }else{
            System.out.println("You can't go back any further");
            }
            validInput = true; 
    }
    if(input.equals("0RRR") && !hasBlaster && input2.equals("R")){
        validInput = false; 
        System.out.println("What on earth are you doing");
        continue; 
        }else if(input.equals("0LLRR")&& !hasCutter && input.equals("R")){
        validInput = false; 
        System.out.println("You have no item that will help you");
        continue; 
        }
        else if(gameStart&& (input2.equals("R")||input2.equals("L"))){
            look = false; 
            input  = input+input2;      
            validInput = true; 
            } 
    if(validInput){
        boolean inRoom = false; 
        for(int i = 0; i<rooms.length; i++){
                if(rooms[i].equals(input)){
                    System.out.println(roomData[i] + "\n");
                    inRoom = true;
                    break; 
                }
            }
        if(!inRoom && !gameRunning){
            System.out.println("You don't quite know where you are");
            }} 
    for(int j = 0; j<endings.length; j++){
        if(endingsID[j].equals(input)){
                endings[j] = true; 
                end = true;
                }
            }
    if (end){
        input = "";
        System.out.println("You have finished the adventure and have been reset. Press 0 to start again or type 'stop' to close the game");
        gameStart = false; 
                }
    if(endings2(endings)){
        System.out.println("Congratulations, you are the master thief");
        for(int x = 0; x<endings.length; x++){
            endings[x] = false; 
                    }
                } 
            }   
        }
            
                                
        
    /**
     * This method checks if all endings have been triggered 
     *
     * @param  y  a sample parameter for a method
     * @return    true or false 
     */
    public boolean endings2(boolean [] endings){
    for(int j=0; j<endings.length;j++){
            if(!endings[j]) return false;  
                } 
            return true; 
        }
    }
    

