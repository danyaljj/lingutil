# BLEU-measure in Java 
Code automatically exported from code.google.com/p/lingutil plus a little clean up from me. 

### Usage 

To use it as a dependency, use the followings, for maven projects: 

```xml 
    <dependencies>
         ...
        <dependency>
            <groupId>lingutil</groupId>
            <artifactId>lingutil</artifactId>
            <version>1.0</version>
        </dependency>
        ...
    </dependencies>
    ...
    <repositories>
        <repository>
            <id>CogcompSoftware</id>
            <name>CogcompSoftware</name>
            <url>http://cogcomp.cs.illinois.edu/m2repo/</url>
        </repository>
    </repositories>
```

and the following for sbt projects: 

```sbt 
resolvers += "CogcompSoftware" at "http://cogcomp.cs.illinois.edu/m2repo/"
libraryDependencies += "lingutil" % "lingutil" % "1.0"
```
