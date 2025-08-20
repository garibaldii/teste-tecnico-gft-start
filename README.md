# DESAFIO TECNICO GFT START #7

- Linguagem Utilizada: Java
- IDE: Intellij


## Desafio 1 - COFRE SONORO:

Você deve criar um programa que simule um cofre digital com senha sonora. O cofre só pode ser aberto se uma sequência correta de "notas musicais" for inserida.

### Desafio:
• A classe CofreSonoro deve encapsular a sequência de desbloqueio.
• A senha sonora é composta por 4 notas (ex: "DÓ", "RÉ", "MI", "FÁ").
• O usuário pode tentar até 3 sequências por execução.
• Se acertar, imprime: " Cofre aberto com sucesso!"
• Caso erre, imprime: "Sequência incorreta."


### Entrada:
DÓ RÉ MI FÁ


### Saída:
Cofre aberto com sucesso!
### Exemplo:

|      ENTRADA       |       SAIDA                |
|:------------------:|:--------------------------:|
| DÓ RÉ MI FÁ        | Cofre aberto com sucesso!  |
|  a b c d e         |  Sequência incorreta.      |

## Resolução - Desafio 1:

Na resolução, comecei criando um scanner para ler a entrada do usuário no console. Toda a lógica ficou dentro de um método chamado execute, deixando o main apenas para instanciar a classe e chamar esse método.

Usei um contador para controlar as tentativas. Enquanto o contador fosse menor que três, o programa pedia quatro notas musicais separadas por espaço. A sequência digitada era comparada com a senha correta “DÓ RÉ MI FÁ”.

Se a sequência estivesse correta, o programa exibia a mensagem de sucesso e encerrava a execução. Caso contrário, o contador era incrementado e era exibida a mensagem de erro, indicando quantas tentativas já haviam sido usadas.

Por fim, se o limite de três tentativas fosse atingido, aparecia a mensagem de bloqueio, informando que o usuário deveria tentar novamente mais tarde.


[Desafio 1 - Cofre Sonoro](https://github.com/garibaldii/teste-tecnico-gft-start/blob/master/src/main/java/questoes/q1_safe_sound/SafeSound.java)

___

## Desafio 2 - Inventário de Criaturas :

Implemente um sistema que gerencie criaturas místicas. Você deve ter uma classe base
Criatura e classes derivadas como Dragao, Fenix, Grifo.

## Regras
• Cada criatura possui Nome, Poder, ForçaBase.
• Cada subclasse implementa uma fórmula própria para calcular ForcaTotal.
• O programa deve mostrar a criatura mais poderosa baseada na força total.
// Saída esperada:
Criatura mais poderosa: Fenix (Poder: Renascimento, Força Total: 187)

___

## Resolução - Desafio 2:

### Modelação das Classes

Na implementação da classe Creature, a ideia foi estruturar uma base comum para todas as criaturas do desafio. Para isso, criei uma classe abstrata, já que ela não deve ser instanciada diretamente, mas sim servir de modelo para as subclasses.

Nela defini atributos genéricos como nome, poder e força base, além dos respectivos métodos getters e setters. Também criei um construtor para facilitar a inicialização desses valores.

O ponto principal foi o uso do conceito de herança. Declarei um método abstrato chamado getTotalStrenght, que não tem corpo na classe base. Isso força cada subclasse (como Phoenix, Griff e Dragon) a implementar sua própria fórmula de cálculo da força total. Dessa forma, consegui padronizar a estrutura das criaturas, mas ao mesmo tempo deixei espaço para o polimorfismo, já que cada tipo de criatura vai se comportar de forma diferente nesse cálculo.

### Controller

Na classe CreatureController a ideia foi centralizar a lógica de controle do inventário de criaturas. Para resolver o problema de encontrar a mais poderosa, criei um método chamado getMostBrutalCreature que recebe uma lista de criaturas como parâmetro.

Dentro desse método, primeiro tratei casos especiais, como lista nula ou vazia. Em seguida, usei uma variável auxiliar para guardar a criatura mais forte até o momento, começando pela primeira da lista. Depois percorri todas as criaturas com um laço for e, a cada iteração, comparei a força total da criatura atual com a que estava armazenada como mais poderosa. Caso fosse maior, atualizava a referência.

No final, o método retorna uma string formatada com o nome, o poder e a força total da criatura vencedora.

No método main, criei uma lista de criaturas, adicionei instâncias de Phoenix, Griff e Dragon, e chamei o método getMostBrutalCreature para exibir no console o resultado da comparação.

[Desafio 2 - Inventário de Criaturas](https://github.com/garibaldii/teste-tecnico-gft-start/tree/master/src/main/java/questoes/q2_creatures_tail)


## Desafio 3 - Sistema de Biblioteca (POO + Lógica) PROMPT!!!:

Você precisa desenvolver um sistema simples de gerenciamento de biblioteca em
C#/Java.

## Regras
1. Ter uma classe Livro com propriedades como Titulo, Autor e AnoPublicacao.
2. Ter uma classe Biblioteca que armazene uma lista de livros.
3. Permitir adicionar novos livros, listar todos os livros e buscar livros por autor.
4. (Desafio extra) – Permitir remover livros da biblioteca.


## Resolução - Desafio 3:

Para resolver esse desafio, eu pensei em organizar o sistema de forma bem simples, mas seguindo a ideia de um padrão MVC. Comecei criando a classe Livro, que funciona como meu modelo básico. Nela coloquei as propriedades título, autor e ano de publicação, além do construtor e os getters e setters.

Depois fiz a classe Biblioteca, que também é um modelo, mas dessa vez representando a própria biblioteca em si. Ela tem o nome e uma lista de livros, junto com construtor e métodos de acesso.

A parte principal ficou na classe BibliotecaController, onde concentrei toda a lógica. Foi ali que implementei os métodos para adicionar, listar, atualizar, deletar e buscar livros por autor. Também coloquei validações para evitar duplicidade de livros (mesmo título e autor) e para verificar se um livro existe antes de atualizar ou excluir.

Além disso, pensei nas mensagens de notificação para o usuário, tanto de sucesso quando uma operação dá certo quanto de erro quando algo não é permitido.

Por fim, deixei configurado o uso de um banco MySQL rodando em Docker para armazenamento, com as credenciais que defini no arquivo de configuração.

[Desafio 3 - Sistema de Biblioteca (POO + Lógica) PROMPT!!! ](https://github.com/garibaldii/teste-tecnico-gft-start/blob/master/src/main/java/questoes/q3_prompt/file.md)
