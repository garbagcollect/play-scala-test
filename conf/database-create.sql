CREATE USER app;
GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA public;

CREATE TABLE public.users (
	id SERIAL PRIMARY KEY,
	last_name varchar(255) NULL,
	first_name varchar(255) NULL
);

ALTER TABLE public.users
    ADD CONSTRAINT users_un UNIQUE (last_name,first_name);
