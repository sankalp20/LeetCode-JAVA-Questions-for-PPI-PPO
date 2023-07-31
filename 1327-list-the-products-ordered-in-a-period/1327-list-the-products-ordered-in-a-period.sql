# Write your MySQL query statement below

select product_name,
sum( o.unit ) as unit
from products p inner join orders o on p.product_id=o.product_id
where o.order_date>="2020-02-01" and o.order_date<="2020-02-29"
group by p.product_id
having sum(o.unit)>=100;