pipelineJob('deploy-test') {
   definition {
      cps {
         script(readFileFromWorkspace('Jenkinsfile.deploy'))
         sandbox(true)
      }
   }
}