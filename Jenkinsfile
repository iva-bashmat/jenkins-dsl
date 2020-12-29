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
         steps {
            script {
               buildName "${BUILD_NAME}"
            }
         }
      }

      stage('Build') {
         steps {
            sh "mvn -B clean package"
         }
      }
   }

   post {
      always {
         deleteDir() /* clean up our workspace */
      }
   }
}