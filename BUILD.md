# How to Create a Deployment 
##### These Directions are made for using repl.it, using a different platform might have different results

### Running Application 
1. Install gradle to your repl.it (see installing gradle section)
2. Run `gradle run`

### Making Jar File 
1. Install gradle to your repl.it (see installing gradle section)
2. Run `gradle jar`
3. The jar will be created an put into build/libs/422ClassProject


### Installing Gradle

1. Go to repl.it, make a new repl and choose import from github while creating it 
2. After the repl is created we need to install gradle. To do this run the following commands in the terminal
    `wget https://services.gradle.org/distributions/gradle-6.6.1-bin.zip`

    `unzip -q gradle-6.6.1-bin.zip`

    `export GRADLE_HOME=$(pwd)/gradle-6.6.1`

    `export PATH=${GRADLE_HOME}/bin:${PATH}`

    `gradle -v`
    
    If gradle installed correctly you should see a message with Gradle 6.6.1 somewhere in it
    
    Note: if at any point you get an error `command: gradle not found` Run the last 3 install steps again

3. Run `gradle build` This will build the project.



