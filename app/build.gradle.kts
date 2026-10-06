plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.dokka)
    alias(libs.plugins.kotlin.dokka.javadoc)
    alias(libs.plugins.kotlin.parcelize)
}

android {
    namespace = "com.example.sendmessage"
    compileSdk {
        version = release(37) {
            minorApiLevel = 1
        }
    }

    defaultConfig {
        applicationId = "com.example.sendmessage"
        minSdk = 24
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)

}

// Configuración de rutas personalizadas para Dokka (Plugin V2)
dokka {
    dokkaPublications.html {
        outputDirectory.set(rootDir.resolve("documentation/html"))
    }
    dokkaPublications.javadoc {
        outputDirectory.set(rootDir.resolve("documentation/javadoc"))
    }
}