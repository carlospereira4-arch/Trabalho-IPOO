import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fase2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fase2 extends Fase
{

    /**
     * Constructor for objects of class Fase2.
     * 
     */
    public Fase2()
    {    
        this(new Partida());
        prepare();
    }

    public Fase2(Partida partida)
    {
        super("piso_fase2_16bits.png", 2, partida);
        prepare();
    }

    public void act(){
        super.act();
    }
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        addObject(getJogador(), 180, 630);
        InimigoCego inimigoCego = new InimigoCego();
        addObject(inimigoCego,1029,188);
        InimigoCego inimigoCego2 = new InimigoCego();
        addObject(inimigoCego2,629,180);
        Perseguidor perseguidor = new Perseguidor();
        addObject(perseguidor,1071,693);
    }
}
