select c.name
	from legal_person lp
		inner join customers c on lp.id_customers = c.id;