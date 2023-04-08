SELECT e.name as Employee FROM Employee e JOIN Employee e1 WHERE e.ManagerId = e1.id AND e.salary > e1.salary
