# Write your MySQL query statement below

select u.user_id, 
concat(upper(substr(name,1,1)),lower(substr(name,2))) 
as name 
from users u 
order by u.user_id;