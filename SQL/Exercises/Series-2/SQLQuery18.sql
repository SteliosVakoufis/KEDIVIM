SELECT d.fname, d.lname, COUNT(m.mid) AS "Movies"
	FROM directors AS d
	LEFT JOIN movies AS m
		ON d.did = m.did
	GROUP BY d.fname, d.lname
	ORDER BY COUNT(m.mid) DESC
;
