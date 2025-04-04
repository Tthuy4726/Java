CREATE DATABASE RealEstateDB;

USE RealEstateDB;

CREATE TABLE real_estate (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255),
    price VARCHAR(255),
    address VARCHAR(255),
    area VARCHAR(255),
    description TEXT
);
