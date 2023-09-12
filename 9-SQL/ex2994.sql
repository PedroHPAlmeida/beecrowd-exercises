select docs.name, round(sum((att.hours * 150) * (1 + ws.bonus / 100)), 1) as salary from attendances as att
	inner join doctors as docs on  att.id_doctor = docs.id
	inner join work_shifts as ws on att.id_work_shift = ws.id
group by docs.name
order by salary desc;