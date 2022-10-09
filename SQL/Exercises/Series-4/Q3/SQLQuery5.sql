USE LIBDW

SELECT 
	cal.lyear, cl.copyloc, c.sex, COUNT(*) AS "Loaned Books"
	FROM LoanedBooks AS lb
	LEFT JOIN Calender AS cal
		ON lb.loandate = cal.cal_key
	LEFT JOIN CopyLocations AS cl
		ON lb.depcode = cl.cl_id
	LEFT JOIN Customers AS c
		ON lb.bid = c.p_id
	GROUP BY CUBE(cal.lyear, cl.copyloc, c.sex)
	ORDER BY cal.lyear DESC, cl.copyloc DESC, c.sex DESC
;
