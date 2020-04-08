import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends Button
{
    public Play()
    {
        GreenfootImage playButton = new GreenfootImage(170,80);
        Font adjustedFont = new Font(true,false,50);
        playButton.setFont(adjustedFont);
        playButton.setColor(Color.BLACK);
        playButton.drawString("Jugar",0,50);
        setImage(playButton);
    }
    
    //Clickeo del playbutton
    public void act() 
    {
        checkMouse();
        checkClick(new MyWorld());
        
    }    
}
