pipelineJob('deploy-t') {
   definition {
      cps {
         script(readFileFromWorkspace('Jenkinsfile.deploy'))
         parameters {
            stringParam('INPUT', 'Whatever dsl')
         }
      }
   }
}