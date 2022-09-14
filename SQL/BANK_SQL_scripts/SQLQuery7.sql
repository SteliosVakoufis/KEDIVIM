SELECT lastName, firstName, accno
	FROM customer, depositor
	WHERE customer.cid = depositor.cid
;


SELECT lastName, firstName, accno
	FROM customer INNER JOIN depositor
	ON customer.cid = depositor.cid
	ORDER BY accno
;


SELECT lastName, firstName, accno
	FROM customer LEFT JOIN depositor
	ON customer.cid = depositor.cid
	ORDER BY accno
;



SELECT * 
	FROM account
;


UPDATE account
	SET balance = 1500
	WHERE accno = 'A900'
;


UPDATE account
	SET balance = balance * 1.10
	WHERE balance >= 10000
;


UPDATE account
	SET balance = balance * 1.05
	WHERE balance < 10000
;


UPDATE account
	SET balance =
		CASE
			WHEN balance >= 10000 THEN balance * 1.10
			ELSE balance * 1.05
		END
;


