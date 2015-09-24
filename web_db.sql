-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Erstellungszeit: 06. Mai 2015 um 12:21
-- Server Version: 5.6.16
-- PHP-Version: 5.5.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Datenbank: `web`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `course`
--

CREATE TABLE IF NOT EXISTS `course` (
  `course_pk` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) NOT NULL,
  `description` varchar(500) NOT NULL,
  PRIMARY KEY (`course_pk`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Daten für Tabelle `course`
--

INSERT INTO `course` (`course_pk`, `title`, `description`) VALUES
(1, 'WEBF', 'Gaengige Webframeworks aus der Java Welt'),
(2, 'English for Beginners', 'Englisch für Anfänger, keine Vorkenntnisse notwendig'),
(3, 'Technical English', 'abcd'),
(4, 'Bewerbungstraining', 'In Zeiten eines dynamischen Arbeitsmarktes sind neben den fachlichen und sozial-kommunikativen Kompetenzen der AbsolventInnen auch gute, auf die jeweilige Organisation abgestimmte Bewerbungsunterlagen und eine entsprechende Vorbereitung auf das Bewerbungsgespräch nötig.'),
(5, 'Software Architektur u Design', 'Eine Softwarearchitektur ist einer der Architekturtypen in der Informatik und beschreibt die grundlegenden Komponenten und deren Zusammenspiel innerhalb eines Softwaresystems.'),
(6, 'Spezialübung II', 'Erarbeitung eigenständiger Arbeiten im Team\r\n');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `person`
--

CREATE TABLE IF NOT EXISTS `person` (
  `person_pk` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `role` varchar(30) NOT NULL,
  PRIMARY KEY (`person_pk`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=14 ;

--
-- Daten für Tabelle `person`
--

INSERT INTO `person` (`person_pk`, `username`, `password`, `role`) VALUES
(1, 'urbauer', '1234', 'Lektor'),
(2, 'Koscher', '1234', 'Student'),
(3, 'Lenes', '1234', 'Student'),
(4, 'Buchmann', '1234', 'Teacher'),
(5, 'Krohndraft', '1234', 'Teacher'),
(6, 'Eckkrammer', '1234', 'Teacher'),
(7, 'Bauer', '1234', 'Student'),
(8, 'Mraz', '1234', 'Teacher'),
(9, 'Vanderhart', '1234', 'Teacher'),
(10, 'Berger', '1234', 'Student'),
(11, 'Müller', '1234', 'Student'),
(12, 'Maier', '1234', 'Student'),
(13, 'Banki', '1234', 'Student');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `person_course_membership`
--

CREATE TABLE IF NOT EXISTS `person_course_membership` (
  `person_fk` int(11) NOT NULL,
  `course_fk` int(11) NOT NULL,
  `note` int(11) NOT NULL,
  PRIMARY KEY (`person_fk`,`course_fk`),
  KEY `person_fk` (`person_fk`),
  KEY `course_fk` (`course_fk`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Daten für Tabelle `person_course_membership`
--

INSERT INTO `person_course_membership` (`person_fk`, `course_fk`, `note`) VALUES
(1, 1, 0),
(2, 1, 0),
(2, 3, 0),
(2, 4, 0),
(2, 5, 0),
(2, 6, 0),
(3, 1, 0),
(3, 3, 0),
(3, 4, 0),
(3, 5, 0),
(3, 6, 0),
(4, 6, 0),
(5, 6, 0),
(6, 5, 0),
(7, 1, 0),
(7, 2, 0),
(7, 4, 0),
(7, 5, 0),
(7, 6, 0),
(8, 4, 0),
(9, 2, 0),
(9, 3, 0),
(10, 1, 0),
(10, 5, 0),
(11, 3, 0),
(11, 4, 0),
(12, 1, 0),
(12, 5, 0),
(13, 2, 0),
(13, 6, 0);

--
-- Constraints der exportierten Tabellen
--

--
-- Constraints der Tabelle `person_course_membership`
--
ALTER TABLE `person_course_membership`
  ADD CONSTRAINT `person_course_membership_ibfk_1` FOREIGN KEY (`person_fk`) REFERENCES `person` (`person_pk`),
  ADD CONSTRAINT `person_course_membership_ibfk_2` FOREIGN KEY (`course_fk`) REFERENCES `course` (`course_pk`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
