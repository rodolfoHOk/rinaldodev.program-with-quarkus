# Program with Quarkus 

> Quarkus Study Project by RudolfHiOk
 
## Technologies

- Java 17
- Quarkus 3.1
- Hibernate ORM + Panache
- PostgreSQL

## Create a Quarkus Project

- Access: https://code.quarkus.io/

## Quarkus CLI (https://quarkus.io/guides/cli-tooling)

- Install Quarkus CLI with sdkman: sdk install quarkus
- Run project for development: quarkus dev
- Add extension: quarkus extension add <extension-name>
- Run tests: quarkus test

## Test coverage

- Install jacoco extension with Quarkus CLI: quarkus extension add jacoco
- Run test coverage: ./mvnw verify
- Open: target/jacoco-report/index.html

## Util links

- [Quarkus RestEasy reactive guide](https://quarkus.io/guides/resteasy-reactive)
- [Quarkus Hibernate ORM + Panache guide](https://quarkus.io/guides/hibernate-orm-panache)
- [Quarkus all properties](https://quarkus.io/guides/all-config)
- [Quarkus datasource guide](https://quarkus.io/guides/datasource)
- [Quarkus Dev Services](https://quarkus.io/guides/dev-services)

# Quarkus default README.md

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/program-with-quarkus-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

## Related Guides

- RESTEasy Reactive ([guide](https://quarkus.io/guides/resteasy-reactive)): A Jakarta REST implementation utilizing build time processing and Vert.x. This extension is not compatible with the quarkus-resteasy extension, or any of the extensions that depend on it.

## Provided Code

### RESTEasy Reactive

Easily start your Reactive RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started-reactive#reactive-jax-rs-resources)
