# Write your MySQL query statement below

# Select
# DATE_FORMAT(trans_date, '%y-%m') as Month, Country,
# Count(*) as trans_count,
# Sum(IF(state = 'Approved', 1, 0)) as approved_trans_count,
# Sum(Amount) as total_trans_amount;
# Sum(IF(state = 'Approved', amount, 0)) as approved_total_amount;
# FROM transactions
# GROUP BY DATE_FORMAT(trans_date, '%y-%m'), Country;

SELECT
  DATE_FORMAT(trans_date, '%Y-%m') AS month,
  country,
  COUNT(*) AS trans_count,
  SUM(IF(state = 'approved', 1, 0)) AS approved_count,
  SUM(amount) AS trans_total_amount,
  SUM(IF(state = 'approved', amount, 0)) AS approved_total_amount
FROM Transactions
GROUP BY DATE_FORMAT(trans_date, '%Y-%m'), country;