USE teachersdb;

INSERT INTO students(LASTNAME, FIRSTNAME) VALUES ('Snow', 'John');
INSERT INTO students(LASTNAME, FIRSTNAME) VALUES ('Karas', 'George');
INSERT INTO students(LASTNAME, FIRSTNAME) VALUES ('Androutsos', 'Kostas');

SELECT * FROM students;

SELECT s.ID
	FROM students AS s
    WHERE s.LASTNAME = 'Snow'
;

SELECT COUNT(*) AS "Number of Students"
	FROM students
;