# Write your MySQL query statement below

select query_name ,
round(sum(rating /position )/count(*),2)  as quality ,
round(sum(CASE WHEN rating < 3 then 1 else 0 end)/count(*)*100,2) as poor_query_percentage 
from Queries 
group by query_name;