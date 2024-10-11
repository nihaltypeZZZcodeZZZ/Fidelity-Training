create or replace function get_worker_count_by_nth_highest_sallary(n int)
returns int as $$
declare 
nth_salary int;
worker_count int;
begin
select distinct salary into nth_salary
from workers
order by salary desc
limit 1 offset n-1;

select count(*) into worker_count
from workers
where salary = nth_salary;

return worker_count;
end;
$$ language plpgsql;
select get_worker_count_by_nth_highest_sallary(4);