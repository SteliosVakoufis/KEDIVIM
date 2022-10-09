USE LIBRARY

SELECT a.author, COUNT(DISTINCT br.bibno) AS "Books", br.lang AS "Language"
	FROM bibrecs AS br
	LEFT JOIN bibauthors AS ba
		ON br.bibno = ba.bibno
	LEFT JOIN authors AS a
		ON ba.aid = a.aid
	WHERE br.lang = 'ITA'
	GROUP BY a.author, br.lang
	ORDER BY Books DESC
;

CREATE NONCLUSTERED INDEX Language_IDX
	ON bibrecs (lang);

DROP INDEX Language_IDX
	ON bibrecs;