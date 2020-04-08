import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class yacimiento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class yacimiento extends Actor
{   //Ajustando el tamaño de la imagen
    public yacimiento(){
    getImage().scale(getImage().getWidth()/9, getImage().getHeight()/9);
    }
    
    public void act() 
    {
    extraccionGas();
   }   
   
   //Determinadores para que una clase pueda extraer gas
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
    
    
    
    public void extraccionGas(){
        World myWorld = getWorld();
        MyWorld rename = (MyWorld)myWorld;
        ConstructorProtoss constProtoss= rename.getConstructorProtoss();
        ConstructorZerg constZerg= rename.getConstructorZerg();
        

    if(tocarConstProt()==true){
       
        constProtoss.extraccionGas+=50;
     
    }
    if(tocarConstZerg()==true){
       
        constZerg.extraccionGas+=50;
    }
    
}
}
