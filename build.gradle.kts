/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    java
    `maven-publish`
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    implementation("org.javassist:javassist:3.26.0-GA")
    implementation("org.slf4j:slf4j-api:1.7.30")
    implementation("org.dom4j:dom4j:2.1.1")
    implementation("com.google.code.gson:gson:2.8.6")
    implementation("org.slf4j:slf4j-simple:1.7.24")
    testImplementation("junit:junit:4.13")
    compileOnly("javax.servlet:servlet-api:2.5")
    compileOnly("org.jboss:jboss-vfs:3.2.12.Final")
}

group = "org.reflections"
version = "0.9.13-SNAPSHOT"
description = "Reflections"
java.sourceCompatibility = JavaVersion.VERSION_1_8

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}


tasks.jar {
    manifest {
        attributes("Automatic-Module-Name" to "org.reflections")
    }
}