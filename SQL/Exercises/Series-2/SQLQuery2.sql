SELECT m.title, m.pyear
	FROM movies AS m
		WHERE m.pyear BETWEEN 1990 AND 2007
		ORDER BY m.pyear DESC
;
