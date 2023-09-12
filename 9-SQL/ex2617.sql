select pdct.name, pro.name
    from products pdct
        inner join providers pro on pdct.id_providers = pro.id
    where pro.name = 'Ajax SA';