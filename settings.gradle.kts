    pluginManagement {
        repositories {
            google()
            mavenCentral()
            gradlePluginPortal()
        }
    }

    dependencyResolutionManagement {
        repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
        repositories {
            google() // Available for dependencies
            mavenCentral() // Available for dependencies
        }
    }

    rootProject.name = "BUKLODConnect"
    include(":app")