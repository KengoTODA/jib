plugins {
  java
  id("com.google.cloud.tools.jib") version "3.4.0"
}

tasks.compileJava {
  options.release = 8
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("com.google.guava:guava:23.6-jre")
}

jib.to.image = "gcr.io/REPLACE-WITH-YOUR-GCP-PROJECT/image-built-with-jib"
