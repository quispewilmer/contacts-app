USE ContactsApp;

DROP TABLE IF EXISTS tb_user;

CREATE TABLE tb_user(
	user_id				int NOT NULL,
    user_username		varchar(80) NOT NULL,
    user_password		varchar(80) NOT NULL,
    user_phone_number	char(9) NOT NULL,
    user_photo			text NOT NULL
);

ALTER TABLE tb_user
ADD CONSTRAINT pk_users_id PRIMARY KEY (user_id);

ALTER TABLE tb_user
ADD CONSTRAINT uk_users_username UNIQUE (user_username);

ALTER TABLE tb_user
ADD CONSTRAINT uk_users_phone_number UNIQUE (user_phone_number);

ALTER TABLE tb_user MODIFY COLUMN user_id INT NOT NULL UNIQUE auto_increment;

DROP TABLE IF EXISTS tb_message;

CREATE TABLE tb_message(
	message_id			int NOT NULL,
    message_content		text NOT NULL,
    message_date		datetime NOT NULL
);

ALTER TABLE tb_message
ADD CONSTRAINT pk_message_id PRIMARY KEY (message_id);

ALTER TABLE tb_message MODIFY COLUMN message_id INT NOT NULL UNIQUE auto_increment;