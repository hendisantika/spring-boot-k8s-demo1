FROM openjdk:11.0-jre-stretch
MAINTAINER HENDI SANTIKA <hendisantika@yahoo.co.id>

WORKDIR /usr/share/demo-k8s

ARG appDir=/usr/share/demo-k8s
ARG DEPENDENCY=target/dependency

COPY ${DEPENDENCY}/BOOT-INF/lib ${appDir}/lib
COPY ${DEPENDENCY}/META-INF ${appDir}/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes ${appDir}

EXPOSE 8081 5005

ENTRYPOINT ["java","-cp","com/hendisantika/springbootk8sdemo1/*:lib/*:.","com.hendisantika.springbootk8sdemo1.SpringBootK8sDemo1Application"]
