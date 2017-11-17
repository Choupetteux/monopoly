/*
drop table CARTE cascade constraints;
drop table PLATEAU cascade constraints;
drop table JEU cascade constraints;
drop table DE cascade constraints;
drop table JOUEUR cascade constraints;
drop table CASE cascade constraints;
drop table CASECARTE cascade constraints;
drop table CASEGOPRISON cascade constraints;
drop table CASEDEPART cascade constraints;
drop table CASEGARE cascade constraints;
drop table CASEPARKING cascade constraints;
drop table CASESERVICE cascade constraints;
drop table CASEACHETABLE cascade constraints;
drop table CASEPROPRIETE cascade constraints;



create table JOUEUR (
   IdPersonne               INTEGER
		CONSTRAINT PK_JOUEUR PRIMARY KEY,
   AGT_NOM          VARCHAR2(25),
   AGT_PRENOM       VARCHAR2(15)

)

--A FAIRE
create table DE{


)

create table CASE(
   IDCase               INTEGER
		CONSTRAINT PK_CASE primary key

)

create table PLATEAU(
  IdPlateau               INTEGER
		CONSTRAINT PK_PLATEAU primary key


)

create table CARTE(
   IDCarte               INTEGER
		CONSTRAINT PK_CARTE primary key

)


create table CASEPARKING(
 IDCase               INTEGER,
CONSTRAINT PK_CaseParking primary key (IDCase), 
CONSTRAINT FK_CaseParking foreign Key (IDCase) references CASE (IdCase) ON DELETE CASCADE

)


create table CASEDEPART(
 IDCase               INTEGER,
CONSTRAINT PK_CaseDepart primary key (IDCase), 
CONSTRAINT FK_CaseDepart foreign Key (IDCase) references CASE (IdCase) ON DELETE CASCADE

)


create table CASEGOPRISON(
 IDCase               INTEGER,
CONSTRAINT PK_CaseGoPrison primary key (IDCase), 
CONSTRAINT FK_CaseGoPrison foreign Key (IDCase) references CASE (IdCase) ON DELETE CASCADE

)


create table CASEACHETABLE(
 IDCase               INTEGER,
CONSTRAINT PK_CaseAchetable primary key (IDCase), 
CONSTRAINT FK_CaseAchetable foreign Key (IDCase) references CASE (IdCase) ON DELETE CASCADE

)



--HERITENT DE CASE ACHETABLE

create table CASESERVICE(
 IDCase               INTEGER,
CONSTRAINT PK_CaseService primary key (IDCase), 
CONSTRAINT FK_CaseService foreign Key (IDCase) references CASEACHETABLE (IdCase) ON DELETE CASCADE
)



create table CASEPROPRIETE(
 IDCase               INTEGER,
CONSTRAINT PK_CasePropriete primary key (IDCase), 
CONSTRAINT FK_CasePropriete foreign Key (IDCase) references CASEACHETABLE (IdCase) ON DELETE CASCADE
)

create table CASEGARE(
 IDCase               INTEGER,
CONSTRAINT PK_CaseGare primary key (IDCase), 
CONSTRAINT FK_CaseGare foreign Key (IDCase) references CASEACHETABLE (IdCase) ON DELETE CASCADE
)
*/

