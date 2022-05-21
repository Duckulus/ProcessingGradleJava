plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version "7.1.2"
    application
}

group = "org.example"
version = "0.1"

dependencies {
    implementation(fileTree("libs") { include("*.jar") })
}

application {
    mainClass.set("org.example.Main")
}
