import org.jetbrains.compose.compose

plugins {
    kotlin("jvm") version "1.4.10"
    kotlin("plugin.serialization") version "1.4.10"
    id("org.jetbrains.compose") version "0.1.0-m1-build62"
    application
}

repositories {
    jcenter()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

dependencies {
    implementation(compose.desktop.all)
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.0.0")
}

application {
    mainClassName = "MainKt"
}