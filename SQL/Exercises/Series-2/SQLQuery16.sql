SELECT DISTINCT m.title
	FROM movies AS m
	LEFT JOIN movie_cat AS mc
		ON m.mid = mc.mid
	LEFT JOIN categories AS c
		ON mc.catid = c.catid
	GROUP BY m.title
	HAVING SUM(CASE WHEN c.category = 'Κωμωδία' THEN 1 ELSE 0 END) > 0 AND
		   SUM(CASE WHEN c.category = 'Αισθηματική' THEN 1 ELSE 0 END) > 0;
;
