USE LIBDW

SELECT cal.lmonth, c.sex, COUNT(*) AS "Loaned Books"
	FROM LoanedBooks AS lb
	LEFT JOIN Customers AS c
		ON lb.bid = c.p_id
	LEFT JOIN Calender AS cal
		ON lb.loandate = cal.cal_key
	WHERE cal.lyear = '2000'
	GROUP BY cal.lmonth, c.sex
	ORDER BY cal.lmonth
;
