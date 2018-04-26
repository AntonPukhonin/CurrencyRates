pipeline {
    agent {
        node {
            label 'test'
        }
    }
    stages{
        stage("init"){
            steps{
                sh("chmod +X gradlew")
            }
        }
        stage("init"){
            steps{
                sh("./gradlew lintPlayDebug")
            }
        }
        stage("test"){
            steps{
                sh("./gradlew clean testPlayDebugUnitTest")
            }
        }
        stage("build"){
            steps{
                sh("./gradlew assemblePlayDebug")
            }
        }
    }
}