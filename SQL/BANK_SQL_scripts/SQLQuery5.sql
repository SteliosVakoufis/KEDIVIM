SELECT c.lastName, c.firstName
	FROM customer AS c, depositor AS d
		WHERE c.cid = d.cid

		UNION

SELECT c.lastName, c.firstName
	FROM customer AS c, borrower AS b
		WHERE c.cid = b.cid
;



SELECT c.lastName, c.firstName
	FROM customer AS c, depositor AS d
		WHERE c.cid = d.cid

		INTERSECT

SELECT c.lastName, c.firstName
	FROM customer AS c, borrower AS b
		WHERE c.cid = b.cid
;



SELECT c.lastName, c.firstName
	FROM customer AS c, depositor AS d
		WHERE c.cid = d.cid

		EXCEPT

SELECT c.lastName, c.firstName
	FROM customer AS c, borrower AS b
		WHERE c.cid = b.cid
;



SELECT DISTINCT c.lastName, c.firstName
	FROM customer AS c, depositor AS d
		WHERE c.cid = d.cid AND
			c.cid IN (SELECT b.cid FROM borrower AS b)
;



SELECT DISTINCT c.lastName, c.firstName
	FROM customer AS c, depositor AS d
		WHERE c.cid = d.cid AND
			c.cid NOT IN (SELECT b.cid FROM borrower AS b)
;



SELECT c.lastName, c.firstName
	FROM customer AS c
		WHERE 
		EXISTS(SELECT * FROM depositor AS d WHERE c.cid = d.cid) AND
		EXISTS(SELECT * FROM borrower AS b WHERE c.cid = c.cid)
;
