DROP TABLE IF EXISTS `profiles`;
CREATE TABLE `profiles` (
  `id` bigint NOT NULL,
  `bio` text,
  `phone_number` varchar(15) DEFAULT NULL,
  `date_of_birth` date DEFAULT NULL,
  `loyalty_points` int unsigned DEFAULT '0',
  PRIMARY KEY (`id`),
  CONSTRAINT `profiles_users_id_fk` FOREIGN KEY (`id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci