# Write your MySQL query statement below

Select p.product_id, Round(Sum(p.price*u.units)/Sum(u.units),2) as average_price 
FROM Prices as p INNER JOIN UnitsSold as u on p.product_id = u.product_id AND u.purchase_date between p.start_date AND 
p.end_date
GROUP BY Product_id;