# TodoList Application

This repository contains a project stub of a simple Spring Boot application for managing a list of todo items. This project includes a `Todo` entity with basic functionality to create and manage tasks. The project is not implemented as it serves as a stub for learning software testing. The project is part of the Software Testing module (SWB 105 6043) at Esslingen University of Applied Sciences. 

    Disclaimer: All content is for educational purposes only. I do not intend for the content to be a substitute for professional usage.

    Ausschlussklausel: Alle Inhalte dienen ausschließlich Bildungszwecken. Der Inhalt ist nicht für die professionelle Nutzung gedacht.

## Project Structure

- **`Todo`**: The main entity representing a todo item, with fields for an ID, title, and completion status.
- **`Application Configuration`**: Configurations for running the application using Spring Boot.
- **`Maven Build`**: Project build and dependency management are handled with Maven.

## Prerequisites

- **Java 17**: Make sure Java 17 is installed on your system.
- **Maven**: Ensure that Maven is installed to build and manage dependencies.

## Build the project

Use Maven to compile and package the application:

```bash
mvn clean package
```

## Run the application

To run the application, use the following Maven command:

```bash
mvn spring-boot:run
```

## Testing

Unit tests are included for the Todo entity to ensure proper functionality of the getters, setters, and other basic methods. To run the tests, execute:

```bash
mvn test
```

## License

This project is licensed under the Apache v2.0 License. See the [LICENSE](./LICENSE) file for details.


