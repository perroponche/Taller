import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Protoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Protoss extends Actor
{
     public Protoss(){
    
        getImage().scale(getImage().getWidth(), getImage().getHeight());
    }
    public void act() 
    {
        move(5);
        isAtEdge(); 
        reboteObst();
        reboteEnemigo();
         kill();
    
    } 
   
    //Movimiento
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
    
    // Detector si se cruza con una clase enemiga
    public boolean golpearObst(){
    if(isTouching(obstaculoArbol.class)||isTouching(depositoProtross.class)
    ||isTouching(depositoZerg.class)){
        
        return true;
    }
    else{
            return false;
        }
}
    //Metodo rebotar
    public void reboteObst(){
    if(golpearObst() == true){
            turn(Greenfoot.getRandomNumber(50));
        }
        else{
        }
    }
    public boolean golpearEnemigo()
    {

      
        World myWorld = getWorld();
        MyWorld rename = (MyWorld)myWorld;
        HealthBar healthBarProtoss = rename.getHealthBar();
        
      if(isTouching(Zerg.class)){
        
        healthBarProtoss.loseHealthProtossGuerrero(); 
        
       return true;
       }
      else{
        
      }    
      return false;
    }
    
    
    public void reboteEnemigo(){
    if(golpearEnemigo() == true){
    turn(Greenfoot.getRandomNumber(50));
    }
    else{
        //Vacio para que no haga nada
    }
    }
    
    
    public void kill(){
          World myWorld = getWorld();
        MyWorld rename = (MyWorld)myWorld;
        //Renombrando la bara de vida de los Protoss
        HealthBar healthBarProtoss = rename.getHealthBar();
     if (healthBarProtoss.muerteGuerrero()==true){
        getWorld().removeObject(this);
     }
    }
}
