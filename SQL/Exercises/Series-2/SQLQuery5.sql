SELECT m.title, m.pyear
	FROM movies AS m
	INNER JOIN movie_actor AS ma
		ON m.mid = ma.mid
	INNER JOIN actors AS a
		ON ma.actid = a.actid
	WHERE a.lname = 'Eastwood'
;
