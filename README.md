### ProcessingGradle
This is a template for using Processing with the Gradle Build Tool\
It uses Processing version 4.0 beta 8 and Gradle 7.4

### How to use
To use this Template just edit [`src/main/java/org/example/Processing.java`](src/main/java/org/example/Processing.java)\
To run your Applet run `./gradlew run`\
To build an executable jar run `./gradlew shadowJar`.

### Renderers
This template comes loaded with all necessary natives to use all renderers. If you intend to only use the default JAVA2D renderer you can safely delete the [`natives`](natives) folder.
