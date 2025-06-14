Verificador de Idade - DETRAN 🚗

📋 Sobre o Projeto
O Verificador de Idade - DETRAN é uma aplicação Java com interface gráfica desenvolvida em Swing que verifica se uma pessoa tem idade suficiente para iniciar o processo de obtenção da Carteira Nacional de Habilitação (CNH) no Brasil.
✨ Funcionalidades

🎂 Cálculo de idade: Calcula automaticamente a idade baseada na data de nascimento
✅ Verificação de elegibilidade: Informa se a pessoa pode iniciar o processo da CNH
⏰ Tempo restante: Mostra quanto tempo falta para atingir a idade mínima (18 anos)
🖥️ Interface intuitiva: Interface gráfica simples e fácil de usar
🇧🇷 Localização brasileira: Adequado às regras do DETRAN brasileiro

🛠️ Tecnologias Utilizadas

Java: Linguagem de programação principal
Swing: Framework para interface gráfica
Java AWT: Para componentes adicionais da interface

📦 Estrutura do Projeto
verificador-idade-detran/
├── Main.java              # Versão console da aplicação
├── TelaDetran.java        # Interface gráfica (Swing)
├── README.md              # Documentação do projeto
├── LICENSE               # Licença MIT
└── .gitignore           # Arquivos ignorados pelo Git

🚀 Como Executar

Pré-requisitos

Java JDK 8 ou superior instalado
IDE Java (recomendado: IntelliJ IDEA, Eclipse, VS Code)

Versão Console (Main.java)

Clone o repositório
bashgit clone https://github.com/Dev-Lucas1/verificador-idade-detran.git

Navegue até o diretório
bashcd verificador-idade-detran

Compile e execute
bashjavac Main.java
java Main


Versão Interface Gráfica (TelaDetran.java)

Compile e execute a versão GUI
bashjavac TelaDetran.java
java TelaDetran


Executando pela IDE

Abra o projeto em sua IDE favorita
Para versão console: Execute a classe Main.java
Para versão GUI: Execute a classe TelaDetran.java

💻 Screenshots
Versão Interface Gráfica (GUI)
![image](https://github.com/user-attachments/assets/3bac9a3e-c70b-4d09-abdf-35746e693e81)

Exemplo de verificação de idade com resultado
![image](https://github.com/user-attachments/assets/d5d6a718-9329-4f98-a13f-0840d5683b5c)

Exemplo da aplicação rodando no terminal
![image](https://github.com/user-attachments/assets/073cd658-ce12-44ce-a2d5-e991e5e02fbf)

📝 Como Usar
Versão Console

Execute o arquivo Main.java
Digite seu nome completo quando solicitado
Insira sua data de nascimento no formato dd/mm/aaaa
Visualize o resultado no terminal

Versão Interface Gráfica (GUI)

Execute o arquivo TelaDetran.java
Preencha os campos "Nome Completo" e "Data de Nascimento"
Clique no botão "Verificar"
Veja o resultado na área de texto abaixo

Resultados Possíveis

✅ 18+ anos: "Você já pode iniciar o processo da CNH!"
✅ 17 anos e 6+ meses: "Você já pode começar as aulas teóricas!"
❌ Menor que 17 anos e 6 meses: Mostra quando poderá iniciar o processo

🎯 Regras de Negócio

Idade mínima: 18 anos completos para CNH categoria A e B
Cálculo preciso: Considera anos, meses e dias para cálculo exato
Validação de data: Verifica se a data inserida é válida

🤝 Como Contribuir
Contribuições são sempre bem-vindas! Para contribuir:

Fork o projeto
Crie uma branch para sua feature (git checkout -b feature/AmazingFeature)
Commit suas mudanças (git commit -m 'Add some AmazingFeature')
Push para a branch (git push origin feature/AmazingFeature)
Abra um Pull Request

💡 Ideias para Contribuições

 Adicionar suporte para outras categorias de CNH (C, D, E)
 Implementar validação mais robusta de datas
 Adicionar temas visuais (claro/escuro)
 Criar versão web da aplicação
 Adicionar testes unitários
 Implementar internacionalização (i18n)
 Adicionar histórico de consultas

🐛 Reportar Bugs
Encontrou um bug? Por favor, abra uma issue com:

Descrição detalhada do problema
Passos para reproduzir o erro
Ambiente (SO, versão do Java, etc.)
Screenshots se aplicável

📄 Licença
Este projeto está sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.

👨‍💻 Autor
Lucas - @Dev-Lucas1

🔗 Links Úteis

[Documentação Java](https://docs.oracle.com/javase/)
[Tutorial Swing](https://docs.oracle.com/javase/tutorial/uiswing/)
[DETRAN - Informações sobre CNH](https://www.gov.br/pt-br/servicos/obter-carteira-nacional-de-habilitacao)


⭐ Gostou do projeto? Deixe uma estrela! ⭐
