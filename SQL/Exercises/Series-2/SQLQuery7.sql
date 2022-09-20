SELECT COUNT(DISTINCT c.mid) AS "Movie DVD Copies"
	FROM copies AS c
		WHERE c.medium = 'DVD'
;
