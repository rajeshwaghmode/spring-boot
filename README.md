# Key Points
1. Enabled all the possible endpoints exposed by actuator.
2. By default, management(actuator) endpoints are available on the same port as that of your application, but you may choose to expose these on a different HTTP port by setting the **management.server.port** to an HTTP port of your choice. And application server will run on different port specified by **server.port**.
3. All the endpoints exposed by actuator can be found by simple endpoint **http://localhost:8082/actuator/**
