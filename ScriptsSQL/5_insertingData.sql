/*
Attorney
*/

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
Clinic_History
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

/*
Patient
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
Medical_Exam
*/

INSERT INTO Medical_Exam (idPatient, typeExam, dateExam, dateResults, results)
VALUES (1, 'resonancia magnetica', TO_DATE('15/01/2023', 'DD/MM/YYYY'), TO_DATE('18/01/2023', 'DD/MM/YYYY'), 'Cancer de higado');

INSERT INTO Medical_Exam (idPatient, typeExam, dateExam, dateResults, results)
VALUES (2, 'ecografia', TO_DATE('10/03/2023', 'DD/MM/YYYY'), TO_DATE('15/08/2023', 'DD/MM/YYYY'), 'Cancer de higado');

INSERT INTO Medical_Exam (idPatient, typeExam, dateExam, dateResults, results)
VALUES (3, 'Analisis de sangre', TO_DATE('02/02/2023', 'DD/MM/YYYY'), TO_DATE('05/12/2023', 'DD/MM/YYYY'), 'Leucemia');

INSERT INTO Medical_Exam (idPatient, typeExam, dateExam, dateResults, results)
VALUES (4, 'Analisis de sangre', TO_DATE('01/01/2023', 'DD/MM/YYYY'), TO_DATE('05/01/2023', 'DD/MM/YYYY'), 'Leucemia');

INSERT INTO Medical_Exam (idPatient, typeExam, dateExam, dateResults, results)
VALUES (5, 'radiografia', TO_DATE('10/02/2023', 'DD/MM/YYYY'), TO_DATE('12/02/2023', 'DD/MM/YYYY'), 'Cancer de pulmon');

INSERT INTO Medical_Exam (idPatient, typeExam, dateExam, dateResults, results)
VALUES (6, 'tomografia', TO_DATE('25/05/2023', 'DD/MM/YYYY'), TO_DATE('27/05/2023', 'DD/MM/YYYY'), 'Cancer de riñon');

INSERT INTO Medical_Exam (idPatient, typeExam, dateExam, dateResults, results)
VALUES (7, 'biopsia', TO_DATE('22/01/2023', 'DD/MM/YYYY'), TO_DATE('25/06/2023', 'DD/MM/YYYY'), 'Cancer de piel');

INSERT INTO Medical_Exam (idPatient, typeExam, dateExam, dateResults, results)
VALUES (8, 'biopsia', TO_DATE('07/02/2023', 'DD/MM/YYYY'), TO_DATE('10/07/2023', 'DD/MM/YYYY'), 'Cancer de piel');

INSERT INTO Medical_Exam (idPatient, typeExam, dateExam, dateResults, results)
VALUES (9, 'tomografia', TO_DATE('01/01/2023', 'DD/MM/YYYY'), TO_DATE('04/01/2023', 'DD/MM/YYYY'), 'Cancer de pulmon');

INSERT INTO Medical_Exam (idPatient, typeExam, dateExam, dateResults, results)
VALUES (10, 'laparoscopia', TO_DATE('21/2/2023', 'DD/MM/YYYY'), TO_DATE('23/12/2023', 'DD/MM/YYYY'), 'Cancer estomago');

/*
AREA - EMPLEADO
*/

ALTER TABLE Area
DISABLE CONSTRAINT fk_area_supervisor;

INSERT INTO Area (idSupervisor, nameArea, descriptionArea, budgetArea)
VALUES (1, 'Shelter_Manager', 'Encargado del manejo general del refugio', 50000.00);

INSERT INTO Area (idSupervisor, nameArea, descriptionArea, budgetArea)
VALUES (2, 'Shelter_Human_Resources', 'Encargado de los recursos humanos del refugio', 30000.00);

INSERT INTO Area (idSupervisor, nameArea, descriptionArea, budgetArea)
VALUES (3, 'Shelter_Finance', 'Encargado de las finanzas y contabilidad', 40000.00);

INSERT INTO Area (idSupervisor, nameArea, descriptionArea, budgetArea)
VALUES (4, 'Shelter_Procurement_Area', 'Encargado de las compras y adquisiciones', 20000.00);


-- Insertar empleado en el área "Shelter_Manager"
INSERT INTO Employee (idArea, surnamesEmployee, userName, password, mailContact, cellPhoneNumber, address, dateStartContract, dateEndContract, positionEmployee, salary, benefits)
VALUES (1, 'Apellido1', 'Usuario1', 'Contraseña1', 'correo1@example.com', '123456789', 'Dirección1', TO_DATE('01/01/2022', 'DD/MM/YYYY'), TO_DATE('31/12/2022', 'DD/MM/YYYY'), 'Posición1', 5000.00, 'Beneficios1');

-- Insertar empleado en el área "Shelter_Human_Resources"
INSERT INTO Employee (idArea, surnamesEmployee, userName, password, mailContact, cellPhoneNumber, address, dateStartContract, dateEndContract, positionEmployee, salary, benefits)
VALUES (2, 'Apellido2', 'Usuario2', 'Contraseña2', 'correo2@example.com', '987654321', 'Dirección2', TO_DATE('01/01/2022', 'DD/MM/YYYY'), TO_DATE('31/12/2022', 'DD/MM/YYYY'), 'Posición2', 6000.00, 'Beneficios2');

-- Insertar empleado en el área "Shelter_Finance"
INSERT INTO Employee (idArea, surnamesEmployee, userName, password, mailContact, cellPhoneNumber, address, dateStartContract, dateEndContract, positionEmployee, salary, benefits)
VALUES (3, 'Apellido3', 'Usuario3', 'Contraseña3', 'correo3@example.com', '123123123', 'Dirección3', TO_DATE('01/01/2022', 'DD/MM/YYYY'), TO_DATE('31/12/2022', 'DD/MM/YYYY'), 'Posición3', 7000.00, 'Beneficios3');

-- Insertar empleado en el área "Shelter_Procurement_Area"
INSERT INTO Employee (idArea, surnamesEmployee, userName, password, mailContact, cellPhoneNumber, address, dateStartContract, dateEndContract, positionEmployee, salary, benefits)
VALUES (4, 'Apellido4', 'Usuario4', 'Contraseña4', 'correo4@example.com', '456789123', 'Dirección4', TO_DATE('01/01/2022', 'DD/MM/YYYY'), TO_DATE('31/12/2022', 'DD/MM/YYYY'), 'Posición4', 8000.00, 'Beneficios4');

ALTER TABLE Area
ENABLE CONSTRAINT fk_area_supervisor;

SELECT * FROM Area;

DESC AREA;
DESC EMPLOYEE;