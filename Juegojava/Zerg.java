import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Zerg extends Actor
{
    int hp =10;
    int daño =10;
    Actor enemy;
    Zerg zerg;
    
    
    public void act() 
    { 
        Actor enemigo;
        enemigo=getOneObjectAtOffset(0,0,Terran.class);
        if(enemigo!=null){
            hp=hp-daño;
            if(hp<=0){
            }
        }
        
     
       
    } 
    //Daño;
    public int damage(int daño){
        this.daño=daño;
     
        return this.daño;
    }
    //vida
    public int vida(int hp){
        if(hp<=0){
            
        }
        this.hp=hp;
        return this.hp;
    }
    
    public void luchar(int hp, int daño){
        this.hp=hp-daño;
        
    }    
        
        
    
}

