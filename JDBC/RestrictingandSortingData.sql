----section 2
---Restricting and Sorting Data

-----q1
---Create a report that displays the last name and salary of employees who earn more than $12,000.
/*
SELECT LAST_NAME, SALARY   
FROM EMPLOYEES
WHERE SALARY>12000;
*/

-----q2
---Create a report that displays the last name and department number for employee number 176.
/*
SELECT LAST_NAME, DEPARTMENT_ID
FROM employees WHERE employee_id=176;
*/

---q3
---To find high-salary and low-salary employees.
--Create a query to display the last name and salary for any employee whose salary is not in the range of $5,000 to $12,000
/*
SELECT LAST_NAME, SALARY
FROM employees 
WHERE SALARY BETWEEN 5000 AND 12000;
*/

--q4
---Create a report to display the last name, job ID, and hire date for employees with the last names of Matos and Taylor. 
---Order the query in ascending order by the hire date.

/*
SELECT last_name, job_id, hire_date
FROM employees 
WHERE last_name = 'Matos' OR last_name = 'Taylor'
ORDER BY hire_date;
*/

---q5
---Display the last name and department ID of all employees in departments 20 or 50 in ascending alphabetical order by name.
/*
SELECT last_name, department_id
FROM employees 
WHERE department_id IN (20,50)
ORDER BY last_name ASC;
*/


---q6
---List employees who earn between $5,000 and $12,000, and are in department 20 or 50. Label the columns as Employee and Monthly Salary, respectively.

/*
SELECT first_name AS "Employee", salary AS "Salary"
FROM employees 
WHERE department_id IN (20,50) 
AND salary BETWEEN 5000 AND 12000;
*/

---q7
--Create a report that displays the last name and hire date for all employees who were hired in 1994.
/*
SELECT last_name, hire_date
FROM employees 
WHERE hire_date LIKE '%94';
*/

---q8
---Create a report to display the last name and job title of all employees who do not have a manager.
/*
SELECT last_name,job_id
FROM employees
WHERE manager_id IS null;
*/

--q9
--Create a report to display the last name, salary, and commission of all employees who earn commissions. 
--Sort data in descending order based on salary and commissions. Use the column’s numeric position in the ORDER BY clause.

/*
SELECT last_name,salary,commission_pct
FROM employees
WHERE commission_pct IS NOT null
ORDER BY 2,3 DESC;
*/

--q10
--Create a report that displays the last name and salary of employees who earn more than an amount that the user specifies after a prompt. 
--If you enter 12000, it should display all employees earning more than 12000.
--Eg: Salary_value: 12000

/*
SELECT last_name,salary
FROM employees
WHERE salary > &salary;
*/

--q11
--Create a query that prompts the user for a manager ID and generates the employee ID, last name, salary and department for that manager’s employees and
--prompts a column name by which result should be sorted.
--Eg: manager_id :103
--sorted_by : last_name

/*
SELECT employee_ID, last_name, salary, department_id
FROM employees
WHERE manager_id = &manager_id
ORDER BY &sorted_by;
*/

---q12
---Display all employee last names in which the third letter of the name is “a”.
/*
SELECT last_name
FROM employees
WHERE last_name LIKE '__a%';
*/

---q13
--Display the last names of all employees who have both an “a” and an “e” in their last name.

/*
SELECT last_name
FROM employees
WHERE last_name LIKE '%a%e';
*/

---q14
---Display the last name, job, and salary for all employees whose jobs are either those of a sales representative or of a stock clerk, 
--and whose salaries are not equal to $2,500, $3,500, or $7,000.
/*
SELECT last_name, job_id, salary
FROM employees
WHERE job_id = 'ST_CLERK' OR job_id = 'SA_REP'
AND salary NOT IN (2500,3500,7000);
*/


















