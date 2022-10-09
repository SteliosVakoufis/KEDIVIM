USE LIBDW

SELECT c.lyear, d.depname, COUNT(*) AS "Loaned Books"
	FROM LoanedBooks AS lb
	LEFT JOIN Calender AS c
		ON lb.loandate = c.cal_key
	LEFT JOIN Departments AS d
		ON lb.depcode = d.d_id
	GROUP BY c.lyear, d.depname
	ORDER BY c.lyear DESC, [Loaned Books] DESC
;
