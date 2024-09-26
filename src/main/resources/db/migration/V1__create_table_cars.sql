CREATE TABLE cars (
    id UUID PRIMARY KEY,
    marca VARCHAR(255) NOT NULL,
    modelo VARCHAR(255) NOT NULL,
    preco numeric(10,2) NOT NULL,
    cor VARCHAR(255)
);