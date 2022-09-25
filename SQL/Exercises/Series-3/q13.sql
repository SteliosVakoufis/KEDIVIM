SELECT e.firstname, e.lastname
	FROM employees AS e
	WHERE e.salary = (
		SELECT salary 
			FROM (
			SELECT
				salary, ROW_NUMBER() OVER (ORDER BY salary DESC) AS row_num
				FROM (SELECT DISTINCT salary FROM employees) AS dist_sal
			) AS ar
		WHERE ar.row_num = 2
	)
;
