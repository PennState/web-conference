insert into person (id, honorific_prefix, prefix, first_name, middle_name, last_name, suffix, honorific_suffix) values (1, NULL, 'MR', 'Joe', 'Joe', 'Schmoe', NULL, NULL);
insert into person (id, honorific_prefix, prefix, first_name, middle_name, last_name, suffix, honorific_suffix) values (2, 'DR', 'MS', 'Sally', 'Joe', 'Schmoe', 'III', 'PHD');
insert into address (address_id, address_type, country, postal_code, is_primary, region, street_address1, street_address2, id) values (1, 'HOME', 'Uruguay', '121212', TRUE, 'Centre', '123 Moonpie Rd.', NULL, 1);
insert into address (address_id, address_type, country, postal_code, is_primary, region, street_address1, street_address2, id) values (2, 'HOME', 'Uruguay', '121212', TRUE, 'Centre', '123 Moonpie Rd.', NULL, 2);
insert into telephone_number (telephone_id, country_code, type, phone_number, is_primary, id) values (1, '+11', 'MOBILE', '703-555-1212', TRUE, 1);
insert into telephone_number (telephone_id, country_code, type, phone_number, is_primary, id) values (2, '+44', 'MOBILE', '01423-87654', TRUE, 2);
insert into vehicle(vehicle_id, make, model, color) values (1, "Toyota", "RAV4", "Blue", 1);
insert into vehicle(vehicle_id, make, model, color) values (2, "Dodge", "Challenger", "Red", 1);
insert into vehicle(vehicle_id, make, model, color) values (3, "Ford", "Model T", "Black", 2);

