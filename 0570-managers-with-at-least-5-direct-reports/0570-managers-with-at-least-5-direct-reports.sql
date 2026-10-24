SELECT m.name FROM Employee e
JOIN Employee m ON e.managerId = m.id
GROUP BY m.id HAVING COUNT(e.id) >= 5;