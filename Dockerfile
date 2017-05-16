FROM openjdk:8-jdk

# Install dependencies
RUN apt-get update && \
	apt-get install -y maven

# Copy spring boot build artifacts to the working docker directory
WORKDIR /tmp
COPY . /tmp
# Build the app
RUN mvn package

RUN apt-get purge -y maven

EXPOSE 8080

# Launch Tomcat
CMD java -jar target/onewayhash-0.0.1-SNAPSHOT.jar