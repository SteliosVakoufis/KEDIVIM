CREATE TABLE customer(
	cid int   NOT NULL,
	firstname varchar(30) NULL,
	lastname varchar(30) NOT NULL,
	city varchar(30) NOT NULL, 
                PRIMARY KEY (cid)
);

CREATE TABLE branch(
	 bcode int  NOT NULL,
	 bname varchar(30) NOT NULL,
	 city varchar(30) NOT NULL,
	 assets numeric(18, 0) NOT NULL,
                 PRIMARY KEY(bcode)
);

CREATE TABLE  account (
	 accno   varchar(10)  NOT NULL,
	 bcode   int  NOT NULL,
	 balance numeric(18, 0) NOT NULL,
                 PRIMARY KEY(accno),
                 CONSTRAINT fk_account FOREIGN KEY (bcode) REFERENCES branch(bcode)
);


CREATE TABLE depositor(
	cid int NOT NULL,
	accno varchar(10) NOT NULL,
                PRIMARY KEY(cid,accno),
                CONSTRAINT fk1_depositor FOREIGN KEY (cid) REFERENCES customer(cid),
                CONSTRAINT fk2_depositor FOREIGN KEY (accno) REFERENCES account (accno)
);

CREATE TABLE loan(
	lnum varchar(10) NOT NULL,
	bcode int NOT NULL,
	amount numeric(18, 0) NOT NULL,
                PRIMARY KEY(lnum),
                CONSTRAINT fk_loan FOREIGN KEY (bcode) REFERENCES branch(bcode)
);

CREATE TABLE borrower (
	 cid  int  NOT NULL,
	 lnum   varchar (10) NOT NULL,
	PRIMARY KEY(cid,lnum),
                CONSTRAINT fk1_borrower FOREIGN KEY (cid) REFERENCES customer(cid),
                CONSTRAINT fk2_borrower FOREIGN KEY (lnum) REFERENCES loan(lnum)
);