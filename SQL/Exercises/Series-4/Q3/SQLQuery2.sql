USE LIBDW

SELECT cl.copyloc, bm.material, COUNT(*) AS "Loaned Books"
	FROM LoanedBooks AS lb
	LEFT JOIN CopyLocations AS cl
		ON lb.copy_loc = cl.cl_id
	LEFT JOIN BookMaterials AS bm
		ON lb.material_id = bm.bn_id
	GROUP BY cl.copyloc, bm.material
	ORDER BY cl.copyloc DESC, [Loaned Books] DESC
;
