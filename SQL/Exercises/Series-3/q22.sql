CREATE TRIGGER Pilot_Achievement ON certified
	AFTER INSERT AS

	BEGIN
		UPDATE employees SET salary = salary * 1.10
		WHERE empid = 
		(
			SELECT c.empid FROM certified AS c 
			WHERE c.empid = ANY(SELECT empid FROM INSERTED)
			GROUP BY c.empid HAVING COUNT(c.empid) = 3
		)
	END
;
