import greenfoot.*;
/**
 * Write a description of class Inimigo here.
 * 
 * @author (LuisMacedo) 
 * @version (31.10)
 */
public class Inimigo extends Personagem
{
     private String nome;
     
     public Inimigo (){
        super(1, 3,100);
        nome = "Gladiador Patrulheiro";   
        }
        
    public void act(){
        patrulhar();
    }    
    
    public void patrulhar(){
        int vel = getVelocidade();
        move(vel);
        if (getX() >= 700){
             vel = vel * -1;
        } else if (getX() <= 450){
            vel = vel * -1;
        }
        setVelocidade(vel);
        
    }
    
    public int atacar(){
        return getDano();
    }
        
}
