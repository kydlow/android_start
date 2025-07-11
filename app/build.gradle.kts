plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("com.google.devtools.ksp")
    id("org.lsposed.lsparanoid")
    alias(libs.plugins.baselineprofile)
}

android {
    namespace = "com.demo.androidstartup"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.demo.androidstartup"
        minSdk = 29
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

}


dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    "baselineProfile"(project(":baselineprofileTest"))
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    // Room
    implementation(libs.androidx.room.runtime)
    implementation(libs.androidx.room.ktx)
    ksp(libs.androidx.room.compiler)

//    implementation (libs.androidx.startup.runtime)

    // Macrobenchmark 库用于生成 Baseline Profile
    androidTestImplementation(libs.androidx.benchmark.macro.junit4)
//    // Profile Installer 库用于安装 Baseline Profile
    implementation (libs.androidx.profileinstaller)


    implementation (libs.lottie.compose)

    implementation (libs.applovin.sdk)
    implementation(libs.play.services.ads) // Admob ads

//    //max聚合
    implementation(libs.bidmachine.adapter)//BidMachine
    implementation(libs.ogury.presage.adapter)//Ogury
    implementation(libs.bytedance.adapter)//Pangle
    implementation(libs.unityads.adapter)//Unity Ads
    implementation(libs.verve.adapter)//Verve

    implementation ("org.jetbrains.kotlin:kotlin-stdlib:1.9.0")
    implementation("androidx.work:work-runtime:2.7.0")
    implementation("com.google.code.gson:gson:2.8.5")
    implementation("androidx.appcompat:appcompat:1.3.0")


    implementation("io.reactivex.rxjava3:rxjava:3.0.0")
    implementation("io.reactivex.rxjava3:rxandroid:3.0.0")
    implementation("io.reactivex.rxjava3:rxkotlin:3.0.0")

    implementation("com.squareup.okhttp3:okhttp:4.8.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.8.0") // 配置缓存策略
    // Retrofit适配RxJava
    implementation("com.squareup.retrofit2:adapter-rxjava3:2.9.0")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.retrofit2:converter-scalars:2.9.0")
    implementation("com.android.installreferrer:installreferrer:2.2") // Google 买量回调
    implementation("com.google.android.gms:play-services-ads-identifier:18.0.1") //
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.9.0")
}