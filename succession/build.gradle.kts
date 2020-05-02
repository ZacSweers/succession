/*
 * Copyright (c) 2020 Zac Sweers
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

plugins {
  id("org.jetbrains.kotlin.jvm")
  id("org.jetbrains.dokka")
  id("com.apollographql.apollo")
  // TODO apply for uploading to maven central
//  id 'com.vanniktech.maven.publish'
}

//mavenPublish {
//  useLegacyMode = false
//}

apollo {
  service("github") {
    @Suppress("UnstableApiUsage")
    customTypeMapping.set(mapOf(
        "DateTime" to "java.time.Instant",
        "URI" to "okhttp3.HttpUrl"
    ))
    generateKotlinModels.set(true)
    rootPackageName.set("dev.zacsweers.succession")
    schemaFile.set(file("src/main/graphql/dev/zacsweers/succession/schema.json"))
  }
}

dependencies {
  api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
  implementation("com.apollographql.apollo:apollo-runtime:2.0.1")
  testImplementation("junit:junit:4.13")
  testImplementation("com.google.truth:truth:1.0.1")
}
