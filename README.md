The goal of the Pipeline Wizard project is to create a Pipeline Definition Language (PDL), a domain-specific language that will 
effectively capture the essence of the CI/CD pipeline domain and suport multiple execution engines: Jenkins, Concourse CI, etc.

The PDL design is inspired by GoCD, https://docs.go.cd/current/introduction/concepts_in_go.html

Our initial goal will be to support Jenkins 1.6.x and Jenkins 2.0 CI servers.

###Design ideas:
- Support collaboration between the application developers and the tool team
- Convention over configuration
- Code generator
- Fully pluggable
- Can mix with lower level DSLs such as Job DSL
- Support containers

###Implementation stack

- Use gradle 3.0 scripted by Kotlin
- Write DSL in Kotlin using Type-Safe Builders https://kotlinlang.org/docs/reference/type-safe-builders.html
- JUnit
- Docker
