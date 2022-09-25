SELECT e.firstname, e.lastname
	FROM employees AS e
	WHERE e.salary < (
		SELECT MIN(f.price)
			FROM flights AS f
			WHERE f.toCity = 'Μελβούρνη'
	)
;
