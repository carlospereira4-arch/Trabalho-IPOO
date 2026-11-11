import greenfoot.*;
import java.util.*;
/** Placar e cronometro compartilhados pelas tres fases. */
public class Fase extends World
{
    private long tempoAcumulado;
    private long ultimaAtualizacao;
    private int ultimoSegundo = -1;
    private Partida partida;
    private int numero;
    private boolean encerrada;
    private Jogador jogador;
    private int pontos;

    public Fase(String imagem, int numero)
    {
        this(imagem, numero, new Partida());
    }

    public Fase(String imagem, int numero, Partida partida)
    {
        super(1200, 800, 1);
        this.partida = partida;
        this.numero = numero;
        setBackground(imagem);
        jogador = new Jogador();

        // Faixa escura para os textos aparecerem sobre qualquer piso.
        getBackground().setColor(new Color(15, 10, 15));
        getBackground().fillRect(0, 0, 1200, 40);
        showText("Fase " + numero, 600, 20);
        atualizarPainel();
    }

    public void addPontuacao(int pontos){
        this.pontos += pontos;
    }
    
    public int getPontuacao(){
        return pontos;
    }
    
    protected Jogador getJogador(){
        return jogador;
    }
    
    public void started()
    {
        ultimaAtualizacao = System.nanoTime();
    }

    public void act()
    {
        contarTempo();
        atualizarPainel();
        
        if (getObjects(Inimigo.class).isEmpty())
        {
            vencerFase();
        }
    }

    public void stopped()
    {
        if (ultimaAtualizacao != 0)
        {
            contarTempo();
        }
        ultimaAtualizacao = 0;
        atualizarPainel();
    }

    /** Soma o tempo real decorrido, sem depender da velocidade do Greenfoot. */
    private void contarTempo()
    {
        long agora = System.nanoTime();
        if (ultimaAtualizacao != 0)
        {
            tempoAcumulado += agora - ultimaAtualizacao;
        }
        ultimaAtualizacao = agora;
    }

    public int getTempoSegundos()
    {
        return (int) (tempoAcumulado / 1000000000L);
    }

    /** Chamar quando o jogador alcancar a saida ou derrotar o chefao. */
    public void concluirFase()
    {
        if (encerrada)
        {
            return;
        }
        guardarResultado();
        if (numero == 1)
        {
            Greenfoot.setWorld(new Fase2(partida));
        }
        else if (numero == 2)
        {
            Greenfoot.setWorld(new Fase3(partida));
        }
        else
        {
            Greenfoot.setWorld(new TelaFinal(true, partida));
        }
    }

    /** Chamar quando a vida do personagem acabar. */
    public void perder()
    {
        if (encerrada)
        {
            return;
        }
        guardarResultado();
        Greenfoot.setWorld(new TelaFinal(false, partida));
    }

    private void guardarResultado()
    {
        stopped();
        encerrada = true;
        
        partida.registrarFase(numero, pontos, tempoAcumulado);
    }

    private void atualizarPainel()
    {
        showText("Pontos: " + pontos, 100, 20);
        showText("Vida: " + jogador.getVidaJogador(), 300, 20);
        
        int segundosTotais = getTempoSegundos();
        if (segundosTotais != ultimoSegundo)
        {
            int minutos = segundosTotais / 60;
            int segundos = segundosTotais % 60;
            String tempo = String.format("%02d:%02d", minutos, segundos);
            showText("Tempo: " + tempo, 1000, 20);
            ultimoSegundo = segundosTotais;
        }
    }
    
    /** Metodo sera usado inicialmente para tela de vitoria aparecer na fase 1 */
    public void vencerFase(){
        if (encerrada){
            return;
        }
        
        guardarResultado();
        Greenfoot.setWorld(new TelaFinal(true, partida));
    
    }
    
}
