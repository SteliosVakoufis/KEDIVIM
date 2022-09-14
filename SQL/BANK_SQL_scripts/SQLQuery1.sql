SELECT customer.firstname, customer.lastname, depositor.accno, account.balance AS Balance
	FROM customer, depositor, account
		WHERE (customer.cid = depositor.cid) AND
		(depositor.accno = account.accno)
		ORDER BY customer.cid
;

SELECT *
	FROM customer
		WHERE customer.lastname LIKE 'Α%'
;

SELECT *
	FROM account
		WHERE accno LIKE 'A__0'
;
