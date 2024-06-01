
public class Maven {
//In this class we have added EmployeeMgmtSystem as a dependency in pom.xml.
//After that we updated maven and EmployeeMgmtSystem got added as a jar in 
//maven Dependencies in the project.
//	<dependency>
//    <groupId>com.example</groupId>
//    <artifactId>EmployeeMgmtSystem</artifactId>
//    <version>0.0.1-SNAPSHOT</version>
//	</dependency>
//	
//Here groupId is taken from the path where the EmployeeMgmtSystem.jar file is 
//present in .m2 folder in path :
//	C:\Users\DELL\.m2\repository\com\example\EmployeeMgmtSystem
//ArtifactId is the name of the project Folder in the path above which gets 
//added after mvn install command is run.
//version is taken from the extended path version as above:
//C:\Users\DELL\.m2\repository\com\example\EmployeeMgmtSystem\0.0.1-SNAPSHOT
}
