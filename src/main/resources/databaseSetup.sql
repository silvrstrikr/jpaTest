DROP DATABASE IF EXISTS jwa2240;
CREATE DATABASE jwa2240;
USE jwa2240;
CREATE TABLE contact (
     id  INT AUTO_INCREMENT PRIMARY KEY,
     firstname VARCHAR (50),
     lastname VARCHAR(50),
     email VARCHAR (50),
     photo VARCHAR(50)
);
INSERT INTO Contact
(email,
 firstname,
 lastname,
 photo
)  VALUES    ('Abeals@gmail.com', 'Alan', 'Beals',null);
INSERT INTO Contact
(email,
 firstname,
 lastname,
 photo
)  VALUES    ('jhobz@gmail.com', 'John', 'hobz',null);
INSERT INTO Contact
(email,
 firstname,
 lastname,
 photo
)  VALUES    ('keyz@gmail.com', 'man', 'keyz',null);
INSERT INTO Contact
(email,
 firstname,
 lastname,
 photo
)  VALUES    ('GemSt@gmail.com', 'St', 'Gem',null);
INSERT INTO Contact
(email,
 firstname,
 lastname,
 photo
)  VALUES    ('SamB@gmail.com', 'same', 'B',null);
