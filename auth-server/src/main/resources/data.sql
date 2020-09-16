DELETE FROM users;

INSERT INTO users (activated,activation_key,email,"password",reset_password_key,username) VALUES 
(true,NULL,'admin@admin.com','$2a$10$r0RFDmpneBVryx.ihHK9gu6FFJQi4nTxQUqzdSTvrPpaKZMxigqpy',NULL,'admin');