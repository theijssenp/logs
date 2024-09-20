CREATE TABLE IF NOT EXISTS logs (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    clientIp VARCHAR(255) NOT NULL,
    logInfo VARCHAR(255) NOT NULL,
    logType VARCHAR(255) NOT NULL,
    logTime VARCHAR(255) NOT NULL
);

insert into logs (id , logtime, clientip, loginfo, logtype ) values ( 1 ,current_date, '127.0.0.1', 'testje', 'testlogging');
