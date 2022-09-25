SELECT a.aname
	FROM aircrafts AS a
	INNER JOIN certified AS c
		ON a.aid = c.aid
	INNER JOIN employees AS e
		ON c.empid = e.empid
	GROUP BY a.aname
	HAVING (SUM(CASE WHEN e.salary >= 6000 THEN 1 ELSE 0 END) = 1) AND
			(SUM(CASE WHEN e.salary < 6000 THEN 1 ELSE 0 END) = 0) 
;
