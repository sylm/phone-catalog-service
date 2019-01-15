# Phone catalog service

Service stands for retrieving phone catalog. Which actually consists of phone name, description, link on its image and its price.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

Java 10+

Gradle 5

Docker 1.8

### Installing

1. Clone project
2. Go to service root folder
3. Run "gradle build docker" in your command line
4. Run "docker-compose build"
5. Run "docker-compose up"

Note: If Ordering service wasn't started before. Network wasn't created so please run "$ docker network create -d bridge net"

Test data will be populated automatically by mongo-seed.

## Running the tests

curl -X GET http://your host:8080/phone-service/v1/phones


## Deployment

Spring actuator was configured so /health, /info etc are available for heartbeats check.
e.g. http://your host:8080/actuator/health

## Built With

* [Spring boot](https://spring.io/projects/spring-boot) - The web framework used
* [Gradle](https://gradle.org/) - Dependency Management


## Authors

* **Bohdan Biloskursky** - *Initial work* - (https://github.com/sylm)

## Acknowledgments

* Created to proof knowledge and skills, or unproof :)


