import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpi.dominio.*;

public class App {
    public static void main(String[] args) throws Exception {

        List<Time> times = new ArrayList<>();
        List<Jogo> jogos = new ArrayList<>();

        Time time1 = new Time(null, null, 0, 0, 0, 0);

        times.add(null);

        Jogo jogo = new Jogo(null, 0, 0, 0);
        Jogo jogo2 = new Jogo(LocalDateTime.now(), 100, 0, 0);
        jogos.add(jogo);
        jogos.add(jogo2);
        jogos.remove(jogo);
        for (Jogo i : jogos) {
            System.out.println(i);
        }
    }
}
