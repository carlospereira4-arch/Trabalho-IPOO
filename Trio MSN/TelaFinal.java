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
        super(800, 400, 1);
        setBackground("cenario_fase3_16bits.png");
        getBackground().setColor(new Color(20, 10, 15, 235));
        getBackground().fillRect(120, 20, 560, 360);

        if (venceu)
        {
            showText("VITORIA!", 400, 55);
            showText("Voce venceu as profundezas!", 400, 95);
        }
        else
        {
            showText("FIM DE JOGO", 400, 55);
            showText("Sua aventura terminou... tente novamente!", 400, 95);
        }

        showText("Fase 1: " + partida.getPontos(1) + " pontos", 400, 140);
        showText("Fase 2: " + partida.getPontos(2) + " pontos", 400, 175);
        showText("Fase 3: " + partida.getPontos(3) + " pontos", 400, 210);
        showText("Total: " + partida.getTotalPontos() + " pontos", 400, 250);

        int tempo = partida.getTempoTotalSegundos();
        showText("Tempo da partida: " + String.format("%02d:%02d", tempo / 60, tempo % 60),
            400, 285);
        showText("ENTER - Jogar novamente", 400, 325);
        showText("ESC - Menu inicial", 400, 355);
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
