select pdct.name, pro.name, pdct.price
    from products pdct
        inner join providers pro on pdct.id_providers = pro.id
        inner join categories ctg on pdct.id_categories = ctg.id
    where pdct.price > 1000.0 and ctg.name = 'Super Luxury';