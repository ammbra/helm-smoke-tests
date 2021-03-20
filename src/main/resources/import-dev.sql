ALTER TABLE location ALTER COLUMN id SET DEFAULT uuid_in((md5((random())::text))::cstring);
INSERT INTO location (name, address, city, country, rating) VALUES ('Rijksmuseum', 'Museumstraat 1', 'Amsterdam', 'Netherlands',4);
INSERT INTO location(name, address, city, country, rating) VALUES ('Van Gogh Museum', 'Museumstraat 6', 'Amsterdam', 'Netherlands',5);
INSERT INTO location(name, address, city, country, rating) VALUES ('Hermitage Amsterdam', 'Amstel 51', 'Amsterdam', 'Netherlands',3);
INSERT INTO location(name, address, city, country, rating) VALUES ('National Art Museum', 'Calea Victoriei 49-53', 'Bucharest', 'Romania',4);
INSERT INTO location(name, address, city, country, rating) VALUES ('National Gallery', 'Trafalgar Square', 'London', 'United Kingdom',4);
INSERT INTO location(name, address, city, country, rating) VALUES ('Metropolitan Museum of Art', '1000 5th Ave', 'New York', 'United States',5);