enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "BetKingPOC"
include(":shared")
include(":shared:features")
include(":shared:features:login")
include(":shared:features:logout")
include(":shared:features:login:domain")
include(":shared:features:login:data")
include(":shared:features:logout:data")
include(":shared:features:logout:domain")
