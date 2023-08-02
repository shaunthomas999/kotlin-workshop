// Ref: https://github.com/sdeleuze/spring-boot-kotlin-demo/blob/master/build.gradle.kts
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  kotlin("jvm") version "1.9.0"
  application // Application plugin to add support for building CLI application in Java.
}

group = "io.shaunthomas.kotlin"
description = "kotlin-workshop"
version = "1.0-SNAPSHOT"

repositories {
  mavenCentral()
}

dependencies {
  val kotestVersion = "5.6.2"

  testImplementation(kotlin("test"))
  testImplementation("io.kotest:kotest-assertions-core:$kotestVersion")
}

tasks.test {
  useJUnitPlatform()
}

kotlin {
  jvmToolchain(17)
}

application {
  mainClass.set("io.shaunthomas.kotlin.Hello") // The main class of the application
}
