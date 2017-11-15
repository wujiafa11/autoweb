java code for autoweb
=======================

An implementation of Geohashes in pure Java.
The produced hashes, when using character precision (multiples of 5 bits) are compatible
to the reference implementation geohash.org.

You can however also encode Geohashes down to the full available precision of a long i.e. 64 bits.

Build status
------------

<a href="https://travis-ci.org/kungfoo/geohash-java"><img src="https://travis-ci.org/kungfoo/geohash-java.svg?branch=master"/></a>


Getting the library
-------------------

As of today, new releases are made available via maven Central.
Thus you can use the artifacts in various build systems like maven, ivy, gradle, sbt and mayn more.

Find the current versions here:

    http://search.maven.org/#search|ga|1|g%3A%22ch.hsr%22%20AND%20a%3A%22geohash%22


Building/Testing the code
-------------------------

The geohash-java code can be built using Apache Maven.

Maven targets are the usual suspects.

	- clean    
    - compile
    - test
    - package   # pack a versioned jar containing the compiled class files

Compatibility
-------------------------
This branch ditches 1.6 compatibility. If you need that look at the release-1.0 branch
and artifacts in maven central. I will backport important bugfixes to the release-1.0 branch.

TODO
----

Current development involves getting the following things to run:

-	a method to find the n closest hashes to any given point.
-	refactor tests, might want to add a dependency on hamcrest
    and provide some custom matchers for fun and profit.


Last important changes
----------------------

Version 1.1.0
-----------------------

Important fix 398d048b66e8cff1e5df8aa1a4bdc4c37ca70070
ord() would return negative longs, which is plain wrong.

Thanks to Graham Dennis and aborochoff for pointing it out.

Also: Raise source level to 1.7.

	
License
-------

This code has been placed under the Apache License 2.0.
See the LICENSE file for more information.
Please contribute improvements and bug fixes back via github.
