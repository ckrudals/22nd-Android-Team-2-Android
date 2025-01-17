buildscript {

    dependencies {
        classpath(com.yapp.bol.KtLint.KTLINT)
        classpath(com.yapp.bol.DaggerHilt.DAGGER_HILT_PLUGIN)
        classpath(com.yapp.bol.Kotlin.SDK)
        classpath(com.yapp.bol.Android.BUILD_GRADLE)
    }
}

plugins {
    id("org.jlleitschuh.gradle.ktlint") version "9.1.0"
    id("com.android.application") version "7.3.1" apply false
    id("org.jetbrains.kotlin.android") version "1.7.20" apply false
    id("com.android.library") version "7.3.1" apply false
}

allprojects {
    apply {
        plugin("maven-publish")
        plugin("org.jlleitschuh.gradle.ktlint")
    }

    tasks.withType<JavaCompile> {
        options.isIncremental = true
    }
}
