CREATE PROCEDURE insert_pilot
	(
	@pilot_id INT, @pilot_lname VARCHAR(30), @pilot_fname VARCHAR(30),
	@aircraft_id INT, @aircraft_name VARCHAR(50)
	)

	AS
		IF (EXISTS (SELECT empid FROM certified WHERE empid = @pilot_id AND aid = @aircraft_id))
			BEGIN
				PRINT 'Pilot already registered with this aircraft.'
				RETURN
			END

		DECLARE @pilot_updated BIT
		DECLARE @aircraft_updated BIT
		SET @pilot_updated = 1;
		SET @aircraft_updated = 1;

		IF (NOT EXISTS (SELECT empid FROM pilots WHERE empid = @pilot_id))
			BEGIN
				INSERT INTO employees (empid, firstname, lastname)
					VALUES (@pilot_id, @pilot_fname, @pilot_lname)
			END
		ELSE SET @pilot_updated = 0;

		IF (NOT EXISTS (SELECT aid FROM aircrafts WHERE aid = @aircraft_id))
			BEGIN
				INSERT INTO aircrafts (aid, aname)
					VALUES (@aircraft_id, @aircraft_name)
			END
		ELSE SET @aircraft_updated = 0;

		IF (@pilot_updated = 0 OR @aircraft_updated = 0)
			BEGIN
				INSERT INTO certified (empid, aid)
					VALUES ((SELECT empid FROM employees WHERE empid = @pilot_id),
							(SELECT aid FROM aircrafts WHERE aid = @aircraft_id))
			END
;


/*Procedures Execution*/
EXECUTE insert_pilot
	@pilot_id = 100, @pilot_lname = 'John', @pilot_fname = 'Snow',
	@aircraft_id = 900, @aircraft_name = '1903 Wright Flyer'
;

EXECUTE insert_pilot
	@pilot_id = 99, @pilot_lname = 'Daniels', @pilot_fname = 'Danielson',
	@aircraft_id = 900, @aircraft_name = '1903 Wright Flyer'
;
