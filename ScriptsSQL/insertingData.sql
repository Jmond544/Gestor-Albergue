INSERT INTO Attorney (dniAttorney, namesAttorney, surnamesAttorney, employmentSituation, civilStatus, socialConditions, levelStudy)
VALUES ('12345678', 'Jhon', 'Doe', 'EMP', 'S', 'A', 'PH');

INSERT INTO Attorney (dniAttorney, namesAttorney, surnamesAttorney, employmentSituation, civilStatus, socialConditions, levelStudy)
VALUES ('98765432', 'Jane', 'Smith', 'DES', 'C', 'C', 'EB');

INSERT INTO Attorney (dniAttorney, namesAttorney, surnamesAttorney, employmentSituation, civilStatus, socialConditions, levelStudy)
VALUES ('56789012', 'Michael', 'Jhonson', 'EMP', 'V', 'B', 'MS');

INSERT INTO Attorney (dniAttorney, namesAttorney, surnamesAttorney, employmentSituation, civilStatus, socialConditions, levelStudy)
VALUES ('23456789', 'Emily', 'Anderson', 'EMP', 'S', 'A', 'PH');

INSERT INTO Attorney (dniAttorney, namesAttorney, surnamesAttorney, employmentSituation, civilStatus, socialConditions, levelStudy)
VALUES ('34567890', 'David', 'Williams', 'DES', 'S', 'C', 'EB');

INSERT INTO Attorney (dniAttorney, namesAttorney, surnamesAttorney, employmentSituation, civilStatus, socialConditions, levelStudy)
VALUES ('14568265', 'Santiago', 'Garcia', 'DES', 'C', 'C', 'EB');

INSERT INTO Attorney (dniAttorney, namesAttorney, surnamesAttorney, employmentSituation, civilStatus, socialConditions, levelStudy)
VALUES ('14754751', 'Valentina', 'Martinez', 'DES', 'C', 'B', 'BS');

INSERT INTO Attorney (dniAttorney, namesAttorney, surnamesAttorney, employmentSituation, civilStatus, socialConditions, levelStudy)
VALUES ('12535624', 'Mateo', 'Lopez', 'EMP', 'C', 'A', 'MS');

INSERT INTO Attorney (dniAttorney, namesAttorney, surnamesAttorney, employmentSituation, civilStatus, socialConditions, levelStudy)
VALUES ('98521659', 'Alejandro', 'Morales', 'EMP', 'S', 'A', 'MS');

INSERT INTO Attorney (dniAttorney, namesAttorney, surnamesAttorney, employmentSituation, civilStatus, socialConditions, levelStudy)
VALUES ('25364891', 'Leonardo', 'Castro', 'DES', 'C', 'C', 'BS');


/*

*/

INSERT INTO Clinic_History (updatedClinic_History)
VALUES ('Yes');

INSERT INTO Clinic_History (updatedClinic_History)
VALUES ('Yes');

INSERT INTO Clinic_History (updatedClinic_History)
VALUES ('No');

INSERT INTO Clinic_History (updatedClinic_History)
VALUES ('Yes');

INSERT INTO Clinic_History (updatedClinic_History)
VALUES ('No');

INSERT INTO Clinic_History (updatedClinic_History)
VALUES ('Yes');

INSERT INTO Clinic_History (updatedClinic_History)
VALUES ('Yes');

INSERT INTO Clinic_History (updatedClinic_History)
VALUES ('No');

INSERT INTO Clinic_History (updatedClinic_History)
VALUES ('No');

INSERT INTO Clinic_History (updatedClinic_History)
VALUES ('Yes');

SELECT * FROM Clinic_History;
/*

*/

INSERT INTO Patient (idAttorney, idClinic_History, dniPatient, namesPatient, surnamesPatient, agePatient, diagNosis)
VALUES (1, 1, '87654321', 'Mark', 'Doe', 13, 'Cancer de pulmon');

INSERT INTO Patient (idAttorney, idClinic_History, dniPatient, namesPatient, surnamesPatient, agePatient, diagNosis)
VALUES (2, 2, '98765432', 'Jesus', 'Anderson', 12, 'Cancer de higado');

INSERT INTO Patient (idAttorney, idClinic_History, dniPatient, namesPatient, surnamesPatient, agePatient, diagNosis)
VALUES (3, 3, '12345678', 'Camila', 'Williams', 8, 'Leucemia');

INSERT INTO Patient (idAttorney, idClinic_History, dniPatient, namesPatient, surnamesPatient, agePatient, diagNosis)
VALUES (4, 4, '56789012', 'Sofia', 'Smith', 12, 'Leucemia');

INSERT INTO Patient (idAttorney, idClinic_History, dniPatient, namesPatient, surnamesPatient, agePatient, diagNosis)
VALUES (5, 5, '23456789', 'Jorge', 'Jhonson', 11, 'Cancer de higado');

INSERT INTO Patient (idAttorney, idClinic_History, dniPatient, namesPatient, surnamesPatient, agePatient, diagNosis)
VALUES (6, 6, '25836945', 'Diego', 'Garcia', 12, 'Cancer de riñon');

INSERT INTO Patient (idAttorney, idClinic_History, dniPatient, namesPatient, surnamesPatient, agePatient, diagNosis)
VALUES (7, 7, '45678952', 'Andres', 'Martinez', 15, 'Cancer estomago');

INSERT INTO Patient (idAttorney, idClinic_History, dniPatient, namesPatient, surnamesPatient, agePatient, diagNosis)
VALUES (8, 8, '15935786', 'Nicolas', 'Lopez', 13, 'Cancer de piel');

INSERT INTO Patient (idAttorney, idClinic_History, dniPatient, namesPatient, surnamesPatient, agePatient, diagNosis)
VALUES (9, 9, '14523685', 'Juan', 'Morales', 10, 'Cancer de piel');

INSERT INTO Patient (idAttorney, idClinic_History, dniPatient, namesPatient, surnamesPatient, agePatient, diagNosis)
VALUES (10, 10, '12596548', 'Mariana', 'Castro', 16, 'Cancer de pulmon');

/*

*/

INSERT INTO Medical_Exam (idPatient, typeExam, dateExam, dateResults, results)
VALUES (1, 'resonancia magnetica', TO_DATE('15/01/2023', 'DD/MM/YYYY'), TO_DATE('18/01/2023', 'DD/MM/YYYY'), 'Cancer de higado');

INSERT INTO Medical_Exam (idPatient, typeExam, dateExam, dateResults, results)
VALUES (2, 'ecografia', TO_DATE('10/08/2022', 'DD/MM/YYYY'), TO_DATE('15/08/2022', 'DD/MM/YYYY'), 'Cancer de higado');

INSERT INTO Medical_Exam (idPatient, typeExam, dateExam, dateResults, results)
VALUES (3, 'Analisis de sangre', TO_DATE('02/12/2022', 'DD/MM/YYYY'), TO_DATE('05/12/2022', 'DD/MM/YYYY'), 'Leucemia');

INSERT INTO Medical_Exam (idPatient, typeExam, dateExam, dateResults, results)
VALUES (4, 'Analisis de sangre', TO_DATE('01/01/2023', 'DD/MM/YYYY'), TO_DATE('05/01/2023', 'DD/MM/YYYY'), 'Leucemia');

INSERT INTO Medical_Exam (idPatient, typeExam, dateExam, dateResults, results)
VALUES (5, 'radiografia', TO_DATE('10/02/2023', 'DD/MM/YYYY'), TO_DATE('12/02/2023', 'DD/MM/YYYY'), 'Cancer de pulmon');

INSERT INTO Medical_Exam (idPatient, typeExam, dateExam, dateResults, results)
VALUES (6, 'tomografia', TO_DATE('25/05/2023', 'DD/MM/YYYY'), TO_DATE('27/05/2023', 'DD/MM/YYYY'), 'Cancer de riñon');

INSERT INTO Medical_Exam (idPatient, typeExam, dateExam, dateResults, results)
VALUES (7, 'biopsia', TO_DATE('22/06/2022', 'DD/MM/YYYY'), TO_DATE('25/06/2022', 'DD/MM/YYYY'), 'Cancer de piel');

INSERT INTO Medical_Exam (idPatient, typeExam, dateExam, dateResults, results)
VALUES (8, 'biopsia', TO_DATE('07/07/2022', 'DD/MM/YYYY'), TO_DATE('10/07/2022', 'DD/MM/YYYY'), 'Cancer de piel');

INSERT INTO Medical_Exam (idPatient, typeExam, dateExam, dateResults, results)
VALUES (9, 'tomografia', TO_DATE('01/01/2023', 'DD/MM/YYYY'), TO_DATE('04/01/2023', 'DD/MM/YYYY'), 'Cancer de pulmon');

INSERT INTO Medical_Exam (idPatient, typeExam, dateExam, dateResults, results)
VALUES (10, 'laparoscopia', TO_DATE('21/12/2022', 'DD/MM/YYYY'), TO_DATE('23/12/2022', 'DD/MM/YYYY'), 'Cancer estomago');
