/* Write your PL/SQL query statement below */

select name as name 
from salesPerson
where sales_id not in (select sales_id  from Orders where com_id IN(select com_id 
from Company 
where name='RED'));
