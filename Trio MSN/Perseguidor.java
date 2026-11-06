import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Perseguidor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Perseguidor extends Inimigo
{
    private int visao;
    
    public Perseguidor(){
        super(15, 3, 75);
        visao = 400;
    }
    
    public void act()
    {
        verAlvo();
        atacar();
    }
    
    @Override
    public void movimentar(){
        move(getVelocidade());
    }
    
    
    public void verAlvo(){
        List<Jogador> jogador = getObjectsInRange(visao, Jogador.class);
        if (!jogador.isEmpty()) { //Jogador vivo
            Jogador alvo = jogador.get(0);
            turnTowards(alvo.getX(), alvo.getY());
            movimentar();
        } else {
            return;
        }
    }
    
}
