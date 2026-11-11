import greenfoot.*;

/** Mostra o resultado e permite comecar uma nova partida. */
public class TelaFinal extends World
{
    /** Permite visualizar a tela pelo menu de classes do Greenfoot. */
    public TelaFinal()
    {
        this(true, new Partida());
    }

    public TelaFinal(boolean venceu, Partida partida)
    {
        super(1200, 800, 1);
        setBackground("cenario_fase3_16bits.png");
        getBackground().setColor(new Color(20, 10, 15, 235));
        getBackground().fillRect(250, 200, 700, 400);

        if (venceu)
        {
            showText("VITORIA!", 600, 245);
            showText("Voce venceu as profundezas!", 600, 285);
        }
        else
        {
            showText("FIM DE JOGO", 600, 245);
            showText("Sua aventura terminou... tente novamente!", 600, 285);
        }

        showText("Fase 1: " + partida.getPontos(1) + " pontos", 600, 340);
        showText("Fase 2: " + partida.getPontos(2) + " pontos", 600, 375);
        showText("Fase 3: " + partida.getPontos(3) + " pontos", 600, 410);
        showText("Total: " + partida.getTotalPontos() + " pontos", 600, 450);

        int tempo = partida.getTempoTotalSegundos();
        showText("Tempo da partida: " + String.format("%02d:%02d", tempo / 60, tempo % 60),
            600, 490);
        showText("ENTER - Jogar novamente", 600, 535);
        showText("ESC - Menu inicial", 600, 565);
    }

    public void act()
    {
        String tecla = Greenfoot.getKey();
        if ("enter".equals(tecla))
        {
            Greenfoot.setWorld(new Fase1());
        }
        else if ("escape".equals(tecla))
        {
            Greenfoot.setWorld(new TelaInicial());
        }
    }
}
