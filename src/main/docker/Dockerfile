FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD onewayhash-0.0.1-SNAPSHOT.jar onewayhash.jar
RUN sh -c 'touch /onewayhash.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /onewayhash.jar" ]