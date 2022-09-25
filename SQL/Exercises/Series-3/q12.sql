SELECT e.firstname, e.lastname
	FROM employees AS e
	WHERE e.salary = (
		SELECT MAX(e.salary)
		FROM employees AS e
	)
;
