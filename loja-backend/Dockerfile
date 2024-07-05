# Usar a imagem base do openjdk:17-jdk-slim
FROM openjdk:17-jdk-slim

# Definir o diretório de trabalho no contêiner
WORKDIR /app

# Copiar o arquivo JAR da aplicação para o contêiner
COPY build/libs/loja-backend-0.0.1-SNAPSHOT.jar app.jar

# Expor a porta que a aplicação vai rodar
EXPOSE 8080

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
