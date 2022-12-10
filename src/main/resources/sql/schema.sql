DROP TABLE IF EXISTS `refugee`;
CREATE TABLE `refugee` (
                            `refugee_id` BIGINT NOT NULL AUTO_INCREMENT,
                            `name` VARCHAR(100) NOT NULL,
                            `lastname` VARCHAR(800) NOT NULL,
                            `x` DECIMAL(5,2),
                            `y` DECIMAL(5,2),
                            PRIMARY KEY (`refugee_id`)
);

