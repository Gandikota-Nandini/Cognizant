-- SELECT u.*
-- FROM Users u
-- WHERE u.registration_date >= CURDATE() - INTERVAL 30 DAY
--   AND u.user_id NOT IN (
--       SELECT DISTINCT user_id FROM Registrations
--   );
-- SELECT u.*
-- FROM Users u
-- WHERE u.user_id NOT IN (
--     SELECT user_id FROM Registrations
-- );
SELECT COUNT(*) 
FROM Users u
WHERE u.user_id NOT IN (
    SELECT user_id FROM Registrations
);