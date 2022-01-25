
INSERT INTO users (id , name , lastname, age , email, password ) VALUES (1, 'ivan', 'ivanov', '34' ,'ivan@mail.ru', '$2a$12$jvAIxDK4uZLj.MQ//JhkpeoU/NjJjkRfA6qvPpLGGbs5tnHEi.b7K');
INSERT INTO users (id , name , lastname, age , email, password  ) VALUES (2, 'stas', 'ivanov', '20', 'stas@mail.ru', '$2a$12$jvAIxDK4uZLj.MQ//JhkpeoU/NjJjkRfA6qvPpLGGbs5tnHEi.b7K');

INSERT INTO roles (id , role)  VALUES (1, 'USER');
INSERT INTO roles (id , role)  VALUES (2, 'ADMIN');

INSERT INTO users_roles   VALUES (1, 1);
INSERT INTO users_roles VALUES (2, 2);
INSERT INTO users_roles VALUES (2, 1);