SELECT a.lname, a.fname
	FROM actors AS a
	INNER JOIN movie_actor AS ma
		ON a.actid = ma.actid
	INNER JOIN movies AS m
		ON ma.mid = m.mid
	WHERE m.title = 'Amelie'
;
