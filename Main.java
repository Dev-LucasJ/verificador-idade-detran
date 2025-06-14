import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===Sistema de Verificação do Detran===");

        System.out.println("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua data de nascimento (dd/mm/aaaa): ");
        String dataNascimento = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNasc = LocalDate.parse(dataNascimento, formatter);
        LocalDate hoje = LocalDate.now();

        Period periodo = Period.between(dataNasc, hoje);
        int idade = periodo.getYears();
        int meses = periodo.getMonths();

        System.out.println("\n=== Resultado da Análise ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade atual: " + idade + " anos e " + meses + " meses.");

        if (idade >= 18) {
            System.out.println("\nVocê já pode iniciar o processo de CNH!");
            System.out.println("Procure uma autoescola para iniciar o processo.");
        }
        else if (idade == 17 && meses >=6) {
            System.out.println("\nVocê já pode iniciar o processo de CNH!");
            System.out.println("Você já pode começar as aulas teóricas.");
        }
        else {
            LocalDate dataMinima = dataNasc.plusYears(17).plusMonths(6);
            Period tempoRestante = Period.between(hoje, dataMinima);

            System.out.println("\nVocê ainda não pode iniciar o processo de CNH.");
            System.out.println("Você poderá começar as aulas teóricas em: "+
                    dataMinima.format(formatter));
            System.out.println("Tempo restante: " +
                    tempoRestante.getYears() + " Anos e " +
                    tempoRestante.getMonths() + " meses");
        }
        scanner.close();
    }
}