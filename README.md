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
classDiagram
    class ConsultarIngresso {
        +main(String[] args)
    }
    class Vetor {
        -Ingresso[] ingressos
        -int tamanho
        +Vetor(int capacidade)
        +Ingresso pesquisar(int codigo)
        +adicionar(Ingresso ingresso)
        +validarIngresso(int codigo)
        +cancelarIngresso(int codigo)
    }
    class Ingresso {
        -int codCliente
        -int ingresso
        -double ValorIngresso
        -String Evento
        -String TipoIngresso
        -String Status
        +getIngresso() int
        +setIngresso(int ingresso)
        +getStatus() String
        +setStatus(String status)
    }
    ConsultarIngresso --> Vetor : usa
    Vetor --> Ingresso : gerencia array

Capacidade Definida no Construtor (ex: 3 posições)
Atributos: tamanho = 3

Gaveta de Ingressos (Array):
+---------------------+---------------------+---------------------+
| Ingresso 1 (101)    | Ingresso 2 (102)    | Ingresso 3 (103)    |
| Status: ATIVO       | Status: ATIVO       | Status: ATIVO       |
+---------------------+---------------------+---------------------+
         [0]                   [1]                   [2]          <-- Índices

