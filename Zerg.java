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
    getImage().scale(getImage().getWidth(), getImage().getHeight());
   
    }
    
    public void act() 
    {
        move(5);
        isAtEdge();
        turnObst(); 
        reboteEnemigo();
        kill();
    }   
    
    public boolean isAtEdge(){
    
        if(getX() < 10 || getX() > getWorld().getWidth()-10){
         turn(Greenfoot.getRandomNumber(50));   
        return true;
    }
        if(getY()<10 || getY() > getWorld().getHeight()-10){
        turn(Greenfoot.getRandomNumber(50));
            return true;
    }
        else{
        return false;
        }
    
    }
    public boolean golpearObst(){
    if(isTouching(obstaculoArbol.class)||isTouching(depositoZerg.class)||
    isTouching(depositoProtross.class)){
        
        return true;
    }
    else{
            return false;
        }
}
    public void turnObst(){
    if(golpearObst() == true){
            turn(Greenfoot.getRandomNumber(50));
        }
        else{
        }
    }
    public boolean golpearEnemigo(){
        //prueba
        World myWorld = getWorld();
        MyWorld prm = (MyWorld)myWorld;
        HealthBarZE healthBarZE = prm.getHealthBar2();
    if(isTouching(Protoss.class )){
       
         healthBarZE.loseHealthZE();//prueba
        
    return true;
    }
    else{
        return false;
    }    
}
    public void reboteEnemigo(){
    if(golpearEnemigo() == true){
    turn(Greenfoot.getRandomNumber(50));
    }
    else{
    }
    } 
    public void kill(){
        World myWorld = getWorld();
        MyWorld prm = (MyWorld)myWorld;
        HealthBarZE healthBarZE = prm.getHealthBar2();
    if (healthBarZE.health2==0){
        getWorld().removeObject(this);
    }
    }
}
