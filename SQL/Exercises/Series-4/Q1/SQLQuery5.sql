SELECT p.pubname, COUNT(c.bibno) AS "Copies of Books"
	FROM copies AS c
	LEFT JOIN bibrecs AS b
		ON c.bibno = b.bibno
	LEFT JOIN publishers AS p
		ON b.pubid = p.pubid
	WHERE p.pubname IN ('ΟΠΑ', 'CEPR')
	GROUP BY p.pubname
	ORDER BY [Copies of Books] DESC
;

CREATE NONCLUSTERED INDEX Pubid_Pubname_IDX
	ON publishers(pubid, pubname)
;

CREATE NONCLUSTERED INDEX Bibno_IDX
	ON copies(bibno)
;

CREATE NONCLUSTERED INDEX Pubid_IDX
	ON bibrecs(pubid)
;

DROP INDEX Pubid_Pubname_IDX
	ON publishers
;

DROP INDEX Bibno_IDX
	ON copies
;

DROP INDEX Pubid_IDX
	ON bibrecs
;
