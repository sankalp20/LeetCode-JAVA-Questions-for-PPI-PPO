# Write your MySQL query statement below

(select u.name as results  from movierating as mr 
inner join users as u
on mr.user_id = u.user_id
group by mr.user_id
order by count(movie_id) desc , u.name
LIMIT 1)
union all
(select m.title as results from movierating as mr 
inner join movies as m
on mr.movie_id = m.movie_id
where month(mr.created_at)=02 and year(mr.created_at)=2020
group by mr.movie_id
order by avg(mr.rating) desc, m.title
LIMIT 1);