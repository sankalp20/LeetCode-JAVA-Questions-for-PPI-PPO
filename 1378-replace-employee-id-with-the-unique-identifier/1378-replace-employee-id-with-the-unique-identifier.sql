# Write your MySQL query statement below

Select EmployeeUNI.unique_id, Employees.name from employees Left join employeeUNI ON Employees.id = EmployeeUNI.id;