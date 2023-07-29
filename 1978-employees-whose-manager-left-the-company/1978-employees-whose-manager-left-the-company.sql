# Write your MySQL query statement below

Select e1.employee_id
From employees as e1
WHERE salary < 30000 AND
e1.manager_id NOT IN (Select employee_id from employees) ORDER BY e1.employee_id;