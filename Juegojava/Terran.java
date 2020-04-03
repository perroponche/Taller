
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Terran extends Actor
{   int hp=100;
    int daño=10;
    Actor enemy ;
    public void act() 
    {   
        // movimiento
        int i;
        int iteraciones=50; //Numero de iteraciones o jugadas en el juego
        
        for(i=1; i<=iteraciones; i++){
            move(1);
            if( Greenfoot.getRandomNumber(100)>10){
            turn(Greenfoot.getRandomNumber(90-45));
            }
            if(getX()<=5 || getX()>= getWorld().getWidth()-5){
                turn(180);
            }
            if(getY()<=5 || getY()>= getWorld().getHeight()-5){
                turn(180);
            }
            
          
        } 
      //Detector
      //Declarando la distancia entre los objetos y quien es el enemigo
   
        if(enemy!=null){
           
            
            World mundo;
            mundo=getWorld();
            mundo.removeObject(enemy);
        }
    }  
    
    
    public void hp(int hp,int daño,Actor enemy){
       this.hp=hp;
       this.daño=daño;
       enemy= getOneObjectAtOffset(0,0,Zerg.class);
        if(enemy!=null){
           if(this.hp<=0){
            
            
            World mundo;
            mundo=getWorld();
            mundo.removeObject(enemy);
            }
             if(this.hp>0){
             this.hp=this.hp-this.daño;
            
           }    
            
         } 
        
        }
       
   
    }  
    
   

   
    

