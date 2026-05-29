SELECT user_id, event_id, COUNT(*) AS cnt
FROM Registrations
GROUP BY user_id, event_id
HAVING COUNT(*) > 1;