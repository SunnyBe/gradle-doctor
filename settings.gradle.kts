pluginManagement {
  repositories {
    mavenCentral()
    gradlePluginPortal()
  }
}

plugins {
  id("com.gradle.enterprise").version("3.10.1")
}

include("simple")
include("dagger-kapt")

includeBuild("doctor-plugin")

dependencyResolutionManagement {
  repositories {
    mavenCentral()
  }
}
