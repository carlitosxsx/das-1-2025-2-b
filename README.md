# Aula 2 - 31/07/25

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

# Aula 3 - 04/08/25

> "Maximize a coesão das classes e minimize o acoplamento entre elas."

## Coesão
Toda classe deve ter uma única responsabilidade, ou seja, um código que deve realizar uma tarefa bem feita. Isso possibilita algumas vantagens:
- Facilitar a implementação;
- Facilitar a alocação de um único recurso para manter a classe;
- Facilita o reuso e teste de uma classe

## Acoplamento

Força de conexão entre duas classes. Diz-se uma classe fortemente acoplável aquela que fica "amarrada" a outra, ou seja, remover um simples método de uma classe associada a outra pode gerar erros na outra classe, enquanto uma baixamente acoplável é adaptátvel, como um cabo USB.

# Aula 4 - 07/08/25

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

Embora ambas as ações estejam dentro do mesmo contexto visual, a separação das responsabilidades é clara. Cada tipo de evento é tratado por uma interface específica.

# Aula 5 - 11/08/25

### Príncio da Inversão de Dependências (**D**)

> "Prefira Interfaces a Classes"

Exemplo levando em consideração a disciplina de fábrica de software:
Os controladores devem estabeler dependências prioritaramente com as interfaces de serviço e não com as implementações de serviço concretas.

Tal princípio atua na redução do acoplamento.

### Prefira Composição a Herança

Herança expoe para subclasses detalhes de implementação das classes pai, o que viola o princípio do encapsulamento em POO, por isso, é preferível o uso de composições (associações)

Herança só deve ser utilizada caso as subclasses são uma divisão exata (uma substituição). Exemplo:

![alt text](/imgs/image.png)
\
Um gato não pode se tornar um cachorro

![alt text](/imgs/image-1.png)
\
Um funcionário pode se tornar um cliente.

### Princípio de Demeter (**D**)

A implementação de um método deve chamar apenas os seguintes outros métodos:

- CASO 1: de sua própria classe;
- CASO 2: de objetos passados como parâmetros;
- CASO 3: de objetos criados pelo próprio método;
- CASO 4: de atributos da classe do método.

O exemplo utilizado na aula para representar o uso do princípio, foi o da criação da janela utilizando a biblioteca Swing, onde o construtor Janelinha() atende as definições acima.

### Principio de Aberto/Fechado (**O**)

Uma classe deve estar fechada para modificações e aberta para extensões.

Classe Abstrata: pegar uma classe e misturar com uma interface (meio incompleta).
Isso significa projetá-la de forma a permitir novas funcionalidades sem alterar seu código, usando recursos como herança, funções lambda e padrões de projeto, garantindo flexibilidade e adaptabilidade.

O exemplo utilizado na aula para representar o uso do princípio, foi o da manipulação das propriedades de uma tabela utilizando a biblioteca JFRAME.

# Aula 6 - 14/08/25

### Princípio de Substituição de Liskov (**L**)

Herança define uma relação é-um entre objetos de uma classe base e objetos de subclasses.
Quando se tem uma herança, subclasses precisam dos mesmos métodos que o pai.
Substitui um filho por outro, sem ter perda.

## DESIGN PATTERNS

[Refactoring Guru] (https://refactoring.guru/pt-br/design-patterns)

Padrões de projeto para desenvolvimento de software, podem ser de criação, estruturais ou comportamentais.

### Singleton

Padrão de criação que permite garantir que uma classe tenha apenas uma instância, ao mesmo tempo em que fornece um ponto de acesso global a essa instância.

Variáveis estáticas, únicas e globais.

# Aula 7 - 18/08/25

- Implementação Singleton

# Aula 8 - 21/08/25

- Implementação Observer

# Aula 9 - 25/08/25

- Implementação Observer

# Aula 10 - 28/08/25

Estrututa de um projeto de software é composto por características da arquitetura, decisões da arquitetura e princípios de design.

## CARACTERÍSTICAS

Iguais a requisitos não funcionais. Dificilmente há sistemas que implementem um software com todas as características, por isso é importante determinar as mais importantes para o sistema.

- Diponibilidade;
- Confiabilidade;
- Testabilidade;
- Escalabilidade;
- Segurança;
- Agilidade;
- Tolerância a falhas;
- Elasticidade;
- Recuperabilidade;
- Desempenho;
- Implementabilidade;
- Capacidade de aprendizadem.

## DECISÕES

Quanto se toma a decisão de qual modelo arquitetural será utilizado no desenvolvimento do projeto, ou seja, essas decisões definem as regras de como um sistema deve ser construído. As decisões da arquitetura formam os limites do sistema e orientam as equipes de desenvolvimento sobre o que é ou não permitido.

## PRINCÍPIOS

> Sempre que possível, utilize a mensageria assincrona entre os serviços para aumentar o desempenho.

- Diretriz a ser seguida.

 Uma decisão (regra) da arquitetura nunca consegue abranger todas as condições e opções para a comunicação entre os serviços, portanto um princípio do design pode ser usado para orientar o método preferido.

 # Aula 11 - 01/09/25

- **Expectativas de um arquiteto**
  - Tomar decisões na aquitetura, manter-se atualizado. 
  - Tem uma experiência vasta em vários tipos de sistemas
  - Precisa assegurar a conformidade nas decisões 
  - Precisa ter um conhecimento na gestão 
  - Ter habilidades interpessoais
  - Entender e lidar com questões políticas

- **Decisões de arquitetura**
  - Arquiteto deve ORIENTAR - Um arquiteto deve orientar, não especificar as escolhas da tecnologia
  - Conhecimento técnico e amplo e conhecimento do negógio

- **Analisar continuamento a arquitetura**
  - Um arquiteto deve analisar continuamente a arquitetura e o ambiente de tecnologia atual, para então recomendar soluções de melhorias.
  - Pensar nas evoluçãoes, não acumular, conecer as tendências
  - Padronização dos sistema 

- **Manter-se atualizado**
  - As decisões que um arquiteto toma tendem a ser de longo prazo e difíceis de mudar. 
  - Entender e seguir as principais tendências contribui para que ele se prepare para o futuro e tome a decisão certa.

- **Domínio do negócio**
> Um arquiteto deve ter certo nível de especialização no domínio do negócio.
Sem conhecimento do domínio do negócio, não entende-se o problema comercial, as metas e os requisitos, complicando planejar uma arquitetura eficiente para atender aos requisitos da empresa

- **DevOps**
  - Conceito: Entregar valor para o cliente
  - Planejar- codar - publicar código em um lugar central (precisa de ferramentas) - implantar (publicar para o clinete final) - monitorar - verificar feedback
  - Controle de conversão 
  - Continuous integration
 
# Aula 12 - 04/09/25

## Resuma a diferença entre: Arquitetura e Design

Arquitetura: define a estrutura fundamental do sistema, buscando  decisões que conectam os requisitos de negócio com soluções técnicas, servindo como uma ponte entre o dominío do problema e a solução a ser adotada. Essas decisões impactam diretamente na viabilidade, manutenibilidade e evolução do sistema ao longo do tempo.

Design: detalha como cada parte do sistema será implementada, a partir das diretrizes definidas pelos artefatos gerados pelo arquiteto. O design é mais flexível e iterativo, podendo ser ajustado conforme o desenvolvimento avança.

## Como é a formação do conhecimento de um arquiteto modelo T?

A formação de um arquiteto modelo T se dá por meio de uma combinação equilibrada entre amplitude e profundidade de conhecimento. Esse profissional desenvolve uma base sólida em diversas tecnologias, linguagens, padrões e práticas de engenharia de software, o que lhe permite dialogar com diferentes times (principalmente com a equipe de desenvolvimento) e compreender todo o ecossistema técnico. Ao mesmo tempo, ele aprofunda seus conhecimentos em uma ou mais áreas específicas, nas quais atua como especialista técnico.

# Aula 13 - 08/09/25

## Trade-off

### Arquitetura de Tópico

- Se o destinatário inscrito no tópico cair, ele não recebe o tópico. Resalva para algumas arquiteturas de tópico que realizam esse armazenamento;
- 1 para N;
- Implementção de um novo "serviço é mais simples, pois não é necessário manutenir nem o tópico e nem o serviço que enviar;
- A mesma mensagem será enviada para os serviçoes incritos (menor acoplamento)

### Arquitetura de Fila

- O destinatário busca a mensagem que ele quer na fila e depois processa sua cópia (pooling);
- Por se tratar de uma fila, ela armazena a mensagem caso não seja entregue ao destinatário;
- Sender (quem envia) e Receiver (quem recebe);
- 1 para 1;
- Pode enviar mensagens diferentes para os serviços devido a relação 1 para 1(maior acoplamento)

### Arquitetura FAN-out

![Exemplo de arquitetura FAN-out](/imgs/image-2.png)

# Aula 14 - 11/09/25

- Dependencia azure-messaging-servicebus: Conectar com o service bus no Azure
- Dependencia azure-identity: Autenticador do Azure

# Aula 15 - 18/09/25

- Implementação Publisher

# Aula 16 - 18/09/25

- Implementação Subscriber

# Aula 17 - 22/09/25

- Prova

# Aula 18 - 25/09/25

- AWS User Group

# Aula 20 - 29/09/25

- Aula para ajustar o repositório

# Aula 21 - 02/09/25

- Implementação de arquitetura de fila em código

# Aula 22 - 06/10/25

[Capítulo 4] (https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/26[%3Bvnd.vst.idref%3Dcap4.xhtml]!/4/2/68/4/4)

Os requisitos não-funcionais, ou melhor definidos como características da arquitetura, são essenciais porque determinam como o sistema deve se comportar, independentemente de suas funcionalidades específicas.

## Características Operacionais

Dizem respeito a como o sistema se comporta em execução. São exemplos de caractererísticas operacionais:

- Disponibilidade:	Quanto tempo o sistema deve permanecer ativo e disponível (ex: 24/7). É necessário planejar para evitar e recuperar rapidamente de falhas.

- Desempenho:	Envolve testes de estresse, análise de pico, frequência de uso das funções, tempos de resposta etc. Muitas vezes requer um processo demorado e detalhado de validação.

- Escalabilidade: Capacidade de o sistema continuar funcionando adequadamente quando há aumento no número de usuários ou requisições.

## Características Estruturais

Dizem respeito à organização interna do sistema, ou seja, à forma como o código é estruturado, mantido e evoluído

Vale ressaltar que qualquer lista de características da arquitetura será necessariamente incompleta, pois qualquer software pode inventar características importantes com base em fatores únicos.

# Aula 23 - 09/10/25

## Circuit Breaker Patern

Ajuda a lidar com falhas que podem levar vários períodos de tempo para se recuperar quando um aplicativo se conecta a um serviço, bloqueando temporariamente o acesso a um serviço defeituoso depois de detectar falhas. Além disso permite que um aplicativo detecte quando a falha é resolvida.

Objetivo: evitar tentativas malsucedidas repetidas para que o sistema possa se recuperar efetivamente.

A implementação do design pattern funciona como uma máquina de estados que inclui os seguintes estados:

- **Fechado (_Closed_)**: A aplicação está fazendo chamadas para a nossa máquina. Se a chamada não for bem-sucedida, será incrementado na contagem. Se o número de falhas recentes exceder um limite especificado dentro de um determinado período de tempo, máquina será colocado no estado `Aberto` 

- **Aberto (_Open_)**: A cada vez que chega nesse estado, inicia um temporizador com um período de tempo determinado anteriomente. Quando o tempo expirar, a máquina será colocado no estado `Meio Aberto`

- **Meio Aberto (_Half Opened_)**: Um número limitado de solicitações do aplicativo tem permissão para realizar chamadas. Se essas solicitações forem bem-sucedidas, o disjuntor mudará para o estado Fechado. Nesse momento, o cotador de falhas é redefinido e se alguma solicitação falhar, o dijunto retorna para o estado Aberto. 

Observação: o estado meio aberto impede que um serviço de recuperação seja inundado repentinamente com solicitações.