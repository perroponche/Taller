import greenfoot.*;


public class HealthBar extends Actor
{       
    
        int healthConst=100,healthGuer=100, healthMed=120;
        int health = ((healthConst+healthGuer+healthMed)/3);
        int healthBarWidth = 106;
        int healthBarHeight = 15;
        int pixelsPerHealthPoint = (int)healthBarWidth/((healthConst+healthGuer+healthMed)/3);
        
    public HealthBar(){
    
       setImage(new GreenfootImage(healthBarWidth + 2, healthBarHeight + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.BLACK);
        myImage.drawRect(0, 0, healthBarWidth + 1, healthBarHeight + 1);
        myImage.setColor(Color.RED);
        myImage.fillRect(1, 1, ((healthConst+healthGuer+healthMed)/3)*pixelsPerHealthPoint, healthBarHeight);
    }
    public void act() 
    {

        update();
    }    
    public void update()
    {
        
        setImage(new GreenfootImage(healthBarWidth + 2, healthBarHeight + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.BLACK);
        myImage.drawRect(0, 0, healthBarWidth + 1, healthBarHeight + 1);
        myImage.setColor(Color.RED);
        myImage.fillRect(1, 1, ((healthConst+healthGuer+healthMed)/3)*pixelsPerHealthPoint, healthBarHeight);
    }
    
    public void loseHealthProtossGuerrero()
    {
        healthGuer=healthGuer-10;
    }
    public void loseHealthConst(){
        healthGuer=healthGuer-2;
    }
    public void loseHealthGuerreroaCons()
    {
        healthConst=healthConst-10;
    }
    public void loseHealthConstaConst(){
        healthConst=healthGuer-2;
    }
    public void loseHealthGuerreroaMed(){
         healthMed=healthMed-10;
    }
    public void loseHealthConstaMed(){
        healthMed=healthMed-10;  

        healthConst=healthConst-2;

    }
    public void curarConst(){
    healthConst=healthConst+15;
    healthMed=healthMed-20;
    }
    public void curarGuerr(){
    healthGuer=healthGuer+15;
    healthMed=healthMed-20;
    }
    public boolean muerteConst(){
    if(healthConst<=0){
        return true;
    }
    return false;
    }
    public boolean muerteGuerrero(){
    if(healthGuer<=0){
        return true;
    }
    return false;
    }
    public boolean muerteMedico(){
        if(healthMed<=0){
            return true;
    }
    return false;
}
}
