FROM openjdk:11.0.11-jre-slim

CMD ./gradlew build

COPY build/libs/dud-gateway-0.0.1-SNAPSHOT.jar dud-gateway.jar

EXPOSE 8000

ENTRYPOINT ["java","-jar","dud-gateway.jar"]

#docker run -d -p 8000:8000 --rm --name dud-gateway dud-gateway:latest
