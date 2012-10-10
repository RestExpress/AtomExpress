AtomExpress is a simple set of domain models that support:

* Atom feeds (http://www.ietf.org/rfc/rfc4287.txt)
* RSS 2.0 feeds (http://cyber.law.harvard.edu/rss/rss.html)
* JSON Activity Streams 1.0 (http://activitystrea.ms/specs/json/1.0/)

The root objects for each of these feed types are:

* com.strategicgains.atomexpress.domain.atom.Feed
* com.strategicgains.atomexpress.domain.rss.Channel
* com.strategicgains.atomexpress.domain.activity.ActivityStream

Respectively. BTW, RestExpress () will marshal these domain models to JSON or XML by default...