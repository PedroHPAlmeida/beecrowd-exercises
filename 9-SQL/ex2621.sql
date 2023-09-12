select pdc.name
	from products pdc
		inner join providers prov on prov.id = pdc.id_providers
	where prov.name like 'P%' and pdc.amount > 9 and  pdc.amount < 21;