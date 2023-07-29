# Write your MySQL query statement below

Select p.product_name, s.year, s.price from sales as s Left join product as p ON p.product_id = s.Product_id;