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
drop table CARTECHANCE cascade constraints;
drop table CARTECOMMUNAUTE cascade constraints;


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
   IDCarte               INTEGER,
   nomCarte              CHAR(25),
  CONSTRAINT PK_CARTE primary key (IDCarte)
)
*/
create table CARTECHANCE(
 IDCarte               INTEGER,
    nomCarte            CHAR(50),
CONSTRAINT PK_CarteChance primary key (IDCarte)
)


create table CARTECOMMUNAUTE(
 IDCarte               INTEGER,
     nomCarte            CHAR(50),
CONSTRAINT PK_CaseCommunaute primary key (IDCarte)

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
 IdPersonne          INTEGER, 
CONSTRAINT PK_CaseAchetable primary key (IDCase), 
CONSTRAINT FK_CaseAchetable foreign Key (IDCase) references CASE (IdCase) ON DELETE CASCADE,
CONSTRAINT FK_CaseAchetableJoueur foreign Key (IdPersonne) references JOUEUR (IdPersonne) ON DELETE CASCADE)
)


--HERITENT DE CASE ACHETABLE

create table CASESERVICE(
 IDCase               INTEGER,
CONSTRAINT PK_CaseService primary key (IDCase), 
CONSTRAINT FK_CaseService foreign Key (IDCase) references CASEACHETABLE (IdCase) ON DELETE CASCADE,

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
--Insertion des cartes Chance--

INSERT INTO CARTECHANCE (IDCarte, nomCarte) VALUES('001','Aller en Prison');
INSERT INTO CARTECHANCE (IDCarte, nomCarte) VALUES('002','Aller Avenue Henri Martin');
INSERT INTO CARTECHANCE (IDCarte, nomCarte) VALUES('003','Aller Boulevard de la Villette');
INSERT INTO CARTECHANCE (IDCarte, nomCarte) VALUES('004','Aller Rue de la Paix');
INSERT INTO CARTECHANCE (IDCarte, nomCarte) VALUES('005','Aller Gare de Lyon');
INSERT INTO CARTECHANCE (IDCarte, nomCarte) VALUES('006','Retour Case Départ');
INSERT INTO CARTECHANCE (IDCarte, nomCarte) VALUES('007','Annuler Amende');
INSERT INTO CARTECHANCE (IDCarte, nomCarte) VALUES('008','Sortir de Prison');
INSERT INTO CARTECHANCE (IDCarte, nomCarte) VALUES('009','Reculer de 3 cases');

--Insertion des cartes Communautaire--
INSERT INTO CARTECOMMUNAUTE (IDCarte, nomCarte) VALUES('101',' Aller à Belleville');
INSERT INTO CARTECOMMUNAUTE(IDCarte, nomCarte) VALUES('102','Aller en Prison');
INSERT INTO CARTECOMMUNAUTE (IDCarte, nomCarte) VALUES('103','Aller Boulevard de la Villette');
INSERT INTO CARTECOMMUNAUTE (IDCarte, nomCarte) VALUES('104','Vous remportez 10 000€');
INSERT INTO CARTECOMMUNAUTE(IDCarte, nomCarte) VALUES('105','Visite vétérinaire -1000€');
INSERT INTO CARTECOMMUNAUTE (IDCarte, nomCarte) VALUES('106','Retour Case Départ');
INSERT INTO CARTECOMMUNAUTE (IDCarte, nomCarte) VALUES('107','Amende de pollution 4000€');
INSERT INTO CARTECOMMUNAUTE (IDCarte, nomCarte) VALUES('108','Recevoir 1000€');
  

