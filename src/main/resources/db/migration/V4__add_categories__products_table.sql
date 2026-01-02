DROP TABLE IF EXISTS `products`;

DROP TABLE IF EXISTS `categories`;

CREATE TABLE `categories` (
  `id` TINYINT NOT NULL,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `products` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `price` decimal(10,2) NOT NULL,
  `category_id` TINYINT NOT NULL,
  PRIMARY KEY (`id`),
  KEY `products_categories_fk_idx` (`category_id`),
  CONSTRAINT `products_categories_fk` FOREIGN KEY (`category_id`) REFERENCES `categories` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci