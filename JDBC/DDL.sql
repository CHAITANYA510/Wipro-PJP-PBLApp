---q1
/*Create the DEPT table based on the following table instance chart. Save the statement in a script called lab_10_01.sql ,
and then execute the statement in the script to create the table. Confirm that the table is created.
Specification Values:
Column named Dept_ID of Numeric 7 size and would be a primary key.
Column named Dept_Name of varchar2 size 20.
*/
/*
CREATE TABLE DEPT (
    Dept_ID NUMBER(7),
    Dept_Name VARCHAR2(20),
    
    CONSTRAINT dept_dept_id_pk
    PRIMARY KEY(Dept_ID)
);
*/

----q2
/*
Populate the DEPT table with data from the DEPARTMENTS table. 
Include only columns that you need.
Insert dept Id 10 and Name Accounts
Insert dept Id as null and Name as TT
Correct by giving 20 and TT
Insert A1 as Id and Accounts
Correct by giving 30 and Accounts
*/

--INSERT INTO DEPT
--VALUES (1,'A11');
--DELETE FROM DEPT WHERE dept_id = 1;
/*
INSERT INTO DEPT(DEPT_ID,DEPT_NAME)
    SELECT DEPARTMENT_ID,DEPARTMENT_NAME
    FROM departments;
 */
/*
INSERT INTO DEPT(DEPT_ID,DEPT_NAME)    
    VALUES (10,'Accounts');
*/
/*
INSERT INTO DEPT(DEPT_ID,DEPT_NAME)    
    VALUES (null,'TT');
*/
/*
INSERT INTO DEPT(DEPT_ID,DEPT_NAME)    
    VALUES (20,'TT');
*/
/*
INSERT INTO DEPT(DEPT_ID,DEPT_NAME)    
    VALUES (A1,'Accounts');
*/
/*
INSERT INTO DEPT(DEPT_ID,DEPT_NAME)    
    VALUES (30,'Accounts');
*/

---q3
/*
 Create the EMP table based on the following table instance chart. Save the statement in a script called lab_10_03.sql
and then execute the statement in the script to create the table. Confirm that the table is created.
Specification-  Values
Column Name: ID, LAST_NAME, FIRST_NAME, DEPT_ID
Key Type: PK,  -,  -, FK
Nulls /Unique:  -,  Not null,  -,  -,
FK Table:   -,  -,    -, Dept
FK Column:   -,   -,  -,  ID
Data type: NUMBER, VARCHAR2, VARCHAR2, NUMBER
Length: 7, 25, 25, 7

Insert 101,Sam,Sundar,10
Insert 101,Ram,Krishna,20
Insert 102,Gopi,null,40
Insert 103,null,ram,20
*/
/*
CREATE TABLE EMP (
    ID NUMBER(7),
    LAST_NAME VARCHAR2(25) NOT NULL, 
    FIRST_NAME VARCHAR2(25),
    DEPT_ID NUMBER(7),
    
    CONSTRAINT id_id_pk
    PRIMARY KEY(ID),
    
    CONSTRAINT id_id_fk
    FOREIGN KEY(DEPT_ID)
    REFERENCES DEPARTMENTS(DEPARTMENT_ID)
); 
*/
    --CONSTRAINT dept_dept_id_fk
    --FOREIGN KEY(Dept_ID)
    --REFERENCES EMP
  
/*
INSERT INTO EMP(ID, LAST_NAME, FIRST_NAME, DEPT_ID)
VALUES (101,'Sam','Sundar',10);
INSERT INTO EMP(ID, LAST_NAME, FIRST_NAME, DEPT_ID)
VALUES (101,'Ram','Krishna',20);
INSERT INTO EMP(ID, LAST_NAME, FIRST_NAME, DEPT_ID)
VALUES (102,'Gopi',null,40);
INSERT INTO EMP(ID, LAST_NAME, FIRST_NAME, DEPT_ID)
VALUES (103,null,'ram',20);

*/










