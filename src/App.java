import br.edu.ifpi.dominio.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        List<Time> times = new ArrayList<>();
        List<Jogo> jogos = new ArrayList<>();
        List<Cliente> clientes = new ArrayList<>();
        List<Aposta> apostas = new ArrayList<>();

        Random random = new Random();

        times.add(new Time("Flamengo", 10, 3, 1, 0));
        times.add(new Time("Corinthias", 4, 2, 1, 0));
        times.add(new Time("Vasco", 20, 6, 2, 2));
        times.add(new Time("Palmeiras", 16, 3, 7, 4));
        times.add(new Time("Internacional",20, 5, 5, 0));
        times.add(new Time("Fluminense", 18, 6, 0, 0));
        times.add(new Time("Atlético-MG", 3, 1, 0, 1));
        times.add(new Time("São Paulo", 14, 4, 2, 0));
        times.add(new Time("Athletico-PR", 15, 4, 3, 0));
        times.add(new Time("Grêmio", 16, 5, 1, 0));

        jogos.add(new Jogo(times.get(0), times.get(1), LocalDateTime.of(2022, 1, 16, 16, 0), 1000, 1000, 500));
        jogos.add(new Jogo(times.get(2), times.get(3), LocalDateTime.of(2022, 1, 16, 16, 0), 1000, 1000, 500));
        jogos.add(new Jogo(times.get(4), times.get(5), LocalDateTime.of(2022, 1, 16, 16, 0), 1000, 1000, 500));
        jogos.add(new Jogo(times.get(6), times.get(7), LocalDateTime.of(2022, 1, 16, 16, 0), 1000, 1000, 500));
        jogos.add(new Jogo(times.get(8), times.get(9), LocalDateTime.of(2022, 1, 16, 16, 0), 1000, 1000, 500));

        Endereco endereco1 = new Endereco("Castro Alves", 456, "Junco", "Picos", "PI");
        Endereco endereco2 = new Endereco("Castelo Branco", 406, "Centro", "Picos", "PI");
        Endereco endereco3 = new Endereco("Rui Barbosa", 667, "Junco", "Picos", "PI");

        clientes.add(new Cliente("Carlos", "carlos@gmail.com", LocalDate.of(2003, 1, 1), endereco1));
        clientes.add(new Cliente("Pedro", "pedro@gmail.com", LocalDate.of(2002, 6, 12), endereco2));
        clientes.add(new Cliente("João", "joao@gmail.com", LocalDate.of(1999, 2, 14), endereco3));

        Jogo[] jogosCli1 = {jogos.get(0), jogos.get(1), jogos.get(2)};
        Time[] resultatosCli1 = {jogos.get(0).getTimeA(), jogos.get(1).getTimeB(), jogos.get(2).getTimeA()};
        
        Jogo[] jogosCli2 = {jogos.get(4)};
        Time[] resultatosCli2 = {jogos.get(4).getTimeA()};
        
        Jogo[] jogosCli3 = {jogos.get(2), jogos.get(3)};
        Time[] resultatosCli3 = {jogos.get(2).getTimeB(), jogos.get(3).getTimeB()};

        apostas.add(new Aposta(LocalDate.of(2023, 1, 14), jogosCli1, clientes.get(0), resultatosCli1));
        apostas.add(new Aposta(LocalDate.of(2023, 1, 14), jogosCli2, clientes.get(1), resultatosCli2));
        apostas.add(new Aposta(LocalDate.of(2023, 1, 14), jogosCli3, clientes.get(2), resultatosCli3));

        for (Aposta aposta : apostas) {
            int resultado;

            if ("Carlos".equals(aposta.getCliente().getNome())) {

                System.out.println("--------------------------------------------------------------------------------------------------");
                

                for (int i = 0; i < aposta.getJogos().length; i++) {
                    resultado = random.nextInt(1, 4);

                    if (resultado == 1) {
                        System.out.println(i+1 + "º " + "Aposta do " + aposta.getCliente().getNome() + " (apostou no " + aposta.getResultado()[i].getNome() + ") | Resultado: " + aposta.getJogos()[i].getTimeA().getNome() + " venceu o " + aposta.getJogos()[i].getTimeB().getNome());
                    }

                    else if (resultado == 2) {
                        System.out.println(i+1 + "º " + "Aposta do " + aposta.getCliente().getNome() + " (apostou no " + aposta.getResultado()[i].getNome() + ") | Resultado: " + aposta.getJogos()[i].getTimeB().getNome() + " venceu o " + aposta.getJogos()[i].getTimeA().getNome());
                    }

                    else {
                        System.out.println(i+1 + "º " + "Aposta do " + aposta.getCliente().getNome() + " (apostou no " + aposta.getResultado()[i].getNome() + ") | Resultado: " + aposta.getJogos()[i].getTimeA().getNome() + " e " + aposta.getJogos()[i].getTimeB().getNome() + " empataram");
                    }   
                }
            }

            else if ("Pedro".equals(aposta.getCliente().getNome())) {

                System.out.println("--------------------------------------------------------------------------------------------------");

                for (int i = 0; i < aposta.getJogos().length; i++) {
                    resultado = random.nextInt(1, 4);

                    if (resultado == 1) {
                        System.out.println(i+1 + "º " + "Aposta do " + aposta.getCliente().getNome() + " (apostou no " + aposta.getResultado()[i].getNome() + ") | Resultado: " + aposta.getJogos()[i].getTimeA().getNome() + " venceu o " + aposta.getJogos()[i].getTimeB().getNome());
                    }

                    else if (resultado == 2) {
                        System.out.println(i+1 + "º " + "Aposta do " + aposta.getCliente().getNome() + " (apostou no " + aposta.getResultado()[i].getNome() + ") | Resultado: " + aposta.getJogos()[i].getTimeB().getNome() + " venceu o " + aposta.getJogos()[i].getTimeA().getNome());
                    }

                    else {
                        System.out.println(i+1 + "º " + "Aposta do " + aposta.getCliente().getNome() + " (apostou no " + aposta.getResultado()[i].getNome() + ") | Resultado: " + aposta.getJogos()[i].getTimeA().getNome() + " e " + aposta.getJogos()[i].getTimeB().getNome() + " empataram");
                    }   
                }

                System.out.println("--------------------------------------------------------------------------------------------------");
            }

            else {
                for (int i = 0; i < aposta.getJogos().length; i++) {
                    resultado = random.nextInt(1, 4);

                    if (resultado == 1) {
                        System.out.println(i+1 + "º " + "Aposta do " + aposta.getCliente().getNome() + " (apostou no " + aposta.getResultado()[i].getNome() + ") | Resultado: " + aposta.getJogos()[i].getTimeA().getNome() + " venceu o " + aposta.getJogos()[i].getTimeB().getNome());
                    }

                    else if (resultado == 2) {
                        System.out.println(i+1 + "º " + "Aposta do " + aposta.getCliente().getNome() + " (apostou no " + aposta.getResultado()[i].getNome() + ") | Resultado: " + aposta.getJogos()[i].getTimeB().getNome() + " venceu o " + aposta.getJogos()[i].getTimeA().getNome());
                    }

                    else {
                        System.out.println(i+1 + "º " + "Aposta do " + aposta.getCliente().getNome() + " (apostou no " + aposta.getResultado()[i].getNome() + ") | Resultado: " + aposta.getJogos()[i].getTimeA().getNome() + " e " + aposta.getJogos()[i].getTimeB().getNome() + " empataram");
                    }              
                }

                System.out.println("--------------------------------------------------------------------------------------------------");
            }
        }
    }
}
