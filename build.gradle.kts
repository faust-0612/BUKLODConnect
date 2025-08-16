buildscript {
    repositories {
        google()
        mavenCentral()
        google()  // Google's Maven repository
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.1.0")
        classpath(kotlin("gradle-plugin", version = "1.9.10"))
        classpath'com.google.gms:google-services:4.3.1','com.google.gms:google-services:4.3.3'
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        google()  // Google's Maven repository
    }
}
