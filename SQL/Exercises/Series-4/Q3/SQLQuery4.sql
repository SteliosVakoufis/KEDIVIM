USE LIBDW

SELECT 
	cal.lyear, dep.depname, c.sex, COUNT(*)
	FROM LoanedBooks AS lb
	LEFT JOIN Calender AS cal
		ON lb.loandate = cal.cal_key
	LEFT JOIN Departments AS dep
		ON lb.depcode = dep.d_id
	LEFT JOIN Customers AS c
		ON lb.bid = c.p_id
	GROUP BY ROLLUP(cal.lyear, dep.depname, c.sex)
	ORDER BY cal.lyear DESC, dep.depname DESC, c.sex DESC
;
