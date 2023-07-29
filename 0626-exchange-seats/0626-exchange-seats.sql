# Write your MySQL query statement below
SELECT
(Case 
When Mod(id, 2) != 0 AND counts != id THEN id + 1
When Mod(id, 2) != 0 AND counts = id THEN id
ELSE id - 1
END) AS id, Student From Seat,
(SELECT COUNT(*) as counts From Seat) As Seat_counts Order by id;