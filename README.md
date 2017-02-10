# onewayhash
build a jar file: `mvn clean package`

run the generated jar file in the background mode:`nohup java -jar xxx.jar&`

Dockerization
(https://spring.io/guides/gs/spring-boot-docker/)
1. build the docker image. 

`mvn package docker:build`

Or use the pushImage option if you want to push the docker image into Dockerhub under privascope

`mvn package docker:build -DpushImage`


2. run the docker image

`docker run -p 8080:8080 -t privascope/onewayhash`

3. the application will be available on `http://localhost:8080/hash?input=`

4. Change the input to see different hash output

5. see a list of containers:`docker ps`
``
CONTAINER ID        IMAGE                   COMMAND                  CREATED             STATUS              PORTS                    NAMES
dbe9df65e787        privascope/onewayhash   "sh -c 'java $JAVA..."   17 minutes ago      Up 17 minutes       0.0.0.0:8080->8080/tcp   wizardly_j
``

6. to shutdown a docker image, use the containerID listed in the `docker ps`: `docker stop dbe9df65e787`

7. to delete the container: `docker rm dbe9df65e787`

