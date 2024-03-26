plugins {
    id("java")
    id("war")
    id("org.springframework.boot") version("3.2.4")
    id("io.spring.dependency-management") version("1.1.4")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.hibernate:hibernate-core:5.6.5.Final")
    implementation("org.hsqldb:hsqldb:2.7.2")
    testImplementation("junit:junit:4.13.2")
    implementation("org.springframework.boot:spring-boot-starter-web")
    providedRuntime("org.springframework.boot:spring-boot-starter-tomcat")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    implementation("com.google.code.gson:gson:2.9.0")

}

tasks.test {
    useJUnitPlatform()
}