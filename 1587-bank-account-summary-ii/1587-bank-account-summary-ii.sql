# Write your MySQL query statement below

Select u.name, sum(t.amount) as balance
From users as u
Join
transactions as t
ON
u.account = t.account
GROUP BY u.account
HAVING
balance >10000;