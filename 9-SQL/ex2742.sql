select lr.name, round((lr.omega * 1.618), 3) as "Fator N"
	from life_registry lr
		inner join dimensions d on d.id = lr.dimensions_id
	where lr.name like '%Richard%' and d.name in ('C875', 'C774');