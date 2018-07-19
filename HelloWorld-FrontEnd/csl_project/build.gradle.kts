import org.jetbrains.kotlin.com.intellij.openapi.vfs.StandardFileSystems.jar
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.2.51"
}

group = "csl_project"
version = "1.0-SNAPSHOT"

apply(plugin = "war")

repositories {
    mavenCentral()
    maven{ setUrl( "https://dl.bintray.com/kotlin/ktor" ) }
    maven{ setUrl("https://dl.bintray.com/kotlin/kotlinx") }
    maven{ setUrl("http://repo.spring.io/libs-release/") }
}

dependencies {
    implementation("org.slf4j", "slf4j-simple", "1.6.1")
    implementation("org.jetbrains.kotlinx", "kotlinx-io-jvm", "0.0.10")
    implementation("org.jetbrains.kotlinx", "kotlinx-html-js", "0.6.11")
    implementation("org.jetbrains.kotlinx", "kotlinx-html-jvm", "0.6.11")
    implementation("io.ktor", "ktor-server-core", "0.9.3")
    implementation("io.ktor", "ktor-server-netty", "0.9.3")
    implementation("io.ktor", "ktor-html-builder", "0.9.3")
    compile(kotlin("stdlib-jdk8"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
