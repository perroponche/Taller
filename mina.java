import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mina here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mina extends Actor
{
    public mina(){
    getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
    }
    public void act() 
    {
      extraccion();
    }    
    public boolean tocarConstProt(){
    if(isTouching(ConstructorProtoss.class)){
    return true;
    }
    return false;
    }
    public boolean tocarConstZerg(){
    if(isTouching(ConstructorZerg.class)){
    return true;
    }
    return false;
    }
    public boolean tocarConstTerr(){
    if(isTouching(ConstructorZerg.class)){
    return true;
    }
    return false;
    }
    public void extraccion(){
    World myWorld = getWorld();
        MyWorld rename = (MyWorld)myWorld;
       ConstructorProtoss constProtoss= rename.getConstructorProtoss();
       ConstructorZerg constZerg= rename.getConstructorZerg();
      //Extraccion de minas 
  int extraccionTotal=constProtoss.extraccion+constZerg.extraccion;
   if(extraccionTotal<=400){
    if(tocarConstProt()==true){
       
        constProtoss.extraccion+=30;
    }
    if(tocarConstZerg()==true){
       
        constZerg.extraccion+=30;
    }
    

}
   }
    
    
    
     
    
}
