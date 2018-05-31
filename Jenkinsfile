pipeline {
  agent any
  stages {
    stage('preperation') {
      parallel {
        stage('preperation') {
          steps {
            echo 'message 1'
          }
        }
        stage('') {
          steps {
            echo 'message2'
          }
        }
      }
    }
    stage('build') {
      steps {
        echo 'Building'
      }
    }
  }
}