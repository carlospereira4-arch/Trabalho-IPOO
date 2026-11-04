import greenfoot.*;

/** Placar e cronometro compartilhados pelas tres fases. */
public class Fase extends World
{
    private long tempoAcumulado;
    private long ultimaAtualizacao;
    private int ultimoSegundo = -1;
    private Partida partida;
    private int numero;
    private boolean encerrada;

    public Fase(String imagem, int numero)
    {
        this(imagem, numero, new Partida());
    }

    public Fase(String imagem, int numero, Partida partida)
    {
        super(800, 400, 1);
        this.partida = partida;
        this.numero = numero;
        setBackground(imagem);

        // Faixa escura para os textos aparecerem sobre qualquer piso.
        getBackground().setColor(new Color(15, 10, 15));
        getBackground().fillRect(0, 0, 800, 40);
        showText("Pontos: 0", 100, 20);
        showText("Fase " + numero, 400, 20);
        atualizarPainel();
    }

    public void started()
    {
        ultimaAtualizacao = System.nanoTime();
    }

    public void act()
    {
        contarTempo();
        atualizarPainel();
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
        // O placar ainda e ilustrativo: integrar os pontos reais depois.
        partida.registrarFase(numero, 0, tempoAcumulado);
    }

    private void atualizarPainel()
    {
        int segundosTotais = getTempoSegundos();
        if (segundosTotais != ultimoSegundo)
        {
            int minutos = segundosTotais / 60;
            int segundos = segundosTotais % 60;
            String tempo = String.format("%02d:%02d", minutos, segundos);
            showText("Tempo: " + tempo, 690, 20);
            ultimoSegundo = segundosTotais;
        }
    }
}
