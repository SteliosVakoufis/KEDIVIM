CREATE VIEW LoanPerCustomer AS
SELECT firstname, lastname, sum(amount) as total
	FROM customer, borrower, loan
	WHERE customer.cid = borrower.cid AND
		  borrower.lnum = loan.lnum
	GROUP BY firstname, lastname
;

SELECT * 
	FROM LoanPerCustomer
	WHERE total >= 50000;