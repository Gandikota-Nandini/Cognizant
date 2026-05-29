-- INSERT INTO Sessions VALUES
-- (5, 1, 'Overlap 1', 'Test Speaker', '2025-06-10 10:30:00', '2025-06-10 11:30:00'),
-- (6, 1, 'Overlap 2', 'Test Speaker', '2025-06-10 11:00:00', '2025-06-10 12:00:00');
SELECT s1.event_id, s1.session_id AS session1, s2.session_id AS session2
FROM Sessions s1
JOIN Sessions s2
  ON s1.event_id = s2.event_id
 AND s1.session_id < s2.session_id
WHERE s1.start_time < s2.end_time
AND s2.start_time < s1.end_time