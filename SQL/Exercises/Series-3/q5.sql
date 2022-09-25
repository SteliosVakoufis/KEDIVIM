SELECT e.firstname, e.lastname
	FROM employees AS e
	WHERE empid = ANY(
		SELECT c.empid 
			FROM certified AS c 
			GROUP BY c.empid 
			HAVING COUNT(*) >= 3
	)
;
