USE LIBDW

SELECT * INTO FACTORY_TABLE
	FROM
	(
		SELECT ROW_NUMBER() OVER (ORDER BY borrowers.bid ASC) AS ID, 
			borrowers.bid, borrowers.sex, borrowers.bname,
			departments.depname, departments.depcode,
			loanstats.lid, loanstats.copyno, loanstats.loandate,
			copies.copyloc, copies.bibno,
			bibrecs.material
			FROM borrowers
			LEFT JOIN departments
				ON borrowers.depcode = departments.depcode
			LEFT JOIN loanstats
				ON borrowers.bid = loanstats.bid
			LEFT JOIN copies
				ON loanstats.copyno = copies.copyno
			LEFT JOIN bibrecs
				ON copies.bibno = bibrecs.bibno
	) AS FC_TABLE
;
