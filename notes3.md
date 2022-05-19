# [Back to main](index)

## Video: How do NoSQL databases work?

https://www.youtube.com/watch?v=0buKQHokLK8

Relational Databases (MySQL, etc.)

-   Built to store relational data as efficiently as possible

-   Relational data: data with predefined relationships 

-   Hard to scale - resource intensive

-   Can scale vertically, not horizontally

Why do NoSQL databases scale so well

-   Do away with costly relationships

-   Every item stands on their own

-   Essentially key value stores

-   Value can be json data storing more data

-   Can split workload across multiple servers

-   These parts of database are called partitions

-   Key determines on which partition data is stored

-   Primary key

-   Hash function to convert each item's primary key into number that falls into fixed range - hash value and ranged used to determine where to store item

-   Range is called a Keyspace

-   Where to store new items, where to find existing ones

NosQL are Schemaless

-   Items in database don't need to have same structure

-   In Relational database, have to define table's structure, and each item must conform to it

-   No structure is good if data is constantly evolving

NoSQL vs Relational

-   Can only retrieve by primary key

-   NoSQL databases are eventually consistent
