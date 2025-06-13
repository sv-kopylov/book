plugins {
    id("java")
}

group = "ru.kopylov"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
//    implementation("jakarta.xml.bind:jakarta.xml.bind-api:3.0.1")
//    implementation("org.glassfish.jaxb:jaxb-runtime:4.0.2")
//    implementation("javax.xml.bind:jaxb-api:2.2.4")

    implementation ("com.sun.xml.bind:jaxb-core:2.3.0.1")
    implementation ("javax.xml.bind:jaxb-api:2.3.1")
    implementation ("com.sun.xml.bind:jaxb-impl:2.3.1")
    implementation ("org.javassist:javassist:3.25.0-GA")

}

