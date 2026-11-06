import greenfoot.*;
/**
 * Write a description of class Inimigo here.
 * 
 * @author (LuisMacedo) 
 * @version (31.10)
 */
public class Inimigo extends Personagem
{
     private int xMax, xMin, yMax, yMin;
     private int tempoStagger = 0;
     
     public Inimigo (int xMax, int xMin, int yMax, int yMin){
        super(20, 3,100);
        this.xMax = xMax;
        this.xMin = xMin;
        this.yMax = yMax;
        this.yMin = yMin;
     
        }
        
    public Inimigo(int dano, int velocidade, int vida){
        super(dano, velocidade, vida);
    }
        
    public void act(){
        movimentar();
    }    
    
    public void movimentar(){
        
        if (tempoStagger > 0){
            tempoStagger--;
            return;
        }
        
        int vel = getVelocidade();
        setRotation(0);
        setRotation(270);
        if (getY() <= yMin && getX() < xMax) {          
            setRotation(0);
        } else if (getX() >= xMax && getY() < yMax) {  
            setRotation(90);
        } else if (getY() >= yMax && getX() > xMin) {   
            setRotation(180);
        } else {                                      
            setRotation(270);
        }
        move(vel);
        
    }
    
    public int atacar(){
        return getDano();
    }
    
    public void levarStagger(){
        move (-15);
        tempoStagger = 10;
    }
        
}
