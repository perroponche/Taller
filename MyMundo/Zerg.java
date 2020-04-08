package MyMundo;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zerg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zerg extends Actor
{
    
    public Zerg(){
    
        setRotation(180);
    }
    
    public Zerg(int direction2){
    
        setRotation(direction2);
    }
    
    public void act() 
    {
        move(3);
        if(isAtEdge()){
            turn(153);
        }
    } 
    public boolean isAtEdge(){
    
        if(getX() < 10 || getX() > getWorld().getWidth()-10){
        return true;
    }
        if(getY()<10 || getY() > getWorld().getHeight()-10){
        return true;
    }
        else{
        return false;
        }
    
    }    
}
