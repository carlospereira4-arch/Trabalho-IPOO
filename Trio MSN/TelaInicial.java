import greenfoot.*;

/** Menu principal do jogo. */
public class TelaInicial extends World
{
    public TelaInicial()
    {
        super(800, 400, 1);

        // O fundo e o painel deixam as opcoes faceis de ler.
        setBackground("cenario_fase1_16bits.png");
        getBackground().setColor(new Color(20, 15, 20, 220));
        getBackground().fillRect(140, 65, 520, 270);

        showText("DIABLO DO PÉ-VERDE", 400, 110);
        showText("Uma aventura pelas profundezas", 400, 155);
        showText("ENTER - Jogar", 400, 220);
        showText("I - Instrucoes", 400, 270);

        // Creditos alinhados a direita, com uma pequena margem.
        GreenfootImage creditos = new GreenfootImage(
            "Estudantes UFLA\nBruno Gualberto, Carlos Henrique, Lu\u00eds Macedo",
            16, Color.WHITE, new Color(20, 15, 20, 230));
        getBackground().drawImage(creditos,
            getWidth() - creditos.getWidth() - 12,
            getHeight() - creditos.getHeight() - 12);
        prepare();
    }

    public void act()
    {
        // getKey retorna uma tecla pressionada pelo jogador.
        String tecla = Greenfoot.getKey();

        if ("enter".equals(tecla))
        {
            Greenfoot.setWorld(new Fase1());
        }
        else if ("i".equals(tecla))
        {
            Greenfoot.setWorld(new TelaInstrucoes());
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
