package MyMundo;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 600, 1); 
        
        int direction = Greenfoot.getRandomNumber(360);
        addObject(new Protoss(direction), 300, 200);
        int direction1 = Greenfoot.getRandomNumber(360);
        addObject(new Terran(direction1), 300, 200);
        int direction2 = Greenfoot.getRandomNumber(360);
        addObject(new Zerg(direction2), 300, 200);
    }
}
