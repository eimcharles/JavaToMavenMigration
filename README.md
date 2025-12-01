### Java to Maven Migration

#### This repository serves as a practical, guide and working example demonstrating the process of converting a traditional Java project into a standardized, buildable Maven project.

--- 

#### Initial File Structure: 
```

JavaToMavenMigration/
├── .idea/                       <-- IntelliJ's project metadata
├── src/                         <-- The single source folder
│   ├── com.eimc/                <-- root package
│   │   ├── booking/       
│   │   ├── car/
│   │   └── User/
│   └── Main.java                <-- entry point file (source code)
└── JavaToMavenMigration.iml     <-- IntelliJ's module file (before Maven)
```
--- 

#### Maven File Structure: 
```
JavaToMavenMigration/
├── src/
│   ├── main/
│   │   ├── java/              <-- entry point file (source code)
│   │   └── resources/         <-- For configuration files (e.g., application.properties)
│   └── test/
│       ├── java/              <-- For unit tests (e.g., JUnit files)
│       └── resources/         <-- For test-specific configuration (Read only during 'mvn test')
├── target/                    <-- Created by Maven build goals (e.g., mvn install)
└── pom.xml                    <-- The core Maven configuration file        
```
