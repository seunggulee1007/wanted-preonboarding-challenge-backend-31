dependencies {
    implementation(project(mapOf("path" to ":web-jpa-core")))
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("com.vladmihalcea:hibernate-types-60:2.21.1")
}
