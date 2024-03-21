plugins {
    id("java")
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
}

tasks.test {
    useJUnitPlatform()
}