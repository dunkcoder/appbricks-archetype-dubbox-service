# appbricks-archetype-service
a maven archetype for appbricks service

## generate project from archetype

with interactive mode

```
mvn archetype:generate                                  \
  -DarchetypeGroupId=io.appbricks                       \
  -DarchetypeArtifactId=appbricks-archetype-service     \
  -DarchetypeVersion=1.0-SNAPSHOT
```

without interactive mode

```
mvn archetype:generate                                  \
  -DarchetypeGroupId=io.appbricks                       \
  -DarchetypeArtifactId=appbricks-archetype-service     \
  -DarchetypeVersion=1.0-SNAPSHOT                       \
  -DgroupId=com.xxx.yyy                                 \
  -DartifactId=zzz                                      \
  -DinteractiveMode=false
```
