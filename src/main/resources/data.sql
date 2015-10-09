-- PRODUCTS
insert into product (ticker_symbol, ticker_name) values ('ENA', 'Enagas');
insert into product (ticker_symbol, ticker_name) values ('SAN', 'Banco Santander');
insert into product (ticker_symbol, ticker_name) values ('MAP', 'Mapfre');

-- USERS
insert into user (email) values ('sergiotorres81@gmail.co');

-- PORTFOLIOS
insert into portfolio (name, user_id, visibility) values ('RV_Spain', 1, 'public');

-- OPERATIONS
insert into OPERATION ( operation_date, price, quantity, commission, currency, operation_type, product_id, portfolio_id ) values({ts '2013-12-19'},  19.30, 71, 8.95, 'EURO', 'BUY',1 ,1); -- ENA
insert into OPERATION ( operation_date, price, quantity, commission, currency, operation_type, product_id, portfolio_id ) values({ts '2013-09-02'},  5.80, 256, 8.95, 'EURO', 'BUY',2 ,1); -- SAN
insert into OPERATION ( operation_date, price, quantity, commission, currency, operation_type, product_id, portfolio_id ) values({ts '2014-02-27'},  6.30, 250, 8.95, 'EURO', 'BUY',2 ,1); -- SAN
insert into OPERATION ( operation_date, price, quantity, commission, currency, operation_type, product_id, portfolio_id ) values({ts '2014-11-15'},  2.79, 533, 6.95, 'EURO', 'BUY',3 ,1); -- MAP


