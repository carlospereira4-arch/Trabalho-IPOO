import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fase3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fase3 extends Fase
{

    /**
     * Constructor for objects of class Fase3.
     * 
     */
    public Fase3()
    {    
        this(new Partida());
    }

    public Fase3(Partida partida)
    {
        super("piso_fase3_16bits.png", 3, partida);
    }
}
