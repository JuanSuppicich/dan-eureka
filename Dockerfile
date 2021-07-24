FROM openjdk:11.0.7-slim
ARG JAR_FILE
ADD target/${JAR_FILE} dan-eureka.jar
RUN echo ${JAR_FILE}
ENTRYPOINT ["java","-jar","/dan-eureka.jar"]