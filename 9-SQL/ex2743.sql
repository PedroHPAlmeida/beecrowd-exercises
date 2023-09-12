/*PostgreSQL, apenas essa forma e aceita no URI
select name, char_length(name) as length from people
	order by length desc;*/

select name, len(name) as length from people --SQL Server
	order by length desc;