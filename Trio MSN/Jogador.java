import greenfoot.*;
import java.util.ArrayList;
/**
 * Write a description of class Jogador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jogador extends Personagem
{
    private ArrayList<String> inventario;
    private Vida vidaJogador;
    
    public Jogador(){
        super(30, 4, 100);
        vidaJogador = getVida();
        inventario = new ArrayList<>();
    }
    
    public void act(){
        movimentar();
        sofrerDano();
        morrer();
    }
    
    public void movimentar(){
        int vel = getVelocidade();
        if (Greenfoot.isKeyDown("d")){
            move(vel);
        }
        
        if (Greenfoot.isKeyDown("a")){
            move(vel * -1);
        }
    }
    
    public void morrer(){
        if (vidaJogador.obterVida() == 0){
            getWorld().removeObject(this);
        }
    }
    
    public void sofrerDano(){
        int tempoRecuperar = 0;
        
        if (tempoRecuperar > 0){
            tempoRecuperar--;
            return;
        }
        
        Inimigo inimigo = (Inimigo) getOneIntersectingObject(Inimigo.class);
        if (inimigo != null){
            vidaJogador.receberDano(inimigo.atacar());
            tempoRecuperar = 180;
        }
    }
    
}
