import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpi.dominio.*;

public class App {
    public static void main(String[] args) throws Exception {

        //DECLARAÇÕES DE VARIÁVEIS E LISTAS

        LocalDateTime dataHoraJogo = LocalDateTime.of(2023, 01, 12, 16, 0);

        double valorVitoriaTimeA = 0, valorVitoriaTimeB = 0, valorEmpate = 0;

        int cont = 1, randA, randB;

        List<Time> times = new ArrayList<>();
        List<Jogo> jogos = new ArrayList<>();
        List<Integer> rands = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Time time1 = new Time("Flamengo", 0, 0, 0, 0);
        Time time2 = new Time("Corinthias", 0, 0, 0, 0);
        Time time3 = new Time("Vasco", 0, 0, 0, 0);
        Time time4 = new Time("Palmeiras", 0, 0, 0, 0);
        Time time5 = new Time("Internacional", 0, 0, 0, 0);
        Time time6 = new Time("Fluminense", 0, 0, 0, 0);
        Time time7 = new Time("Atlético-MG", 0, 0, 0, 0);
        Time time8 = new Time("São Paulo", 0, 0, 0, 0);
        Time time9 = new Time("Athletico-PR", 0, 0, 0, 0);
        Time time10 = new Time("Grêmio", 0, 0, 0, 0);

        times.add(time1); times.add(time2); times.add(time3); times.add(time4); times.add(time5);
        times.add(time6); times.add(time7); times.add(time8); times.add(time9); times.add(time10);

        for (int i = 0; i < 5; i ++) {
            randA = random.nextInt(0, 10);
            randB = random.nextInt(0, 10);

            while (rands.contains(randA)) {
                randA = random.nextInt(0, 10);
            }

            rands.add(randA);

            while (rands.contains(randB)) {
                randB = random.nextInt(0, 10);
            }

            rands.add(randB);

            Jogo jogo = new Jogo(times.get(randA), times.get(randB), dataHoraJogo, valorVitoriaTimeA, valorVitoriaTimeB, valorEmpate);
            jogos.add(jogo);
        }

        for (Jogo jogo : jogos) {
            System.out.println("Jogo " + cont + ": " + jogo.getTimeA().getNome() + " X " + jogo.getTimeB().getNome());
            cont ++;
        }

        scanner.close();
    }
}
