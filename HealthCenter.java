import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthCenter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthCenter extends Actor
{
    
    public HealthCenter(){
    getImage().scale(getImage().getWidth()/6, getImage().getHeight()/6);
    }
    public void act() 
    {
       curacionMedicos();
    }    
    public boolean tocarMedProtoss(){
    if(isTouching(MedicoProtoss.class)){
     return true;
    }
    return false;
}
   
    public boolean tocarMedZerg(){
    if(isTouching(MedicoZerg.class)){
    return true;
    }
    return false;
    }
    
    public void curacionMedicos(){
        World myWorld = getWorld();
        MyWorld rename = (MyWorld)myWorld;
        MedicoProtoss medicoProtoss= rename.getMedicoProtoss();
        
        MedicoZerg medicoZerg= rename.getMedicoZerg();
        HealthBar healthBarProtoss = rename.getHealthBar();
        
        HealthBarZE healthBarZerg = rename.getHealthBar2();
        
        int celdasTotal=medicoProtoss.celda+medicoZerg.celda;
        if(celdasTotal<=20){
            if(tocarMedProtoss()==true && healthBarProtoss.healthMed<160){
            medicoProtoss.celda++;
            healthBarProtoss.healthMed=healthBarProtoss.healthMed+20;
            
            }
        
        if(tocarMedZerg()==true && healthBarZerg.health2Med<160){
            medicoZerg.celda++;
            healthBarZerg.health2Med=healthBarZerg.health2Med+20;
           }
        
        }
    }
}
