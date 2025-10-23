## [REST API](http://localhost:8080/doc)

## Concept:

- Spring Modulith
    - [Introduction to Spring Modulith](https://www.baeldung.com/spring-modulith)
    - [Introducing Spring Modulith](https://spring.io/blog/2022/10/21/introducing-spring-modulith)
    - [Spring Modulith - Reference documentation](https://docs.spring.io/spring-modulith/docs/current-SNAPSHOT/reference/html/)

```
  url: jdbc:postgresql://localhost:5432/jira
  username: jira
  password: CodeGymJira
```

- There are two tables, which do not have foreign keys
    - _Reference_ - directory. Make the link using _code_ (using id is not allowed, as id is tied to the environment-specific base)
    - _UserBelong_ - link users with type (owner, lead, ...) to object (task, project, sprint, ...). FK will be checked manually

## Analogues

- https://java-source.net/open-source/issue-trackers

## Testing

- https://www.youtube.com/watch?v=aEW8ZH6wj2o

List of completed tasks:
Task 1.	Understand the project structure (onboarding). COMPLETED!
Task 2.	Delete social network(s): e.g. facebook.  COMPLETED!
Task 3.	Put sensitive information into a separate property file. COMPLETED!
Task 4.	Mail settings. The values of these properties should be read from the machine’s environment variables when the server starts. COMPLETED!
Task 7.	Refactor the com.codegym.jira.bugtracking.attachment.FileUtil#upload method. COMPLETED!
Task 10.	Write a Dockerfile for the main server. COMPLETED!
Task 11.	Write a docker-compose file to run the server container. COMPLETED!