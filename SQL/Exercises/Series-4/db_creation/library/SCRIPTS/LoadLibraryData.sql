USE LIBDW

BULK INSERT departments
 FROM 'C:\Users\Administrator\Documents\Programming_Stuff\KEDIVIM\SQL\Exercises\Series-4\db_creation\library\DATA\DEPARTMENTS.txt'
WITH (DATAFILETYPE = 'widechar', FIRSTROW =2, FIELDTERMINATOR= '|', ROWTERMINATOR = '\n');

BULK INSERT publishers
 FROM 'C:\Users\Administrator\Documents\Programming_Stuff\KEDIVIM\SQL\Exercises\Series-4\db_creation\library\DATA\PUBLISHERS.txt'
WITH (DATAFILETYPE = 'widechar', FIRSTROW =2, FIELDTERMINATOR= '|', ROWTERMINATOR = '\n');

BULK INSERT authors
 FROM 'C:\Users\Administrator\Documents\Programming_Stuff\KEDIVIM\SQL\Exercises\Series-4\db_creation\library\DATA\AUTHORS.txt'
WITH (DATAFILETYPE = 'widechar', FIRSTROW =2, FIELDTERMINATOR= '|', ROWTERMINATOR = '\n');


BULK INSERT sterms
 FROM 'C:\Users\Administrator\Documents\Programming_Stuff\KEDIVIM\SQL\Exercises\Series-4\db_creation\library\DATA\STERMS.txt'
WITH (DATAFILETYPE = 'widechar', FIRSTROW =2, FIELDTERMINATOR= '|', ROWTERMINATOR = '\n');

BULK INSERT bibrecs 
 FROM 'C:\Users\Administrator\Documents\Programming_Stuff\KEDIVIM\SQL\Exercises\Series-4\db_creation\library\DATA\BIBRECS.txt'
WITH (DATAFILETYPE = 'widechar', FIRSTROW =2, FIELDTERMINATOR= '|', ROWTERMINATOR = '\n');

BULK INSERT bibauthors
 FROM 'C:\Users\Administrator\Documents\Programming_Stuff\KEDIVIM\SQL\Exercises\Series-4\db_creation\library\DATA\BIBAUTHORS.txt'
WITH (DATAFILETYPE = 'widechar', FIRSTROW =2, FIELDTERMINATOR= '|', ROWTERMINATOR = '\n');

BULK INSERT bibterms
 FROM 'C:\Users\Administrator\Documents\Programming_Stuff\KEDIVIM\SQL\Exercises\Series-4\db_creation\library\DATA\BIBTERMS.txt'
WITH (DATAFILETYPE = 'widechar', FIRSTROW =2, FIELDTERMINATOR= '|', ROWTERMINATOR = '\n');

BULK INSERT borrowers
 FROM 'C:\Users\Administrator\Documents\Programming_Stuff\KEDIVIM\SQL\Exercises\Series-4\db_creation\library\DATA\BORROWERS.txt'
WITH (DATAFILETYPE = 'widechar', FIRSTROW =2, FIELDTERMINATOR= '|', ROWTERMINATOR = '\n');

BULK INSERT copies
 FROM 'C:\Users\Administrator\Documents\Programming_Stuff\KEDIVIM\SQL\Exercises\Series-4\db_creation\library\DATA\COPIES.txt'
WITH (DATAFILETYPE = 'widechar', FIRSTROW =2, FIELDTERMINATOR= '|', ROWTERMINATOR = '\n');

SET DATEFORMAT dmy; 
BULK INSERT loanstats
 FROM 'C:\Users\Administrator\Documents\Programming_Stuff\KEDIVIM\SQL\Exercises\Series-4\db_creation\library\DATA\LOANSTATS.txt'
WITH (DATAFILETYPE = 'widechar', FIRSTROW =2, FIELDTERMINATOR= '|', ROWTERMINATOR = '\n');



