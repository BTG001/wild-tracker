CREATE DATABASE wildlife_tracker;
\c wildlife_tracker;

CREATE TABLE IF NOT EXISTS animals (
    id SERIAL PRIMARY KEY,
    name VARCHAR,
    age VARCHAR,
    health VARCHAR,
    type VARCHAR
);

CREATE TABLE IF NOT EXISTS sightings (
    id SERIAL PRIMARY KEY,
    name VARCHAR,
    location VARCHAR,
    animalId VARCHAR,
    timestamp Timestamp
);

CREATE DATABASE wildlife_tracker_test WITH TEMPLATE wildlife_tracker;
