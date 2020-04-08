import greenfoot.*;// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
// (Trabajar los colores de la barra)

/**
 * Write a description of class HealtBar here.
 ** @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBarZE extends Actor
{
    int health2Guer=100,health2Const=100,health2Med=120;
    int health2 = ((health2Guer+health2Const+health2Med)/3);
        int healthBarWidth = 106;
        int healthBarHeight = 15;
        int pixelsPerHealthPoint = (int)healthBarWidth/((health2Guer+health2Const+health2Med)/3);
    public HealthBarZE(){
        setImage(new GreenfootImage(healthBarWidth + 2, healthBarHeight + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.BLACK);
        myImage.drawRect(0, 0, healthBarWidth + 1, healthBarHeight + 1);
        myImage.setColor(Color.RED);
        myImage.fillRect(1, 1,((health2Guer+health2Const+health2Med)/3)*pixelsPerHealthPoint, healthBarHeight);
    }
    public void act() 
    {
        //Add your action code here. Barra de vida del protoss
        update();
    }    
    public void update()
    {
        setImage(new GreenfootImage(healthBarWidth + 2, healthBarHeight + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.BLACK);
        myImage.drawRect(0, 0, healthBarWidth + 1, healthBarHeight + 1);
        myImage.setColor(Color.RED);
        myImage.fillRect(1, 1,((health2Guer+health2Const+health2Med)/3)*pixelsPerHealthPoint, healthBarHeight);
    }
    public void loseHealthZE()
    {
        health2Guer =health2Guer-10;
    }
    public void loseHealthZEConst(){
    health2Guer =health2Guer-2;
    }
    public void loseHealthGuerreroaConst()
    {
        health2Const =health2Const-10;
    }
    public void loseHealthConstaConst(){
    health2Const =health2Const-2;
    }public void loseHealthGuerreroaMed()
    {
        health2Med =health2Med-10;
    }
    public void loseHealthConstaMed(){
    health2Med =health2Med-2;
    }
    public void curarConst(){
    health2Const=health2Const+15;
    health2Med=health2Med-20;
    }
    public void curarGuerr(){
    health2Guer=health2Guer+15;
    health2Med=health2Med-20;
    }
    public boolean muerteGuer(){
    if(health2Guer<=0){
        return true;
    }
    return false;
    }
    public boolean muerteConst(){
    if(health2Const<=0){
        return true;
    }
    return false;
    }
    public boolean muerteMed(){
    if(health2Med<=0){
        return true;
    }
    return false;
    }
}

