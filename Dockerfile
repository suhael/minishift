FROM 604083106117.dkr.ecr.eu-west-1.amazonaws.com/gg-centos7-jre
COPY /target/minishift.jar minishift.jar
ENTRYPOINT ["sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar /minishift.jar"]