## JAR files
- Package Java application into Java Archive file


1. Create a `manifest.mf` file and specify `main-class` (entry point)
1. Compile all classes
  * `javac App.java`
1. Create JAR file with manifest to make it executable
  * `jar cvmf MANIFEST.MF App.jar App.class`
1. Now jar can be executed with
  * `java -jar App.jar`
