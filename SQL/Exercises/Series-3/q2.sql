SELECT *
	FROM flights AS f
	WHERE f.distance BETWEEN 900 AND 1500
	ORDER BY f.distance ASC
;
