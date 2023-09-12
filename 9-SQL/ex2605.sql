select pdct.name, pvd.name
	from products pdct
		inner join providers pvd on pdct.id_providers = pvd.id
	where pdct.id_categories = 6;