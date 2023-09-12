select c.name, cast( ((s.math*2 + s.specific*3 + s.project_plan*5)/10) as decimal(10, 2)) as avg
	from score s
		inner join candidate c on s.candidate_id = c.id
	order by avg desc;