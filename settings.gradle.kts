plugins {
    id("com.gradle.enterprise") version "3.14.1"
}

rootProject.name = "result"

include("lib")

gradleEnterprise {
    if (System.getenv("CI") != null) {
        buildScan {
            publishAlways()
            termsOfServiceUrl = "https://gradle.com/terms-of-service"
            termsOfServiceAgree = "yes"
        }
    }
}
