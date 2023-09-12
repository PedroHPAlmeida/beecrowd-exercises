select FORMAT(CONVERT(bigint, np.cpf), '###\.###\.###-##') as cpf
	from natural_person as np; --SQL Server

/*PostgreSQL - apenas essa forma e aceita no URI
select concat_ws('-', concat_ws('.', substring(np.cpf from 1 for 3), substring(np.cpf from 4 for 3), substring(np.cpf from 7 for 3)), substring(np.cpf from 10 for 2)) as cpf
	from natural_person as np; */ 