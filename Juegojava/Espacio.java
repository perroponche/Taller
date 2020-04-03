import greenfoot.*; 
public class Espacio extends World
{
        //Constructor de espacio Espacio
         public Espacio()
        
         {    
         
           super(16,10,60); //19 colums, 10 rows, 60 px;

         //Creador de personajes
         crearTerran(5);
         crearZerg(5);
        }
         int i;
         int x;
         int y;
         int m;
         //Creador de Terrans
         public void crearTerran(int numero)
         {
             for(i=1; i<=numero; i++)
             { 
                 Terran personaje1 = new Terran();
                 x=Greenfoot.getRandomNumber(getWidth());
                 y=Greenfoot.getRandomNumber(getHeight());
                 addObject(personaje1,x,y);
                 
                }
            }        
         //Creador de Zergs
         public void crearZerg(int numero){
             for(m=1; m<=numero; m++)
             { 
                 Zerg personaje2 = new Zerg();
                 x=Greenfoot.getRandomNumber(getWidth());
                 y=Greenfoot.getRandomNumber(getHeight());
                 addObject(personaje2,x,y);
                 
                }
             
            }
    }
