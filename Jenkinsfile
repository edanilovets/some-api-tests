node {
    stage("build") {
        sh "./gradlew clean assemble"
    }
    stage("run Demo tests") {
        sh "./gradlew test"
    }
}