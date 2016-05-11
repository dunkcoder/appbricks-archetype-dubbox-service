# Grand Design Service Starter

## generate project from archetype

with interactive mode

```
mvn archetype:generate                                  \
  -DarchetypeGroupId=com.foreveross.grand-design        \
  -DarchetypeArtifactId=service-quickstart              \
  -DarchetypeVersion=1.0-SNAPSHOT
```

without interactive mode

```
mvn archetype:generate                                  \
  -DarchetypeGroupId=com.foreveross.grand-design        \
  -DarchetypeArtifactId=service-quickstart              \
  -DarchetypeVersion=1.0-SNAPSHOT                       \
  -DgroupId=com.xxx.yyy                                 \
  -DartifactId=zzz                                      \
  -DinteractiveMode=false
```
