# Como Contribuir para o Projeto Calcula_Area

Agradecemos o seu interesse em contribuir para o projeto Calcula_Area! Suas contribuições são muito valiosas para o aprimoramento e manutenção deste software.

Este documento explica como você pode contribuir, seja reportando um bug, sugerindo uma nova funcionalidade ou enviando alterações de código/documentação.

## Sumário

1.  [Reportando Bugs (Issues)](#reportando-bugs-issues)
2.  [Sugestão de Novas Funcionalidades](#sugestao-de-novas-funcionalidades)
3.  [Contribuindo com Código ou Documentação (Pull Requests)](#contribuindo-com-codigo-ou-documentacao-pull-requests)
    * [Preparando o Ambiente](#preparando-o-ambiente)
    * [Criando uma Nova Branch](#criando-uma-nova-branch)
    * [Fazendo Suas Alterações](#fazendo-suas-alteracoes)
    * [Mantendo seu Fork Atualizado](#mantendo-seu-fork-atualizado)
    * [Submetendo um Pull Request (PR)](#submetendo-um-pull-request-pr)
4.  [Guia de Estilo](#guia-de-estilo)
5.  [Código de Conduta](#codigo-de-conduta)

---

## Reportando Bugs (Issues)

Se você encontrar um bug ou um comportamento inesperado no Calcula_Area, por favor, nos ajude a corrigi-lo abrindo uma "Issue" no GitHub. Antes de abrir uma nova issue, por favor, verifique se já existe uma issue semelhante.

Ao abrir uma issue de bug, inclua o máximo de detalhes possível:

* **Descrição clara e concisa do bug.**
* **Passos para reproduzir:** Descreva exatamente como replicar o bug.
* **Comportamento esperado:** O que você esperava que acontecesse.
* **Comportamento atual:** O que realmente aconteceu.
* **Capturas de tela ou vídeos (se aplicável):** Para ajudar a ilustrar o problema.
* **Sua versão do software e sistema operacional.**

## Sugestão de Novas Funcionalidades

Temos ideias para melhorar o Calcula_Area? Adoraríamos ouvir! Você pode sugerir novas funcionalidades abrindo uma "Issue" no GitHub.

Ao abrir uma issue de funcionalidade, inclua:

* **Descrição clara da funcionalidade:** O que você gostaria de adicionar.
* **Por que essa funcionalidade seria útil:** Qual problema ela resolveria ou qual melhoria traria.
* **Exemplos de uso (opcional):** Como você imagina que essa funcionalidade seria usada.

## Contribuindo com Código ou Documentação (Pull Requests)

Para contribuir com alterações no código ou na documentação do projeto, siga os passos abaixo:

### Preparando o Ambiente

1.  **Faça um Fork do Repositório:** O primeiro passo é fazer um fork do repositório principal do Calcula_Area para a sua conta do GitHub. Clique no botão 'Fork' no canto superior direito da página do repositório.
2.  **Clone o seu Fork:** Em seu ambiente local, clone o *seu fork* do repositório:
    ```bash
    git clone [https://github.com/SEU_USUARIO/Calcula_Area.git](https://github.com/SEU_USUARIO/Calcula_Area.git)
    cd Calcula_Area
    ```
    (Substitua `SEU_USUARIO` pelo seu nome de usuário no GitHub).
3.  **Adicione o Repositório Original como "upstream" (Opcional, mas recomendado):** Isso permite que você sincronize seu fork com as atualizações do projeto original.
    ```bash
    git remote add upstream [https://github.com/paulojunior-ufla/Calcula_Area.git](https://github.com/paulojunior-ufla/Calcula_Area.git)
    ```
    (Este comando é para o repositório original do seu amigo, se ele tiver um link público. Se não, discuta com ele qual o repositório "oficial" a ser usado como upstream).

### Criando uma Nova Branch

Trabalhe sempre em uma nova branch, não na branch `main` (ou `master`) do seu fork. Isso mantém suas alterações isoladas e facilita o processo de Pull Request.

```bash
git checkout -b nome-da-sua-branch-descritiva

Escolha um nome descritivo para sua branch, como feature/calculo-trapezio, bugfix/erro-circulo ou docs/melhoria-readme.

Fazendo Suas Alterações
Implemente suas alterações (código, documentação, etc.).
Faça commits atômicos (commits pequenos e focados em uma única mudança).

git add .
git commit -m "feat: Adiciona calculo de área do trapézio"

Use mensagens de commit claras e concisas.
Mantendo seu Fork Atualizado
Antes de enviar seu Pull Request, é uma boa prática sincronizar seu fork com o repositório original para evitar conflitos:

git checkout main # ou master, dependendo da branch principal
git pull upstream main # ou master
git push origin main # ou master
git checkout nome-da-sua-branch-descritiva
git rebase main # ou master

(O git rebase pode ser mais avançado; se houver dificuldade, um git merge main simples também funciona, mas cria um commit de merge).

Submetendo um Pull Request (PR)
Quando suas alterações estiverem prontas e testadas:

Faça o push da sua branch para o seu fork no GitHub:

git push origin nome-da-sua-branch-descritiva

Vá para a página do seu fork no GitHub.
Você verá um botão "Compare & pull request" (ou similar). Clique nele.
Certifique-se de que a base seja o repositório original (paulojunior-ufla/Calcula_Area ou o do seu amigo) e a comparação seja a sua branch no seu fork.
Preencha o título do PR de forma clara e uma descrição detalhada do que foi alterado e por quê. Se o PR resolver uma issue, você pode linká-lo (ex: Fixes #123 ou Closes #456).
Crie o Pull Request.

Código de Conduta
Este projeto adota o Código de Conduta Contributor Covenant. Ao participar, você concorda em seguir este código.

---

**Pontos Importantes ao criar o `CONTRIBUTING.md` para o seu trabalho:**

* **Adapte os Links:** No exemplo acima, usei `https://github.com/paulojunior-ufla/Calcula_Area.git` como um placeholder para o repositório original. **Substitua este link pelo link real do repositório do seu amigo.**
* **Personalize o Conteúdo:** Embora o template seja abrangente, você pode simplificar algumas seções ou adicionar outras que façam mais sentido para o projeto específico do seu amigo.
* **Traduza e Revise:** Se o seu projeto estiver em português, certifique-se de que todo o `CONTRIBUTING.md` esteja em português, com boa ortografia e gramática.
* **Sincronize com o Amigo:** É fundamental que seu amigo (o mantenedor do repositório original) esteja de acordo com as diretrizes de contribuição que você está propondo. Afinal, ele será o revisor dos seus PRs.

Depois de criar este arquivo no seu fork e revisá-lo, você pode incluí-lo em um Pull Request de "Melhorias na Documentação".
