import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ConstructorZerg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConstructorZerg extends Zerg
{
    int extraccion;
    int extraccionGas;
    public ConstructorZerg(){
    getImage().scale(getImage().getWidth()/11, getImage().getHeight()/8);
   
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
    isTouching(MedicoZerg.class)){
        
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
       
    }
    public boolean tocarMina(){
    if(isTouching(mina.class)){
    return true;
    }
    return false;
    }
    public boolean tocarDeposito(){
    if(isTouching(depositoZerg.class)){
    return true;
    }
    return false;
    }
    public boolean golpearEnemigo(){
        //prueba
        World myWorld = getWorld();
        MyWorld prm = (MyWorld)myWorld;
        HealthBarZE healthBarZE = prm.getHealthBar2();
    if(isTouching(GuerreroProtoss.class )){
       
         healthBarZE.loseHealthGuerreroaConst();//prueba
         return true;
        }
        if(isTouching(ConstructorProtoss.class)){
        healthBarZE.loseHealthConstaConst();
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
    if(isTouching(mina.class)||isTouching(yacimiento.class)){
    turn(180);
    }
    } 
     public void extraccion(){
    World myWorld = getWorld();
        MyWorld rename = (MyWorld)myWorld;
       
        depositoZerg depZerg = rename.getdepositoZerg();
    if(tocarMina()==true){
        
        extraccion++;
       
    }
       if(tocarDeposito()==true){
        if(extraccion!=0){
       depZerg.energiaDep=depZerg.energiaDep+25;
       extraccion--;
       
    }
    }
    }
    public void kill(){
        World myWorld = getWorld();
        MyWorld prm = (MyWorld)myWorld;
        HealthBarZE healthBarZE = prm.getHealthBar2();
    if (healthBarZE.muerteConst()==true){
        getWorld().removeObject(this);
    }
    }
}
