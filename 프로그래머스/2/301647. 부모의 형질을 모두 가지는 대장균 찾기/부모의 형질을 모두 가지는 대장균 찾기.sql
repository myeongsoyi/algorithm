SELECT A.ID, GENOTYPE, PARENT_GENOTYPE
FROM ECOLI_DATA AS A
JOIN (SELECT ID, GENOTYPE AS PARENT_GENOTYPE
     FROM ECOLI_DATA) AS B
ON A.PARENT_ID = B.ID
WHERE GENOTYPE & PARENT_GENOTYPE = PARENT_GENOTYPE
ORDER BY ID