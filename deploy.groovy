pipelineJob('deploy-test') {
   definition {
      cps {
         script(readFileFromWorkspace('Jenkinsfile.deploy'))
         sandbox(true)
      }
   }
   parameters {
      stringParam('INPUT', 'def_g', 'description_g')
   }
}