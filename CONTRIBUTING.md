# Como Contribuir para o Projeto Calcula_Area
:heavy_multiplication_x: :heavy_minus_sign: :heavy_division_sign: :heavy_plus_sign:	

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

## Reportando Bugs (Issues) :exclamation:

Se você encontrar um bug ou um comportamento inesperado no Calcula_Area, por favor, nos ajude a corrigi-lo abrindo uma "Issue" no GitHub. Antes de abrir uma nova issue, por favor, verifique se já existe uma issue semelhante.

Ao abrir uma issue de bug, inclua o máximo de detalhes possível:

* **Descrição clara e concisa do bug.**
* **Passos para reproduzir:** Descreva exatamente como replicar o bug.
* **Comportamento esperado:** O que você esperava que acontecesse.
* **Comportamento atual:** O que realmente aconteceu.
* **Capturas de tela ou vídeos (se aplicável):** Para ajudar a ilustrar o problema.
* **Sua versão do software e sistema operacional.**

## Sugestão de Novas Funcionalidades :white_check_mark:

Tem ideias para melhorar o Calcula_Area? Adoraríamos ouvir! Você pode sugerir novas funcionalidades abrindo uma "Issue" no GitHub.

Ao abrir uma issue de funcionalidade, inclua:

* **Descrição clara da funcionalidade:** O que você gostaria de adicionar.
* **Por que essa funcionalidade seria útil:** Qual problema ela resolveria ou qual melhoria traria.
* **Exemplos de uso (opcional):** Como você imagina que essa funcionalidade seria usada.

## Contribuindo com Código ou Documentação (Pull Requests)

Para contribuir com alterações no código ou na documentação do projeto, siga os passos abaixo:

### Preparando o Ambiente :computer:

1.  **Faça um Fork do Repositório:** O primeiro passo é fazer um fork do repositório principal do Calcula_Area para a sua conta do GitHub. Clique no botão 'Fork' no canto superior direito da página do repositório.
2.  **Clone o seu Fork:** Em seu ambiente local, clone o *seu fork* do repositório:
    ```bash
    git clone https://github.com/SEU_USUARIO/Calcula_Area.git
    cd Calcula_Area
    ```
    (Substitua `SEU_USUARIO` pelo seu nome de usuário no GitHub).
3.  **Adicione o Repositório Original como "upstream" (Opcional, mas recomendado):** Isso permite que você sincronize seu fork com as atualizações do projeto original.
    ```bash
    git remote add upstream https://github.com/REPOSITORIO_ORIGINAL_DO_AMIGO.git
    ```

### Criando uma Nova Branch

Trabalhe sempre em uma nova branch, não na branch `main` (ou `master`) do seu fork. Isso mantém suas alterações isoladas e facilita o processo de Pull Request.

```bash
git checkout -b nome-da-sua-branch-descritiva
```

Dê um nome claro e descritivo à sua branch, como `ajuste-interface-grafica` ou `corrige-calculo-triangulo`.

### Fazendo Suas Alterações

Edite o código ou a documentação conforme necessário. Teste suas alterações localmente antes de enviar.

Depois de fazer suas mudanças:

```bash
git add .
git commit -m "Descreva brevemente a alteração realizada"
git push origin nome-da-sua-branch-descritiva
```

### Mantendo seu Fork Atualizado

Para manter seu fork sincronizado com o repositório original, execute:

```bash
git fetch upstream
git checkout main
git merge upstream/main
git push origin main
```

### Submetendo um Pull Request (PR)

1. Acesse seu repositório no GitHub.
2. Clique em **"Compare & pull request"** na página da sua branch.
3. Adicione uma descrição clara sobre as mudanças realizadas.
4. Clique em **"Create pull request"**.

A equipe de manutenção irá revisar seu PR e poderá aprová-lo, pedir ajustes ou sugerir melhorias.

---

## Guia de Estilo :closed_book:

Para manter o código consistente, siga as diretrizes abaixo:

- Utilize indentação adequada (preferencialmente 4 espaços por nível, se Python).
- Use nomes de variáveis e funções claros e descritivos.
- Escreva comentários quando necessário, especialmente em partes mais complexas.
- Utilize mensagens de commit no imperativo, por exemplo: `Adiciona verificação de entrada nula`.

---

## Código de Conduta :notebook_with_decorative_cover:

Este projeto adota um Código de Conduta com base no respeito e colaboração mútua.

**Resumidamente:**

- Seja respeitoso com outros colaboradores.
- Aceite críticas construtivas.
- Evite linguagem ofensiva, discriminatória ou agressiva.
- Trabalhe com empatia e colaboração.

O objetivo é garantir um ambiente inclusivo, seguro e acolhedor para todos os envolvidos.

---

Muito obrigado por contribuir com o **Calcula_Area**!  
Juntos, podemos tornar este projeto cada vez melhor 🚀

Em caso de dúvidas, não hesite em abrir uma *issue* ou entrar em contato.
