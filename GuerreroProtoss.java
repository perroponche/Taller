import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GuerreroProtoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GuerreroProtoss extends Protoss
{
    public GuerreroProtoss(){
    
        getImage().scale(getImage().getWidth()/8, getImage().getHeight()/8);
    }
    public void act() 
    {
        move(5);
        isAtEdge(); 
        reboteObst();
        reboteEnemigo();
         kill();
       movimientoControl();
    
    } 
     public void movimientoControl(){
    if(Greenfoot.isKeyDown("P")){
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
    if(isTouching(obstaculoArbol.class)||isTouching(depositoProtross.class)||
    isTouching(depositoZerg.class)||
    isTouching(MedicoProtoss.class)||isTouching(mina.class)||
    isTouching(HealthCenter.class)||isTouching(yacimiento.class)){
        
        return true;
    }
    else{
            return false;
        }
}

    public void reboteObst(){
    if(golpearObst() == true){
            turn(Greenfoot.getRandomNumber(50));
        }
        else{
        }
    }
    public boolean golpearEnemigo(){

      //prueba
        World myWorld = getWorld();
        MyWorld rename = (MyWorld)myWorld;
        HealthBar healthBarProtoss = rename.getHealthBar();
       
    if(isTouching(GuerreroZerg.class)){
        
        healthBarProtoss.loseHealthProtossGuerrero();//prueba
        return true;
    }
    if(isTouching(ConstructorZerg.class)){
        
        healthBarProtoss.loseHealthConst();

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
        MyWorld rename = (MyWorld)myWorld;
        HealthBar healthBarProtoss = rename.getHealthBar();
    if (healthBarProtoss.muerteGuerrero()==true){
        getWorld().removeObject(this);
    }
    }
}
