pipelineJob('deploy') {
   definition {
      cps {
         script('''
        pipeline {
            agent any
                stages {
                    stage('Deploy') {
                        steps {
                            echo 'logic'
                        }
                    }
                }
            }
        }
      '''.stripIndent())
         sandbox()
      }
   }
}