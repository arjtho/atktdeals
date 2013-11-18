create table product(
	product_id integer primary key auto_increment,
	product_name varchar(100),
	product_description varchar(500)
);

INSERT INTO `atkt`.`product` (`product_id`, `product_name`, `product_description`) VALUES ('1', 'iphone', 'iphone5');

create table atkt.userJpa(
  user_id integer primary key AUTO_INCREMENT,
  first_name varchar(50),
  last_name varchar(50),
  email varchar(50),
  password varchar(20)
);