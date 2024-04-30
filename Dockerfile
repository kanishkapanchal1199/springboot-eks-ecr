FROM openjdk:17
ADD target/springboot-eks-ecr.jar springboot-eks-ecr.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","springboot-eks-ecr.jar"]