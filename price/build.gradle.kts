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
        property("sonar.projectKey", "hvpaiva-github_smart-shopper_price")
        property("sonar.organization", "hvpaiva-github")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}