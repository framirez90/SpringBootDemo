pipeline{
  agent any

  stages{
    stage('Compile Stage'){
      whitMaven(maven: 'apache-maven-3.2.5'){
      	sh 'mvn clean compile'
      }
    }
    
    stage('Test Stage'){
      whitMaven(maven: 'apache-maven-3.2.5'){
      	sh 'mvn test'
      }
    }
    
    stage('Deploy Stage'){
      whitMaven(maven: 'apache-maven-3.2.5'){
      	sh 'mvn deploy'
      }
    }
  }

}