create table TEST3_ORDER_LINE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ORDER_ID varchar(36) not null,
    PRODUCT_ID varchar(36) not null,
    QUABTITU decimal(19, 2),
    --
    primary key (ID)
);