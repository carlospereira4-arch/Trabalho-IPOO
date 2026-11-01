import greenfoot.*;
/**
 * Write a description of class Inimigo here.
 * 
 * @author (LuisMacedo) 
 * @version (31.10)
 */
public class Inimigo extends Actor
{
     private String nome;
     private int dano;
     private int velocidade;
     private Vida vida;
     
     public Inimigo (){
            nome = "Gladiador Patrulheiro";
            dano = 3;
            velocidade = 3;
            vida = new Vida(100);
        }
        
    public void act(){
        patrulhar();
    }    
    
    public void patrulhar(){
        move(velocidade);
        if (getX() >= 700){
            velocidade = velocidade * -1;
        } else if (getX() <= 450){
            velocidade = velocidade * -1;
        }
        
    }
        
}
