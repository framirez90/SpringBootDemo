pipeline{
  agent any

  stages{
    stage('Compile Stage'){
      withMaven(maven: 'apache-maven-3.2.5'){
      	sh 'mvn clean compile'
      }
    }
    
    stage('Test Stage'){
      withMaven(maven: 'apache-maven-3.2.5'){
      	sh 'mvn test'
      }
    }
    
    stage('Deploy Stage'){
      withMaven(maven: 'apache-maven-3.2.5'){
      	sh 'mvn deploy'
      }
    }
  }

}