insert into usuarios (username, password, enabled, nombre, apellido, email) values ('andres','$2a$10$NQK0aGeMfShWYtJP0m2IkOmcxnHUoGU8o6hMYnwzONDiZKEiMN7jO',1,'Andres','Guzman','ejemplo@gmail.com')
insert into usuarios (username, password, enabled, nombre, apellido, email) values ('admin','$2a$10$fc6SIqy7SKUytPUZlBpBc.uII..yDWVTeXQ7191V9TTtiPwyOaklq',1,'John','DOe','ejemplo2@gmail.com')

insert into roles (nombre) values ('ROLE_USER')
insert into roles (nombre) values ('ROLE_ADMIN')

insert into usuarios_roles (usuario_id,roles_id) values (1,1)
insert into usuarios_roles (usuario_id,roles_id) values (2,2)
insert into usuarios_roles (usuario_id,roles_id) values (2,2)