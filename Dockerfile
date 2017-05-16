#FROM frolvlad/alpine-oraclejdk8:slim
#VOLUME /tmp
#ADD onewayhash-0.0.1-SNAPSHOT.jar onewayhash.jar
#RUN sh -c 'touch /onewayhash.jar'
#EXPOSE 8080
#ENV JAVA_OPTS=""
#ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /onewayhash.jar" ]

FROM ubuntu:16.04

ENV TOMCAT_VERSION 8.0.36

# Install dependencies
RUN apt-get update && \
apt-get install -y git build-essential curl wget software-properties-common maven

# Install JDK 8
RUN \
echo oracle-java8-installer shared/accepted-oracle-license-v1-1 select true | debconf-set-selections && \
add-apt-repository -y ppa:webupd8team/java && \
apt-get update && \
apt-get install -y oracle-java8-installer unzip tar && \
rm -rf /var/lib/apt/lists/* && \
rm -rf /var/cache/oracle-jdk8-installer

# Define commonly used JAVA_HOME variable
ENV JAVA_HOME /usr/lib/jvm/java-8-oracle

# Copy spring boot build artifacts to the working docker directory
WORKDIR /tmp
COPY . /tmp
# Build the app
RUN mvn package

EXPOSE 8080

# Launch Tomcat
CMD java -jar target/onewayhash-0.0.1-SNAPSHOT.jar