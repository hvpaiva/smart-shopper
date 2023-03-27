plugins {
    id("org.springframework.boot")
    id("org.sonarqube") version "4.0.0.2929"
}

dependencies {
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    // Adicione as dependências específicas do subprojeto user aqui, se necessário
}

sonarqube {
    properties {
        property("sonar.projectKey", "hvpaiva-github_smart-shopper_product")
        property("sonar.organization", "hvpaiva-github")
        property("sonar.host.url", "https://sonarcloud.io")
        property("sonar.sources", "src/main/kotlin")
        property("sonar.tests", "src/test/kotlin")
        property(
            "sonar.exclusions",
            "src/main/kotlin/dev/hvpaiva/smart/shopper/product/ProductApplication.kt,src/test/kotlin/dev/hvpaiva/smart/shopper/product/ProductApplicationTests.kt"
        )
    }
}