import greenfoot.*;  

public class Button extends Actor
{
    public boolean mouseOver = false;
    public static int MAX_TRANS= 255;
    
    public void checkMouse()
    {
        if(Greenfoot.mouseMoved(null))
        {
                mouseOver = Greenfoot.mouseMoved(this);
        }
        
        //Efecto hover en el boton
        if(mouseOver)
        {
            adjTrans(MAX_TRANS/2);
        }
        else
        {
            adjTrans(MAX_TRANS);
        }
        
    } 
    
    //Click del mouse 
    public void checkClick(World world)
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new MyWorld());
        }
    }
        //Transparencia del boton
    public void adjTrans(int adjust)
    {
        GreenfootImage tempImage = getImage();
        tempImage.setTransparency(adjust);
        setImage(tempImage);
    }
    
}
