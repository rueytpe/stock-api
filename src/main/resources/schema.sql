CREATE TABLE IF NOT EXISTS MyStockList (
   id INT NOT NULL,
   email varchar(256) NOT NULL,
   stockSymbols varchar(4000) NOT NULL,
   updated_on timestamp NOT NULL,
   PRIMARY KEY (id)
);