# appbricks-archetype-service
a maven archetype for appbricks service

## generate project from archetype

with interactive mode

```
mvn archetype:generate                                      \
  -DarchetypeGroupId=io.appbricks                           \
  -DarchetypeArtifactId=appbricks-archetype-dubbox-service  \
  -DarchetypeVersion=1.0-SNAPSHOT
```

you will required to input groupId, artifactId for your new project.


without interactive mode

```
mvn archetype:generate                                      \
  -DarchetypeGroupId=io.appbricks                           \
  -DarchetypeArtifactId=appbricks-archetype-dubbox-service  \
  -DarchetypeVersion=1.0-SNAPSHOT                           \
  -DgroupId=x.y                                     \
  -DartifactId=z                                          \
  -DarchetypeCatalog=local
```

this process should be slow, but if you had already run once successfully, to speed up, add this param:

```
-DarchetypeCatalog=local
```

## setting up zookeeper

in src/main/resources/dubbo.properties

modify following line:

```
dubbo.registry.address=zookeeper://127.0.0.1:2181
```

## run

```
mvn spring-boot:run
```
