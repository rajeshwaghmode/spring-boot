# Key Points - Actuator
1. Enabled all the possible endpoints exposed by an actuator.
2. By default, management(actuator) endpoints are available on the same port as that of your application, but you may choose to expose these on a different HTTP port by setting the **management.server.port** to an HTTP port of your choice. And application server will run on different port specified by **server.port**.
3. All the endpoints exposed by an actuator can be found by a simple endpoint **http://localhost:8082/actuator/**

# Steps to Add Actuator
1. Create a SpringBoot project with Gradle (or Maven).
2. Add dependency "org.springframework.boot:spring-boot-starter-actuator:2.1.8.RELEASE".
3. In application property file add configuration to enable specific or all actuator endpoints.
4. Build and run application. Do call endpoint **http://localhost:8082/actuator/**.

# Steps to enable DevTools
1. Create a SpringBoot project with Gradle (or Maven).
2. Add dependency "org.springframework.boot:spring-boot-devtools:2.1.8.RELEASE".
3. Using ctrl + alt + S -> Compiler -> Enable "Build project automatically".
4. Using Ctrl + Shift + A -> type **Registry**. Once the registry windows is open, locate and enable **compiler.automake.allow.when.app.running**.
5. Build and run application.
6. It will do Automatic Restart every time you change something.


 