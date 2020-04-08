import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class contador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class contador extends Actor
{
    int time;
    
   
    public void pararTiempo(){
       World myWorld = getWorld();
        MyWorld rename = (MyWorld)myWorld;
        HealthBar healthBarProtoss = rename.getHealthBar();
        
        HealthBarZE healthBarZerg = rename.getHealthBar2();
      
       int vidaProt=healthBarProtoss.healthGuer+healthBarProtoss.healthMed+healthBarProtoss.healthConst;
       int vidaZerg=healthBarZerg.health2Guer+healthBarZerg.health2Med+healthBarZerg.health2Const;
        
        if(time==1800){
               GameOver gameOver = new GameOver();
            myWorld.addObject(gameOver, myWorld.getWidth()/2,myWorld.getHeight()/2);
         
            Greenfoot.stop();
            if(vidaProt > vidaZerg){
                
                GanadorProtos ganaProtos = new GanadorProtos();
               myWorld.addObject(ganaProtos, myWorld.getWidth()/2, myWorld.getHeight()/4);
            }
            else{
                
              GanaZerg ganaZerg = new GanaZerg();
              myWorld.addObject(ganaZerg, myWorld.getWidth()/2, myWorld.getHeight()/4);
            }
            
            
        }
        if(vidaProt<=0 ){
               GameOver gameOver = new GameOver();
            myWorld.addObject(gameOver, myWorld.getWidth()/2,myWorld.getHeight()/2);
         Greenfoot.stop();
          GanaZerg ganaZerg = new GanaZerg();
              myWorld.addObject(ganaZerg, myWorld.getWidth()/2, myWorld.getHeight()/4);
            
        }
        if(vidaZerg<=0){
               GameOver gameOver = new GameOver();
            myWorld.addObject(gameOver, myWorld.getWidth()/2,myWorld.getHeight()/2);
         Greenfoot.stop();
         GanadorProtos ganaProtos = new GanadorProtos();
               myWorld.addObject(ganaProtos, myWorld.getWidth()/2, myWorld.getHeight()/4);
            
        }
        
    }

    public contador(){
       
     setImage(new GreenfootImage("Tiempo: "+time/30,30,Color.RED, Color.BLACK));
     
    } 
    public void act() 
    {
       time++;
       pararTiempo();
     setImage(new GreenfootImage("Tiempo: "+time/30,30,Color.RED, Color.BLACK));
    } 
}
