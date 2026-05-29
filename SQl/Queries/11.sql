SELECT registration_date, COUNT(*) AS user_count
FROM Users
WHERE registration_date >= '2024-12-01'
GROUP BY registration_date
ORDER BY registration_date;