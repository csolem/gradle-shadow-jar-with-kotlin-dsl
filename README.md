# Gradle kotlin dsl example with shadow plugin

Example project using gradle with kotlin dsl and the johnrengelman/shadow plugin

See this project files [build.gradle.kts](build.gradle.kts)


## Verify that it works
```
./gradlew build
```

```
java -jar build/libs/shadow.jar
```


## References
https://github.com/johnrengelman/shadow/issues/417

https://github.com/gradle/kotlin-dsl/tree/master/samples