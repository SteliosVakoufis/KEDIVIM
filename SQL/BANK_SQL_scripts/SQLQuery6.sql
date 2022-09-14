SELECT 
	AVG(balance) AS "avg",
	MAX(balance) AS "max",
	MIN(balance) AS "min",
	SUM(balance) AS "sum",
	COUNT(balance) AS "count"
		FROM account
;


SELECT bname, sum(balance)
	FROM account, branch
	WHERE account.bcode = branch.bcode
	GROUP BY bname
	HAVING sum(balance) > 100000
;


SELECT count(accno) AS "accounts", firstName, lastName
	FROM customer, depositor
	WHERE customer.cid = depositor.cid
	GROUP BY firstName, lastName
	HAVING count(accno) >= 3
;



SELECT sum(acc.balance) * 0.05 AS "value"
	FROM account AS acc
	WHERE acc.balance > 4000
;



SELECT b.bname, b.assets
	FROM branch AS b
	WHERE b.assets > ANY (SELECT assets FROM branch AS b WHERE b.city = 'Θεσσαλονίκη')
;
