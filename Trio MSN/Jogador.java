import greenfoot.*;
import java.util.*;
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
        super(10, 4, 100);
        vidaJogador = getVida();
        inventario = new ArrayList<>();
    }
    
    public void act(){
        movimentar();
        sofrerDano();
        morrer();
        atacar();
    }
    
    public void movimentar(){
        int vel = getVelocidade();
        if (Greenfoot.isKeyDown("d")){
            setRotation(0);
            move(vel);
            setRotation(270);
        }
        
        if (Greenfoot.isKeyDown("a")){
            setRotation(180);
            move(vel);
            setRotation(90);
        }
        if (Greenfoot.isKeyDown("w")){
            setRotation(270);
            move(vel);
            setRotation(180);
        }
        
        if (Greenfoot.isKeyDown("s")){
            setRotation(90);
            move(vel);
            setRotation(0);
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
    
    public void atacar(){
        int intervaloAtaque = 0;
        
        if (intervaloAtaque > 0){
            intervaloAtaque--;
            return;
        }
        
        if (Greenfoot.isKeyDown("space")){
            List<Inimigo> inimigos = getObjectsInRange(100, Inimigo.class);
            if (!inimigos.isEmpty()){
                Inimigo alvo = inimigos.get(0);
                alvo.levarDano(getDano());
                intervaloAtaque = 180;
            }
            
        }
    }
    
}
