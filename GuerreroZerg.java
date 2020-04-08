import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GuerreroZerg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GuerreroZerg extends Zerg
{
    
    public GuerreroZerg(){
    getImage().scale(getImage().getWidth()/4, getImage().getHeight()/4);
   
    }
    
    public void act() 
    {
        move(5);
        isAtEdge();
        turnObst(); 
        reboteEnemigo();
        kill();
        movimientoControl();
    }   
    public void movimientoControl(){
    if(Greenfoot.isKeyDown("Z")){
       if(Greenfoot.isKeyDown("Right")){
        turn(20);   
        }
        if(Greenfoot.isKeyDown("Left")){
        turn(-20);    
        }
        if(Greenfoot.isKeyDown("Down")){
        setLocation(getX(), getY()+15);
        }
        if(Greenfoot.isKeyDown("Up")){
        setLocation(getX(), getY()-15);
        }
    }
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
    isTouching(depositoProtross.class)
    ||isTouching(mina.class)||isTouching(HealthCenter.class)||
    isTouching(yacimiento.class)||isTouching(MedicoZerg.class)){
        
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
    if(isTouching(GuerreroProtoss.class )){
        healthBarZE.loseHealthZE();//prueba
        return true;
        }
        if(isTouching(ConstructorProtoss.class)){
        healthBarZE.loseHealthZEConst();
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
    if (healthBarZE.muerteGuer()==true){
        getWorld().removeObject(this);
    }
    }
     
}
