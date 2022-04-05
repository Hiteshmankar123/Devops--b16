  
  displayName('scripted')
  
  keepDependencies(false)
  
  quietPeriod(0)
  
  checkoutRetryCount(0)
  
  disabled(false)
  
  concurrentBuild(false)
  
  configure { flowdefinition ->
    
    flowdefinition << delegate.'definition'(class:'org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition',plugin:'workflow-cps@2683.vd0a_8f6a_1c263') {
      
      'scm'(class:'hudson.plugins.git.GitSCM',plugin:'git@4.11.0') {
        
        'configVersion'(2)
        
        'userRemoteConfigs' {
          
          'hudson.plugins.git.UserRemoteConfig' {
            
            'url'('https://github.com/Hiteshmankar123/Devops--b16.git')
            
            'credentialsId'('gitlab-user-pswd')
            
          }
          
        }
        
        'branches' {
          
          'hudson.plugins.git.BranchSpec' {
            
            'name'('*/master')
            
          }
          
        }
        
        'doGenerateSubmoduleConfigurations'(false)
        
        'submoduleCfg'(class:'empty-list')
        
        'extensions'()
        
      }
      
      'scriptPath'('Pipeline/scripted-pipeline.groovy')
      
      'lightweight'(true)
      
    }
    
  }
  
}