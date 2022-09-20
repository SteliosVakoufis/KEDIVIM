SELECT m.title
	FROM movies AS m
	INNER JOIN movie_actor AS ma
		ON m.mid = ma.mid
	INNER JOIN actors AS a
		ON ma.actid = a.actid
	GROUP BY m.title
	HAVING SUM(CASE WHEN a.lname = 'Καρέζη' THEN 1 ELSE 0 END) > 0 AND
		   SUM(CASE WHEN a.lname = 'Κούρκουλος' THEN 1 ELSE 0 END) = 0
;

SELECT secondSet.title
	FROM
	(
		SELECT ma.mid
			FROM movies AS m
			INNER JOIN movie_actor AS ma
				ON m.mid = ma.mid
			INNER JOIN actors AS a
				ON ma.actid = a.actid
			WHERE a.lname = 'Κούρκουλος'
	)	as firstSet
		RIGHT JOIN
	(
		SELECT m.title, ma.mid
			FROM movies AS m
			INNER JOIN movie_actor AS ma
				ON m.mid = ma.mid
			INNER JOIN actors AS a
				ON ma.actid = a.actid
			WHERE a.lname = 'Καρέζη'
	)	as secondSet
	ON firstSet.mid = secondSet.mid
	WHERE firstSet.mid IS NULL
;