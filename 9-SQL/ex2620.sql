select c.name, o.id
    from orders o
        inner join customers c on o.id_customers = c.id
    where o.orders_date < '2016/06/30';