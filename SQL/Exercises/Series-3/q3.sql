SELECT f.toCity, COUNT(*) AS "Flights"
	FROM flights AS f
	WHERE f.depDate BETWEEN '2018/5/1' AND '2018/5/30'
	GROUP BY f.toCity
;
