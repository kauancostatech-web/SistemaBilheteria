# Sistema de Bilheteria em Java

Projeto individual desenvolvido para a disciplina de Estruturas de Dados. A ideia principal foi criar um sistema de controle de ingressos do zero, manipulando vetores manualmente e **sem utilizar a classe `ArrayList`**.

## O que o sistema faz?
* **Cadastro e Controle:** Permite adicionar ingressos em um vetor com capacidade fixa.
* **Validação de Entrada:** Verifica se o ingresso existe na catraca, autorizando e alterando o status para "UTILIZADO" caso esteja ativo, ou bloqueando se já foi usado ou cancelado.
* **Cancelamento:** Permite cancelar bilhetes ativos e solicitar reembolso, garantindo que ingressos já utilizados ou já cancelados não possam ser cancelados novamente.

---

## 📊 Diagrama do Sistema

### 1. Diagrama de Classes
```mermaid
# Sistema de Bilheteria em Java

Projeto individual desenvolvido para a disciplina de Estruturas de Dados. A ideia principal foi criar um sistema de controle de ingressos do zero, manipulando vetores manualmente e **sem utilizar a classe `ArrayList`**.

## O que o sistema faz?
* **Cadastro e Controle:** Permite adicionar ingressos em um vetor com capacidade fixa.
* **Validação de Entrada:** Verifica se o ingresso existe na catraca, autorizando e alterando o status para "UTILIZADO" caso esteja ativo, ou bloqueando se já foi usado ou cancelado.
* **Cancelamento:** Permite cancelar bilhetes ativos e solicitar reembolso, garantindo que ingressos já utilizados ou já cancelados não possam ser cancelados novamente.

## Fluxo e Processo Ilustrativo do Sistema

```text
  +===================================================+
  |              ConsultarIngresso (Main)             |
  +===================================================+
                            |
         1. Inicia o sistema e instancia o Vetor
                            v
  +===================================================+
  |                     Vetor.java                    |
  |   (Gerencia a memória e array de forma manual)    |
  +===================================================+
        |                     |                  |
        v                     v                  v
  [adicionar()]        [validarIngresso()]  [cancelarIngresso()]
        |                     |                  |
        +---------------------+------------------+
                              |
                              v
  +===================================================+
  |                   Ingresso.java                   |
  |    (Objeto/Entidade que guarda dados e status)    |
  +===================================================+
