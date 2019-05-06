# javaOnline
mvn package
After configuring this plug-in, running mvn package will produce two jars: one containing just the project classes, and a second fat jar with all dependencies with the suffix "-jar-with-dependencies".

Run:
java -cp Menu/target/Menu-1.0-SNAPSHOT-jar-with-dependencies.jar com.vtom.view.menu.ViewList