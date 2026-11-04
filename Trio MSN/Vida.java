/**
 * Write a description of class Vida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vida  
{
    private int vida;
    private int vidaMaxima;
    
    public Vida(int vida){
        this.vida = vida;
        vidaMaxima = vida;
    }
    
    public int obterVida(){
        return vida;
    }
    
    public int getVidaMaxima(){
        return vidaMaxima;
    }
    
    public void curar(){
        if (vida > vidaMaxima){
            vida += 20;
        }
        
        if (vida < vidaMaxima){
            vida = vidaMaxima;
        }
        
    }
    
    public void receberDano(int dano){
        vida -= dano;
    }
    
}
