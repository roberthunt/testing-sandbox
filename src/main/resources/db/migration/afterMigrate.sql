${startComment}

-- WARNING! do not use multi-line comments /*LIKE THIS*/ as they are used to control the conditional execution of this script
TRUNCATE TABLE item;
INSERT INTO item (checked, description) VALUES (true, 'Development Data')

${endComment}