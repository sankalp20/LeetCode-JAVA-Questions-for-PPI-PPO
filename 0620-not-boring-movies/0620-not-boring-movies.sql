# Write your MySQL query statement below
Select * from cinema 
where mod(id, 2) = 1 and description != 'boring'
order by rating Desc;