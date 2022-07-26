--DROP all tables
DROP TABLE IF EXISTS clue;

--Create table

START TRANSACTION;

CREATE TABLE clue
(
	clue_id serial,
	game_id int,
	round int,
	clue_number int,
	category varchar(100),
	point_value int,
	question varchar(1000),
	answer varchar(100),
	
	CONSTRAINT pk_clue PRIMARY KEY (clue_id)
);

INSERT INTO clue (game_id, round, clue_number, category, point_value, question, answer)
VALUES  (0, 1, 0, 'jeopardyCategory1', 200, 'jeopardyQuestion0', 'jeopardyAnswer0'),
		(0, 1, 1, 'jeopardyCategory1', 400, 'jeopardyQuestion1', 'jeopardyAnswer1'),
		(0, 1, 2, 'jeopardyCategory1', 600, 'jeopardyQuestion2', 'jeopardyAnswer2'),
		(0, 1, 3, 'jeopardyCategory1', 800, 'jeopardyQuestion3', 'jeopardyAnswer3'),
		(0, 1, 4, 'jeopardyCategory1', 1000, 'jeopardyQuestion4', 'jeopardyAnswer4'),
		(0, 1, 5, 'jeopardyCategory2', 200, 'jeopardyQuestion5', 'jeopardyAnswer5'),
		(0, 1, 6, 'jeopardyCategory2', 400, 'jeopardyQuestion6', 'jeopardyAnswer6'),
		(0, 1, 7, 'jeopardyCategory2', 600, 'jeopardyQuestion7', 'jeopardyAnswer7'),
		(0, 1, 8, 'jeopardyCategory2', 800, 'jeopardyQuestion8', 'jeopardyAnswer8'),
		(0, 1, 9, 'jeopardyCategory2', 1000, 'jeopardyQuestion9', 'jeopardyAnswer9'),
		(0, 1, 10, 'jeopardyCategory3', 200, 'jeopardyQuestion10', 'jeopardyAnswer10'),
		(0, 1, 11, 'jeopardyCategory3', 400, 'jeopardyQuestion11', 'jeopardyAnswer11'),
		(0, 1, 12, 'jeopardyCategory3', 600, 'jeopardyQuestion12', 'jeopardyAnswer12'),
		(0, 1, 13, 'jeopardyCategory3', 800, 'jeopardyQuestion13', 'jeopardyAnswer13'),
		(0, 1, 14, 'jeopardyCategory3', 1000, 'jeopardyQuestion14', 'jeopardyAnswer14'),
		(0, 1, 15, 'jeopardyCategory4', 200, 'jeopardyQuestion15', 'jeopardyAnswer15'),
		(0, 1, 16, 'jeopardyCategory4', 400, 'jeopardyQuestion16', 'jeopardyAnswer16'),
		(0, 1, 17, 'jeopardyCategory4', 600, 'jeopardyQuestion17', 'jeopardyAnswer17'),
		(0, 1, 18, 'jeopardyCategory4', 800, 'jeopardyQuestion18', 'jeopardyAnswer18'),
		(0, 1, 19, 'jeopardyCategory4', 1000, 'jeopardyQuestion19', 'jeopardyAnswer19'),
		(0, 1, 20, 'jeopardyCategory5', 200, 'jeopardyQuestion20', 'jeopardyAnswer20'),
		(0, 1, 21, 'jeopardyCategory5', 400, 'jeopardyQuestion21', 'jeopardyAnswer21'),
		(0, 1, 22, 'jeopardyCategory5', 600, 'jeopardyQuestion22', 'jeopardyAnswer22'),
		(0, 1, 23, 'jeopardyCategory5', 800, 'jeopardyQuestion23', 'jeopardyAnswer23'),
		(0, 1, 24, 'jeopardyCategory5', 1000, 'jeopardyQuestion24', 'jeopardyAnswer24'),
		(0, 1, 25, 'jeopardyCategory6', 200, 'jeopardyQuestion25', 'jeopardyAnswer25'),
		(0, 1, 26, 'jeopardyCategory6', 400, 'jeopardyQuestion26', 'jeopardyAnswer26'),
		(0, 1, 27, 'jeopardyCategory6', 600, 'jeopardyQuestion27', 'jeopardyAnswer27'),
		(0, 1, 28, 'jeopardyCategory6', 800, 'jeopardyQuestion28', 'jeopardyAnswer28'),
		(0, 1, 29, 'jeopardyCategory6', 1000, 'jeopardyQuestion29', 'jeopardyAnswer29'),
		(0, 2, 0, 'doubleJeopardyCategory1', 200, 'doubleJeopardyQuestion0', 'doubleJeopardyAnswer0'),
		(0, 2, 1, 'doubleJeopardyCategory1', 400, 'doubleJeopardyQuestion1', 'doubleJeopardyAnswer1'),
		(0, 2, 2, 'doubleJeopardyCategory1', 600, 'doubleJeopardyQuestion2', 'doubleJeopardyAnswer2'),
		(0, 2, 3, 'doubleJeopardyCategory1', 800, 'doubleJeopardyQuestion3', 'doubleJeopardyAnswer3'),
		(0, 2, 4, 'doubleJeopardyCategory1', 1000, 'doubleJeopardyQuestion4', 'doubleJeopardyAnswer4'),
		(0, 2, 5, 'doubleJeopardyCategory2', 200, 'doubleJeopardyQuestion5', 'doubleJeopardyAnswer5'),
		(0, 2, 6, 'doubleJeopardyCategory2', 400, 'doubleJeopardyQuestion6', 'doubleJeopardyAnswer6'),
		(0, 2, 7, 'doubleJeopardyCategory2', 600, 'doubleJeopardyQuestion7', 'doubleJeopardyAnswer7'),
		(0, 2, 8, 'doubleJeopardyCategory2', 800, 'doubleJeopardyQuestion8', 'doubleJeopardyAnswer8'),
		(0, 2, 9, 'doubleJeopardyCategory2', 1000, 'doubleJeopardyQuestion9', 'doubleJeopardyAnswer9'),
		(0, 2, 10, 'doubleJeopardyCategory3', 200, 'doubleJeopardyQuestion10', 'doubleJeopardyAnswer10'),
		(0, 2, 11, 'doubleJeopardyCategory3', 400, 'doubleJeopardyQuestion11', 'doubleJeopardyAnswer11'),
		(0, 2, 12, 'doubleJeopardyCategory3', 600, 'doubleJeopardyQuestion12', 'doubleJeopardyAnswer12'),
		(0, 2, 13, 'doubleJeopardyCategory3', 800, 'doubleJeopardyQuestion13', 'doubleJeopardyAnswer13'),
		(0, 2, 14, 'doubleJeopardyCategory3', 1000, 'doubleJeopardyQuestion14', 'doubleJeopardyAnswer14'),
		(0, 2, 15, 'doubleJeopardyCategory4', 200, 'doubleJeopardyQuestion15', 'doubleJeopardyAnswer15'),
		(0, 2, 16, 'doubleJeopardyCategory4', 400, 'doubleJeopardyQuestion16', 'doubleJeopardyAnswer16'),
		(0, 2, 17, 'doubleJeopardyCategory4', 600, 'doubleJeopardyQuestion17', 'doubleJeopardyAnswer17'),
		(0, 2, 18, 'doubleJeopardyCategory4', 800, 'doubleJeopardyQuestion18', 'doubleJeopardyAnswer18'),
		(0, 2, 19, 'doubleJeopardyCategory4', 1000, 'doubleJeopardyQuestion19', 'doubleJeopardyAnswer19'),
		(0, 2, 20, 'doubleJeopardyCategory5', 200, 'doubleJeopardyQuestion20', 'doubleJeopardyAnswer20'),
		(0, 2, 21, 'doubleJeopardyCategory5', 400, 'doubleJeopardyQuestion21', 'doubleJeopardyAnswer21'),
		(0, 2, 22, 'doubleJeopardyCategory5', 600, 'doubleJeopardyQuestion22', 'doubleJeopardyAnswer22'),
		(0, 2, 23, 'doubleJeopardyCategory5', 800, 'doubleJeopardyQuestion23', 'doubleJeopardyAnswer23'),
		(0, 2, 24, 'doubleJeopardyCategory5', 1000, 'doubleJeopardyQuestion24', 'doubleJeopardyAnswer24'),
		(0, 2, 25, 'doubleJeopardyCategory6', 200, 'doubleJeopardyQuestion25', 'doubleJeopardyAnswer25'),
		(0, 2, 26, 'doubleJeopardyCategory6', 400, 'doubleJeopardyQuestion26', 'doubleJeopardyAnswer26'),
		(0, 2, 27, 'doubleJeopardyCategory6', 600, 'doubleJeopardyQuestion27', 'doubleJeopardyAnswer27'),
		(0, 2, 28, 'doubleJeopardyCategory6', 800, 'doubleJeopardyQuestion28', 'doubleJeopardyAnswer28'),
		(0, 2, 29, 'doubleJeopardyCategory6', 1000, 'doubleJeopardyQuestion29', 'doubleJeopardyAnswer29'),
		(0, 3, 1, 'finalJeopardyCategory', null, 'finalJeopardyQuestion', 'finalJeopardyAnswer');
		
		
		

COMMIT TRANSACTION;

SELECT * FROM clue
