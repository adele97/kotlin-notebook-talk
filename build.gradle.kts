plugins {
    id("org.jetbrains.kotlinx.dataframe") version "1.0.0-Beta4n"
    kotlin("jvm") version "2.2.20"
    application
}

group = "com.adele97"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.postgresql:postgresql:42.7.11")
    implementation("com.google.zxing:core:3.5.4")
    implementation("com.google.zxing:javase:3.5.4")
    implementation("org.jetbrains.kotlinx:dataframe:1.0.0-Beta4n")
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