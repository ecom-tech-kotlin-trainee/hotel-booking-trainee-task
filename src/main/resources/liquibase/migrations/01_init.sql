--liquibase formatted sql

--changeset trainee:init
CREATE TABLE IF NOT EXISTS guest
(
    id                uuid                 NOT NULL
    -- TODO Дописать миграцию
);