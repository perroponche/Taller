import greenfoot.*;

// HealthBar para los Protoss, en el healthCenter se hace un renombramiento, care
public class HealthBar extends Actor
{       
    
        int healthConst=100,healthGuer=100, healthMed=120;
        int health = ((healthConst+healthGuer+healthMed)/3);
        int healthBarWidth = 106;
        int healthBarHeight = 15;
        int pixelsPerHealthPoint = (int)healthBarWidth/((healthConst+healthGuer+healthMed)/3);
        
    public HealthBar(){
        
        setImage(new GreenfootImage(healthBarWidth + 2, healthBarHeight + 2));
        //Objeto myImage, instanciamos las caracteristicas
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.BLACK); //Bordes
        myImage.drawRect(0, 0, healthBarWidth + 1, healthBarHeight + 1); //Dimensiones 
        myImage.setColor(Color.RED); //background 
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
        //Llenado del rectangulo
        myImage.fillRect(1, 1, ((healthConst+healthGuer+healthMed)/3)*pixelsPerHealthPoint, healthBarHeight);
    }
    // Metodos para perder vida
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
    
    //Metodos de los medicos para curar
    public void curarConst(){
    healthConst=healthConst+15;
    healthMed=healthMed-20;
    }
    public void curarGuerr(){
    healthGuer=healthGuer+15;
    healthMed=healthMed-20;
    }
    
    //Metodos para las muertes
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
