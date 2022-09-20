SELECT m.title
	FROM movies AS m
	INNER JOIN movie_actor AS ma
		ON m.mid = ma.mid
	INNER JOIN actors AS a
		ON ma.actid = a.actid
	GROUP BY m.title
	HAVING SUM(CASE WHEN a.lname = 'Καρέζη' THEN 1 ELSE 0 END) > 0 AND
		   SUM(CASE WHEN a.lname = 'Κούρκουλος' THEN 1 ELSE 0 END) > 0
;

SELECT firstSet.title
	FROM
	(
		SELECT m.title, ma.mid, ma.actid, a.lname
			FROM movies AS m
			INNER JOIN movie_actor AS ma
				ON m.mid = ma.mid
			INNER JOIN actors AS a
				ON ma.actid = a.actid
			WHERE a.lname = 'Κούρκουλος'
	)	as firstSet
		INNER JOIN
	(
		SELECT m.title, ma.mid, ma.actid, a.lname
			FROM movies AS m
			INNER JOIN movie_actor AS ma
				ON m.mid = ma.mid
			INNER JOIN actors AS a
				ON ma.actid = a.actid
			WHERE a.lname = 'Καρέζη'
	)	as secondSet
	ON firstSet.mid = secondSet.mid
;
