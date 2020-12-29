pipelineJob('deploy') {
   definition {
      cps {
         script(readFileFromWorkspace('Jenkinsfile.deploy'))
         sandbox()
      }
   }
}