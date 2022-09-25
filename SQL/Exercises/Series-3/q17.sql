SELECT DISTINCT e.firstname, e.lastname, e.salary
	FROM employees AS e, certified AS c
		WHERE e.salary > (
			SELECT AVG(e.salary)
				FROM employees AS e
				WHERE e.empid = ANY(
					SELECT DISTINCT c.empid
						FROM certified AS c
				)
		) AND e.empid != ALL (SELECT DISTINCT empid FROM certified)
;
