SELECT m.title, d.lname, d.fname
	FROM movies AS m, directors AS d
		WHERE m.production = 'GRC' AND m.did = d.did
		ORDER BY d.lname ASC
;
