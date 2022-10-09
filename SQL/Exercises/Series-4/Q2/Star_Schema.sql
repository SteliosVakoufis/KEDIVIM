USE LIBDW

--- Calender table creation and insertion
CREATE TABLE Calender (
	cal_key DATE NOT NULL,
	lday INT NOT NULL,
	lweek INT NOT NULL,
	lmonth INT NOT NULL,
	lquarter INT NOT NULL,
	lyear INT NOT NULL,
	PRIMARY KEY (cal_key)
);

INSERT INTO Calender
	SELECT 
		DISTINCT ft.loandate,
		DATEPART(DAYOFYEAR, ft.loandate) AS "lday",
		DATEPART(WEEK, ft.loandate) AS "lweek",
		DATEPART(MONTH, ft.loandate) AS "lmonth",
		DATEPART(QUARTER, ft.loandate) AS "lquarter",
		DATEPART(YEAR, ft.loandate) AS "lyear"
	FROM FACTORY_TABLE AS ft
	WHERE ft.loandate IS NOT NULL
;

--- Customers table creation and insertion
CREATE TABLE Customers(
	p_id INT PRIMARY KEY NOT NULL,
	sex VARCHAR(1) NOT NULL,
	pname VARCHAR(65) NOT NULL
);

INSERT INTO Customers
	SELECT DISTINCT ft.bid, ft.sex, ft.bname
	FROM FACTORY_TABLE AS ft
;

--- Departments table creation and insertion
CREATE TABLE Departments(
	d_id INT PRIMARY KEY NOT NULL,
	depname VARCHAR(65) NOT NULL
);

INSERT INTO Departments
	SELECT DISTINCT ft.depcode, ft.depname
	FROM FACTORY_TABLE AS ft
;

--- BookMaterials table creation and insertion
CREATE TABLE BookMaterials(
	bn_id INT PRIMARY KEY NOT NULL IDENTITY(1, 1),
	material VARCHAR(25) NOT NULL
);

INSERT INTO BookMaterials
	SELECT DISTINCT ft.material
	FROM FACTORY_TABLE AS ft
	WHERE ft.bibno IS NOT NULL
;

--- CopyLocations table creation and insertion
CREATE TABLE CopyLocations(
	cl_id INT PRIMARY KEY NOT NULL IDENTITY(1, 1),
	copyloc VARCHAR(3) NOT NULL
);

INSERT INTO CopyLocations
	SELECT DISTINCT ft.copyloc
	FROM FACTORY_TABLE AS ft
	WHERE ft.copyloc IS NOT NULL
;

--- LoanedBooks table creation and insertion

CREATE TABLE LoanedBooks(
	lb_id INT PRIMARY KEY NOT NULL,
	loandate DATE NOT NULL,
	bid INT NOT NULL,
	material_id INT NOT NULL,
	copy_loc INT NOT NULL,
	depcode INT NOT NULL,
	FOREIGN KEY (loandate) REFERENCES Calender(cal_key),
	FOREIGN KEY (bid) REFERENCES Customers(p_id),
	FOREIGN KEY (material_id) REFERENCES BookMaterials(bn_id),
	FOREIGN KEY (copy_loc) REFERENCES CopyLocations(cl_id),
	FOREIGN KEY (depcode) REFERENCES Departments(d_id)
);

INSERT INTO LoanedBooks
	SELECT 
		ft.ID, 
		(SELECT cal_key FROM Calender WHERE cal_key = ft.loandate),
		(SELECT p_id FROM Customers WHERE p_id = ft.bid),
		(SELECT bn_id FROM BookMaterials WHERE material = ft.material),
		(SELECT cl_id FROM CopyLocations WHERE copyloc = ft.copyloc),
		(SELECT d_id FROM Departments WHERE depname = ft.depname)
	FROM FACTORY_TABLE AS ft
	WHERE ft.copyno IS NOT NULL
;
