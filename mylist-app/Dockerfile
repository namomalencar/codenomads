# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add Maintainer Info
LABEL maintainer="namomalencar@gmail.com"

# Add a volume pointing to /tmp
VOLUME /tmp

# Add the application's jar to the container
COPY target/mylist-app-0.0.1-SNAPSHOT.jar /mylist-app.jar

# Verbs file
ARG VERBS=verbs.txt

# Verbs file to the container
COPY ${VERBS} verbs.txt

# Run the jar file 
ENTRYPOINT java -Djava.security.egd=file:/dev/./urandom $JAVA_OPTS -jar /mylist-app.jar

# Port
EXPOSE 9093