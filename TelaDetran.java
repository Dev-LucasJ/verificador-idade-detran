import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TelaDetran extends JFrame {
    private JTextField campoNome;
    private JTextField campoData;
    private JTextArea areaResultado;

    public TelaDetran() {
        // Configurações da janela
        setTitle("Sistema de Verificação do Detran");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Criar painel principal
        JPanel painelPrincipal = new JPanel(new BorderLayout(10, 10));
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Painel para os campos de entrada
        JPanel painelEntrada = new JPanel(new GridLayout(5, 1, 5, 5));

        // Adicionar campos de entrada
        painelEntrada.add(new JLabel("Nome Completo:"));
        campoNome = new JTextField(20);
        painelEntrada.add(campoNome);

        painelEntrada.add(new JLabel("Data de Nascimento (dd/mm/aaaa):"));
        campoData = new JTextField(10);
        painelEntrada.add(campoData);

        // Botão de verificação
        JButton botaoVerificar = new JButton("Verificar");
        botaoVerificar.setBackground(new Color(70, 130, 180));
        botaoVerificar.setForeground(Color.WHITE);
        painelEntrada.add(botaoVerificar);

        // Área de resultado
        areaResultado = new JTextArea(15, 40);
        areaResultado.setEditable(false);
        areaResultado.setLineWrap(true);
        areaResultado.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(areaResultado);

        // Adicionar componentes ao painel principal
        painelPrincipal.add(painelEntrada, BorderLayout.NORTH);
        painelPrincipal.add(scrollPane, BorderLayout.CENTER);

        // Adicionar painel principal à janela
        add(painelPrincipal);

        // Configurar ação do botão
        botaoVerificar.addActionListener(e -> verificarIdade());
    }

    private void verificarIdade() {
        try {
            // Pegar valores dos campos
            String nome = campoNome.getText();
            String dataNascimento = campoData.getText();

            // Usar a mesma lógica do seu código original
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataNasc = LocalDate.parse(dataNascimento, formatter);
            LocalDate hoje = LocalDate.now();

            Period periodo = Period.between(dataNasc, hoje);
            int idade = periodo.getYears();
            int meses = periodo.getMonths();

            // Construir o resultado
            StringBuilder resultado = new StringBuilder();
            resultado.append("=== Resultado da Análise ===\n");
            resultado.append("Nome: ").append(nome).append("\n");
            resultado.append("Idade atual: ").append(idade).append(" anos e ")
                    .append(meses).append(" meses.\n");

            if (idade >= 18) {
                resultado.append("\nVocê já pode iniciar o processo de CNH!\n");
                resultado.append("Procure uma autoescola para iniciar o processo.");
            }
            else if (idade == 17 && meses >= 6) {
                resultado.append("\nVocê já pode iniciar o processo de CNH!\n");
                resultado.append("Você já pode começar as aulas teóricas.");
            }
            else {
                LocalDate dataMinima = dataNasc.plusYears(17).plusMonths(6);
                Period tempoRestante = Period.between(hoje, dataMinima);

                resultado.append("\nVocê ainda não pode iniciar o processo de CNH.\n");
                resultado.append("Você poderá começar as aulas teóricas em: ")
                        .append(dataMinima.format(formatter)).append("\n");
                resultado.append("Tempo restante: ")
                        .append(tempoRestante.getYears()).append(" Anos e ")
                        .append(tempoRestante.getMonths()).append(" meses");
            }

            // Mostrar resultado na área de texto
            areaResultado.setText(resultado.toString());

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    "Por favor, verifique se a data está no formato correto (dd/mm/aaaa)",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        // Iniciar a interface gráfica
        SwingUtilities.invokeLater(() -> {
            TelaDetran tela = new TelaDetran();
            tela.setVisible(true);
        });
    }
}