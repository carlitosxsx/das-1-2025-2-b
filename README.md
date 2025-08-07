# Aula 2 - 31/07/2025

## Abstração
Representar problemas do mundo palpável em programas com o objetivo de reduzir a complexidade no desenvolvimento de software. Ou seja, abstrações mais fieis e completas facilitam a manutenção de projetos de software.

## Complexidade
Assim como o processo de desenvolvimento de software, o mundo real também é complexo, logo, mesmo que o objetivo da abstração seja reduzir essa complexidade ela ainda é pertinente. Por isso, particionar e encapsular os componentes de um sistema é fundamendal na evolução do software.

## Framework
A escolha e o dominio sobre um framwork para um projeto de software é uma peça fundamental pra facilitar a comunicação entre os componentes.

## Estrutura de Dados
Principal característica valorizada pelas big techs pois é através do uso correto de cada estrutura que permite o sistema atenda a milhares de usuários todos os dias.

## _Information Hiding_
Ocultar a lógica desenvolvida em uma aplicação transforma as ações que a aplicação executa mais simples. Logo, para o usuário como sua solicitação está sendo atendida não importa, contanto que ela chegue no resultado esperado.

## Encapsulamento
Pilar da POO que oculta e protege as informações do código, exemplo métodos getter() e setter()

# Aula 3 - 04/08/2025

> "Maximize a coesão das classes e minimize o acoplamento entre elas."

## Coesão
Toda classe deve ter uma única responsabilidade, ou seja, um código que deve realizar uma tarefa bem feita. Isso possibilita algumas vantagens:
- Facilitar a implementação;
- Facilitar a alocação de um único recurso para manter a classe;
- Facilita o reuso e teste de uma classe

## Acoplamento

Força de conexão entre duas classes. Diz-se uma classe fortemente acoplável aquela que fica "amarrada" a outra, ou seja, remover um simples método de uma classe associada a outra pode gerar erros na outra classe, enquanto uma baixamente acoplável é adaptátvel, como um cabo USB.

# Aula 4 - 07/08/2025

## SOLID

### Princípio da Responsabilidade Única (**S**)

Esse princípio é uma aplicação direta da ideia de coesão.

Entity <-- Dados
Repository <-- JPA spring data
Services <-- Lógica(use cases)
Controller <-- Api rest

Seta de Herança - Seta com ponta vazada (aberta) e linha contínua
Seta de Variável - Seta com ponta fechada e linha contínua
Seta de Interface - Seta com ponta vazada (aberta) e linha tracejada
Seta de Associação - Seta com ponta fechada e linha tracejada

### Príncio da Segregação de Interface (**I**)

Esse princípio está diretamente relacionado à ideia de coesão, mas com foco específico na definição de responsabilidades das interfaces. Em outras palavras, cada interface deve ser projetada para atender exclusivamente às necessidades de uma entidade ou funcionalidade específica.

No exemplo apresentado em aula, foi desenvolvida uma interface gráfica utilizando a biblioteca Swing do Java, que realiza duas ações distintas:

- Exibir uma janela modal com uma mensagem na tela
- Registrar e exibir os movimentos do mouse

Embora ambas as ações estejam dentro do mesmo contexto visual, a separação das responsabilidades é clara. Cada tipo de evento é tratado por uma interface específica, o que reforça a aplicação do princípio da segregação.

Essa abordagem evita que uma única interface assuma múltiplas responsabilidades, tornando o sistema mais modular, compreensível e fácil de manter.