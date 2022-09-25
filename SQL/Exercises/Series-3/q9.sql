SELECT aname
	FROM aircrafts
	WHERE crange >= (
		SELECT f.distance
			FROM flights AS f
			WHERE f.fromCity = 'Αθήνα' AND
				f.toCity = 'Μελβούρνη'
	)
;
