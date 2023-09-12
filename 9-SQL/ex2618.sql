select pdct.name, pro.name, ctg.name
    from products pdct
        inner join providers pro on pdct.id_providers = pro.id
        inner join categories ctg on pdct.id_categories = ctg.id
    where pro.name = 'Sansul SA' and ctg.name = 'Imported';