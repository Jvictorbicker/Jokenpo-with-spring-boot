# Jokenpo-with-spring-boot

#🎮 Sobre o projeto

Aplicação backend desenvolvida com Spring Boot que simula uma rodada do jogo Pedra, Papel e Tesoura (Jokenpô).

A cada requisição, o sistema:

Gera uma jogada aleatória para o jogador

Gera uma jogada aleatória para o bot

Calcula o vencedor

Retorna o resultado via endpoint HTTP

#🧱 Arquitetura

O projeto segue uma estrutura em camadas:

Controller → expõe o endpoint REST

Service → contém a lógica do jogo

Model → enum com as jogadas

#Fluxo:

Request → Controller → Game → Player/Bot → Winner → Response
#🛠️ Tecnologias utilizadas

☕ Java 17+

🌱 Spring Boot

📦 Maven

🔗 REST API

▶️ Como executar o projeto
1️⃣ Clonar o repositório
git clone https://github.com/Jvictorbicker/Jokenpo-with-spring-boot.git
2️⃣ Entrar na pasta
cd Jokenpo-with-spring-boot
3️⃣ Rodar a aplicação

No IntelliJ ou pelo terminal:

./mvnw spring-boot:run

ou no Windows:

mvnw.cmd spring-boot:run
🌐 Endpoint
🎯 Jogar uma rodada
GET http://localhost:8080/game
✅ Exemplo de resposta
Player: PAPEL | Bot: PEDRA | Resultado: Jogador venceu

