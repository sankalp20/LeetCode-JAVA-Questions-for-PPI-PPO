# Write your MySQL query statement below

Select
weather.id AS 'id'
from
weather JOIN weather as w ON DateDiff(weather.recordDate, w.recordDate) = 1
AND weather.Temperature > w.Temperature;