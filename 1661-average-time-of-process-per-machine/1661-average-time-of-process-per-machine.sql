-- Source - https://stackoverflow.com/q/77393973
-- Posted by Burak Özalp, modified by community. See post 'Timeline' for change history
-- Retrieved 2026-10-18, License - CC BY-SA 4.0

select 
a1.machine_id, 
ROUND(AVG(a2.timestamp - a1.timestamp),3) as processing_time 
from Activity a1
INNER JOIN Activity a2
ON a1.process_id = a2.process_id
WHERE a2.activity_type = 'end' 
AND a1.activity_type = 'start' 
and a1.process_id = a2.process_id 
and  a1.machine_id = a2.machine_id
GROUP BY a1.machine_id
