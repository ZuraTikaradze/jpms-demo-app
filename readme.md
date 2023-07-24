https://www.baeldung.com/java-9-modularity
https://www.youtube.com/watch?v=I7H8xaSBRIk&t=1236s

Multi Module Maven Project vs Java Platform Module System


A Multi-Module Maven Project and the Java Platform Module System (JPMS) are two different concepts that serve different purposes in Java application development.

Multi-Module Maven Project:
A Multi-Module Maven Project is an organizational structure for Java projects using the Apache Maven build tool. In a multi-module project, the application is divided into multiple smaller modules, each representing a distinct functionality or component of the application. These modules can have their own dependencies, configurations, and lifecycle. The parent project coordinates the build and dependency management across all modules. This approach helps in managing large projects, improves code organization, and allows better code reuse.
For example, a web application may have separate modules for the frontend, backend, and data access layer. Each of these modules can be developed independently and then assembled together into the final application.

Java Platform Module System (JPMS):
The Java Platform Module System, introduced in Java 9, is a mechanism to achieve modularity at the Java platform level. It allows developers to create explicit and well-defined modules for Java applications and libraries. By using modules, developers can encapsulate code and restrict access to internal implementations, providing better security, maintainability, and performance.
Modules in JPMS are defined by module-info.java files, which specify the module's name, dependencies, and exported packages. When using JPMS, the code is organized into modules, and at runtime, only the necessary modules are loaded, reducing the overhead of loading unused code.

While both concepts promote modularity, there are some key differences:

Scope of Modularity:
Multi-Module Maven Project: Modularity is at the project level. It helps organize large projects and separate functionalities into different modules for ease of development.
Java Platform Module System: Modularity is at the Java platform level. It allows developers to define explicit module boundaries within the application itself, resulting in better encapsulation and dependency management.
Dependency Management:
Multi-Module Maven Project: Dependencies are managed at the project level using Maven's dependency management.
Java Platform Module System: Dependencies are explicitly defined in the module-info.java files, and the JPMS ensures that only required modules are accessible.
In conclusion, Multi-Module Maven Projects are about organizing the codebase of a single application, whereas the Java Platform Module System focuses on the modularity of the Java platform itself and individual Java applications. While they have different scopes, they can complement each other, and you can use them together for better code organization and maintainability in large Java projects.
