import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class depositoZerg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class depositoZerg extends Actor
{
    int energiaDep;
     public depositoZerg(){
    getImage().scale(getImage().getWidth()/5, getImage().getHeight()/5);
    }
    public void act() 
    {
       curarZerg();
       almacenarEner();
    }    
     public boolean tocarConst(){
    if(isTouching(ConstructorZerg.class)){
        return true;
    }
    return false;
    }
    public boolean tocarGuerr(){
    if(isTouching(GuerreroZerg.class)||isTouching(MedicoZerg.class)){
        return true;
    }
    return false;
    }
    public boolean tocarMed(){
    if(isTouching(MedicoZerg.class)){
    return true;    
    }
    return false;
    }
     public void almacenarEner(){
    World myWorld = getWorld();
        MyWorld rename = (MyWorld)myWorld;
        HealthBar healthBarProtoss = rename.getHealthBar();
        ConstructorZerg constZerg= rename.getConstructorZerg();
      if(tocarConst()==true){
        if(constZerg.extraccion!=0){
       energiaDep=energiaDep+50;
       constZerg.extraccion-=30;
    }
    if(constZerg.extraccionGas!=0){
    energiaDep=energiaDep+10;
    constZerg.extraccionGas-=50;
    
    }
    }
}
    public void curarZerg(){
     World myWorld = getWorld();
        MyWorld rename = (MyWorld)myWorld;
        HealthBarZE healthBarZerg = rename.getHealthBar2();
        ConstructorZerg constZerg= rename.getConstructorZerg();
        depositoZerg depZerg = rename.getdepositoZerg();

     if(energiaDep!=0){
         if(energiaDep>=10 && tocarGuerr()==true && healthBarZerg.health2Guer<140){
            healthBarZerg.health2Guer=healthBarZerg.health2Guer+10;
                energiaDep=energiaDep-10;
         
            }
         if(energiaDep>=20 && tocarGuerr()==true && healthBarZerg.health2Guer<140){
                healthBarZerg.health2Guer=healthBarZerg.health2Guer+20;
                energiaDep=energiaDep-20;
                
            }
         if(energiaDep>=20 && tocarConst()==true && healthBarZerg.health2Const<140){
                healthBarZerg.health2Const=healthBarZerg.health2Const+20;
                energiaDep=energiaDep-20;
                    
        }
        if(energiaDep>=10 && tocarConst()==true && healthBarZerg.health2Const<140){
                healthBarZerg.health2Const=healthBarZerg.health2Const+10;
                energiaDep=energiaDep-10;
                    
        }
    }
}
}