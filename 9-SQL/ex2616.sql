select c.id, c.name
    from locations l
        right outer join customers c on l.id_customers = c.id
    where l.id_customers is null;