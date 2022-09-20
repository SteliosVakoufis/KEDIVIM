SELECT m.title, m.pyear
	FROM movies AS m 
	INNER JOIN directors AS d
		ON m.did = d.did
		WHERE d.lname = 'Σακελλάριος'
;
