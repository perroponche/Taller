import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MedicoProtoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MedicoProtoss extends Protoss
{  //Tamaño de la imagen
    int celda;
     public MedicoProtoss(){
    
        getImage().scale(getImage().getWidth()/8, getImage().getHeight()/8);
    }
    public void act() 
    {
        move(4);
        isAtEdge(); 
        reboteObst();
        reboteEnemigo();
         kill();
         movimientoControl();
         
    } 
    //Movimiento Controlado
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
    //Rebote en el borde
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
    //Detector de obstaculos
    public boolean golpearObst(){
    if(isTouching(obstaculoArbol.class)||isTouching(depositoProtross.class)||
    isTouching(depositoZerg.class)||
    isTouching(MedicoZerg.class)
    ||isTouching(mina.class)||isTouching(HealthCenter.class)||
    isTouching(yacimiento.class)){
        
        return true;
    }
    else{
            return false;
        }
    }
    //Rebote
    public void reboteObst()
    {
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
        healthBarProtoss.loseHealthGuerreroaMed();//prueba
        return true;
    }
    if(isTouching(ConstructorZerg.class)){
        
        healthBarProtoss.loseHealthConstaMed();
        return true;
    }
     else{
         return false;
        }
    }
    //Deteccion si el medico puede curar
    public boolean curacion(){
    World myWorld = getWorld();
        MyWorld rename = (MyWorld)myWorld;
       HealthBar healthBarProtoss= rename.getHealthBar();
    if(isTouching(GuerreroProtoss.class)){
       
        if(healthBarProtoss.healthGuer<140 && healthBarProtoss.healthMed>20){
        healthBarProtoss.healthGuer= healthBarProtoss.healthGuer+15;
         healthBarProtoss.healthMed= healthBarProtoss.healthMed-20;
    }
    return true;
    }
    if(isTouching(ConstructorProtoss.class)){
       if(healthBarProtoss.healthConst<140 && healthBarProtoss.healthMed>20){
         healthBarProtoss.healthConst= healthBarProtoss.healthConst+15;
         healthBarProtoss.healthMed= healthBarProtoss.healthMed-20;
    }
    return true;
    }
    return false;
    }
    //Rebote en obstaculos (personas)
    public void reboteEnemigo(){
    if(golpearEnemigo() == true||curacion()==true){
    turn(Greenfoot.getRandomNumber(50));
    }
    }
    //Para morir
    public void kill(){
          World myWorld = getWorld();
        MyWorld rename = (MyWorld)myWorld;
        HealthBar healthBarProtoss = rename.getHealthBar();
    if (healthBarProtoss.muerteMedico()==true){
        getWorld().removeObject(this);
    }
    }
    
}
