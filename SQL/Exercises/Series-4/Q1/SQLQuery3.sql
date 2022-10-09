USE LIBRARY

SELECT ISNULL(a.author, 'Unkown') AS Author, 
	COUNT(b.sex) AS "Borrowers",
	(CASE 
		WHEN b.sex = 'F' THEN 'Female' ELSE 'Male' 
	END) AS "Gender"

	FROM loanstats AS ls
	INNER JOIN borrowers as b
		ON ls.bid = b.bid
	LEFT JOIN copies AS c
		ON ls.copyno = c.copyno
	LEFT JOIN bibauthors AS ba
		ON c.bibno = ba.bibno
	LEFT JOIN authors AS a
		ON ba.aid = a.aid
	WHERE DATEPART(YEAR, ls.loandate) = '2006' AND
		c.copyloc = 'OPA'
	GROUP BY a.author, b.sex
	HAVING COUNT(b.sex) > 10
	ORDER BY COUNT(b.sex) DESC
;

CREATE NONCLUSTERED INDEX Copyloc_IDX
	ON copies(copyloc)
;

CREATE NONCLUSTERED INDEX Bibno_Aid_IDX
	ON bibauthors(bibno, aid)
;

CREATE NONCLUSTERED INDEX Aid_Authors_IDX
	ON authors(aid, author)
;

DROP INDEX Bibno_Aid_IDX
	ON bibauthors
;

DROP INDEX Aid_Authors_IDX
	ON authors
;

DROP INDEX Copyloc_IDX
	ON copies
;
