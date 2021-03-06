-- 최대값 구하기
SELECT MAX(DATETIME) AS '시간' FROM ANIMAL_INS;

-- 최소값 구하기
SELECT MIN(DATETIME) AS '시간' FROM ANIMAL_INS;

-- 동물 수 구하기
SELECT COUNT(ANIMAL_TYPE) AS 'count' FROM ANIMAL_INS;

-- 중복 제거하기
SELECT COUNT(DISTINCT NAME) AS 'count' FROM ANIMAL_INS WHERE NAME IS NOT NULL;