# Sistema de Bilheteria em Java

Projeto individual desenvolvido para a disciplina de Estruturas de Dados. A ideia principal foi criar um sistema de controle de ingressos do zero, manipulando vetores manualmente e **sem utilizar a classe `ArrayList`**.

## O que o sistema faz?
* **Cadastro e Controle:** Permite adicionar ingressos em um vetor com capacidade fixa.
* **Validação de Entrada:** Verifica se o ingresso existe na catraca, autorizando e alterando o status para "UTILIZADO" caso esteja ativo, ou bloqueando se já foi usado ou cancelado.
* **Cancelamento:** Permite cancelar bilhetes ativos e solicitar reembolso, garantindo que ingressos já utilizados ou já cancelados não possam ser cancelados novamente.

## Estrutura do Código
O projeto foi dividido em três classes para organizar as responsabilidades:
1. **`Ingresso.java`**: A classe de modelo que guarda os dados do bilhete (código do cliente, número do ingresso, valor, evento, tipo e status).
2. **`Vetor.java`**: O núcleo de Estruturas de Dados do projeto. Gerencia o array de forma manual e implementa a lógica de busca, adição, validação na catraca e cancelamento.
3. **`ConsultarIngresso.java`**: A classe principal (`main`) que simula a operação do sistema, pré-cadastrando alguns ingressos e interagindo com o usuário via console (`Scanner`).

## Como Executar

Se quiser testar o projeto na sua máquina, siga os passos abaixo pelo terminal:

1. **Clone o repositório:**
   ```bash
   git clone [https://github.com/kauancostatech-web/SistemaBilheteria.git](https://github.com/kauancostatech-web/SistemaBilheteria.git)
