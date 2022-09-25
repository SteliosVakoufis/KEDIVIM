CREATE PROCEDURE flight_verbal_cost
	AS
		SELECT f.fno, 
			CASE
				WHEN f.price <= 500 THEN 'Cheap'
				WHEN f.price <= 1500 THEN 'Normal' ELSE 'EXPENSIVE'
			END AS cost
			FROM flights AS f
;


/*Procedure Execution*/
EXEC flight_verbal_cost;
