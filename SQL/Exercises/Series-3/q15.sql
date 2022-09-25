SELECT e.empid, MAX(a.crange) AS "Max crange"
	FROM employees AS e
	INNER JOIN certified AS c
		ON e.empid = c.empid
	INNER JOIN aircrafts AS a
		ON c.aid = a.aid
	GROUP BY e.empid
	HAVING COUNT(*) >= 3
;
