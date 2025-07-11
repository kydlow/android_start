pluginManagement {
    resolutionStrategy {
        eachPlugin {

            if (requested.id.id == "org.lsposed.lsparanoid") {
                useModule("org.lsposed.lsparanoid:gradle-plugin:0.6.0")
            }
        }
    }
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()

        maven { url = uri("https://artifactory.bidmachine.io/bidmachine") }
        maven { url = uri("https://maven.ogury.co") }
        maven { url = uri("https://artifact.bytedance.com/repository/pangle") }
        maven { url = uri("https://verve.jfrog.io/artifactory/verve-gradle-release") }
    }
}

rootProject.name = "AndroidStartup"
include(":app")
include(":baselineprofileTest")
