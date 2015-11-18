-- Need to clean DB because, Spring is runningn data.sql from src/main/resources
delete from operation;
delete from portfolio;
delete from client;
delete from product;


-- Test script CANNOT be empty. 
-- PRODUCTS
insert into product (ticker_symbol, ticker_name, market) values ('ENA', 'Enagas', 'MC');
insert into product (ticker_symbol, ticker_name, market) values ('SAN', 'Banco Santander', 'MC');
insert into product (ticker_symbol, ticker_name, market) values ('MAP', 'Mapfre', 'MC');
insert into product (ticker_symbol, ticker_name, market) values ('KMI', 'Kinder Morgan, Inc.', 'NYSE');

-- USERS
insert into client (email) values ('sergiotorres81@gmail.co');

-- PORTFOLIOS
insert into portfolio (name, visibility, client_id) values ('RV_Spain','public',select min(id) from client);
-- if client_id is not the last one, then the SQL fails when it is being run
--insert into portfolio (name, client_id, visibility) values ('RV_Spain',select min(id) from client,'public');

-- OPERATIONS
--select id from portfolio where portfolio.name='RV_Spain'
--select id from product where product.ticker_symbol='ENA'
insert into operation ( operation_date, price, quantity, commission, currency, operation_type, product_id, portfolio_id ) 
	values	({ts '2013-12-19'},
		19.30,
		71, 
		8.95, 
		'EURO', 
		'BUY',
		select id from product where product.ticker_symbol='ENA' ,
		select id from portfolio where portfolio.name='RV_Spain'); -- ENA
insert into operation ( operation_date, price, quantity, commission, currency, operation_type, product_id, portfolio_id ) 
	values	({ts '2013-09-02'},
		5.80,
		256, 
		8.95, 
		'EURO', 
		'BUY',
		select id from product where product.ticker_symbol='SAN' ,
		select id from portfolio where portfolio.name='RV_Spain'); -- SAN 
insert into operation ( operation_date, price, quantity, commission, currency, operation_type, product_id, portfolio_id ) 
	values	({ts '2014-02-27'},
		6.30,
		250, 
		8.95, 
		'EURO', 
		'BUY',
		select id from product where product.ticker_symbol='SAN' ,
		select id from portfolio where portfolio.name='RV_Spain');
insert into operation ( operation_date, price, quantity, commission, currency, operation_type, product_id, portfolio_id ) 
	values	({ts '2014-11-15'},
		2.79,
		533, 
		6.95, 
		'EURO', 
		'BUY',
		select id from product where product.ticker_symbol='MAP' ,
		select id from portfolio where portfolio.name='RV_Spain');
insert into operation ( operation_date, price, quantity, commission, currency, operation_type, product_id, portfolio_id ) 
	values	({ts '2015-09-23'},
		28.70,
		26, 
		0.54, 
		'DOLLAR', 
		'BUY',
		select id from product where product.ticker_symbol='KMI' ,
		select id from portfolio where portfolio.name='RV_Spain');

