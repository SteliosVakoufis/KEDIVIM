CREATE VIEW pilots AS
(
	SELECT *
		FROM employees AS e
		WHERE e.empid = ANY(
			SELECT DISTINCT c.empid
				FROM certified AS c
		)
);

CREATE VIEW others AS
(
	SELECT *
		FROM employees AS e
		WHERE e.empid != ALL(
			SELECT DISTINCT c.empid
				FROM certified AS c
		)
);


/*QUERY 7*/
SELECT SUM(p.salary) AS "Pilots Monthly Salary"
	FROM pilots AS p
;

/*QUERY 8*/
SELECT SUM(o.salary) AS "Not Pilots Monthly Salary"
	FROM others AS o
;

/*QUERY 17*/
SELECT o.firstname, o.lastname, o.salary
	FROM others AS o
	WHERE o.salary > (SELECT AVG(salary) FROM pilots)
;
