import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.edu.ifpi.dominio.*;

public class App {
    public static void main(String[] args) throws Exception {

        //INTRODUÇÃO

        LocalDateTime dataHoraJogo = LocalDateTime.of(2023, 01, 12, 16, 0);

        double valorVitoriaTimeA = 0, valorVitoriaTimeB = 0, valorEmpate = 0;

        int contJogos = 1, contClassificacao = 1, randA, randB;

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

        times.sort(Comparator.comparing(Time::getNumeroPontos).reversed());

        System.out.println("\nCLASSIFICAÇÃO DOS TIMES\n");

        System.out.println("------------------------------------------------------------------------------------------");

        for (Time time : times) {
            if (contClassificacao == 10) {
                System.out.println(contClassificacao + "º " + time.getNome() + " - Pontos: " + time.getNumeroPontos() + " | Vitórias: " + time.getNumeroVitorias() + " | Empates: " + time.getNumeroEmpates() + " | Derrotas: " + time.getNumeroDerrotas() + "\n");       
            }

            else {
                System.out.println(contClassificacao + "º  " + time.getNome() + " - Pontos: " + time.getNumeroPontos() + " | Vitórias: " + time.getNumeroVitorias() + " | Empates: " + time.getNumeroEmpates() + " | Derrotas: " + time.getNumeroDerrotas() + "\n");       
            }
            
            contClassificacao ++;
        }

        System.out.println("------------------------------------------------------------------------------------------");

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

            if (randA < randB) {
                valorVitoriaTimeA = 1000;
                valorVitoriaTimeB = 500;
                valorEmpate = 750;
            }

            else {
                valorVitoriaTimeB = 1000;
                valorVitoriaTimeA = 500;
                valorEmpate = 750;
            }

            Jogo jogo = new Jogo(times.get(randA), times.get(randB), dataHoraJogo, valorVitoriaTimeA, valorVitoriaTimeB, valorEmpate);
            jogos.add(jogo);
        }
        
        System.out.println("\nJOGOS DESSA RODADA\n");
        System.out.println("------------------------------------------------------------------------------------------");

        for (Jogo jogo : jogos) {
            System.out.println("Jogo " + contJogos + ": " + jogo.getTimeA().getNome() + " X " + jogo.getTimeB().getNome() + "\n");
            System.out.println("Valor da Vitória do " + jogo.getTimeA().getNome() + " = R$ " + jogo.getValorVitoriaTimeA());
            System.out.println("Valor da Vitória do " + jogo.getTimeB().getNome() + " = R$ " + jogo.getValorVitoriaTimeB());
            System.out.println("Valor do Empate = R$ " + jogo.getValorEmpate() + "\n");
            System.out.println("------------------------------------------------------------------------------------------");
            contJogos ++;
        }

        scanner.close();
    }
}
