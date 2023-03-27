import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
    id("org.springframework.boot") version "3.0.5"
    id("io.spring.dependency-management") version "1.1.0"
    id("org.sonarqube") version "3.5.0.2730"
    kotlin("jvm") version "1.8.10"
    kotlin("plugin.spring") version "1.8.10"
    jacoco
}

group = "dev.hvpaiva"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "kotlin")
    apply(plugin = "jacoco")
    apply(plugin = "org.springframework.boot")
    apply(plugin = "io.spring.dependency-management")

    dependencies {
        implementation("org.springframework.boot:spring-boot-starter-web")
        implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
        implementation("org.jetbrains.kotlin:kotlin-reflect")
        testImplementation("org.springframework.boot:spring-boot-starter-test")
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "17"
        }
    }

    tasks.withType<Test> {
        useJUnitPlatform()
        finalizedBy(tasks.jacocoTestReport)
    }

    tasks.jacocoTestReport {
        dependsOn("test")

        executionData.setFrom(fileTree(buildDir.resolve("jacoco")).apply {
            include("*.exec", "*.ec")
        })
        classDirectories.setFrom(classDirectories.files.map {
            fileTree(it).matching {
                exclude(
                    "**/Application.class",
                    "**/ApplicationKt.class",
                    "**/ApplicationTests.class",
                    "**/Application.kt"
                )
            }
        })

        sourceDirectories.setFrom(files("src/main/kotlin"))

        reports {
            xml.required.set(true)
        }
    }
}

tasks.named<BootJar>("bootJar") {
    enabled = false
}
