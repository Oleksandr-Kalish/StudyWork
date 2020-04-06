CREATE TABLE Conference
(
    id          LONG AUTO_INCREMENT PRIMARY KEY,
    nameConf    varchar(100) UNIQUE NOT NULL,
    memberCount LONG                NOT NULL,
    theme       varchar(100)        NOT NULL,
    dateConf    varchar(100)        NOT NULL
);

CREATE TABLE Report
(
    id           LONG AUTO_INCREMENT PRIMARY KEY,
    idConference LONG                NOT NULL,
    nameReport   varchar(100) UNIQUE NOT NULL,
    description  varchar(100)        NOT NULL,
    author       varchar(100)        NOT NULL,
    reportType   varchar(100)        NOT NULL
);