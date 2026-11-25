<div align="center">

# ⚔️ Diablo do Pé-Verde

### Uma aventura pelas profundezas, construída com Java e Greenfoot.

**Projeto acadêmico de Introdução à Programação Orientada a Objetos**  
Universidade Federal de Lavras (UFLA) · 2026/2

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Greenfoot](https://img.shields.io/badge/Greenfoot-2E7D32?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Em%20desenvolvimento-F0AD4E?style=for-the-badge)

</div>

---

## 🏰 Sobre o jogo

**Diablo do Pé-Verde** é um jogo de ação com temática de masmorra, desenvolvido em **Java** com o ambiente **Greenfoot**. O jogador enfrenta inimigos enquanto explora um cenário inspirado em aventuras de fantasia sombria.

O projeto foi criado para aplicar, na prática, conceitos de **programação orientada a objetos**, como herança, encapsulamento, especialização de classes e interação entre objetos.

A proposta do jogo contempla **três fases**, com progressão entre andares e um confronto final. Parte dessas mecânicas ainda está em implementação.

## 🎮 Como jogar

| Ação | Tecla |
| :--- | :---: |
| Mover para cima | `W` |
| Mover para a esquerda | `A` |
| Mover para baixo | `S` |
| Mover para a direita | `D` |
| Atacar inimigos próximos | `Espaço` |
| Iniciar partida no menu | `Enter` |
| Abrir instruções no menu | `I` |
| Voltar das instruções | `Esc` |

> **Observação:** os comandos de movimento e ataque estão implementados em `Jogador.java`. A tela de instruções do jogo ainda exibe um aviso antigo de que os controles estão em desenvolvimento.

## 🖼️ Prévia do cenário

![Cenário da primeira fase](Trio%20MSN/images/piso_fase1_16bits.png)

*Arte utilizada como cenário da primeira fase.*

## 🚀 Executando o projeto

1. Instale o [Greenfoot](https://www.greenfoot.org/download).
2. Clone este repositório ou baixe-o como ZIP:

   ```bash
   git clone https://github.com/SEU-USUARIO/Trabalho-IPOO.git
   ```

3. Abra o Greenfoot e selecione o arquivo `Trio MSN/project.greenfoot`.
4. Caso o Greenfoot não abra diretamente no menu, crie um mundo da classe `TelaInicial` pelo painel de classes.
5. Clique em **Run** e pressione `Enter` no menu para iniciar.

> Substitua `SEU-USUARIO` pelo proprietário real do repositório, caso utilize o comando de clonagem acima.

## 🧩 Estrutura do projeto

```text
Trio MSN/
├── Fase.java              # Base das fases, cronômetro e transições
├── Fase1.java             # Primeira fase e posicionamento dos personagens
├── Fase2.java             # Estrutura da segunda fase
├── Fase3.java             # Estrutura da terceira fase
├── Personagem.java        # Atributos e comportamentos compartilhados
├── Jogador.java           # Movimento, ataque e recebimento de dano
├── Inimigo.java           # Inimigo com movimentação por percurso
├── Perseguidor.java       # Inimigo que segue o jogador ao detectá-lo
├── Vida.java              # Controle dos pontos de vida
├── Partida.java           # Registro de tempo e pontuação por fase
├── TelaInicial.java       # Menu principal
├── TelaInstrucoes.java    # Instruções do jogo
├── TelaFinal.java         # Telas de vitória e derrota
├── images/                # Sprites e cenários
├── sounds/                # Efeitos sonoros e música
└── project.greenfoot      # Arquivo do projeto Greenfoot
```

## 🛠️ Tecnologias e conceitos

- **Java:** lógica, classes, objetos e regras do jogo.
- **Greenfoot:** cenários, atores, entrada do teclado, áudio e ciclo de execução.
- **Programação orientada a objetos:** herança (`Jogador` e `Inimigo` derivam de `Personagem`), encapsulamento e composição (por exemplo, `Personagem` utiliza `Vida`).
- **Coleções Java:** listas para inventário, busca de alvos e registro de resultados.

## ⚙️ Funcionalidades

| Recurso | Situação no código |
| :--- | :--- |
| Menu inicial e tela de instruções | Implementado |
| Movimento com WASD | Implementado |
| Ataque de curta distância | Implementado |
| Inimigo com patrulha | Implementado |
| Inimigo que persegue o jogador | Implementado |
| Sistema básico de vida e dano | Implementado |
| Cronômetro por fase | Implementado |
| Registro de resultados e tela final | Estrutura implementada |
| Conteúdo jogável das fases 2 e 3 | Pendente |
| Pontuação real por ações do jogador | Pendente |
| Saídas de fase, chefe final e coleta de itens | Pendente |
| Integração completa de derrota e progressão | Pendente |

**Estado atual:** a primeira fase instancia jogador e inimigos. As classes de progressão, vitória e derrota existem, mas nem todos os eventos que as acionariam estão conectados à jogabilidade. O placar ainda registra zero pontos por fase.

## 👥 Equipe

Desenvolvido pelo **Trio MSN**, como trabalho final da disciplina de **Introdução à Programação Orientada a Objetos**, na **Universidade Federal de Lavras (UFLA)**.

- **Carlos Henrique Pereira**
- **Bruno Gualberto**
- **Luís Macedo**

**Período:** 2026/2

---

<div align="center">

*Feito com Java, Greenfoot e uma boa dose de exploração de masmorras.* ⚔️

</div>
