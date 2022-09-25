SELECT e.firstname, e.lastname
	FROM employees AS e
	WHERE e.empid = ANY(
		SELECT c.empid
			FROM certified AS c
			INNER JOIN aircrafts AS a
				ON c.aid = a.aid
			WHERE a.aname LIKE 'Boeing%'
	)
;
