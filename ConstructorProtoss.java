

    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ConstructorProtoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConstructorProtoss extends Protoss
{
    int extraccion=0;
    int extraccionGas=0;
    int energiaDep;

    

     public ConstructorProtoss(){
    
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
    
    //Movimiento controlado 
     public void movimientoControl()
     {
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
    //Cuando llega al borde 
    public boolean isAtEdge()
    {
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
    //Detector cuando se toca con un obstaculo
    public boolean golpearObst()
    {
    if(isTouching(obstaculoArbol.class)||isTouching(depositoProtross.class)||
    isTouching(depositoZerg.class)||
    isTouching(HealthCenter.class)||isTouching(MedicoProtoss.class)){
        
        return true;
    }
    else{
            return false;
        }
        
    }
    //Detector de tocar mina
    public boolean tocaMina()
    {
        if(isTouching(mina.class)){
            return true;
        }
    return false;
    }
    //Detector de tocar deposito
    public boolean tocarDeposito()
    {
    if(isTouching(depositoProtross.class)){
    return true;
    }
    return false;
    }
    
    
    //Rebote
    public void reboteObst(){
    if(golpearObst() == true){
        turn(Greenfoot.getRandomNumber(50));         
    }
    if(isTouching(mina.class)||isTouching(yacimiento.class)){
    turn(180);
    }
            

        
     //Metodos Para realizar daño   
    }
    public boolean golpearEnemigo(){

      //prueba
        World myWorld = getWorld();
        MyWorld rename = (MyWorld)myWorld;
        HealthBar healthBarProtoss = rename.getHealthBar();
        
    if(isTouching(GuerreroZerg.class)){
        
        healthBarProtoss.loseHealthGuerreroaCons();//prueba
        
        return true;
    }
    if(isTouching(ConstructorZerg.class)){
        
        healthBarProtoss.loseHealthConstaConst();
       
        return true;
    }
     else{
         return false;
        }
    }
    //Metodo para rebotar con un enemigo
    public void reboteEnemigo(){
    if(golpearEnemigo() == true){
    turn(Greenfoot.getRandomNumber(50));
    }
    else{
    }
    }
    //Metodo para morir 
    public void kill(){
          World myWorld = getWorld();
        MyWorld rename = (MyWorld)myWorld;
        HealthBar healthBarProtoss = rename.getHealthBar();
    if (healthBarProtoss.muerteConst()==true){
        getWorld().removeObject(this);
    }
    }
}
