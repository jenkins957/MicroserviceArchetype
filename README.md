# MicroserviceArchetype
Maven archetype to create a simple dropwizard mircoservice.

Generate a Microservice template project. Includes test framework at various levels;

### Unit Tests
- JUnit (Developer Tests), *.Test.java

### Integration Tests
 - JUnit (Developer Tests), *.IT.java
 - Cucumber (Stakeholder Tests), *.feature

### Build

mvn clean install

### Usage

mvn archetype:generate -DarchetypeGroupId=net.beyondcoding \
-DarchetypeArtifactId=MicroserviceArchetype \
-DarchetypeVersion=1.0.0-SNAPSHOT \
-DgroupId=groupId \
-DartifactId=projectName
