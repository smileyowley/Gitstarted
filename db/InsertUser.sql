BEGIN TRANSACTION;
insert into User ( userName, userEmail, userRole, userToken, userStatus, userLastUpdate ) 
values  ('Ultron', 'ultron@evilones.com', 'admin', 'evil', '1', datetime('now'));
COMMIT;
