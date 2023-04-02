SELECT MAX(sa.salary) SecondHighestSalary 
FROM (
SELECT salary 
FROM Employee 
WHERE salary NOT IN
(SELECT MAX(salary) 
FROM Employee)
) sa
