SELECT f.toCity, COUNT(*) AS "Flights"
	FROM flights AS f
	GROUP BY f.toCity
	HAVING COUNT(*) >= 3
;
