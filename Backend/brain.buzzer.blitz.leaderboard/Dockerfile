#Start with a base image containing Java runtime
FROM openjdk:19

#Information around who maintains the image
MAINTAINER eazybytes.com

# Add the application's jar to the container
COPY target/brain.buzzer.blitz.leaderboard-0.0.1-SNAPSHOT.jar /brain.buzzer.blitz.leaderboard-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java","-jar","/brain.buzzer.blitz.leaderboard-0.0.1-SNAPSHOT.jar"]