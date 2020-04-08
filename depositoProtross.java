import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RefugioProtross here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class depositoProtross extends Actor
{
    int energiaDep;
   public depositoProtross(){
    getImage().scale(getImage().getWidth()/5, getImage().getHeight()/5);
    }
    public void act() 
    {
    curarProtoss();
    almacenarEner();
    }    
    
    public boolean tocarConst(){
    if(isTouching(ConstructorProtoss.class)){
    return true;    
    }
    return false;
    }
    public boolean tocarMed(){
    if(isTouching(MedicoProtoss.class)){
    return true;    
    }
    return false;
    }
    public boolean tocarGuerr(){
    if(isTouching(GuerreroProtoss.class)){
        return true;
    }
    return false;
}
    public void almacenarEner(){
    World myWorld = getWorld();
        MyWorld rename = (MyWorld)myWorld;
        HealthBar healthBarProtoss = rename.getHealthBar();
        ConstructorProtoss constProtoss= rename.getConstructorProtoss();
    if(tocarConst()==true){
        if(constProtoss.extraccion!=0){
       energiaDep=energiaDep+50;
       constProtoss.extraccion-=30;
    }
    if(constProtoss.extraccionGas!=0){
    energiaDep=energiaDep+10;
    constProtoss.extraccionGas-=50;
 
    }
    }
}
    public void curarProtoss(){
     World myWorld = getWorld();
        MyWorld rename = (MyWorld)myWorld;
        HealthBar healthBarProtoss = rename.getHealthBar();
        ConstructorProtoss constProtoss= rename.getConstructorProtoss();
        depositoProtross depProtoss = rename.getdepositoProtross();

      if(energiaDep!=0){
         if(energiaDep>=10 && tocarGuerr()==true && healthBarProtoss.healthGuer<140){
            healthBarProtoss.healthGuer=healthBarProtoss.healthGuer+10;
                energiaDep=energiaDep-10;
         
            }
         if(energiaDep>=20 && tocarGuerr()==true && healthBarProtoss.healthGuer<140){
                healthBarProtoss.healthGuer=healthBarProtoss.healthGuer+20;
                energiaDep=energiaDep-20;
                
            }
         if(energiaDep>=20 && tocarConst()==true && healthBarProtoss.healthConst<140){
                healthBarProtoss.healthConst=healthBarProtoss.healthConst+20;
                energiaDep=energiaDep-20;
                    
        }
        if(energiaDep>=10 && tocarConst()==true && healthBarProtoss.healthConst<140){
                healthBarProtoss.healthConst=healthBarProtoss.healthConst+10;
                energiaDep=energiaDep-10;
                    
        }
    }
}
}