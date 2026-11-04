import greenfoot.*;

/** Explica o objetivo do jogo e permite voltar ao menu. */
public class TelaInstrucoes extends World
{
    public TelaInstrucoes()
    {
        super(800, 400, 1);

        setBackground("piso_fase2_16bits.png");
        getBackground().setColor(new Color(20, 15, 20, 230));
        getBackground().fillRect(40, 30, 720, 340);

        showText("COMO JOGAR", 400, 65);
        showText("Explore as masmorras e encontre a saida de cada andar.", 400, 115);
        showText("Enfrente os inimigos e colete itens pelo caminho.", 400, 155);
        showText("Venca o chefao do terceiro andar para ganhar.", 400, 195);
        showText("Se a sua vida acabar, voce perde.", 400, 235);
        // Atualizar quando o grupo definir os controles do personagem.
        showText("Movimento e ataque: controles ainda em desenvolvimento.", 400, 280);
        showText("ESC - Voltar ao menu", 400, 335);
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
