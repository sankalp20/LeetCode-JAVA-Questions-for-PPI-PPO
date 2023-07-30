# Write your MySQL query statement below
Select teacher_id, COUNT(Distinct subject_id) as cnt
from Teacher
Group By Teacher_id;