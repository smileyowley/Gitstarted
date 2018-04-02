# GIT Usage Example

This code is part of a lecture course in software development. Its purpose it so teach the following concepts/tools:
* Eclipse
* Maven
* GIT
* Branching and version control
* SQLite
* Logging

## About the Project
As part of a TY program at your local secondary school, a music teacher wants to do a series of music appreciation and life skills classes where the parents of each pupil provide a playlist of their top 10 songs. We will create an application to allow the Music teacher to do this.
 
### Features:
+ Connection to the database
+ Menu system
+ Mini applications within the application itself:
	- show users
	- show playlists
	- show/play music

### Folders:

* **data** for csv files
* **database** for database files
* **db** for tables and scripts

### CA3 Checklist
* √ uses **JOpt library** to process command line parameters
* √ uses **Log4J** to output app progress & error messages
* X uses **SQLite JDBC library** for a database connection
* X has Classes to create a text-based menu
* X used **Factory Method pattern** to instantiate the menu items requested
* X has **tables**: User, Music, Playlist & Playlist x Music crosstable
* X has **MVC classes** to display User data from a database:
	* Music view
	* Playlist view
	* PlaylistViewMenuItem class
* X has a **DAO class** for database access
* X add MusicViewMenuItem and PlaylistViewMenuItem to **Menu Builder**
* X add MusicViewMenuItem and PlaylistViewMenuItem to **MenuItemFactory**


So, let's start coding!

![Owlie Dev](http://rlv.zcache.com/cartoon_owl_with_headphones_stickers-r91958afc453147f49cb7b37185600df0_v9waf_8byvr_512.jpg "Owlie Dev")

## Licence

**Author :** [Conor O Reilly](http://ie.linkedin.com/in/conororeilly)

*[Licensed under the Creative Commons Attribution 3.0 License](http://creativecommons.org/licenses/by/3.0/)*

	- Free for use in both personal and commercial projects.
	- Attribution requires leaving author name, author homepage link, and the license info intact.