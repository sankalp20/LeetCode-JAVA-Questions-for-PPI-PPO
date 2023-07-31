# Write your MySQL query statement below

# select * from Users 
# where regexp_like(mail, '^[A-Za-z]+[A-Za-z0-9\_\.\-]*@leetcode.com')

SELECT * FROM
 USERS WHERE 
 MAIL  REGEXP '^[a-zA-Z][a-zA-Z0-9._-]*@leetcode\\.com';