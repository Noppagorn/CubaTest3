-- begin TEST3_CUSTOMER
create table TEST3_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    EMAIL varchar(255),
    --
    primary key (ID)
)^
-- end TEST3_CUSTOMER
-- begin TEST3_ORDER
create table TEST3_ORDER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DATE_ date not null,
    AMOUNT decimal(19, 2) not null,
    CUSTOMER_ID varchar(36),
    --
    primary key (ID)
)^
-- end TEST3_ORDER
-- begin TEST3_ORDER_LINE
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
)^
-- end TEST3_ORDER_LINE
-- begin TEST3_PRODUCT
create table TEST3_PRODUCT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    PRICE decimal(19, 2) not null,
    --
    primary key (ID)
)^
-- end TEST3_PRODUCT
