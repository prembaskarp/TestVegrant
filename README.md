# Prerequisites:

Install Java Jdk 1.8 or above

configure this with system Variables

Install Eclipse, the Maven plugin, 
Set up Eclipse Preferences

Window > Preferences... (or on Mac, Eclipse > Preferences...)

Create a new Java Project.
Choose the Location of the project to be the location of cmdline-sample
Select the project and Convert to Maven Project to add Maven Dependencies.
add  This dependencies on pom.xml
<!-- https://mvnrepository.com/artifact/junit/junit -->
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
</dependency>


check java libaries on add library.
Click on Run 
Right-click on project
Run As > Java Application
