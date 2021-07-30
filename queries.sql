## Part 1: Test it with SQL

SELECT * FROM techjobs.job;

## Part 2: Test it with SQL

SELECT * FROM employer WHERE location = "St. Louis";

## Part 3: Test it with SQL

DROP TABLE job;

## Part 4: Test it with SQL

SELECT name,description
FROM techjobs.skill
INNER JOIN job_skills ON techjobs.skill.id = techjobs.job_skills.skills_id
ORDER BY name ASC;