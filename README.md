# 🎟️ Sistema de Bilheteria em Java

Projeto desenvolvido para a disciplina de Estruturas de Dados. O objetivo principal aqui foi **fugir do `ArrayList`**[cite: 3, 4, 5] e aprender como as coisas funcionam por baixo do capô, criando a nossa própria manipulação manual de vetores[cite: 5].

## 👥 O que o projeto faz?
A gente criou um sistema simples para controlar a venda e a validação de ingressos de eventos. Ele permite:
* Cadastrar ingressos com limite de capacidade definido[cite: 5].
* Pesquisar bilhetes pelo código[cite: 5].
* Validar a entrada na catraca (verificando se o ingresso está ativo, se já foi usado ou se foi cancelado)[cite: 5].
* Cancelar ingressos e solicitar reembolso com segurança[cite: 5].

## 🛠️ Como a gente estruturou o código
Dividimos o projeto em três arquivos principais para deixar organizado:
1. **`Ingresso.java`**: É a classe de modelo (entidade) que guarda as informações do bilhete (código, status, etc.)[cite: 4].
2. **`Vetor.java`**: É o coração do trabalho em Estruturas de Dados[cite: 5]. Aqui a gente gerencia o array de forma manual, controlando o tamanho e implementando as lógicas de busca, adição, validação e cancelamento[cite: 5].
3. **`ConsultarIngresso.java`**: É a classe principal (`main`) onde a gente testa tudo rodando simulações e interagindo via console (`Scanner`)[cite: 3].

## 🚀 Como rodar na sua máquina

Se quiser testar aí no seu computador, é bem simples:

1. Clone este repositório:
   ```bash
   git clone [https://github.com/seu-usuario/seu-repositorio.git](https://github.com/seu-usuario/seu-repositorio.git)
