import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fase1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fase1 extends Fase
{
    private GreenfootSound musica = new GreenfootSound("masmorra_fundo.wav");
    /**
     * Constructor for objects of class Fase1.
     * 
     */
    public Fase1()
    {    
        super("piso_fase1_16bits.png", 1);
        musica.setVolume(35);
        prepare();
    }

    /** Inicia a musica quando a fase esta rodando. */
    public void act()
    {
        super.act();
        if (!musica.isPlaying())
        {
            musica.playLoop();
        }
    }

    /** Pausa a musica quando o jogo e pausado ou muda de mundo. */
    public void stopped()
    {
        super.stopped();
        musica.pause();
    }
    
    private void prepare(){
        //Spawm do jogador
        Jogador jogador = getJogador();
        addObject(jogador, 69, 459);

        //Spawn de inimigos
        Inimigo guarda = new Inimigo(455, 195, 359, 99);
        addObject(guarda, 195, 99);

        Inimigo inimigo1 = new Inimigo(1150, 800, 360, 80);
        addObject(inimigo1, 750, 352);

        Inimigo inimigo2 = new Inimigo(1000, 300, 690, 580);
        addObject(inimigo2, 600, 600);

        Perseguidor perseguidor1 = new Perseguidor();
        addObject(perseguidor1, 1006, 133);

        Perseguidor perseguidor2 = new Perseguidor();
        addObject(perseguidor2, 1050, 700);

        // Itens de cura
        Pocao pocao1 = new Pocao();
        addObject(pocao1, 450, 150);

        Pocao pocao2 = new Pocao();
        addObject(pocao2, 800, 480);

        Pocao pocao3 = new Pocao();
        addObject(pocao3, 200, 700);

        //Obstaculos
        Torre torre = new Torre();
        addObject(torre, 325, 229);

        Parede parede = new Parede();
        addObject(parede,375,500);

        Torre torre2 = new Torre();
        addObject(torre2,1031,455);
        
    }    
}
