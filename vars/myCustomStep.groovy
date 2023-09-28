// StarkProjekt/vars/myCustomStep.groovy

def call() {

    // Add .jar files from the libs directory to the classpath
    def libDir = "${JENKINS_HOME}/userContent/StarkProjekt/libs"
    def jars = findFiles(glob: "${libDir}/*.jar")
    jars.each { jar ->
        def jarPath = jar.toString()
        currentBuild.classLoader.addURL(new URL("file://${jarPath}"))
    }

    
}