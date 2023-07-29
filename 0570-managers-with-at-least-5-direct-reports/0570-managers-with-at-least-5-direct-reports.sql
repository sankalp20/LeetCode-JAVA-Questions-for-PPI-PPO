# Write your MySQL query statement below
Select name FROM employee
Where id IN(Select ManagerId from employee group by managerId having Count(*) >= 5);