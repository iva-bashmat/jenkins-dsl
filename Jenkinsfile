pipeline {
   agent any


   environment {
      SHORT_HASH = sh(
              encoding: 'UTF-8',
              label: 'Get Git short hash',
              returnStdout: true,
              script: 'git rev-parse --short HEAD 2> /dev/null'
      ).trim()
      BUILD_NAME = "${env.BUILD_NUMBER}-${SHORT_HASH}"
   }

   stages {
      stage('Initialize') {
          parallel {
            stage ('Init properties'){
                steps {
                    script {
                        buildName "${BUILD_NAME}"
                     }
                }
            }
            stage ('Init deploy build'){
                steps {
                    jobDsl targets: 'deploy.groovy', sandbox: true
                }
            }
          }
      }
   }

   post {
      always {
         deleteDir() /* clean up our workspace */
      }
   }
}