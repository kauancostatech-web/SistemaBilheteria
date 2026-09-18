# 🎟️ Sistema de Bilheteria em Java

🎯 **Destaque Técnico para Recrutadores e Gestores:** Projeto individual desenvolvido com foco em **Estruturas de Dados**, implementando a manipulação manual de vetores e controle rigoroso de capacidade do zero, **sem utilizar a classe `ArrayList`**. Isso demonstra forte domínio de lógica algorítmica, gerenciamento de memória e orientação a objetos.

## 📌 O que o sistema faz?
* **📥 Cadastro e Controle:** Permite adicionar ingressos em um vetor gerenciado manualmente com capacidade fixa.
* **🛡️ Validação de Entrada (Catraca):** Verifica a existência do bilhete, autoriza e altera o status dinamicamente (`ATIVO` ➔ `UTILIZADO`), ou bloqueia entradas duplicadas e canceladas com segurança.
* **💸 Cancelamento com Regras de Negócio:** Processa solicitações de reembolso bloqueando tentativas inválidas (como tentar cancelar ingressos já utilizados ou já cancelados).

## 🏗️ Fluxo e Processo Ilustrativo do Sistema

```text
  +===================================================+
  |              ConsultarIngresso (Main)             | <--- 🎮 Interface / Interação via Console (Scanner)
  +===================================================+
                            |
         1. Inicia o sistema e gerencia o fluxo
                            v
  +===================================================+
  |                     Vetor.java                    | <--- ⚙️ Core de Estruturas de Dados (Manipulação Manual)
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
  |                   Ingresso.java                   | <--- 📦 Camada de Domínio / Entidade (Encapsulamento)
  |    (Objeto/Entidade que guarda dados e status)    |
  +===================================================+


