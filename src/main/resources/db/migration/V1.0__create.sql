CREATE TABLE Conference
(
    id          LONG AUTO_INCREMENT PRIMARY KEY,
    name_conf    varchar(100) UNIQUE NOT NULL,
    member_count LONG                NOT NULL,
    theme       varchar(100)        NOT NULL,
    date_conf    varchar(100)        NOT NULL
);

CREATE TABLE Report
(
    id           LONG AUTO_INCREMENT PRIMARY KEY,
    id_conference LONG                NOT NULL,
    name_report   varchar(100) UNIQUE NOT NULL,
    description  varchar(100)        NOT NULL,
    author       varchar(100)        NOT NULL,
    report_type   varchar(100)        NOT NULL
);