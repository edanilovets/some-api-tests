node {
    stage("checkout repository") {
        git branch: 'master',
        credentialsId: 'github-id',
        url: 'https://github.com/edanilovets/some-api-tests.git'
    }
    stage("build") {
        sh "./gradlew clean assemble"
    }
    stage("run Demo tests") {
        sh "./gradlew test"
    }
    stage('allure report') {
        steps {
        script {
                allure([
                        includeProperties: false,
                        jdk: '',
                        properties: [],
                        reportBuildPolicy: 'ALWAYS',
                        results: [[path: 'build/allure-results']]
                ])
        }
        }
    }
}