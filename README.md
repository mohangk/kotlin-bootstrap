# kotlin-bootstrap

## What ?

A source repo with an opinionated list of dependencies to start a Kotlin based project. Logging, testing and building an
executable fat-jar for ease of deployment.  
 

## How

1. Clone it, then delete the .git directory and `git init`. No point keeping history from this repo
1. Replace all occurance of the word "bootstrap" in `src` with whatever package name you would like to use.
1. Replace the `BusinessLogic` class with whatever you would like it to be, its just there to test the testing integration

## Basic gradle 

1. To build - `gradle build`
1. To run tests = `gradle test`
1. To run - `java -jar build/libs/bootstrap-1.0.0-SNAPSHOT-all.jar`
1. Copy the fat jar out for deployments

# TODO
- remove the need for kotlinOptions, jvmTarget
- fix compiler warnings and gradle deprecation warnings 
