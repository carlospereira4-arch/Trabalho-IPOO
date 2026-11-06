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
        //incializa o jogador no spawn
        Jogador jogador = new Jogador();
        addObject(jogador, 100, 366);

        //Spawn dos inimigos
        Inimigo inimigo1 = new Inimigo(1000, 650, 700, 200);
        addObject(inimigo1, 750, 352);

        Perseguidor perseguidor = new Perseguidor();
        addObject(perseguidor,1006,133);
    }    
}
