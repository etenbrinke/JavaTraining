Building an Application with Spring Boot

https://spring.io/guides/gs/spring-boot/

What is MVC : https://nl.wikipedia.org/wiki/Model-view-controller-model

Test your app : http://127.0.0.1:8080/

Switch between java versions on your mac : http://www.jayway.com/2014/01/15/how-to-switch-jdk-version-on-mac-os-x-maverick/

Run from command line :
etenbrinke@sbpltk1yyfh04 [ ~/IdeaProjects/SpringBootTest ] (14:09:23 - Fri Dec 04)
> java -jar target/myfirstservice-0.1.0.jar

Find your service if you want to kill it :
> lsof -i tcp:8080
COMMAND   PID       USER   FD   TYPE             DEVICE SIZE/OFF NODE NAME
java    75464 etenbrinke   70u  IPv6 0x3794ce8b998ffbb7      0t0  TCP *:http-alt (LISTEN)

Step 1
Create src/main/java source dir
You have to unmark Directory 'src' as Sources Root first to do so

Step 2
Create an package in src/main/java source root

Step 3
View Tool Windows -> Maven Projects

Step 4
Create the pom.xml under your project path

Step 5
Add Maven project and select the pom.xml

Step 6
Create Application class
Resolve Spring Annotation dependencies with Option-Enter

Step 7
Create TestService class

Step 8
Create HelloController class

Step 9
Run Application class

Step 10
Browse : http://127.0.0.1:8080/

Build and run from command line
> setjdk 1.8 (in my case Project is using jdk 1.8)

> cd ~/IdeaProjects/SpringBootTest/
> mvn
> mvn clean
> mvn compile
> mvn test
> mvn package
> java -jar target/myfirstservice-0.1.0.jar
> curl localhost:8080
Greetings from Spring Boot!


