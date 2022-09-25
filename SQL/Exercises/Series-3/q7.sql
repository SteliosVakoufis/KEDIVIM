SELECT SUM(e.salary) AS "Pilots Monthly Salary"
	FROM employees AS e
	WHERE e.empid = ANY(
		SELECT DISTINCT c.empid
			FROM certified AS c
	)
;
