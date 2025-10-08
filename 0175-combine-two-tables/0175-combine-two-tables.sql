/* Write your PL/SQL query statement below */
select Person.firstName,person.lastName,city,state
from Person LEFT JOIN Address
on Person.personId=Address.personId;