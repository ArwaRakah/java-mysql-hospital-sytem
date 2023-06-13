 create database YouHeal ;
use YouHeal ;
CREATE TABLE Pharmacy (
Medicine_ID int PRIMARY KEY NOT NULL ,
Medicine_Name varchar(30) NOT NULL ,
Medicine_Form varchar(30) NOT NULL ,
Medicine_PDate DATE ,
Medicine_ExDate DATE ,
Medicine_QTY int ,
Medicine_Type varchar(30) ,
Age_Classification varchar(10) ,
Price int  
);

CREATE TABLE Prescription (
P_Date Date NOT NULL, 
Medicine_ID int,
Doctor_ID int,
P_Time TIME,
Patient_ID int,
primary key( P_Date,Medicine_ID)
);

CREATE TABLE Attendant_INFO (
Attendant_ID int NOT NULL,
PatientID int,
Attendant_Name varchar(20) NOT NULL,
DateOfBirth DATE,
PhoneNumber int NOT NULL,
BloodType varchar(5),
primary key(Attendant_ID,PatientID),
constraint bloodcheck check (BloodType in ('O+','O-','B+','B-','A+','A-','AB+','AB-'))
);

CREATE TABLE Patient (
Patient_ID int PRIMARY KEY NOT NULL,
File_Number int NOT NULL,
Name varchar(20) NOT NULL,
BirthDate DATE NOT NULL,
Blood_Type varchar(5) NOT NULL,
Phone_Number int NOT NULL,
City varchar(15),
Neighborhood varchar(15),
Street int,
RoomNumber int,
check (Blood_Type in ('O+','O-','B+','B-','A+','A-','AB+','AB-'))
);

CREATE TABLE Doctors (
Doctor_ID int PRIMARY KEY NOT NULL,
Doctor_FName varchar(30) NOT NULL,
Doctor_LName varchar(30) NOT NULL,
Gender char(1) NOT NULL,
Specialty varchar(30) NOT NULL,
Department_ID int ,
check (Gender in ('M','F'))
);

CREATE TABLE Department (
Department_ID int PRIMARY KEY NOT NULL,
Department_Name varchar(25) NOT NULL,
Doctor_ID int  
);

CREATE TABLE Rooms (
Room_Number int PRIMARY KEY NOT NULL,
Floor int NOT NULL,
Status varchar(10) NOT NULL,
Department_ID int
);

CREATE TABLE Doctors_Nationality (
Nationality varchar(30)  NOT NULL,
Doctor_ID int NOT NULL,
primary key(Nationality,Doctor_ID)
);

CREATE TABLE Patients_Nationality (
Nationality varchar(30)  NOT NULL,
Patient_ID int NOT NULL,
primary key(Nationality,Patient_ID)
);

CREATE TABLE Patients_have_Doctors (
Doctor_ID int NOT NULL,
Patient_ID int NOT NULL,
primary key(Doctor_ID,Patient_ID)
);

CREATE TABLE Login(
Username varchar (30) NOT NULL ,
password varchar (30) NOT NULL ,
ID int ,
UserType varchar (10)
);

ALTER TABLE Prescription ADD FOREIGN KEY (Doctor_ID) REFERENCES Doctors(Doctor_ID) on delete cascade on update cascade;
ALTER TABLE Prescription ADD FOREIGN KEY (Medicine_ID) REFERENCES Pharmacy(Medicine_ID) on delete cascade on update cascade;
ALTER TABLE Prescription ADD FOREIGN KEY (Patient_ID) REFERENCES Patient(Patient_ID) on delete cascade on update cascade;

ALTER TABLE Attendant_INFO ADD FOREIGN KEY (PatientID) REFERENCES Patient(Patient_ID) on delete cascade on update cascade;

ALTER TABLE Patient ADD FOREIGN KEY (RoomNumber) REFERENCES Rooms(Room_Number) on delete cascade on update cascade;

ALTER TABLE Doctors ADD FOREIGN KEY (Department_ID) REFERENCES Department(Department_ID) on delete cascade on update cascade;

ALTER TABLE Rooms ADD FOREIGN KEY (Department_ID) REFERENCES Department(Department_ID) on delete cascade on update cascade;

ALTER TABLE Department ADD FOREIGN KEY (Doctor_ID) REFERENCES Doctors(Doctor_ID) on delete cascade on update cascade;

ALTER TABLE Patients_have_Doctors ADD FOREIGN KEY (Doctor_ID) REFERENCES Doctors(Doctor_ID) on delete cascade on update cascade;
ALTER TABLE Patients_have_Doctors ADD FOREIGN KEY (Patient_ID) REFERENCES Patient(Patient_ID) on delete cascade on update cascade;

ALTER TABLE Patients_Nationality ADD FOREIGN KEY (Patient_ID) REFERENCES Patient(Patient_ID) on delete cascade on update cascade;
ALTER TABLE Doctors_Nationality ADD FOREIGN KEY (Doctor_ID) REFERENCES Doctors(Doctor_ID) on delete cascade on update cascade;


SET FOREIGN_KEY_CHECKS=0;

insert into pharmacy (Medicine_ID,Medicine_Name,Medicine_Form,Medicine_PDate,Medicine_ExDate,
Medicine_QTY,Medicine_Type,Age_Classification,Price) values 
(100210,"Diprolene","Cream",'2019-4-12','2021-4-12',5000,"Inflammation medication","1 - 12",45),
(100211,"Ventor","Pills",'2019-03-16','2023-03-16',7000,"Inflammation medication","12 - 50",66),
(100212,"Fevadol","Liquid",'2018-05-03','2022-05-03',4000,"Analgesic","4 - 13",23),
(100213,"Brufen","Pills",'2019-07-05','2021-07-05',3500,"Analgesic","15 - 24",38),
(100214,"Feroglobin","Pills",'2020-04-01','2022-04-01',10000,"Supplement for pregnant women","16 - 27",112),
(100215,"pregnacare","Pills",'2019-09-07','2023-09-07',8000,"Supplement for pregnant women","28 - 39",164),
(100216,"Augmentin","Pills",'2020-03-02','2024-03-02',12000,"Antibiotic","16 - 30",78),
(100217,"E-Mox","Liquid",'2019-12-05','2021-12-05',9000,"Antibiotic","2 - 15",99),
(100218,"Fusiderm","Cream",'2018-07-16','2020-07-16',11500,"skin Sensitivity","10 - 25",120),
(100219,"Clara","Pills",'2018-09-22','2021-09-22',6500,"skin Sensitivity","26 - 40",89);

insert into Department(Department_ID,Department_Name,Doctor_ID) values 
(1,"Accident and emergency",1111),(2,"Diagnostic imaging",1112),
(3,"Ear nose and throat (ENT)",1113),(4,"Orthopaedics",1114),
(5,"Dermatology clinics",1115),(6,"Gastroenterology",1116),
(7,"Maternity departments",1117),(8,"Gynaecology",1118),
(9,"Dental clinics",1119),(10,"Physiotherapy",1120);

insert into Rooms(Room_Number,Department_ID,Floor,Status) values
(11,1,1,"unstable"),(13,2,1,"stable"),(20,3,2,"stable"),(25,4,2,"stable"),(33,5,3,"stable"),
(38,6,3,"stable"),(46,7,4,"unstable"),(48,8,4,"stable"),(52,9,5,"stable"),(53,10,5,"stable");
 
insert into Doctors(Doctor_ID,Doctor_FName,Doctor_LName,Gender,Specialty,Department_ID) values
(1111,"Sara"," Altalib","F","Emergency Physician",1 ),(1112,"Fatema"," Aljarri","F","orthopedist",2),
(1113,"Saleh ","Baker","M","Radiologist",3),(1114,"Sameer ","Yaser","M","dentist",4),
(1115,"Eman ","alfaer","F","Physiotherapist",5),(1116,"Hamed ","Esam","M","Dermatologist",6),
(1117,"Hessah ","Alnashwan ","F","Obstetrician and Gynecologist",7),(1118,"Waleed ","Hany","M","Otolaryngologist",8),
(1119,"Lara ","alqhatani","F","Gynecologist",9),(1120,"Arwa ",	"alrakah","F","Gastroenterologist",10);

insert into Patient(Patient_ID,File_Number,Name,BirthDate,Blood_Type,Phone_Number,City,Neighborhood,Street,RoomNumber) values
(111,101,"Ali Ahmed",'1990-04-23',"O+",527481459,"Qatif","Nassirah",17,38),
(112,102,"Amenah Ali",'1995-12-12',"AB+",546060465,"Khobar","Aljeser",19,52),
(113,103,"Mohammed Ali",'1955-03-04',"A-",566992288,"Dammam","Alanod",24,48),
(114,104,"Abdullah Hassan",'2005-07-01',"B+",581294506,"Qatif","Albahr",22,25),
(115,105,"Layla Fadhel",'1983-02-07',"O+",583488136,"Khobar","Alrakah",6,46),
(116,106,"Mousa Salem",'1999-06-14',"A+",541225396,"Khobar","AlEskan",33,53),
(117,107,"Hussain Yousif",'2008-05-17',"O+",571341164,"Dammam","Alsaif",4,33),
(118,108,"Razan mohammed",'1977-09-28',"O+",551369917,"Qatif","Tarot",11,11),
(119,109,"Jawad Nezar",'1968-11-06',"A+",569340015,"Qatif","Nassirah",14,20),
(120,110,"Hisham Ziad",'1952-07-25',"O-",562095531,"Dammam","Alfaisaleah",26,13);

insert into Prescription(Patient_ID,Medicine_ID,Doctor_ID,P_Date,P_Time) values
(111,100219,1116,'2018-12-11','13:30:00'),(112,100214,1119,'2019-06-21','15:45:00'),
(113,100211,1118,'2018-05-25','16:50:00'),(114,100213,1114,'2020-04-01','9:10:00'),
(115,100215,1117,'2018-06-06','14:15:00'),(116,100216,1120,'2019-01-30','10:30:00'),
(117,100218,1115,'2018-03-20','14:45:00'),(118,100212,1111,'2020-02-18','21:15:00'),
(119,100217,1113,'2020-01-02','15:00:00'),(120,100210,1112,'2019-03-14','08:45:00');

insert into Patients_have_Doctors(Doctor_ID,Patient_ID) values
(1116,111),(1118,113),(1119,112),(1114,114),(1120,116),
(1112,120),(1115,117),(1117,115),(1113,119),(1111,118);

insert into Attendant_INFO(Attendant_ID,Attendant_Name,DateOfBirth,PhoneNumber,BloodType,PatientID) values
(10,"Khaled Naser",'1990-07-12',562468954,"O-",112),(11,"Abdulrahman Ali",'1988-08-06',581458638,"AB-",113),
(12,"Marwa Sohail",'1970-02-01',519643885,"AB+",111),(13,"Soha Nabeel",'1995-09-08',559872783,null,120),
(14,"Abdulaziz Adel",'1980-06-05',529872568,"O-",115),(15,"Ameer Samy",'1975-06-22',596542672,"A+",116),
(16,"Shahad Amer",'1985-10-17',505364387,"B-",114),(17,"Fatimah Salah",'1992-10-06',549785378,"O-",118),
(18,"Ali Majed",'1998-04-04',539864653,"O+",119), (19,"Saad Tariq",'1982-11-28',575123147,null,117);

 insert into Doctors_Nationality (Doctor_ID,Nationality) values 
 ( 1111 ,'saudi'), (1112, 'saudi'),  ( 1113 , 'egyptian'), (1114, 'syrian'),  
 ( 1115 ,'saudi'), (1116, 'egyptian'),  ( 1117 , 'Emarati'), (1118, 'saudi'), 
 ( 1119 , 'saudi'), (1120,'saudi');
 
 insert into Patients_Nationality (Patient_ID,Nationality) values 
 ( 111 , 'saudi'), (112, 'saudi'),  ( 113 , 'saudi'), (114, 'saudi'),  
 ( 115 ,'saudi'), (116, 'saudi'),  ( 117 , 'saudi'), (118,'saudi'), 
 ( 119 ,'saudi'), (120, 'saudi');
 
 insert into Login values
-- Patient login 
('Ali1990','Alia111',111,'patient'),('Amenah1995','Amenaha112',112,'patient'),
('Mohammed1955','Mohammeda113',113,'patient'),('Abdullah2005','Abdullahh114',114,'patient'),
('layla1983','laylaf115',115,'patient'),('Mousa1999','Mousas116',116,'patient'),
('Hussain2008','Hussainy117',117,'patient'),('Razan1977','Razanm118',118,'patient'), 
('Jawad1968','Jawadn119',119,'patient'),('Hisham1952','Hishamz120',120,'patient'), 
-- Doctor login 
('Sara11','Saraa1111',1111,'Doctor'),('Fatema12','Fatemaa1112',1112,'Doctor'),
('Saleh13','Salehb1113',1113,'Doctor'),('Sameer14','Sameery1114',1114,'Doctor'),
('Eman15','Emana1115',1115,'Doctor'),('Hamed16','Hamede1116',1116,'Doctor'),
('Hessah17','Hessaha1117',1117,'Doctor'),('Waleed18','Waleedh1118',1118,'Doctor'),
('Lara19','Laraa1119',1119,'Doctor'),('Arwa20','Arwaa1120',1120,'Doctor');

SET FOREIGN_KEY_CHECKS=1; 

 -- derived attribute AGE:: 
select *,
TIMESTAMPDIFF(Year, BirthDate, CURDATE()) as age
from Patient; 
 
ALTER TABLE Patients_have_Doctors RENAME COLUMN Patient_ID TO P_ID;
ALTER TABLE Patients_have_Doctors RENAME COLUMN Doctor_ID TO D_ID;

-- view 
create view Patient_Doctor_Information  
AS
 SELECT  PD.* , P.Patient_ID , P.Name
 FROM Patients_have_Doctors AS PD , Patient AS P
 WHERE P_ID = Patient_ID;
 
-- update  
-- update YouHeal.attendant_info set BloodType = 'O+' where Attendant_ID in (19);

-- Delete 
-- from rooms
-- where Department_ID=7 and status='unstable';
-- select * from rooms;

 -- aggregate functions 
select max(Price) from pharmacy;
select min(Price) from pharmacy;
select avg(Price) from pharmacy;
select sum(Price) from pharmacy;

-- function cost of the medicine
use YouHeal;
delimiter $$ 
 create function Cost (M_ID int)  
 returns int 
 deterministic 
 begin 
 declare updatedPrice int; 
 select (Medicine_QTY*Price) into updatedPrice 
 from pharmacy where Medicine_ID = M_ID; 
 return (updatedPrice); 
end ; $$
delimiter ;
select YouHeal.Cost(100210) as cost;

-- trigger 
use YouHeal; 
delimiter $$
create trigger Check_Price
before insert on pharmacy
for each row  
begin 
if new.price >200
then
signal sqlstate'02000' set message_text ='The price is more than 200 SR'; 
end if; end ;$$ 
delimiter ; 
-- insert into pharmacy (Medicine_ID,Medicine_Name,Medicine_Form,Medicine_PDate,Medicine_ExDate,Medicine_QTY,Medicine_Type,Age_Classification,Price)
--  values (100220,"Diprolene","Cream",'2019-4-12','2021-4-12',5000,"Inflammation medication","1 - 12",300);

-- like 
select * 
from patient 
where city like '____a%';

-- join 
SELECT pharmacy.medicine_id, pharmacy.medicine_name, Prescription.P_Date
FROM pharmacy
INNER JOIN Prescription
ON pharmacy.Medicine_ID = Prescription.Medicine_ID;

-- in / nested query 
SELECT * 
FROM pharmacy 
WHERE Medicine_ID IN (SELECT Medicine_ID 
FROM pharmacy 
WHERE Medicine_QTY > 5500) ;

-- Not in, we have to add a medicine havent benn used in prescroption...
-- insert into pharmacy (Medicine_ID,Medicine_Name,Medicine_Form,Medicine_PDate,Medicine_ExDate,Medicine_QTY,Medicine_Type,Age_Classification,Price)
-- values (100220,"Diprolene","Cream",'2019-4-12','2021-4-12',5000,"Inflammation medication","1 - 12",100); 
SELECT *
FROM pharmacy
WHERE Medicine_ID NOT IN (select Medicine_ID from Prescription);

-- group by 
select  BloodType , count(Attendant_ID) 
from attendant_info group by 
BloodType;

-- having 
select  BloodType , count(Attendant_ID) as count 
from attendant_info 
group by BloodType
 having count > 1;
 
-- order by 
SELECT Patient_ID,Room_Number, Status 
FROM  rooms, patient
where status='unstable' and patient.RoomNumber=rooms.Room_Number
order by Room_Number asc;

-- union
select Doctor_ID
from Doctors 
Union 
select Doctor_ID
From department;

-- between 
select * 
from Pharmacy 
where price between 50 and 100;

-- is null 
Select *
From attendant_info
where BloodType is null;

-- all
select Attendant_ID ,Attendant_Name, BloodType
from attendant_info 
where Attendant_ID=all
(select Attendant_ID from attendant_info where  BloodType='O+');
 
 -- Except 
 select * 
 from pharmacy 
 where Medicine_ID not in (select Medicine_ID from Prescription);
 
 -- inner join 
 select pharmacy.Medicine_ID, pharmacy.Medicine_name, prescription.P_date
 from pharmacy
 inner join prescription 
 on pharmacy.Medicine_ID =prescription.Medicine_ID;
 
 -- natural join 
 select Doctor_ID, Doctor_Fname, Doctor_LName, Department_name
 from Department natural join Doctors;
 
 -- outer join
 select patient_ID , name, blood_type ,Attendant_ID , Attendant_name, BloodType 
 from patient left outer join attendant_info
 on blood_type = bloodtype and patient_ID = patientID ;
 
 -- Exist / nested query 
 select name 
 from patient 
 where Exists (select * 
 from attendant_info 
 where patientID=patient_ID);
 
-- VIOLATING BLOOD check
-- insert into Attendant_INFO(Attendant_ID,Attendant_Name,DateOfBirth,PhoneNumber,BloodType,PatientID) values
-- (21,"Khaled",'1990-07-12',562268954,"BB-",113);

-- insert into Doctors(Doctor_ID,Doctor_FName,Doctor_LName,Gender,Specialty,Department_ID) values
-- (1189,"Hoor"," Alaid","C","Emergency Physician",1 );

-- insert into Patient(Patient_ID,File_Number,Name,BirthDate,Blood_Type,Phone_Number,City,Neighborhood,Street,RoomNumber) values
-- (222,101,"Ali Ahmed",'1990-04-23',"V+",527481459,"Qatif","Nassirah",17,38);



use youheal;
Delimiter $$ 
create procedure NoOfNationality (in ID int ,out No_Nation int )
begin 
select Count(Nationality) into No_Nation
From doctors_nationality
where Doctor_ID= ID;
end ;$$ 
Delimiter ;
-- created a new doctor to make sure the procedure is working 
-- insert into Doctors(Doctor_ID,Doctor_FName,Doctor_LName,Gender,Specialty,Department_ID) values (1122,"Ro-na"," Kim","F","Emergency Physician",1);
-- insert into Doctors_Nationality (Doctor_ID,Nationality) values ( 1122 , "saudi"), ( 1122 , "kuwaiti"), ( 1122 , "American");
call NoOfNationality (1111, @count);
select @count as 'Number of Nationality';
use youheal;
select Nationality from Doctors_Nationality;

-- Transactions 
delimiter $$ 
-- commit 
begin ;

update pharmacy 
   set price = price - 15
 where Medicine_ID = 100210;

update pharmacy 
   set price = price + 15
 where medicine_ID = 100212; 
 
 commit ;
 select Medicine_ID , price from Pharmacy; 
 
 $$ delimiter ;
 
 
 -- rollback
 delimiter $$ 
 begin ; 
 
insert into pharmacy (Medicine_ID,Medicine_Name,Medicine_Form,Medicine_PDate,Medicine_ExDate,
Medicine_QTY,Medicine_Type,Age_Classification,Price) values 
(100220,"Nebivolo","Pills",'2019-4-12','2021-4-12',4000,"blood pressure medication","1 - 12",80);
Rollback;
select * from pharmacy;

$$ delimiter ; 

-- intersect 
SELECT Doctor_ID,Doctor_FName,Doctor_LName,Gender,Specialty
from Doctors
where exists(
SELECT *
from Doctors_Nationality
where  Doctors.Doctor_ID = Doctors_Nationality.Doctor_ID and Nationality='saudi');

