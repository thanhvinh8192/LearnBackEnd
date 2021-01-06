CREATE SCHEMA IF NOT EXISTS student_cms_plusplus DEFAULT CHARACTER  SET utf8mb4;

USE student_cms_plusplus;
CREATE TABLE IF NOT EXISTS student (
    `id` INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    `name` VARCHAR(45) NOT NULL,
    `mssv` VARCHAR(10) NOT NULL,
    `password` VARCHAR(45) NOT NULL,
    `phone` VARCHAR(15),
    `address` VARCHAR(200) NOT NULL,
    `age` SMALLINT NOT NULL,
    `email` VARCHAR(100),
    `created_timestamp` TIMESTAMP,
    `last_updated_timestamp` TIMESTAMP
);
CREATE TABLE IF NOT EXISTS classroom (
    `id` INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    `name` VARCHAR(45) NOT NULL,
    `major` VARCHAR(10) NOT NULL,
    `total_student` VARCHAR(45) NOT NULL,
    `teacher_name` INT NOT NULL,
    `teacher_phone` VARCHAR(15) NOT NULL,
    `created_timestamp` TIMESTAMP,
    `last_updated_timestamp` TIMESTAMP
);
CREATE TABLE IF NOT EXISTS studnet_class (
    `student_id` INT NOT NULL,
    `class_id` INT NOT NULL
);