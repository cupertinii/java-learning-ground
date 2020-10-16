## JAR files
- Package Java application into Java Archive file


* Create a `manifest.mf` file and specify `main-class` (entry point)
* Compile all classes
  * `javac App.java`
* Create JAR file with manifest to make it executable
  * `jar cvmf MANIFEST.MF App.jar App.class`
* Now jar can be executed with
  * `java -jar App.jar`
