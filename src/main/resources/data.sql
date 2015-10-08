-- PRODUCTS
insert into product (ticker_symbol, ticker_name) values ('ENA', 'Enagas');
insert into product (ticker_symbol, ticker_name) values ('SAN', 'Banco Santander');
insert into product (ticker_symbol, ticker_name) values ('MAP', 'Mapfre');

-- USERS
insert into user (email) values ('sergiotorres81@gmail.co');

-- PORTFOLIOS
insert into portfolio (name, user_id) values ('RV_Spain', 1);

-- OPERATIONS
insert into OPERATION ( operation_date, price, quantity, commission, currency, operation_type, product_id, portfolio_id ) values({ts '2013-12-19'},  19.30, 71, 6.95, 'EURO', 'BUY',1 ,1);

