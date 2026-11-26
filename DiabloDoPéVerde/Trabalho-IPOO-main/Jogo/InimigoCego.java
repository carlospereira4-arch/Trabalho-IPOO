import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InimigoCego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InimigoCego extends Inimigo
{
    public InimigoCego(){
        super(20, 4, 150);
    }
    
    
    @Override 
    public void movimentar(){
        move(getVelocidade());
        if (Greenfoot.getRandomNumber(100) < 10){
            int lado = Greenfoot.getRandomNumber(90) - 45;
            turn(lado);
        }
        if (isAtEdge()){
        turn(180);
        }
    }
}
