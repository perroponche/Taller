import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MedicoZerg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MedicoZerg extends Zerg
{
    int celda;
    public MedicoZerg(){
    getImage().scale(getImage().getWidth()/3, getImage().getHeight()/3);
   
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
   isTouching(depositoProtross.class)||
    isTouching(MedicoProtoss.class)
    ||isTouching(mina.class)||isTouching(HealthCenter.class)||
    isTouching(yacimiento.class)){
        
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
        healthBarZE.loseHealthGuerreroaMed();//prueba
        return true;
        }
        if(isTouching(ConstructorProtoss.class)){
        healthBarZE.loseHealthConstaMed();
        return true;
        }
     else{
         return false;
        }
    
      
}
     
    public boolean curacion(){
    World myWorld = getWorld();
        MyWorld rename = (MyWorld)myWorld;
        HealthBarZE healthBarZerg = rename.getHealthBar2();
    if(isTouching(GuerreroZerg.class)){
       
        if(healthBarZerg.health2Guer<140 && healthBarZerg.health2Med>20){
            
        healthBarZerg.health2Guer=healthBarZerg.health2Guer+25;
        healthBarZerg.health2Med=healthBarZerg.health2Med-20;
        
    }return true;
}
    if(isTouching(ConstructorZerg.class)){
       if(healthBarZerg.health2Const<140 && healthBarZerg.health2Med>20){
        healthBarZerg.curarConst();
    }
return true;
}
return false;
}
public void reboteEnemigo(){
    if(golpearEnemigo() == true || curacion()==true){
    turn(Greenfoot.getRandomNumber(50));
    }
    
    }
    public void kill(){
        World myWorld = getWorld();
        MyWorld prm = (MyWorld)myWorld;
        HealthBarZE healthBarZE = prm.getHealthBar2();
    if (healthBarZE.muerteMed()==true){
        getWorld().removeObject(this);
    }
    }    
}

