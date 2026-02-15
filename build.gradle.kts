plugins {
    id("org.jetbrains.kotlinx.dataframe") version "1.0.0-Beta4"
    kotlin("jvm") version "2.1.21"
    application
}

group = "com.adele97"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.postgresql:postgresql:42.7.10")
    implementation("org.jetbrains.kotlinx:dataframe:1.0.0-Beta4")
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}

application {
    mainClass.set("DataImporterKt")
}