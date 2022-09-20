SELECT a.lname, a.fname 
	FROM actors AS a
		WHERE a.lname LIKE 'Κ%'
		ORDER BY a.lname ASC
;
