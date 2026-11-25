import java.util.ArrayList;

/** Guarda os resultados dos tres andares de uma partida. */
public class Partida
{
    private ArrayList<Integer> pontos = new ArrayList<Integer>();
    private ArrayList<Long> tempos = new ArrayList<Long>();

    public Partida()
    {
        // Cria uma posicao para cada fase, com resultado inicial zero.
        for (int i = 0; i < 3; i++)
        {
            pontos.add(0);
            tempos.add(0L);
        }
    }

    public void registrarFase(int numero, int pontuacao, long tempo)
    {
        pontos.set(numero - 1, pontuacao);
        tempos.set(numero - 1, tempo);
    }

    public int getPontos(int numero)
    {
        return pontos.get(numero - 1);
    }

    public int getTotalPontos()
    {
        return pontos.get(0) + pontos.get(1) + pontos.get(2);
    }

    public int getTempoTotalSegundos()
    {
        return (int) ((tempos.get(0) + tempos.get(1) + tempos.get(2)) / 1000000000L);
    }
}
