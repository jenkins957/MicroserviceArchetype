# MicroserviceArchetype
Maven archetype to create a dropwizard mircoservice

Generate a Microservice template project. Includes tests at various levels;

Unit Tests
Integration Tests
 - JUnit (Developer Tests)
 - Cucumber (Stakeholder Tests)

Build:
mvn install

Usage:
mvn archetype:generate -DarchetypeGroupId=net.beyondcoding \
-DarchetypeArtifactId=MicroserviceArchetype \
-DarchetypeVersion=1.0.0-SNAPSHOT \
-DgroupId=<groupId> \
-DartifactId=<projectName>
