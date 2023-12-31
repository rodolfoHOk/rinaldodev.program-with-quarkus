CREATE SEQUENCE fruit_sequence
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 9223372036854775807
	START 1
	CACHE 1
	NO CYCLE;

CREATE TABLE fruit (
	id int8 NOT NULL,
	name varchar(80) NULL,
	quantity int4 NULL,
	CONSTRAINT fruit_pkey PRIMARY KEY (id)
);
