plugins {
    id("java")
}

group = "ru.kopylov"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {


    implementation ("com.sun.xml.bind:jaxb-core:2.3.0.1")
    implementation ("javax.xml.bind:jaxb-api:2.3.1")
    implementation ("com.sun.xml.bind:jaxb-impl:2.3.1")
    implementation ("org.javassist:javassist:3.25.0-GA")

}

