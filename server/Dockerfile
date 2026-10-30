# Server image: build with Maven on JDK 25, run on JRE 25. Used by deploy/sandbox; the same image fits later
# environments with their own configuration (section 26). Base images are pinned by digest (REQ-ENG-11): the tag
# says what it is, the digest makes the build reproducible. Refresh both with scripts/pin-images.sh.
FROM maven:3.9-eclipse-temurin-25@sha256:93b8a14ea2f412782e4e842651273b4d903e35cc496284f178fbbe2d67d00976 AS build
WORKDIR /src
# The Maven of the build image, which its digest fixes. The wrapper (mvnw) is for CI and local builds: it needs unzip,
# which this image does not have.
COPY pom.xml .
RUN mvn -B -q -ntp dependency:go-offline
COPY src ./src
RUN mvn -B -q -ntp -DskipTests package && cp target/server-*.jar /app.jar

FROM eclipse-temurin:25-jre@sha256:ecdc0adb37bde1a281c4d245a3cd535004b1fc8322d560f5b09463b248c81df0
RUN useradd --system --uid 10001 blizz
USER blizz
COPY --from=build /app.jar /app/server.jar
EXPOSE 8080
ENTRYPOINT ["java", "-XX:MaxRAMPercentage=75", "-jar", "/app/server.jar"]
