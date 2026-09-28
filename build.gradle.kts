// Top-level build file
plugins {
    id 'com.android.application' version '8.1.0' apply false
    id 'com.android.library' version '8.1.0' apply false
}
plugins {
    id 'com.android.application'
}

android {
    namespace 'com.example.aivideounlimited'
    compileSdk 34

    defaultConfig {
        applicationId "com.example.aivideounlimited"
        minSdk 24
        targetSdk 34
        versionCode 1
        versionName "1.0"
    }

    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_17
        targetCompatibility JavaVersion.VERSION_17
    }
}

dependencies {
    // Yahan aapki app ki dependencies aayengi
}
