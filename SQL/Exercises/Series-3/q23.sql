CREATE TRIGGER Ticket_Price_History ON flights
	AFTER UPDATE AS

	DECLARE @price_after INT,
			@price_before INT,
			@fno VARCHAR(4)

	DECLARE flight_INSERTED CURSOR FOR 
		SELECT price FROM INSERTED
	DECLARE flight_DELETED CURSOR FOR 
		SELECT fno, price FROM DELETED
		
	OPEN flight_INSERTED 
	OPEN flight_DELETED 

	FETCH NEXT FROM flight_INSERTED
		INTO @price_after
	FETCH NEXT FROM flight_DELETED
		INTO @fno, @price_before

	WHILE (@@FETCH_STATUS = 0)
		BEGIN
			INSERT INTO flight_history
				VALUES (
					(@fno),
					(SELECT SYSTEM_USER),
					(SYSDATETIME()),
					(@price_before),
					(@price_after)
				)

			FETCH NEXT FROM flight_INSERTED
				INTO @price_after
			FETCH NEXT FROM flight_DELETED
				INTO @fno, @price_before
		END

	CLOSE flight_INSERTED
	DEALLOCATE flight_INSERTED
	CLOSE flight_DELETED
	DEALLOCATE flight_DELETED
;

CREATE TABLE flight_history (
	fno VARCHAR(4) REFERENCES flights(fno),
	updated VARCHAR(500),
	date_time DATETIME,
	price_before INT,
	price_after INT
);



UPDATE flights SET price = 3021 WHERE fno = 'A401' OR fno = 'A400'

SELECT * FROM flights ORDER BY fno
SELECT * FROM flight_history

DROP TRIGGER Ticket_Price_History

DROP TABLE flight_history
