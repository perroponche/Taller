import greenfoot.*;  


public class Titulo extends World
{
 private GreenfootSound soundtrack1= new GreenfootSound("avengers_endgame.mp3");
    
    public Titulo()
    {    
        
        super(1000, 620, 1, false); 
        prepare();
    }
    //Musica de inicio
     public void started(){
        soundtrack1.play();  
     soundtrack1.playLoop(); 
    }public void repetir(){
        soundtrack1.playLoop();  
    
    }
    //Boton del Jugar
    private void prepare()
    {
        Play play = new Play();
        addObject(play,218,189);
        play.setLocation(500,414);
    }
}
