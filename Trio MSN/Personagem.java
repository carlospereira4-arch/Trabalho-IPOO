import greenfoot.*;
/**
 * Write a description of class Personagem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Personagem extends Actor
{
    private int dano;
     private int velocidade;
     private Vida vida;
     
     public Personagem (int dano, int velocidade, int vida){
        this.dano = dano;
        this.velocidade = velocidade;
        this.vida = new Vida(vida);
        }
        
    public void setVelocidade(int vel){
        velocidade = vel;
    }    
    
        
    public int getVelocidade(){
        return velocidade;
    }    
    
    public Vida getVida(){
        return vida;
    }
    
    public int getDano(){
        return dano;
    }
}
