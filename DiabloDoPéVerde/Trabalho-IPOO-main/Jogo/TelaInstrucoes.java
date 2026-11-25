import greenfoot.*;

/** Explica o objetivo do jogo e permite voltar ao menu. */
public class TelaInstrucoes extends World
{
    public TelaInstrucoes()
    {
        super(1200, 800, 1);

        setBackground("piso_fase2_16bits.png");
        getBackground().setColor(new Color(20, 15, 20, 230));
        // retângulo centralizado: x = 600 - 700/2 = 250, y = 400 - 400/2 = 200
        getBackground().fillRect(250, 200, 700, 400);

        showText("COMO JOGAR", 600, 250);
        showText("Explore as masmorras e encontre a saida de cada andar.", 600, 310);
        showText("Enfrente os inimigos e colete itens pelo caminho.", 600, 350);
        showText("Venca o chefao do terceiro andar para ganhar.", 600, 390);
        showText("Se a sua vida acabar, voce perde.", 600, 430);
        // Atualizar quando o grupo definir os controles do personagem.
        showText("Movimento e ataque: w, a, s, d para movimentar o personagem e space para atacar.", 600, 490);
        showText("ESC - Voltar ao menu", 600, 550);
    }

    public void act()
    {
        String tecla = Greenfoot.getKey();

        if ("escape".equals(tecla))
        {
            Greenfoot.setWorld(new TelaInicial());
        }
    }
}
