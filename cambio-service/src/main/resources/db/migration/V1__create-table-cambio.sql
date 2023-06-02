CREATE TABLE cambio (
   id SERIAL PRIMARY KEY,
   from_currency VARCHAR(3) NOT NULL,
   to_currency VARCHAR(3) NOT NULL,
   conversion_factor NUMERIC(38,2) NOT NULL);