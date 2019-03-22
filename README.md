# codenomads

#### Intro
This is a simple cloud scenario using Spring Cloud and Docker. The elements of this scenario are the following:
- mylist-config-server: Server used by the rest of the apps to obtain their properties.
- mylist-eureka-server: Discovery and Registry server. Each instance of each microservice will register itself on this server. The gateway server will use this registry to know if a microservice is alive.
- mylist-app: Microservice that exposes endpoints to save/find/edit a list domain.
- mylist-ui: User interface. It provides to the final user a web app to manage its lists.

#### Intro - TODO
- security-server: Authentication service. Creates and checks a JWT token. Zuul will use this server to validate the user credentials every time it receives a request.
- zuul-server: Gateway server. Load Balance. Entry point for the infrastructure. It checks the user credentials, performs security access and redirects each request to the corresponding microservice it will exposes a Hystrix dashboard and a Swagger UI.
- mylist-ui: Improve the user interface.

![alt text](https://raw.githubusercontent.com/namomalencar/codenomads-configs/master/Arch.png "Architecture")


#### Technology
The base stack is the following:
- Java8
- Spring Boot
- Spring Cloud
- Project Lombok
- H2DB
- Angular 7

###### Spring Boot
Spring Boot provides a fast development experience using Spring. It configures many things out-of-the-box, saving a lot of time when starting a new project. Among the new features, one of the most interesting is Webflux, which allows to develop REST services in a non-blocking way, providing high scalability.

###### Spring Cloud
Spring Cloud has been chose because it's the simple option to go if Spring Boot is used. The integration is seamless. It provides a config server, a discovery server, a gateway server and fallback mechanisms.

###### Project Lombok
By using annotations, it generates setters, getters, constructors, performs null checks... While Spring reduces the boilerplate of JEE, Project Lombok reduces the boilerplate of Java POJOs.

###### H2DB
Simplest DB for a fast development.

#### Solution
My list is a simple to-do list and task manager that helps you get stuff done.

#### How to start
There are a few tools that must be installed in the computer prior to run and execute. These tools are Docker, Maven, Java and nodejs.

I have used a Windows environment.

For maven projects, eecute _mvn clean package_ and then create the docker containers by executing these commands:
```sh
$ docker build -f Dockerfile -t namom/config ./mylist-configserver
$ docker build -f Dockerfile -t namom/eureka ./mylist-eurekaserver
$ docker build -f Dockerfile -t namom/app ./mylist-app
```

For angular project, execute the following commands on the root angular project path: ..\mylist-ui
```sh
$ npm install
$ docker build -t namom/ui .
```

Finally, execute the following command on root full project
```sh
$ docker run --name myconfig -it -p 9090:9090 namom/config
$ docker-compose up
```

The ip used on the project was 192.168.99.100, provided by the docker toolbox.

Interface: http://192.168.99.100:4200/
End-Point: http://192.168.99.100:9093/mylist/

#### Print Screen
![alt text](https://raw.githubusercontent.com/namomalencar/codenomads-configs/master/01_config.png "Config conteiner")

![alt text](https://raw.githubusercontent.com/namomalencar/codenomads-configs/master/02_compose.png "Docker Compose")

![alt text](https://raw.githubusercontent.com/namomalencar/codenomads-configs/master/03_back-end-01.png "Back-end get list")

![alt text](https://raw.githubusercontent.com/namomalencar/codenomads-configs/master/04_back-end-02.png "Back-end create list")

![alt text](https://raw.githubusercontent.com/namomalencar/codenomads-configs/master/05_back-end-03.png "Back-end generate list")

![alt text](https://raw.githubusercontent.com/namomalencar/codenomads-configs/master/06-front-end-01.png "Front-end show list")

