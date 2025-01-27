FROM maven:3.8.5-jdk-11

WORKDIR /app
COPY . .
RUN mvn clean install -DskipTests

CMD mvn spring-boot:run