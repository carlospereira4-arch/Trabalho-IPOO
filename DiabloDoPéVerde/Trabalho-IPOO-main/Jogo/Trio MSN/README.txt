DIABLO DO PÉ-VERDE
=================
Uma aventura de masmorras desenvolvida em Java e Greenfoot.

Projeto acadêmico de Introdução à Programação Orientada a Objetos
Universidade Federal de Lavras (UFLA) | 2026/2
Status: Em desenvolvimento


1. SOBRE O JOGO
---------------
Diablo do Pé-Verde é um jogo de ação com temática de masmorra. O jogador
explora um cenário de fantasia sombria e enfrenta inimigos. O projeto
aplica conceitos de programação orientada a objetos, como herança,
encapsulamento, composição e interação entre classes.

A proposta prevê três fases, progressão entre andares e um confronto
final. Algumas dessas funcionalidades ainda estão em desenvolvimento.


2. CONTROLES
------------
W       - Mover para cima
A       - Mover para a esquerda
S       - Mover para baixo
D       - Mover para a direita
Espaço  - Atacar inimigos próximos
Enter   - Iniciar a partida no menu
I       - Abrir instruções no menu
Esc     - Voltar da tela de instruções

Observação: os comandos de movimento e ataque já estão implementados
em Jogador.java. A tela de instruções do jogo ainda apresenta um aviso
antigo de que os controles estão em desenvolvimento.


3. COMO EXECUTAR
----------------
1) Instale o Greenfoot: https://www.greenfoot.org/download
2) Extraia os arquivos do projeto, caso estejam em um arquivo ZIP.
3) Abra o Greenfoot e selecione "Trio MSN/project.greenfoot".
4) Se o menu não aparecer automaticamente, crie um mundo da classe
   TelaInicial pelo painel de classes.
5) Clique em Run e pressione Enter no menu para começar.


4. ESTRUTURA DO PROJETO
-----------------------
Pasta principal: Trio MSN/

Fase.java             - Base das fases, cronômetro e transições
Fase1.java            - Primeira fase e posicionamento dos personagens
Fase2.java            - Estrutura da segunda fase
Fase3.java            - Estrutura da terceira fase
Personagem.java       - Atributos e comportamentos compartilhados
Jogador.java          - Movimento, ataque e recebimento de dano
Inimigo.java          - Inimigo com movimentação por percurso
Perseguidor.java      - Inimigo que segue o jogador ao detectá-lo
Vida.java             - Controle dos pontos de vida
Partida.java          - Registro de tempo e pontuação por fase
TelaInicial.java      - Menu principal
TelaInstrucoes.java   - Instruções do jogo
TelaFinal.java        - Telas de vitória e derrota
images/                - Sprites e cenários
sounds/                - Efeitos sonoros e música
project.greenfoot      - Arquivo do projeto Greenfoot


5. TECNOLOGIAS E CONCEITOS
--------------------------
Java: lógica, classes, objetos e regras do jogo.
Greenfoot: cenários, atores, teclado, áudio e ciclo de execução.
Orientação a objetos: herança, encapsulamento e composição.
Coleções Java: listas para inventário, alvos e resultados.


6. FUNCIONALIDADES E ESTADO ATUAL
---------------------------------
IMPLEMENTADO:
- Menu inicial e tela de instruções
- Movimento com WASD
- Ataque de curta distância
- Inimigo com patrulha
- Inimigo que persegue o jogador
- Sistema básico de vida e dano
- Cronômetro por fase

ESTRUTURA IMPLEMENTADA, MAS INTEGRAÇÃO INCOMPLETA:
- Registro de resultados e tela final
- Fluxos de vitória, derrota e progressão

PENDENTE:
- Conteúdo jogável das fases 2 e 3
- Pontuação real por ações do jogador
- Saídas de fase, chefe final e coleta de itens

A primeira fase já instancia jogador e inimigos. O placar ainda registra
zero pontos por fase, e nem todos os eventos de progressão e término
de partida estão conectados à jogabilidade.


7. EQUIPE
---------
Trio MSN
Carlos Henrique Pereira
Bruno Gualberto
Luís Macedo

Trabalho final da disciplina de Introdução à Programação Orientada
a Objetos, Universidade Federal de Lavras (UFLA), 2026/2.


Desenvolvido com Java e Greenfoot.
