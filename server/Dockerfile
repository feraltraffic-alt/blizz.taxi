# Server image: build with Maven on JDK 25, run on JRE 25. Used by deploy/sandbox; the same image fits later
# environments with their own configuration (section 26).
FROM maven:3.9-eclipse-temurin-25 AS build
WORKDIR /src
COPY pom.xml .
RUN mvn -B -q -ntp dependency:go-offline
COPY src ./src
RUN mvn -B -q -ntp -DskipTests package && cp target/server-*.jar /app.jar

FROM eclipse-temurin:25-jre
RUN useradd --system --uid 10001 blizz
USER blizz
COPY --from=build /app.jar /app/server.jar
EXPOSE 8080
ENTRYPOINT ["java", "-XX:MaxRAMPercentage=75", "-jar", "/app/server.jar"]
