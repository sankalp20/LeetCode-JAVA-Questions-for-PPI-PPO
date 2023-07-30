# Write your MySQL query statement below

Select frndID as ID, count(*) as num
FROM
(Select requester_id as frndId from RequestAccepted
UNION ALL
Select accepter_id as frndId from RequestAccepted) as T
GROUP BY frndID order by num desc
limit 1;



