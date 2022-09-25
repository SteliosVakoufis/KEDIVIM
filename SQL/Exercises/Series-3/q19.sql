CREATE VIEW flight_aircrafts AS
	SELECT a.aname, f.fno, f.fromCity, f.toCity
		FROM flights AS f
		LEFT JOIN aircrafts AS a
			ON f.distance <= a.crange
;


SELECT fa.aname, COUNT(fa.fno) AS "Services"
	FROM flight_aircrafts AS fa
	GROUP BY fa.aname
;
