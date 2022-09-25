SELECT e.firstname, e.lastname, e.empid
	FROM employees AS e
	WHERE e.empid = ANY (
		SELECT c.empid
			FROM certified AS c
			INNER JOIN aircrafts AS a
				ON c.aid = a.aid
			GROUP BY c.empid 
			HAVING (SUM(CASE WHEN a.aname LIKE '%Boeing%' THEN 1 ELSE 0 END) = 0) AND
					(SUM(CASE WHEN a.crange >= 3000 THEN 1 ELSE 0 END) > 0)
	)
;
