AtomExpress is a simple set of domain models that support:

* Atom feeds (http://www.ietf.org/rfc/rfc4287.txt)
* RSS 2.0 feeds (http://cyber.law.harvard.edu/rss/rss.html)
* JSON Activity Streams 1.0 (http://activitystrea.ms/specs/json/1.0/)

The root objects for each of these feed types are:

* com.strategicgains.atomexpress.domain.atom.Feed
* com.strategicgains.atomexpress.domain.rss.Channel
* com.strategicgains.atomexpress.domain.activity.ActivityStream

Respectively. BTW, RestExpress () will marshal these domain models to JSON or XML by default...

Maven Usage
===========
Stable:
```xml
		<dependency>
			<groupId>com.strategicgains</groupId>
			<artifactId>AtomExpress</artifactId>
			<version>0.1.1</version>
		</dependency>
```
Development:
```xml
		<dependency>
			<groupId>com.strategicgains</groupId>
			<artifactId>AtomExpress</artifactId>
			<version>0.1.2-SNAPSHOT</version>
		</dependency>
```
Or download the jar directly from: 
http://search.maven.org/#search%7Cga%7C1%7Ca%3A%22RestExpress%22

Note that to use the SNAPSHOT version, you must enable snapshots and a repository in your pom file as follows:
```xml
  <profiles>
    <profile>
       <id>allow-snapshots</id>
          <activation><activeByDefault>true</activeByDefault></activation>
       <repositories>
         <repository>
           <id>snapshots-repo</id>
           <url>https://oss.sonatype.org/content/repositories/snapshots</url>
           <releases><enabled>false</enabled></releases>
           <snapshots><enabled>true</enabled></snapshots>
         </repository>
       </repositories>
     </profile>
  </profiles>
```