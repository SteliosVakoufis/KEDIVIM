﻿SELECT COUNT(*) AS "Starred"
	FROM movies AS m
	INNER JOIN movie_actor AS ma
		ON m.mid = ma.mid
	INNER JOIN actors AS a
		ON ma.actid = a.actid
	WHERE a.lname = 'Παπαγιαννόπουλος'
;