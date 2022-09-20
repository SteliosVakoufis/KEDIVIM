SELECT c.category, COUNT(*) AS "Movies Number"
	FROM categories AS c
	INNER JOIN movie_cat AS mc
		ON c.catid = mc.catid
	INNER JOIN movies AS m
		ON mc.mid = m.mid
	GROUP BY c.category
	HAVING COUNT(*) >= 5
;
