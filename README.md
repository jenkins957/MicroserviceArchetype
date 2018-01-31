# MicroserviceArchetype
Maven archetype to create a dropwizard mircoservice

Generate a Microservice template project. Includes test framework at various levels;

### Unit Tests

### Integration Tests
 - JUnit (Developer Tests)
 - Cucumber (Stakeholder Tests)

### Build

mvn install

### Usage

mvn archetype:generate -DarchetypeGroupId=net.beyondcoding \
-DarchetypeArtifactId=MicroserviceTemplateArchetype \
-DarchetypeVersion=1.0.0-SNAPSHOT \
-DgroupId=groupId \
-DartifactId=projectName
