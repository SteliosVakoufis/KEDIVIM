USE LIBRARY

SELECT COUNT(bid) AS "Borrowers", b.sex AS "Gender"
	FROM borrowers AS b
	GROUP BY sex
;

CREATE INDEX Sex_IDX ON borrowers(sex);

DROP INDEX Sex_IDX ON borrowers;