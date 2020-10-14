---- Select Statement
-- q1 Determine the structure of the DEPARTMENTS table and its contents.
-- q2 Create a query to display the last name, job ID, hire date, and employee ID for each employee, with the employee ID appearing first. Provide an alias STARTDATE for the HIRE_DATE column.
-- q3 Create a query to display all unique job IDs from the EMPLOYEES table.
-- q4 Create a query to display employee id, last name, job id and hiredate from employee table with more describing column names.  Name the column headings Emp # , Employee , Job and Hire Date respectively.
-- q5 Create a report of all employees and their job IDs. Display the last name concatenated with the job ID (separated by a comma and space) and name the column as "Employee and Title"

----q1
/* 
DETERMINE EMPLOYEES;
*/

-----q2
/*
SELECT EMPLOYEE_ID, LAST_NAME, JOB_ID, HIRE_DATE as "HIRE_DATE"
FROM EMPLOYEES;
*/

----q3
/*
SELECT distinct JOB_ID
from EMPLOYEES;
*/

----q4
/*
SELECT EMPLOYEE_ID AS "Emp #", LAST_NAME AS "Employee", JOB_ID AS "Job", HIRE_DATE AS "Hire Date"  
from EMPLOYEES;
*/

----q5
/*
SELECT LAST_NAME||', '||JOB_ID AS "Employee and Title"  
from EMPLOYEES;
*/


--comments

--DESCRIBE DEPT;
--DESCRIBE EMP;

--SELECT * FROM EMPLOYEES;
--SELECT * FROM STUDENTLOG;
--SELECT * FROM STUDENTINFO;
--SELECT * FROM DEPT;
--SELECT * FROM EMP;
--SELECT * FROM MY_EMPLOYEE;

