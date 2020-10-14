---section 3

---q1
/*
Create table MY_EMPLOYEE 
as
Select employee_id,first_name,last_name,department_id,salary from EMPLOYEES where 1=2;
*/

---q2
--DESCRIBE MY_EMPLOYEE;

--q3
--Insert one record without listing the column names in the insert statement. Check whether data is inserted
--Eg:
--employee_id    first_name    last_name    department_id     salary
--201             Michael       Hartstein      20          13000
/*
INSERT INTO MY_EMPLOYEE
VALUES (201,'Micheal','Hartstein',20,13000);
*/

---q4
--Insert one record without listing the column names in the insert statement where salary value remain undetermined. Check whether data is inserted
/*Eg: 
employee_id first_name last_name  department_id salary
201         Michael     Hartstein   20         13000
202         Pat            Fay       20         (null)
*/
/*
INSERT INTO MY_EMPLOYEE
VALUES (202,'Pat','Fay',20,null);
*/

---q5
---Insert one record with listing the column names avoiding salary column in the insert statement where salary value remain undetermined. 
/*Check whether data is inserted
employee_id first_name last_name department_id salary
201       Michael        Hartstein   20          13000
202       Pat             Fay          20         (null)
203       Susan           Mavris        40        (null)
*/
/*
INSERT INTO MY_EMPLOYEE
VALUES (203,'Susan','Marvis',40,null);
*/

---q6
---Use the above Script to insert the below given records
--employee_id first_name last_name department_id salary
/*
INSERT INTO MY_EMPLOYEE (employee_id, first_name, last_name, department_id, salary)
    VALUES (205,'Shelley','Higgins',110,12000);
INSERT INTO MY_EMPLOYEE (employee_id, first_name, last_name, department_id, salary)
    VALUES (100,'Steven','King',90,24000);
INSERT INTO MY_EMPLOYEE (employee_id, first_name, last_name, department_id, salary)
    VALUES (101,'Neena','Kochhar',90,17000);
INSERT INTO MY_EMPLOYEE (employee_id, first_name, last_name, department_id, salary)
    VALUES (102,'Lex De','Haan',90,17000);
INSERT INTO MY_EMPLOYEE (employee_id, first_name, last_name, department_id, salary)
    VALUES (111,'Ismael','Sciarra',100,7700);
INSERT INTO MY_EMPLOYEE (employee_id, first_name, last_name, department_id, salary)
    VALUES (112,'Jose Manuel','Urman',100,7800);
INSERT INTO MY_EMPLOYEE (employee_id, first_name, last_name, department_id, salary)
    VALUES (204,'Hermann','Baer',70,1000);
*/

--q7
--Create a query to increase salary by 10% for all employees in dept 90.
/*
UPDATE MY_EMPLOYEE 
SET SALARY = salary + (salary/10)
WHERE DEPARTMENT_ID = 90;
*/

--q8
--Create a query to update Last_name of emp 202 to Higgins.
/*
UPDATE MY_EMPLOYEE 
SET Last_name = 'Higgins'
WHERE employee_id = 202;
*/

--q9
-- Delete employees whose name either first or last name has char seq of ‘man’
/*
DELETE FROM MY_EMPLOYEE 
WHERE first_name LIKE '%man%' OR Last_name LIKE '%man%';   
*/



























