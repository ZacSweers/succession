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

pluginManagement {
  repositories {
    mavenCentral()
    gradlePluginPortal()
    jcenter()
  }
  resolutionStrategy {
    eachPlugin {
      when (requested.id.id) {
        "org.jetbrains.dokka" -> {
          useModule("org.jetbrains.dokka:dokka-gradle-plugin:0.10.1")
        }
        "com.diffplug.gradle.spotless" -> {
          useModule("com.diffplug.spotless:spotless-plugin-gradle:3.26.1")
        }
        "org.jetbrains.kotlin.jvm" -> {
          useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.72")
        }
        "org.jetbrains.kotlin.kapt" -> {
          useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.72")
        }
        "com.apollographql.apollo" -> {
          useModule("com.apollographql.apollo:apollo-gradle-plugin:2.0.1")
        }
      }
    }
  }
}

rootProject.name = "succession-root"
include("succession")
