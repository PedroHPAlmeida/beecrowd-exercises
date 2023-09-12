--select name, cast(extract(day from payday) as int) as day from loan; --PostgreSQl, apenas essa forma e aceita no URI
select name, day(payday) as day from loan; --SQL Server