UPDATE copies
	SET price = 70
	WHERE mid = ALL (SELECT m.mid FROM movies AS m WHERE m.title = 'Amelie') AND
		  medium = 'DVD'
;
