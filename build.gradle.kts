plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // Добавьте Lombok
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-xml:2.18.1")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310")
    implementation("io.vertx:vertx-core:4.5.3")
    compileOnly("org.projectlombok:lombok:1.18.30")
    annotationProcessor("org.projectlombok:lombok:1.18.30")
}



tasks.register<JavaExec>("run") {
    classpath = sourceSets.main.get().runtimeClasspath
    mainClass.set("se.ifmo.Main")
    standardInput = System.`in`
}

tasks.register<JavaExec>("test_XmlHandler") {
    classpath = sourceSets.main.get().runtimeClasspath
    mainClass.set("se.ifmo.server.file.handlers.XmlHandler")
    standardInput = System.`in`
}