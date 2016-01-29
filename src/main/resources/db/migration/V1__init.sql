CREATE TABLE `item` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `checked` bit(1) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;