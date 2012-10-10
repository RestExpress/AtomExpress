AtomExpress is a simple set of domain models that support:

* Atom feeds (http://www.ietf.org/rfc/rfc4287.txt)
* RSS 2.0 feeds (http://cyber.law.harvard.edu/rss/rss.html)
* JSON Activity Streams 1.0 (http://activitystrea.ms/specs/json/1.0/)

Additionally, there is a corresponding set of 'builders' with their own fluent DSLs that enable simple creation of same:

* AtomFeedBuilder
* RssFeedBuilder
* ActivityStreamBuilder

Respectively. BTW, RestExpress () will marshal these domain models to JSON or XML by default...