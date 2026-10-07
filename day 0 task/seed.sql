use students_records;

INSERT INTO students (id, name, email)
VALUES
    (1, 'Asha', 'asha@example.com'),
    (2, 'Rahul', 'rahul@example.com'),
    (3, 'Kumar', 'kumar@example.com'),
    (4, 'Priya', 'priya@example.com'),
    (5, 'Vikram', 'vikram@example.com');

INSERT INTO courses (id, title, capacity)
VALUES 	(1, 'Java', 30),
		(2, 'Spring Boot', 25),
		(3, 'MySQL', 20);
        
INSERT INTO enrollments (id, student_id, course_id, enrolled_at)
VALUES (1, 1, 1, CURRENT_TIMESTAMP),
    (2, 1, 2, CURRENT_TIMESTAMP),
    (3, 2, 1, CURRENT_TIMESTAMP),
    (4, 3, 3, CURRENT_TIMESTAMP),
    (5, 4, 2, CURRENT_TIMESTAMP),
    (6, 5, 1, CURRENT_TIMESTAMP);
    
select * from students;
SELECT * FROM courses;
SELECT * FROM enrollments;

SELECT
    s.id,
    s.name,
    s.email,
    c.title,
    e.enrolled_at
FROM students s
JOIN enrollments e
    ON s.id = e.student_id
JOIN courses c
    ON e.course_id = c.id
WHERE s.email = 'asha@example.com'
ORDER BY c.title ASC;

SELECT
    c.title,
    count(c.title) as "no_of_students"
FROM courses c
JOIN enrollments e
    ON c.id = e.course_id
    group by c.title;
    
DELETE FROM students
WHERE id = 1;

UPDATE students
SET email = 'asha_new@example.com'
WHERE id = 1;

