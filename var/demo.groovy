def call() {
  echo "my first library"
  sh '''
    mvn clean install
    '''
}
