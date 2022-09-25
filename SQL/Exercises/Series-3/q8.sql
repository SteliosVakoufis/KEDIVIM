SELECT SUM(e.salary) AS "Not Pilots Monthly Salary"
	FROM employees AS e
	WHERE e.empid != ALL(
		SELECT DISTINCT c.empid
			FROM certified AS c
	)
;
