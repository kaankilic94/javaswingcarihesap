/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 100128
 Source Host           : localhost:3306
 Source Schema         : carihesap

 Target Server Type    : MySQL
 Target Server Version : 100128
 File Encoding         : 65001

 Date: 04/01/2018 14:14:05
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for kategori
-- ----------------------------
DROP TABLE IF EXISTS `kategori`;
CREATE TABLE `kategori` (
  `katId` int(11) NOT NULL AUTO_INCREMENT,
  `katAdi` varchar(45) COLLATE utf8_turkish_ci NOT NULL,
  `katAciklama` varchar(45) COLLATE utf8_turkish_ci DEFAULT NULL,
  PRIMARY KEY (`katId`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

-- ----------------------------
-- Records of kategori
-- ----------------------------
BEGIN;
INSERT INTO `kategori` VALUES (15, 'spor', 'spor malzemeleri');
INSERT INTO `kategori` VALUES (16, 'kitap', 'roman,hikaye');
INSERT INTO `kategori` VALUES (17, 'elektronik', 'elektronik eşya');
INSERT INTO `kategori` VALUES (18, 'oyuncak', 'cocuk oyuncakları');
INSERT INTO `kategori` VALUES (21, 'beyaz eşya', 'beyaz eşyalar');
INSERT INTO `kategori` VALUES (22, 'hediyelik', 'hediyelik eşyalar');
INSERT INTO `kategori` VALUES (23, 'kırtasiye', 'okul malzemeleri');
COMMIT;

-- ----------------------------
-- Table structure for kullanici
-- ----------------------------
DROP TABLE IF EXISTS `kullanici`;
CREATE TABLE `kullanici` (
  `kulId` int(11) NOT NULL AUTO_INCREMENT,
  `kulAdi` varchar(45) COLLATE utf8_turkish_ci NOT NULL,
  `kulParola` varchar(45) COLLATE utf8_turkish_ci NOT NULL,
  PRIMARY KEY (`kulId`),
  UNIQUE KEY `kulAdi_UNIQUE` (`kulAdi`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

-- ----------------------------
-- Records of kullanici
-- ----------------------------
BEGIN;
INSERT INTO `kullanici` VALUES (1, 'admin', '1');
COMMIT;

-- ----------------------------
-- Table structure for musteri
-- ----------------------------
DROP TABLE IF EXISTS `musteri`;
CREATE TABLE `musteri` (
  `musId` int(11) NOT NULL AUTO_INCREMENT,
  `musAdi` varchar(45) COLLATE utf8_turkish_ci NOT NULL,
  `musSoyadi` varchar(45) COLLATE utf8_turkish_ci NOT NULL,
  `musTelefon` varchar(45) COLLATE utf8_turkish_ci NOT NULL,
  `musAdres` varchar(45) COLLATE utf8_turkish_ci NOT NULL,
  PRIMARY KEY (`musId`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

-- ----------------------------
-- Records of musteri
-- ----------------------------
BEGIN;
INSERT INTO `musteri` VALUES (12, 'kaan', 'kılıç', '02165790087', 'pendik');
INSERT INTO `musteri` VALUES (13, 'osman', 'deniz', '02163835014', 'tuzla');
INSERT INTO `musteri` VALUES (14, 'ali', 'bilmem', '05378987751', 'beşiktaş');
INSERT INTO `musteri` VALUES (18, 'murat', 'yılmaz', '05328789988', 'istanbul');
INSERT INTO `musteri` VALUES (19, 'ayşe', 'yıldız', '02164678832', 'Kartal');
INSERT INTO `musteri` VALUES (20, 'oğuz', 'kurt', '02165678842', 'kadiköy');
INSERT INTO `musteri` VALUES (21, 'selin', 'vardar', '05327613367', 'göztepe');
INSERT INTO `musteri` VALUES (22, 'mehmet', 'bora', '05327613256', 'ankara');
INSERT INTO `musteri` VALUES (23, 'merve', 'demirci', '05334724287', 'bursa');
INSERT INTO `musteri` VALUES (24, 'mustafa', 'duman', '05425671281', 'izmir');
INSERT INTO `musteri` VALUES (25, 'sabri', 'adıgüzel', '05557624256', 'izmir');
INSERT INTO `musteri` VALUES (26, 'gizem', 'deniz', '0545123256', 'adana');
INSERT INTO `musteri` VALUES (27, 'cansel', 'akbulut', '05337634981', 'tekirdağ');
INSERT INTO `musteri` VALUES (28, 'veli', 'bozkurt', '05334638393', 'rize');
INSERT INTO `musteri` VALUES (29, 'deniz', 'günay', '05627834561', 'istanbul');
INSERT INTO `musteri` VALUES (30, 'emre', 'kartal', '05328625645', 'istanbul');
INSERT INTO `musteri` VALUES (31, 'necip', 'kaya', '02164835012', 'beşiktaş');
COMMIT;

-- ----------------------------
-- Table structure for satis
-- ----------------------------
DROP TABLE IF EXISTS `satis`;
CREATE TABLE `satis` (
  `satId` int(11) NOT NULL AUTO_INCREMENT,
  `satMusId` int(11) NOT NULL,
  `satUrunId` int(11) NOT NULL,
  `satAdet` int(11) NOT NULL,
  `satTarih` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`satId`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

-- ----------------------------
-- Records of satis
-- ----------------------------
BEGIN;
INSERT INTO `satis` VALUES (1, 12, 6, 10, '2017-11-03 21:51:47');
INSERT INTO `satis` VALUES (2, 13, 7, 2, '2017-11-06 21:52:15');
INSERT INTO `satis` VALUES (3, 14, 7, 5, '2017-11-06 21:52:22');
INSERT INTO `satis` VALUES (4, 12, 15, 10, '2017-12-09 15:57:40');
INSERT INTO `satis` VALUES (5, 12, 16, 20, '2017-12-10 15:24:18');
INSERT INTO `satis` VALUES (6, 12, 8, 1, '2017-12-10 15:24:27');
INSERT INTO `satis` VALUES (7, 12, 23, 1, '2017-12-10 15:24:35');
INSERT INTO `satis` VALUES (8, 12, 19, 5, '2017-12-10 15:24:47');
INSERT INTO `satis` VALUES (9, 12, 18, 10, '2017-12-10 15:24:57');
INSERT INTO `satis` VALUES (10, 12, 6, 2, '2017-12-10 15:25:08');
COMMIT;

-- ----------------------------
-- Table structure for urun
-- ----------------------------
DROP TABLE IF EXISTS `urun`;
CREATE TABLE `urun` (
  `urId` int(11) NOT NULL AUTO_INCREMENT,
  `urAdi` varchar(45) COLLATE utf8_turkish_ci NOT NULL,
  `urKatId` int(11) DEFAULT NULL,
  `urAlis` int(11) NOT NULL,
  `urSatis` int(11) NOT NULL,
  `urStok` varchar(45) COLLATE utf8_turkish_ci NOT NULL,
  `urAciklama` varchar(45) COLLATE utf8_turkish_ci DEFAULT NULL,
  PRIMARY KEY (`urId`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

-- ----------------------------
-- Records of urun
-- ----------------------------
BEGIN;
INSERT INTO `urun` VALUES (1, 'ceket', 14, 10, 30, '100', 'acik');
INSERT INTO `urun` VALUES (5, 'bal', 10, 20, 30, '20', 'aciklama');
INSERT INTO `urun` VALUES (6, 'futbol topu', 15, 3, 10, '87', 'futbol');
INSERT INTO `urun` VALUES (7, 'basketbol topu', 15, 10, 25, '200', 'basketbol');
INSERT INTO `urun` VALUES (8, 'bilgisayar', 17, 1500, 2500, '29', 'diz üstü');
INSERT INTO `urun` VALUES (15, 'Harry Potter', 16, 10, 32, '50', 'J.K Rowling');
INSERT INTO `urun` VALUES (16, 'Suç ve Ceza', 16, 7, 25, '55', 'Dostoyevski');
INSERT INTO `urun` VALUES (17, 'Sefiller', 16, 8, 30, '75', 'Victor Hugo');
INSERT INTO `urun` VALUES (18, 'Mum', 22, 3, 12, '90', 'kokulu');
INSERT INTO `urun` VALUES (19, 'defter', 23, 5, 14, '95', 'çizgili');
INSERT INTO `urun` VALUES (20, 'araba', 18, 3, 10, '200', 'plastik');
INSERT INTO `urun` VALUES (21, 'bebek', 18, 10, 24, '200', 'oyuncak bebek');
INSERT INTO `urun` VALUES (22, 'buzdolabı', 21, 850, 1500, '20', 'beyaz');
INSERT INTO `urun` VALUES (23, 'televizyon', 17, 1000, 1950, '14', 'lcd');
COMMIT;

-- ----------------------------
-- Procedure structure for prcGiris
-- ----------------------------
DROP PROCEDURE IF EXISTS `prcGiris`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `prcGiris`()
BEGIN

select * from kullanici;

END;
;;
delimiter ;

-- ----------------------------
-- Procedure structure for prcKategoriDuzenle
-- ----------------------------
DROP PROCEDURE IF EXISTS `prcKategoriDuzenle`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `prcKategoriDuzenle`(IN id varchar(45), IN adi varchar(45), IN aciklama varchar(45))
BEGIN
UPDATE kategori SET katAdi=adi, katAciklama=aciklama WHERE katId=id;
END;
;;
delimiter ;

-- ----------------------------
-- Procedure structure for prcKategoriEkle
-- ----------------------------
DROP PROCEDURE IF EXISTS `prcKategoriEkle`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `prcKategoriEkle`(IN katAdi varchar(45), IN katAciklama varchar(45))
BEGIN

INSERT INTO kategori VALUES(NULL, katAdi, katAciklama);

END;
;;
delimiter ;

-- ----------------------------
-- Procedure structure for prcKategoriGetir
-- ----------------------------
DROP PROCEDURE IF EXISTS `prcKategoriGetir`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `prcKategoriGetir`(IN id varchar(45))
BEGIN
SELECT * FROM kategori WHERE katId=id;
END;
;;
delimiter ;

-- ----------------------------
-- Procedure structure for prcKategoriListele
-- ----------------------------
DROP PROCEDURE IF EXISTS `prcKategoriListele`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `prcKategoriListele`()
BEGIN
SELECT * FROM kategori;
END;
;;
delimiter ;

-- ----------------------------
-- Procedure structure for prcKategoriSil
-- ----------------------------
DROP PROCEDURE IF EXISTS `prcKategoriSil`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `prcKategoriSil`(IN id varchar(45))
BEGIN
delete from kategori where katId = id;
END;
;;
delimiter ;

-- ----------------------------
-- Procedure structure for prcKategoriUrunListele
-- ----------------------------
DROP PROCEDURE IF EXISTS `prcKategoriUrunListele`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `prcKategoriUrunListele`(IN id varchar(45))
BEGIN
select * from urun where urKatId = id;
END;
;;
delimiter ;

-- ----------------------------
-- Procedure structure for prcMusteriDuzenle
-- ----------------------------
DROP PROCEDURE IF EXISTS `prcMusteriDuzenle`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `prcMusteriDuzenle`(IN id varchar(45), IN adi varchar(45), IN soyadi varchar(45), IN tel varchar(45), IN adres varchar(45))
BEGIN
update musteri set musAdi=adi, musSoyadi = soyadi, musTelefon=tel, musAdres=adres where musId=id;
END;
;;
delimiter ;

-- ----------------------------
-- Procedure structure for prcMusteriEkle
-- ----------------------------
DROP PROCEDURE IF EXISTS `prcMusteriEkle`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `prcMusteriEkle`(IN musAdi varchar(45),IN musSoyadi varchar(45),IN musTel varchar(45),IN musAdres varchar(45))
BEGIN
INSERT INTO musteri VALUES(NULL, musAdi, musSoyadi, musTel, musAdres);
END;
;;
delimiter ;

-- ----------------------------
-- Procedure structure for prcMusteriGetir
-- ----------------------------
DROP PROCEDURE IF EXISTS `prcMusteriGetir`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `prcMusteriGetir`(IN id varchar(45))
BEGIN
select * from musteri where musId=id;
END;
;;
delimiter ;

-- ----------------------------
-- Procedure structure for prcMusteriListele
-- ----------------------------
DROP PROCEDURE IF EXISTS `prcMusteriListele`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `prcMusteriListele`()
BEGIN
SELECT * FROM musteri;
END;
;;
delimiter ;

-- ----------------------------
-- Procedure structure for prcMusteriSil
-- ----------------------------
DROP PROCEDURE IF EXISTS `prcMusteriSil`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `prcMusteriSil`(IN id varchar(45))
BEGIN
delete from musteri where musId=id;
END;
;;
delimiter ;

-- ----------------------------
-- Procedure structure for prcParolaDegis
-- ----------------------------
DROP PROCEDURE IF EXISTS `prcParolaDegis`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `prcParolaDegis`(IN parola VARCHAR(45))
BEGIN

UPDATE kullanici SET kulParola=parola WHERE kulId=1;

END;
;;
delimiter ;

-- ----------------------------
-- Procedure structure for prcSatisYap
-- ----------------------------
DROP PROCEDURE IF EXISTS `prcSatisYap`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `prcSatisYap`(IN musteriId varchar(45), IN urunId varchar(45), IN adet varchar(45))
BEGIN
INSERT INTO satis VALUES(NULL, musteriId, urunId, adet, now());
END;
;;
delimiter ;

-- ----------------------------
-- Procedure structure for prcUrunDuzenle
-- ----------------------------
DROP PROCEDURE IF EXISTS `prcUrunDuzenle`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `prcUrunDuzenle`(IN id varchar(45), IN adi varchar(45), IN kategori varchar(45), IN alis varchar(45), IN satis varchar(45), IN stok varchar(45), IN aciklama varchar(45))
BEGIN
update urun set urAdi=adi, urKatId = kategori, urAlis=alis, urSatis=satis, urStok=stok, urAciklama=aciklama where urId=id;
END;
;;
delimiter ;

-- ----------------------------
-- Procedure structure for prcUrunEkle
-- ----------------------------
DROP PROCEDURE IF EXISTS `prcUrunEkle`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `prcUrunEkle`(IN adi varchar(45), IN kategori varchar(45),  IN alis varchar(45),  IN satis varchar(45),  IN stok varchar(45),  IN aciklama varchar(45))
BEGIN

INSERT INTO urun VALUES(null, adi, kategori, alis, satis, stok, aciklama);

END;
;;
delimiter ;

-- ----------------------------
-- Procedure structure for prcUrunGetir
-- ----------------------------
DROP PROCEDURE IF EXISTS `prcUrunGetir`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `prcUrunGetir`(IN id varchar(45))
BEGIN
SELECT * FROM urun,kategori WHERE urId=id and urun.urKatId=kategori.katId;
END;
;;
delimiter ;

-- ----------------------------
-- Procedure structure for prcUrunListele
-- ----------------------------
DROP PROCEDURE IF EXISTS `prcUrunListele`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `prcUrunListele`()
BEGIN
SELECT * FROM urun as u , kategori as k WHERE u.urKatId=k.katId;
END;
;;
delimiter ;

-- ----------------------------
-- Procedure structure for prcUrunSil
-- ----------------------------
DROP PROCEDURE IF EXISTS `prcUrunSil`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `prcUrunSil`(in id varchar(45))
BEGIN
delete from urun where urId=id;
END;
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
