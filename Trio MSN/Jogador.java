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
    private int intervalo;
    
    public Jogador(){
        super(15, 4, 100);
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
        
        if (intervalo > 0){
            intervalo--;
            return;
        }
        
        Inimigo inimigo = (Inimigo) getOneIntersectingObject(Inimigo.class);
        if (inimigo != null){
            vidaJogador.receberDano(inimigo.atacar());
            intervalo = 10;
        }
    }
    
    
    public void atacar(){
        
        if (intervalo > 0){
            intervalo--;
            return;
        }
        
        if (Greenfoot.isKeyDown("space")){
            List<Inimigo> inimigos = getObjectsInRange(100, Inimigo.class);
            if (!inimigos.isEmpty()){
                Inimigo alvo = inimigos.get(0);
                Greenfoot.playSound("somgolpe.wav");
                alvo.levarDano(getDano());
                alvo.levarStagger();
                intervalo = 7;
            }
            
        }
    }
    
}
