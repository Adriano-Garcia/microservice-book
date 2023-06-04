CREATE TABLE book (
   id SERIAL PRIMARY KEY,
   author TEXT,
   launch_date DATE NOT NULL,
   price NUMERIC(28,2) NOT NULL,
   title TEXT
);
