import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * itens coletaveis que recupera vida(poçao de cura).
 * 
 * @author (Bruno Gualberto) 
 * @version (a version number or a date)
 */
public class Pocao extends Actor
{
    /**
     * Act - do whatever the Poçao wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int cura;

    public Pocao()
    {
        this.cura = 25;
    }

    public int getCura(){
        return cura;
    }
}
