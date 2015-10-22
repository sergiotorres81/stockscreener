-- PRODUCTS
insert into product (ticker_symbol, ticker_name, market) values ('ENA', 'Enagas', 'MC');
insert into product (ticker_symbol, ticker_name, market) values ('SAN', 'Banco Santander', 'MC');
insert into product (ticker_symbol, ticker_name, market) values ('MAP', 'Mapfre', 'MC');
insert into product (ticker_symbol, ticker_name, market) values ('KMI', 'Kinder Morgan, Inc.', 'NYSE');

-- USERS
insert into user (email) values ('sergiotorres81@gmail.co');

-- PORTFOLIOS
insert into portfolio (name, user_id, visibility) values ('RV_Spain', 1, 'public');

-- OPERATIONS
insert into OPERATION ( operation_date, price, quantity, commission, currency, operation_type, product_id, portfolio_id ) values({ts '2013-12-19'},  19.30, 71, 8.95, 'EURO', 'BUY',1 ,1); -- ENA
insert into OPERATION ( operation_date, price, quantity, commission, currency, operation_type, product_id, portfolio_id ) values({ts '2013-09-02'},  5.80, 256, 8.95, 'EURO', 'BUY',2 ,1); -- SAN
insert into OPERATION ( operation_date, price, quantity, commission, currency, operation_type, product_id, portfolio_id ) values({ts '2014-02-27'},  6.30, 250, 8.95, 'EURO', 'BUY',2 ,1); -- SAN
insert into OPERATION ( operation_date, price, quantity, commission, currency, operation_type, product_id, portfolio_id ) values({ts '2014-11-15'},  2.79, 533, 6.95, 'EURO', 'BUY',3 ,1); -- MAP
insert into OPERATION ( operation_date, price, quantity, commission, currency, operation_type, product_id, portfolio_id ) values({ts '2015-09-23'},  28.70, 26, 0.54, 'DOLLAR', 'BUY',4 ,1); -- KMI

