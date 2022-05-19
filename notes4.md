# [Back to main](index)

## Video: SQL vs NoSQL Explained

https://www.youtube.com/watch?v=ruz-vK8IesE

What is SQL?

-   Structured Query Language

-   Allows CRUD operations through universal language

-   4 key components

-   Structure

-   Tables w/ rows (individual entities/elements) and columns (types)

-   Data can have constraints

-   Consistency across contents of table

-   Relations

-   Storage

-   Storage pattern is concentrated

-   1 node that contains entire copy of data, not partitioned

-   Scale

-   Vertical (better machine) - more memory, faster CPU, better hard disk, etc

-   Upper ceiling: physical limitation

-   Horizontal

-   Adding more machines

-   Distributing data across multiple nodes

-   Access

-   Raw SQL

-   Require direct database connection

-   Object relational mappers

What is NoSQL?

-   Anything that is non-relational

-   Many implementations: table, doc, graph, etc

-   Built to scale with high performance, but queries are less flexible

-   4 key components

-   Structure

-   Tables

-   Documents (JSON)

-   Graphs

-   Rely on Key Value Store - need to know key when performing query

-   Storage

-   Hashing Input f(x)

-   Depending hashing value, it is distributed onto different partitions

-   Scale

-   Add more partitions

-   Access

-   REST APIs

-   Handle specific endpoint that has specific functionality

-   CRUD in Vendor specific language

When to use what?

-   SQL

-   When your access patterns aren't defined

-   Not sure yet how your business wants to use data

-   When you want to perform flexible queries

-   When you want to perform relational queries

-   If you want query to make multiple hops between tables

-   When you want to enforce field constraints

-   When you want to use a well documented access language (SQL)

-   NoSQL

-   When your access pattern is defined

-   When your primary key is known

-   When your data model fits (graphs)

-   When you need high performance and low latency
