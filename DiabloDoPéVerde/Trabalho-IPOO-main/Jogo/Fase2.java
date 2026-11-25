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
    }

    public Fase2(Partida partida)
    {
        super("piso_fase2_16bits.png", 2, partida);
    }
}
