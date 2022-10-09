CREATE VIEW genders_authors AS
	SELECT a.author, 
		COUNT(b.sex) AS Borrowers,
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
		GROUP BY a.author, b.sex
;

SELECT *	
	FROM genders_authors AS ga
	WHERE ga.Borrowers IN (
		SELECT MAX(Borrowers)
			FROM genders_authors
			WHERE author IS NOT NULL
			GROUP BY Gender
	)
;

CREATE NONCLUSTERED INDEX Copyno_IDX
	ON loanstats(copyno)
;

CREATE NONCLUSTERED INDEX Bibno_Aid_IDX
	ON bibauthors(bibno, aid)
;

CREATE NONCLUSTERED INDEX Aid_Authors_IDX
	ON authors(aid, author)
;

DROP INDEX Copyno_IDX
	ON loanstats
;

DROP INDEX Bibno_Aid_IDX
	ON bibauthors
;

DROP INDEX Aid_Authors_IDX
	ON authors
;

DROP VIEW genders_authors