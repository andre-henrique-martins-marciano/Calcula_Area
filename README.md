# Calcula_Area
Softwares usados para aprender de forma simples como criar um sisteminha para fazer cálculos.

### Pré-requisitos

Certifique-se de ter o Java Development Kit (JDK) versão 8 ou superior instalado em sua máquina. Você pode baixar o JDK em [link para download do JDK oficial da Oracle ou OpenJDK].

### Como Clonar o Repositório

1. Abra seu terminal ou prompt de comando.
2. Navegue até o diretório onde deseja armazenar o projeto.
3. Execute o comando para clonar o repositório:
   ```bash
   git clone [https://github.com/SEU_USUARIO/Calcula_Area.git](https://github.com/SEU_USUARIO/Calcula_Area.git)
   ```
   (Lembre-se de usar o link do seu **fork** quando estiver trabalhando, mas no README do projeto principal, o link seria o do repositório original do seu amigo).
4. Entre no diretório do projeto:
   ```bash
   cd Calcula_Area
   ```

   ### Abrindo o Projeto no NetBeans IDE

1. Abra o NetBeans IDE.
2. Vá em `File` (Arquivo) -> `Open Project...` (Abrir Projeto...).
3. Navegue até a pasta `Calcula_Area` que você clonou e selecione-a.
4. Clique em `Open Project` (Abrir Projeto).

5. ### Compilando e Executando o Projeto

#### Via NetBeans IDE:
1. Com o projeto aberto no NetBeans, clique com o botão direito do mouse no nó do projeto (`calcular area`) no painel 'Projects'.
2. Selecione `Run` (Executar) ou `Clean and Build` (Limpar e Construir) seguido de `Run` (Executar).

#### Via Linha de Comando (após compilar na IDE ou com Ant):
Se você já compilou o projeto (o NetBeans geralmente faz isso automaticamente ou você pode usar `ant jar`), um arquivo `.jar` será gerado na pasta `dist`.
1. Navegue até a pasta `dist` dentro do seu projeto:
   ```bash
   cd dist
   ```
2. Execute o arquivo JAR:
   ```bash
   java -jar calcular_area.jar
   ```
