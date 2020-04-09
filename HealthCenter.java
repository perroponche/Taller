import greenfoot.*;  

public class HealthCenter extends Actor
{
    //Tamaño del Healthcenter
    public HealthCenter(){
    getImage().scale(getImage().getWidth()/6, getImage().getHeight()/6);
    }
    public void act() 
    {
       curacionMedicos();
    }    
    //Deteccion de los medicos de Protoss y Zerg
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
        //Renombrando Medicos
        MedicoProtoss medicoProtoss= rename.getMedicoProtoss();
        
        MedicoZerg medicoZerg= rename.getMedicoZerg();
        //Renombrando barras de vida
        HealthBar healthBarProtoss = rename.getHealthBar();
        
        HealthBarZE healthBarZerg = rename.getHealthBar2();
        //curacion del healthcenter (20 x 20)
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
