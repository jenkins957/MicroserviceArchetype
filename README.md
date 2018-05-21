# MicroserviceArchetype
Maven archetype to create a simple dropwizard mircoservice.
Generate a Microservice template project. Includes test framework at various levels;

Test framework included and docker integration to create a docker image of the application (credit Spotify).

### Unit Tests
- JUnit (Developer Tests), *.Test.java

# Integration Testing
Integtarion Testing at two levels;

### Integration Tests
Aimed at developers, Integration tests usign JUnit.
* Publishes resources to in-memory Jersey server
* Does not run up the whole application

 - JUnit (Developer Tests), *.IT.java
 - Cucumber (Stakeholder Tests), *.feature

### Stakeholder Level Integration Tests (Acceptance Tests
Stakeholder, Customer facing tests which can be used as documentation. Uses Cucumber framework to describe features.
* Runs up application using in-memory Jersey server 

### Build

mvn clean install

### Usage

mvn archetype:generate -DarchetypeGroupId=net.beyondcoding \
-DarchetypeArtifactId=MicroserviceArchetype \
-DarchetypeVersion=1.0 \
-DgroupId=_groupId_ \
-DartifactId=_projectName_

### Deploy

####Maven image build

mvn clean package docker:build

####Run 
docker run -p 8080:8080 beyondcoding.net/<name>



