INSERT   customer   (cid,    firstname, lastname, city   ) VALUES (1, 'Μάριος', 'Αβραμίδης', 'Αθήνα');
INSERT   customer   ( cid,  firstname,  lastname,  city  ) VALUES (2, 'Μαρία', 'Αγγελίδου ', 'Θεσσαλονίκη');
INSERT   customer   ( cid,  firstname,  lastname,  city  ) VALUES (3, 'Ελένη', 'Αγγελοπούλου', 'Αθήνα');
INSERT   customer   ( cid,  firstname,  lastname,  city  ) VALUES (4, 'Αγγελος', 'Αθανασιάδης', 'Θεσσαλονίκη');
INSERT   customer   ( cid,  firstname,  lastname,  city  ) VALUES (5, 'Αννα', 'Αλεξάνδρου ', 'Θεσσαλονίκη');
INSERT   customer   ( cid,  firstname,  lastname,  city  ) VALUES (6, 'Νέλη', 'Βαμβακά', 'Αθήνα');
INSERT   customer   ( cid,  firstname,  lastname,  city  ) VALUES (7, 'Ιωάννης', 'Βλαχόπουλος', 'Θεσσαλονίκη');
INSERT   customer   ( cid,  firstname,  lastname,  city  ) VALUES (8, 'Δημήτρης', 'Βούλγαρης', 'Θεσσαλονίκη');
INSERT   customer   ( cid,  firstname,  lastname,  city  ) VALUES (9, 'Νάντια', 'Γαλάνη', 'Αθήνα');
INSERT   customer   ( cid,  firstname,  lastname,  city  ) VALUES (10, 'Γεώργιος', 'Γεωργίου', 'Αθήνα');
INSERT   customer   ( cid,  firstname,  lastname,  city  ) VALUES (11, 'Ελένη', 'Καζαντζή', 'Πάτρα');
INSERT   customer   ( cid,  firstname,  lastname,  city  ) VALUES (12, 'Βασίλης', 'Κορωναίος', 'Πάτρα');
INSERT   customer   ( cid,  firstname,  lastname,  city  ) VALUES (13, 'Παναγιώτης', 'Κολιάτσος', 'Αθήνα');
INSERT   customer   ( cid,  firstname,  lastname,  city  ) VALUES (14, 'Αντώνης', 'Λειβαδάς', 'Πάτρα');
INSERT   customer   ( cid,  firstname,  lastname,  city  ) VALUES (15, 'Μιχάλης', 'Λιάπης', 'Ιωάννινα');
INSERT   customer   ( cid,  firstname,  lastname,  city  ) VALUES (16, 'Γιώργος', 'Λιακόπουλο', 'Αθήνα');
INSERT   customer   ( cid,  firstname,  lastname,  city  ) VALUES (17, 'Ντίνος', 'Μανωλάς', 'Ιωάννινα');
INSERT   customer   ( cid,  firstname,  lastname,  city  ) VALUES (18, 'Ιωάννης', 'Μαρκόπουλος', 'Αθήνα');
INSERT   customer   ( cid,  firstname,  lastname,  city  ) VALUES (19, 'Μαρία', 'Νικαλάου', 'Ιωάννινα');
INSERT   customer   ( cid,  firstname,  lastname,  city  ) VALUES (20, 'Δημήτρης', 'Νικητάκης', 'Αθήνα');

INSERT   branch   ( bcode,  bname,  city,  assets  ) VALUES (100, 'Σταδίου', 'Αθήνα', 10000000 );
INSERT   branch   ( bcode,  bname,  city,  assets  ) VALUES (150, 'Πατησίων', 'Αθήνα', 700000 );
INSERT   branch   ( bcode,  bname,  city,  assets  ) VALUES (200, 'Πανεπιστημίου', 'Αθήνα', 300000 );
INSERT   branch   ( bcode,  bname,  city,  assets  ) VALUES (250, 'Τσιμισκή', 'Θεσσαλονίκη', 500000 );
INSERT   branch   ( bcode,  bname,  city,  assets  ) VALUES (300, 'Νίκης', 'Θεσσαλονίκη', 1000000 );
INSERT   branch   ( bcode,  bname,  city,  assets  ) VALUES (350, 'Αμαλίας', 'Πάτρα', 400000 );
INSERT   branch   ( bcode,  bname,  city,  assets  ) VALUES (400, 'Γούναρη', 'Πάτρα', 100000 );
INSERT   branch   ( bcode,  bname,  city,  assets  ) VALUES (450, 'Δωδώνης', 'Ιωάννινα', 600000 );
INSERT   branch   ( bcode,  bname,  city,  assets  ) VALUES (500, 'Κηφισίας', 'Αθήνα', 400000 );
INSERT   branch   ( bcode,  bname,  city,  assets  ) VALUES (550, 'Πειραιώς', 'Αθήνα', 100000 );


INSERT   account   ( accno,  bcode,  balance  ) VALUES ('A900', 100, 1000 );
INSERT   account   ( accno,  bcode,  balance  ) VALUES ('A901', 450, 2000 );
INSERT   account   ( accno,  bcode,  balance  ) VALUES ('A902', 150, 5000 );
INSERT   account   ( accno,  bcode,  balance  ) VALUES ('A903', 550, 10000 );
INSERT   account   ( accno,  bcode,  balance  ) VALUES ('A904', 200, 20000 );
INSERT   account   ( accno,  bcode,  balance  ) VALUES ('A905', 100, 50000 );
INSERT   account   ( accno,  bcode,  balance  ) VALUES ('A906', 500, 10000 );
INSERT   account   ( accno,  bcode,  balance  ) VALUES ('A907', 150, 5000 );
INSERT   account   ( accno,  bcode,  balance  ) VALUES ('A908', 550, 1000 );
INSERT   account   ( accno,  bcode,  balance  ) VALUES ('A909', 200, 7000 );
INSERT   account   ( accno,  bcode,  balance  ) VALUES ('A910', 250, 8000 );
INSERT   account   ( accno,  bcode,  balance  ) VALUES ('A911', 300, 7000 );
INSERT   account   ( accno,  bcode,  balance  ) VALUES ('A912', 300, 8000 );
INSERT   account   ( accno,  bcode,  balance  ) VALUES ('A913', 300, 9000 );
INSERT   account   ( accno,  bcode,  balance  ) VALUES ('A914', 350, 12000 );
INSERT   account   ( accno,  bcode,  balance  ) VALUES ('A915', 250, 40000 );
INSERT   account   ( accno,  bcode,  balance  ) VALUES ('A916', 250, 50000 );
INSERT   account   ( accno,  bcode,  balance  ) VALUES ('A917', 250, 30000 );
INSERT   account   ( accno,  bcode,  balance  ) VALUES ('A918', 350, 20000 );
INSERT   account   ( accno,  bcode,  balance  ) VALUES ('A919', 400, 18000 );
INSERT   account   ( accno,  bcode,  balance  ) VALUES ('A920', 400, 7000 );
INSERT   account   ( accno,  bcode,  balance  ) VALUES ('A921', 450, 6000 );
INSERT   account   ( accno,  bcode,  balance  ) VALUES ('A922', 450, 9000 );
INSERT   account   ( accno,  bcode,  balance  ) VALUES ('A923', 350, 12000 );
INSERT   account   ( accno,  bcode,  balance  ) VALUES ('A924', 100, 18000 );
INSERT   account   ( accno,  bcode,  balance  ) VALUES ('A925', 100, 6000 );
INSERT   account   ( accno,  bcode,  balance  ) VALUES ('A926', 150, 1000 );
INSERT   account   ( accno,  bcode,  balance  ) VALUES ('A927', 500, 2000 );
INSERT   account   ( accno,  bcode,  balance  ) VALUES ('A928', 500, 3000 );
INSERT   account   ( accno,  bcode,  balance  ) VALUES ('A929', 500, 1000 );


INSERT   depositor   ( cid,  accno  ) VALUES (1, 'A900');
INSERT   depositor   ( cid,  accno  ) VALUES (1, 'A902');
INSERT   depositor   ( cid,  accno  ) VALUES (1, 'A927');
INSERT   depositor   ( cid,  accno  ) VALUES (2, 'A900');
INSERT   depositor   ( cid,  accno  ) VALUES (2, 'A910');
INSERT   depositor   ( cid,  accno  ) VALUES (2, 'A915');
INSERT   depositor   ( cid,  accno  ) VALUES (3, 'A905');
INSERT   depositor   ( cid,  accno  ) VALUES (3, 'A915');
INSERT   depositor   ( cid,  accno  ) VALUES (4, 'A905');
INSERT   depositor   ( cid,  accno  ) VALUES (4, 'A911');
INSERT   depositor   ( cid,  accno  ) VALUES (4, 'A916');
INSERT   depositor   ( cid,  accno  ) VALUES (5, 'A912');
INSERT   depositor   ( cid,  accno  ) VALUES (5, 'A913');
INSERT   depositor   ( cid,  accno  ) VALUES (5, 'A917');
INSERT   depositor   ( cid,  accno  ) VALUES (6, 'A913');
INSERT   depositor   ( cid,  accno  ) VALUES (6, 'A924');
INSERT   depositor   ( cid,  accno  ) VALUES (9, 'A907');
INSERT   depositor   ( cid,  accno  ) VALUES (9, 'A925');
INSERT   depositor   ( cid,  accno  ) VALUES (10, 'A904');
INSERT   depositor   ( cid,  accno  ) VALUES (10, 'A909');
INSERT   depositor   ( cid,  accno  ) VALUES (10, 'A926');
INSERT   depositor   ( cid,  accno  ) VALUES (11, 'A909');
INSERT   depositor   ( cid,  accno  ) VALUES (11, 'A914');
INSERT   depositor   ( cid,  accno  ) VALUES (11, 'A918');
INSERT   depositor   ( cid,  accno  ) VALUES (11, 'A920');
INSERT   depositor   ( cid,  accno  ) VALUES (12, 'A919');
INSERT   depositor   ( cid,  accno  ) VALUES (12, 'A923');
INSERT   depositor   ( cid,  accno  ) VALUES (15, 'A921');
INSERT   depositor   ( cid,  accno  ) VALUES (15, 'A922');
INSERT   depositor   ( cid,  accno  ) VALUES (17, 'A901');
INSERT   depositor   ( cid,  accno  ) VALUES (18, 'A906');
INSERT   depositor   ( cid,  accno  ) VALUES (20, 'A903');
INSERT   depositor   ( cid,  accno  ) VALUES (20, 'A908');
INSERT   depositor   ( cid,  accno  ) VALUES (20, 'A928');
INSERT   depositor   ( cid,  accno  ) VALUES (20, 'A929');


INSERT   loan   ( lnum,  bcode,  amount  ) VALUES ('L100', 100, 50000 );
INSERT   loan   ( lnum,  bcode,  amount  ) VALUES ('L150', 100, 10000 );
INSERT   loan   ( lnum,  bcode,  amount  ) VALUES ('L200', 100, 3000 );
INSERT   loan   ( lnum,  bcode,  amount  ) VALUES ('L250', 150, 1000 );
INSERT   loan   ( lnum,  bcode,  amount  ) VALUES ('L300', 150, 15000 );
INSERT   loan   ( lnum,  bcode,  amount  ) VALUES ('L350', 250, 8000 );
INSERT   loan   ( lnum,  bcode,  amount  ) VALUES ('L400', 250, 4000 );
INSERT   loan   ( lnum,  bcode,  amount  ) VALUES ('L450', 300, 2000 );
INSERT   loan   ( lnum,  bcode,  amount  ) VALUES ('L500', 400, 7000 );
INSERT   loan   ( lnum,  bcode,  amount  ) VALUES ('L550', 400, 1000 );
INSERT   loan   ( lnum,  bcode,  amount  ) VALUES ('L600', 450, 3000 );
INSERT   loan   ( lnum,  bcode,  amount  ) VALUES ('L650', 500, 15000 );
INSERT   loan   ( lnum,  bcode,  amount  ) VALUES ('L700', 500, 10000 );
INSERT   loan   ( lnum,  bcode,  amount  ) VALUES ('L750', 500, 11000 );
INSERT   loan   ( lnum,  bcode,  amount  ) VALUES ('L800', 550, 9000 );


INSERT   borrower   ( cid,  lnum  ) VALUES (2, 'L300');
INSERT   borrower   ( cid,  lnum  ) VALUES (2, 'L650');
INSERT   borrower   ( cid,  lnum  ) VALUES (2, 'L700');
INSERT   borrower   ( cid,  lnum  ) VALUES (3, 'L150');
INSERT   borrower   ( cid,  lnum  ) VALUES (3, 'L200');
INSERT   borrower   ( cid,  lnum  ) VALUES (4, 'L350');
INSERT   borrower   ( cid,  lnum  ) VALUES (5, 'L400');
INSERT   borrower   ( cid,  lnum  ) VALUES (7, 'L450');
INSERT   borrower   ( cid,  lnum  ) VALUES (8, 'L400');
INSERT   borrower   ( cid,  lnum  ) VALUES (8, 'L450');
INSERT   borrower   ( cid,  lnum  ) VALUES (10, 'L750');
INSERT   borrower   ( cid,  lnum  ) VALUES (12, 'L550');
INSERT   borrower   ( cid,  lnum  ) VALUES (13, 'L100');
INSERT   borrower   ( cid,  lnum  ) VALUES (13, 'L800');
INSERT   borrower   ( cid,  lnum  ) VALUES (14, 'L500');
INSERT   borrower   ( cid,  lnum  ) VALUES (15, 'L600');
INSERT   borrower   ( cid,  lnum  ) VALUES (18, 'L100');
INSERT   borrower   ( cid,  lnum  ) VALUES (20, 'L800');





