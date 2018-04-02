BEGIN TRANSACTION;
insert into User (userName, userEmail, userRole, userToken, userStatus, userLastUpdate)
values('supermom', 'supermom18@woohoo.com', 'user', 'CryptonCake18', '2', datetime('now'));
insert into User (userName, userEmail, userRole, userToken, userStatus, userLastUpdate)
values('cooldad', 'kmorris@jmail.com', 'user', 'Cooldad', '2', datetime('now'));
insert into User (userName, userEmail, userRole, userToken, userStatus, userLastUpdate)
values('heydaisy', 'daisy-maisey@inlook.com', 'user', 'SpringYAY111', '2', datetime('now'));
insert into User (userName, userEmail, userRole, userToken, userStatus, userLastUpdate)
values('mr_stache', 'egrey@morningtea.ie', 'user', 'classyMe:D', '2', datetime('now'));
insert into User (userName, userEmail, userRole, userToken, userStatus, userLastUpdate)
values('mshugsalot', 'kat.mau@kittycare.co.uk', 'user', 'kitties', '2', datetime('now'));
COMMIT;
