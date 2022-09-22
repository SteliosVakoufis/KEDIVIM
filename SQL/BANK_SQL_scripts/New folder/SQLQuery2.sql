CREATE VIEW TotalLoanPerBranch AS
	SELECT bname, SUM(loan.amount) AS totalloans
	FROM branch LEFT JOIN loan ON branch.bcode = loan.bcode
	GROUP BY bname