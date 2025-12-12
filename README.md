### Java to Maven Migration

#### This repository serves as a working example demonstrating the process of converting a traditional Java project into a standardized, buildable Maven project.

--- 

#### Important Files for Java to Maven Migration:

| File Name                                                                                                   
|-------------------------|
| [pom.xml](pom.xml)                                                    
                                                                                      
---                                                                           

#### Initial File Structure: 
```
JavaToMavenMigration/
├── src/                             Single source folder
│   ├── com.eimc/                    Root package
│   │   ├── booking/
│   │   │      └── Booking.java
│   │   │
│   │   ├── user/
│   │   │    └── User.jav
│   │   │
│   │   └── car/
│   │        ├── Car.java
│   │        ├── Brand.java
│   │        └── FuelType.java
│   │  
│   └── Main.java                    Entry point file (source code) - Contains the main() method for application execution.
│ 
├── README.MD 
└── JavaToMavenMigration.iml         IntelliJ's module file (before Maven)
```
--- 

#### File Structure after Maven Migration: 
```
JavaToMavenMigration/
├── src/                                           The main container for all source code and resources.
│   ├── main/                                      Contains production code and resources that will be packaged into the final JAR/application.
│   │   ├── java/                                  Root directory for all production Java source files (must contain the package folders).
│   │   │   └── com/
│   │   │       └── eimc/                          Root package for the organization/project.
│   │   │           ├── booking/
│   │   │           │    └── Booking.java
│   │   │           │      
│   │   │           ├── user/
│   │   │           │     └── User.java
│   │   │           │        
│   │   │           ├── car/
│   │   │           │   ├── Car.java
│   │   │           │   ├── Brand.java
│   │   │           │   └── FuelType.java
│   │   │           │
│   │   │           └── Main.java                  Entry point file (Package: com.eimc) - Contains the main() method for application execution.
│   │   │ 
│   │   │
│   │   └── resources/                             For application configuration files (e.g., application.properties)
│   │
│   │             
│   └── test/                                      Contains all code and resources used only for testing
│       ├── java/                                  Root directory for all JUnit test source files.
│       │   └── com/
│       │       └── eimc/
│       │           ├── booking/
│       │           │    └── BookingTest.java      Unit test class for Booking object (Mirrors production package)
│       │           ├── car/
│       │           │    └── CarTest.java          Unit test class for Car object (Mirrors production package)
│       │           └── user/
│       │                └── UserTest.java         Unit test class for User object (Mirrors production package)
│       │
│       └── resources/                             For test-specific configuration (Read only during 'mvn test') 
│   
├── JavaToMavenMigration.iml                       IntelliJ's module file
├── pom.xml                                        The core Maven configuration file
└── README.MD                                         
```

