select name, round((salary * 0.1), 2) as tax
	from people
	where salary > 3000.0;