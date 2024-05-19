enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
pluginManagement {
  repositories {
    mavenCentral()
    google()
    gradlePluginPortal()
  }
}

dependencyResolutionManagement {
  repositories {
    mavenCentral()
    google()
  }
}

rootProject.name = "redwood-sample-counter"
include(":androidApp")
include(":shared")
// Redwood samples counter
include(":samples:counter:android-composeui")
include(":samples:counter:android-views")
include(":samples:counter:android-tests")
include(":samples:counter:browser")
include(":samples:counter:desktop-composeui")
include(":samples:counter:ios-shared")
include(":samples:counter:presenter")
include(":samples:counter:schema")
include(":samples:counter:schema:compose")
include(":samples:counter:schema:testing")
include(":samples:counter:schema:widget")
include(":samples:counter:shared-composeui")
