
import greenfoot.*;  


public class MyWorld extends World
{
    //Musica 
private GreenfootSound soundtrack= new GreenfootSound("war.mp3");
    //Barras de Vida 
    
    //Objeto barra de vida protoss
    HealthBar healthBarProtoss = new HealthBar(); 
    //Objeto barra de vida Terran
    
    //Objeto barra de vida Zerg
    HealthBarZE healthBarZE = new HealthBarZE();
    
    //Objetos de las clases de personajes
    
    //Objeto Constructor protoss
    ConstructorProtoss constProtoss= new ConstructorProtoss();
    
    //Objeto constructor Zerg
    ConstructorZerg constZerg= new ConstructorZerg();
    //Objeto constructor Terran
    
    
    //Depositos 
    
    depositoProtross depProtoss= new depositoProtross();
    
    depositoZerg depZerg= new depositoZerg();
    
    //Mina
    mina mina= new mina();
    
    //Medicos 
    MedicoProtoss medicoProtoss=new MedicoProtoss();
    
    MedicoZerg medicoZerg=new MedicoZerg();
    
    //Contador 
    contador contador= new contador();
     


     Protoss protoss = new Protoss();

    public MyWorld()
    {    
        // Celdas de 1 pixel, 1000 celdas de ancho x 620 de alto.
        super(1000, 620, 1); 

        prepare();
    }
    //Musica de inicio
    public void started(){
        soundtrack.play();  
   
        soundtrack.playLoop();  
    
    
    }
    public void repeat(){
        soundtrack.playLoop();  
    
    }
    
    //Gets 
    public HealthBar getHealthBar()
    {
        return healthBarProtoss;
        
    }
    public contador getContador(){
        return contador;
    }
    public depositoProtross getdepositoProtross(){
    return depProtoss;
    }
     
    public depositoZerg getdepositoZerg(){
    return depZerg;
    }
    public MedicoProtoss getMedicoProtoss(){
    return medicoProtoss;
    }
    
    public MedicoZerg getMedicoZerg(){
    return medicoZerg;
    }
    public mina getMina(){
    return mina;
    }
    public ConstructorProtoss getConstructorProtoss(){
    return constProtoss;
    }
    
    public ConstructorZerg getConstructorZerg(){
    return constZerg;
    }
    
    public HealthBarZE getHealthBar2()
    {
        return healthBarZE;
    }//fin 
    

    public Protoss getProtoss(){
        return protoss;
    }


    //Inicializando los objetos
    private void prepare()
    {
        
        addObject(healthBarProtoss, 480, 15);
        
        addObject(healthBarZE, 950, 20);
        
        arbolGrande arbolGrande = new arbolGrande();
        addObject(arbolGrande,377,160);
        arbolMediano arbolMediano = new arbolMediano();
        addObject(arbolMediano,755,195);
        arbolMediano arbolMediano2 = new arbolMediano();
        addObject(arbolMediano2,144,300);
        arbolGrande.setLocation(413,102);
        arbolGrande.getX();
        arbolGrande.act();
        arbolGrande arbolGrande2 = new arbolGrande();
        addObject(arbolGrande2,915,405);
        arbolMediano arbolMediano3 = new arbolMediano();
        addObject(arbolMediano3,507,422);
        arbolMediano arbolMediano4 = new arbolMediano();
        addObject(arbolMediano4,926,102);
        arbolMediano arbolMediano5 = new arbolMediano();
        addObject(arbolMediano5,165,96);
        arbolGrande.setLocation(448,186);
        Protoss protoss = new Protoss();
        addObject(protoss,Greenfoot.getRandomNumber(1000),Greenfoot.getRandomNumber(500));
        protoss.setLocation(620,301);
        arbolGrande2.setLocation(977,432);
        arbolMediano4.setLocation(961,148);
        arbolMediano.setLocation(762,146);
        arbolMediano3.setLocation(616,445);
        arbolMediano3.setLocation(610,392);
        protoss.setLocation(756,272);
        
        
        arbolMediano.setLocation(695,118);
        Zerg zerg = new Zerg();
        addObject(zerg,Greenfoot.getRandomNumber(1000),Greenfoot.getRandomNumber(500));
        arbolGrande.setLocation(405,280);
        arbolMediano2.setLocation(137,353);
        contador contador = new contador();
        addObject(contador,62,42);
        contador.setLocation(48,33);
        contador.setLocation(55,22);
        contador.setLocation(49,25);
        contador.setLocation(53,24);
        contador.setLocation(80,22);
        Protoss protoss2 = new Protoss();
        addObject(protoss2,517,176);
        Zerg zerg2 = new Zerg();
        addObject(zerg2,270,198);
        Zerg zerg3 = new Zerg();
        addObject(zerg3,820,40);
        Protoss protoss3 = new Protoss();
        addObject(protoss3,297,376);
        
        
        vidaProtoss vidaProtoss = new vidaProtoss();
        addObject(vidaProtoss,295,27);
        vidaProtoss.setLocation(294,15);
       
        vidaZerg vidaZerg = new vidaZerg();
        addObject(vidaZerg,711,33);
        vidaZerg.setLocation(729,13);
        vidaZerg.setLocation(915,16);
        
        vidaProtoss.setLocation(375,5);
        contador.setLocation(132,21);
        vidaProtoss.setLocation(394,21);
        contador.setLocation(131,12);
        contador.setLocation(133,21);
        vidaProtoss.setLocation(327,34);
        
        vidaProtoss.setLocation(355,16);
        vidaZerg.setLocation(827,25);
        vidaZerg.setLocation(876,19);
        
        contador.setLocation(80,21);
        
        contador.setLocation(54,14);
        vidaZerg.setLocation(902,11);
        
        removeObject(protoss3);
        removeObject(zerg2);
        
        removeObject(protoss);
        protoss2.setLocation(490,85);
        
        zerg3.setLocation(327,115);
        removeObject(zerg);
        vidaZerg.setLocation(856,23);
        vidaZerg.setLocation(843,25);
        
        
        vidaZerg.setLocation(840,14);
        healthBarZE.setLocation(938,15);
        vidaZerg.setLocation(818,21);
        
        vidaZerg.setLocation(840,12);
        vidaZerg.setLocation(830,16);
        vidaZerg.setLocation(855,18);
        vidaZerg.setLocation(833,10);
        vidaZerg.setLocation(840,27);
        vidaZerg.setLocation(832,11);
        vidaZerg.setLocation(857,19);
        vidaZerg.setLocation(830,16);
       
        depositoProtross depositoProtross = new depositoProtross();
        addObject(depositoProtross,726,308);
        
        
        depositoProtross depositoProtross2 = new depositoProtross();
        addObject(depositoProtross2,607,236);
        removeObject(depositoProtross);
        depositoZerg depositoZerg = new depositoZerg();
        addObject(depositoZerg,358,466);
        depositoProtross2.setLocation(741,273);
        arbolGrande.setLocation(264,550);
        depositoZerg.setLocation(462,455);
        arbolMediano3.setLocation(708,433);
        arbolMediano.setLocation(503,237);
        arbolMediano4.setLocation(955,112);
        arbolMediano4.setLocation(980,106);
        Protoss protoss4 = new Protoss();
        addObject(protoss4,396,288);
        removeObject(protoss4);
        removeObject(protoss2);
        GuerreroProtoss guerreroProtoss = new GuerreroProtoss();
        addObject(guerreroProtoss,394,259);
        
        removeObject(zerg3);
        GuerreroZerg guerreroZerg = new GuerreroZerg();
        addObject(guerreroZerg,379,135);
        depositoProtross2.setLocation(875,106);
        depositoProtross2.setLocation(889,124);
        arbolMediano5.setLocation(316,105);
        
        depositoZerg.setLocation(406,386);
        ConstructorProtoss constructorProtoss = new ConstructorProtoss();
        addObject(constructorProtoss,267,215);
        MedicoProtoss medicoProtoss = new MedicoProtoss();
        addObject(medicoProtoss,518,170);
        
        
        ConstructorZerg constructorZerg = new ConstructorZerg();
        addObject(constructorZerg,234,407);
        MedicoZerg medicoZerg = new MedicoZerg();
        addObject(medicoZerg,562,522);

        medicoZerg.setLocation(567,518);
        medicoZerg.setLocation(622,498);
        removeObject(medicoZerg);
        MedicoZerg medicoZerg2 = new MedicoZerg();
        addObject(medicoZerg2,492,442);

        mina mina = new mina();
        addObject(mina,750,256);
        constructorProtoss.setLocation(579,254);
        
        
        mina mina2 = new mina();
        addObject(mina2,260,287);
        mina mina3 = new mina();
        addObject(mina3,429,527);

        depositoZerg.setLocation(424,402);
        mina2.setLocation(155,293);
        removeObject(arbolMediano2);
        arbolMediano3.setLocation(707,459);
        mina3.setLocation(497,533);
        medicoZerg.setLocation(611,533);
        depositoZerg.setLocation(434,401);
        medicoProtoss.setLocation(560,156);
        arbolMediano5.setLocation(360,88);
        guerreroZerg.setLocation(406,145);
        medicoProtoss.setLocation(594,142);
        mina.setLocation(765,263);

        removeObject(mina3);
        arbolMediano3.setLocation(570,563);
        yacimiento yacimiento = new yacimiento();
        addObject(yacimiento,817,449);
        yacimiento.setLocation(783,453);
        medicoZerg2.setLocation(555,358);
        constructorProtoss.setLocation(603,424);
        medicoProtoss.setLocation(626,89);
        constructorProtoss.setLocation(595,425);
        medicoZerg2.setLocation(605,355);
        HealthCenter healthCenter = new HealthCenter();
        addObject(healthCenter,634,164);
        removeObject(arbolMediano4);
        depositoProtross2.setLocation(866,121);
        depositoProtross2.setLocation(886,131);
        
        mina2.setLocation(169,257);
        yacimiento.setLocation(767,452);
        depositoZerg.setLocation(453,389);
        healthCenter.setLocation(619,189);
        arbolMediano.setLocation(474,249);
        healthCenter.setLocation(440,407);
        medicoProtoss.setLocation(634,101);
        constructorProtoss.setLocation(456,510);
        constructorZerg.setLocation(621,404);
        medicoZerg2.setLocation(239,381);
        constructorZerg.setLocation(631,374);
        mina2.setLocation(142,301);
        arbolGrande.setLocation(237,554);
        yacimiento.setLocation(722,510);
        removeObject(arbolMediano3);
        
        depositoProtross2.setLocation(857,116);
        depositoProtross2.setLocation(857,116);
        depositoZerg.setLocation(433,396);
        medicoProtoss.setLocation(822,354);
        medicoProtoss.setLocation(693,144);
        guerreroProtoss.setLocation(645,336);
        guerreroProtoss.setLocation(774,445);
        constructorZerg.setLocation(777,444);
        depositoZerg.setLocation(160,80);
        constructorProtoss.setLocation(489,512);
        medicoZerg2.setLocation(310,332);
        mina2.setLocation(158,292);
        arbolMediano.setLocation(588,135);
        arbolMediano5.setLocation(389,53);
        mina.setLocation(808,279);
        mina.setLocation(815,296);
        yacimiento.setLocation(590,580);
        guerreroProtoss.setLocation(626,341);
    }
}
