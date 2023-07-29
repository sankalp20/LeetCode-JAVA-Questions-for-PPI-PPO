# Write your MySQL query statement below

select s.user_id ,CASE WHEN c.time_stamp is NULL  then 0.00
else ROUND(sum(c.action='confirmed')/COUNT(*),2)
END AS confirmation_rate 
from Signups s
left join Confirmations  c
on s.user_id =c.user_id 
group by s.user_id 