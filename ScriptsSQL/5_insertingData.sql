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

INSERT INTO Volunteer (idArea, dniVolunter, namesVolunteer, surnamesVolunteer, mailContactVolunteer, cellPhoneNumberVolunteer, addressVolunteer, dateStart, dateEnd, skills, experience, hoursAvailability)
VALUES (1, '5682489', 'Alejandro', 'Fernandez', 'Alejandro_Fernadez@gmail.com', '986452189', 'Carrera del sol 232', TO_DATE('01/06/2020', 'DD/MM/YYYY'), TO_DATE('30/11/2022', 'DD/MM/YYYY'), 'proactivo, colaborativo', '12 meses', '2000');

INSERT INTO Volunteer (idArea, dniVolunter, namesVolunteer, surnamesVolunteer, mailContactVolunteer, cellPhoneNumberVolunteer, addressVolunteer, dateStart, dateEnd, skills, experience, hoursAvailability)
VALUES (2, '26458736', 'Sofia', 'Guzman', 'Sofia_Guzmadez@gmail.com', '965382156', 'Calle los tulipanes 25', TO_DATE('15/01/2022', 'DD/MM/YYYY'), TO_DATE('30/10/2022', 'DD/MM/YYYY'), 'trabajo en equipo', 'No tiene', '900');

INSERT INTO Volunteer (idArea, dniVolunter, namesVolunteer, surnamesVolunteer, mailContactVolunteer, cellPhoneNumberVolunteer, addressVolunteer, dateStart, dateEnd, skills, experience, hoursAvailability)
VALUES (3, '65823957', 'Daniel', 'Garcia', 'Daniel_Garcidez@gmail.com', '958626359', 'Calle mauricio hosh 50', TO_DATE('01/02/2023', 'DD/MM/YYYY'), TO_DATE('30/04/2023', 'DD/MM/YYYY'), 'pensamiento analitico', '6 meses', '100');

INSERT INTO Volunteer (idArea, dniVolunter, namesVolunteer, surnamesVolunteer, mailContactVolunteer, cellPhoneNumberVolunteer, addressVolunteer, dateStart, dateEnd, skills, experience, hoursAvailability)
VALUES (4, '25648125', 'Rafael', 'Castro', 'Rafael_Castrdez@gmail.com', '957482659', 'Calle las begonias 111', TO_DATE('15/12/2022', 'DD/MM/YYYY'), TO_DATE('30/06/2023', 'DD/MM/YYYY'), 'Liderazgo', 'no tiene', '450');

INSERT INTO Volunteer (idArea, dniVolunter, namesVolunteer, surnamesVolunteer, mailContactVolunteer, cellPhoneNumberVolunteer, addressVolunteer, dateStart, dateEnd, skills, experience, hoursAvailability)
VALUES (1, '25639899', 'Pedro', 'Silva', 'Pedro_Silvadez@gmail.com', '958625419', 'Jr Real 329', TO_DATE('15/11/2022', 'DD/MM/YYYY'), TO_DATE('30/03/2023', 'DD/MM/YYYY'), 'Creatividad', 'no tiene', '280');

INSERT INTO Volunteer (idArea, dniVolunter, namesVolunteer, surnamesVolunteer, mailContactVolunteer, cellPhoneNumberVolunteer, addressVolunteer, dateStart, dateEnd, skills, experience, hoursAvailability)
VALUES (2, '56587455', 'Carlos', 'Rios', 'Carlos_dez@gmail.com', '952351246', 'Breña 148', TO_DATE('28/02/2023', 'DD/MM/YYYY'), TO_DATE('30/05/2023', 'DD/MM/YYYY'), 'Pensamiento critico', '8 meses', '250');

INSERT INTO Volunteer (idArea, dniVolunter, namesVolunteer, surnamesVolunteer, mailContactVolunteer, cellPhoneNumberVolunteer, addressVolunteer, dateStart, dateEnd, skills, experience, hoursAvailability)
VALUES (3, '25663212', 'Natalia', 'Gomez', 'Natalia_Gomezdez@gmail.com', '958621456', 'La victoria 121', TO_DATE('01/01/2023', 'DD/MM/YYYY'), TO_DATE('15/03/2023', 'DD/MM/YYYY'), 'trabajo en equipo', 'no tiene', '200');

INSERT INTO Volunteer (idArea, dniVolunter, namesVolunteer, surnamesVolunteer, mailContactVolunteer, cellPhoneNumberVolunteer, addressVolunteer, dateStart, dateEnd, skills, experience, hoursAvailability)
VALUES (4, '24589986', 'Andres', 'Delgado', 'Andres_Delgadez@gmail.com', '985672536', 'San Luis 255', TO_DATE('18/11/2022', 'DD/MM/YYYY'), TO_DATE('30/05/2023', 'DD/MM/YYYY'), 'comunicación efectiva', '3 meses', '400');

INSERT INTO Volunteer (idArea, dniVolunter, namesVolunteer, surnamesVolunteer, mailContactVolunteer, cellPhoneNumberVolunteer, addressVolunteer, dateStart, dateEnd, skills, experience, hoursAvailability)
VALUES (1, '25647758', 'Ana', 'sanchez', 'Ana_sanchdez@gmail.com', '986142025', 'Surco 132', TO_DATE('28/02/2023', 'DD/MM/YYYY'), TO_DATE('30/06/2023', 'DD/MM/YYYY'), 'Pensamiento critico', 'no tiene', '350');

INSERT INTO Volunteer (idArea, dniVolunter, namesVolunteer, surnamesVolunteer, mailContactVolunteer, cellPhoneNumberVolunteer, addressVolunteer, dateStart, dateEnd, skills, experience, hoursAvailability)
VALUES (2, '58624895', 'Andrea', 'Cruz', 'Andrea_dez@gmail.com', '952140368', 'Wilson 88', TO_DATE('28/02/2023', 'DD/MM/YYYY'), TO_DATE('30/06/2023', 'DD/MM/YYYY'), 'Liderazgo', 'no tiene', '300');

INSERT INTO VolunteerPatient (idVolunteer, idPatient)
VALUES (1, 1);

INSERT INTO VolunteerPatient (idVolunteer, idPatient)
VALUES (2, 2);

INSERT INTO VolunteerPatient (idVolunteer, idPatient)
VALUES (3, 3);

INSERT INTO VolunteerPatient (idVolunteer, idPatient)
VALUES (4, 4);

INSERT INTO VolunteerPatient (idVolunteer, idPatient)
VALUES (5, 5);

INSERT INTO VolunteerPatient (idVolunteer, idPatient)
VALUES (6, 6);

INSERT INTO VolunteerPatient (idVolunteer, idPatient)
VALUES (7, 7);

INSERT INTO VolunteerPatient (idVolunteer, idPatient)
VALUES (8, 8);

INSERT INTO VolunteerPatient (idVolunteer, idPatient)
VALUES (9, 9);

INSERT INTO VolunteerPatient (idVolunteer, idPatient)
VALUES (10, 10);

INSERT INTO Supplier (name, mailContact, cellPhoneNumber, address, typeProduct)
VALUES ('fabricacion alfa', 'alfa.1975@gmail.com', '95230156', 'av colonial S/N', 'Material');

INSERT INTO Supplier (name, mailContact, cellPhoneNumber, address, typeProduct)
VALUES ('Industria JM', 'IndustriaJM@gmail.com', '941025103', 'calle san juan 329', 'Material');

INSERT INTO Supplier (name, mailContact, cellPhoneNumber, address, typeProduct)
VALUES ('corporacion energy', 'energy@gmail.com', '989520167', 'Jr. Lima 123', 'Salud');

INSERT INTO Supplier (name, mailContact, cellPhoneNumber, address, typeProduct)
VALUES ('Soluciones xyz', 'soluXYZ@gmail.com', '978410659', 'Jr. Ayacucho 654', 'Material');

INSERT INTO Supplier (name, mailContact, cellPhoneNumber, address, typeProduct)
VALUES ('Industria delCampo', 'delCampo@gmail.com', '978410965', 'AV Nicolas de pierola S/N', 'Consumo');

INSERT INTO Supplier (name, mailContact, cellPhoneNumber, address, typeProduct)
VALUES ('Compania saludyVIda', 'saludyVida@gmail.com', '978954203', 'Breña 325', 'Salud');

INSERT INTO Supplier (name, mailContact, cellPhoneNumber, address, typeProduct)
VALUES ('Industrias GM', 'IndustriasGM@gmail.com', '985012456', 'AV Brasil 158', 'Material');

INSERT INTO Supplier (name, mailContact, cellPhoneNumber, address, typeProduct)
VALUES ('Industrias Asia', 'labAmoryPaz@gmail.com', '900578424', 'Puente piedra 152', 'Material');

INSERT INTO Supplier (name, mailContact, cellPhoneNumber, address, typeProduct)
VALUES ('Corporacion Andina', 'Andina.75@gmail.com', '985475123', 'San miguel 142', 'Material');

INSERT INTO Supplier (name, mailContact, cellPhoneNumber, address, typeProduct)
VALUES ('Industrias CyM', 'IndCyM@gmail.com', '985206401', 'La victoria 147', 'Material');

INSERT INTO Purchase (idArea, idSupplier, nameProduct, descriptionProduct, type, amount, unitAmount)
VALUES (1, 1, 'Papel', 'Papel de oficina', 'Consumo', 100, 5.99);

INSERT INTO Purchase (idArea, idSupplier, nameProduct, descriptionProduct, type, amount, unitAmount)
VALUES (1, 2, 'Tóner', 'Tóner para impresoras', 'Material', 10, 29.99);

INSERT INTO Purchase (idArea, idSupplier, nameProduct, descriptionProduct, type, amount, unitAmount)
VALUES (1, 3, 'Pastillas', 'Medicamentos', 'Salud', 50, 1.99);

INSERT INTO Purchase (idArea, idSupplier, nameProduct, descriptionProduct, type, amount, unitAmount)
VALUES (1, 4, 'Carpetas', 'Carpetas de archivo', 'Servicio', 20, 3.49);

INSERT INTO Donor (nameDonor, nicknameDonor, mailContact, cellPhoneNumber, Hero, categoryHero)
VALUES ('Jorge', 'EL campeon', 'jorge.98@gmail.com', '958624518', 'Yes', 'Héroe 5');

INSERT INTO Donor (nameDonor, nicknameDonor, mailContact, cellPhoneNumber, Hero, categoryHero)
VALUES ('Sarai', 'La dama de fuego', 'sarai@gmail.com', '953698254', 'No', null);

INSERT INTO Donor (nameDonor, nicknameDonor, mailContact, cellPhoneNumber, Hero, categoryHero)
VALUES ('Lucas', 'El campeon', 'lucas@gmail.com', '958621495', 'Yes', 'Héroe 19');

INSERT INTO Donor (nameDonor, nicknameDonor, mailContact, cellPhoneNumber, Hero, categoryHero)
VALUES ('Marcos', 'El guerrero', 'marcoos@gmail.com', '952306410', 'No', null);

INSERT INTO Donor (nameDonor, nicknameDonor, mailContact, cellPhoneNumber, Hero, categoryHero)
VALUES ('Angela', 'EL maestro', 'angela_00@gmail.com', '921065487', 'Yes', 'Héroe 30');

INSERT INTO Donor (nameDonor, nicknameDonor, mailContact, cellPhoneNumber, Hero, categoryHero)
VALUES ('Sheyla', 'La estrella', 'sheyla@gmail.com', '953216048', 'Yes', 'Héroe 60');

INSERT INTO Donor (nameDonor, nicknameDonor, mailContact, cellPhoneNumber, Hero, categoryHero)
VALUES ('Lucio', 'El vendaval', 'lucio22@gmail.com', '952036250', 'No', null);

INSERT INTO Donor (nameDonor, nicknameDonor, mailContact, cellPhoneNumber, Hero, categoryHero)
VALUES ('Jhostin', 'EL conquistador', 'jhostin@gmail.com', '95621087', 'Yes', 'Héroe 100');

INSERT INTO Donor (nameDonor, nicknameDonor, mailContact, cellPhoneNumber, Hero, categoryHero)
VALUES ('Maria', 'La reina', 'mariaL@gmail.com', '954203621', 'Yes', 'Héroe (Otros)');

INSERT INTO Donor (nameDonor, nicknameDonor, mailContact, cellPhoneNumber, Hero, categoryHero)
VALUES ('Ariana', 'La perla', 'ariana@gmail.com', '950065487', 'Yes', 'Héroe 5');


INSERT INTO MonetaryDonation (idDonor, dateDonation, methodDonation, amount, comments, status)
VALUES (1, TO_DATE('10/01/2023', 'DD/MM/YYYY'), 'Efectivo', 100.00, 'Dar lo poco que se tiene', 'Aprobado');

INSERT INTO MonetaryDonation (idDonor, dateDonation, methodDonation, amount, comments, status)
VALUES (2, TO_DATE('15/02/2023', 'DD/MM/YYYY'), 'Cheque', 500.50, 'Aportar con mi grano de arena', 'Pendiente');

INSERT INTO MonetaryDonation (idDonor, dateDonation, methodDonation, amount, comments, status)
VALUES (3, TO_DATE('05/03/2023', 'DD/MM/YYYY'), 'T_Debito', 750.25, 'Todo sea por los mas necesitados', 'Aprobado');

INSERT INTO MonetaryDonation (idDonor, dateDonation, methodDonation, amount, comments, status)
VALUES (4, TO_DATE('02/04/2023', 'DD/MM/YYYY'), 'T_Credito', 300.75, 'Dar lo poco que se tiene', 'Aprobado');

INSERT INTO MonetaryDonation (idDonor, dateDonation, methodDonation, amount, comments, status)
VALUES (5, TO_DATE('08/05/2023', 'DD/MM/YYYY'), 'Pago Móvil', 90.00, 'Aportar con mi grano de arena', 'Pendiente');

INSERT INTO MonetaryDonation (idDonor, dateDonation, methodDonation, amount, comments, status)
VALUES (6, TO_DATE('03/06/2023', 'DD/MM/YYYY'), 'Efectivo', 250.50, 'Dar lo poco que se tiene', 'Aprobado');

INSERT INTO MonetaryDonation (idDonor, dateDonation, methodDonation, amount, comments, status)
VALUES (7, TO_DATE('06/07/2023', 'DD/MM/YYYY'), 'Cheque', 1200.00, 'Aportar con mi grano de arena', 'Rechazado');

INSERT INTO MonetaryDonation (idDonor, dateDonation, methodDonation, amount, comments, status)
VALUES (8, TO_DATE('12/08/2023', 'DD/MM/YYYY'), 'T_Debito', 800.25, 'Todo sea por los mas necesitados', 'Pendiente');

INSERT INTO MonetaryDonation (idDonor, dateDonation, methodDonation, amount, comments, status)
VALUES (9, TO_DATE('20/09/2023', 'DD/MM/YYYY'), 'T_Credito', 400.50, 'Dar lo poco que se tiene', 'Aprobado');

INSERT INTO MonetaryDonation (idDonor, dateDonation, methodDonation, amount, comments, status)
VALUES (10, TO_DATE('25/10/2023', 'DD/MM/YYYY'), 'Pago Móvil', 1500.00, 'Aportar con mi grano de arena', 'Pendiente');

INSERT INTO MaterialDonation (idDonor, idArea, dateDonation, comments, type, amount, status)
VALUES (1, 3, TO_DATE('12/01/2023', 'DD/MM/YYYY'), 'Ropa nueva con etiqueta', 'Ropa', 10, 'Aprobado');

INSERT INTO MaterialDonation (idDonor, idArea, dateDonation, comments, type, amount, status)
VALUES (2, 4, TO_DATE('10/12/2022', 'DD/MM/YYYY'), 'sillon', 'Mueble', 2, 'Pendiente');

INSERT INTO MaterialDonation (idDonor, idArea, dateDonation, comments, type, amount, status)
VALUES (3, 1, TO_DATE('01/10/2022', 'DD/MM/YYYY'), 'Ropa variada para niñas', 'Ropa', 20, 'Aprobado');

INSERT INTO MaterialDonation (idDonor, idArea, dateDonation, comments, type, amount, status)
VALUES (4, 3, TO_DATE('25/03/2022', 'DD/MM/YYYY'), 'carros y muñecos', 'Juguetes', 100, 'Rechazado');

INSERT INTO MaterialDonation (idDonor, idArea, dateDonation, comments, type, amount, status)
VALUES (5, 1, TO_DATE('05/03/2023', 'DD/MM/YYYY'), 'Cocina', 'Electrodoméstico', 1, 'Rechazado');

INSERT INTO MaterialDonation (idDonor, idArea, dateDonation, comments, type, amount, status)
VALUES (6, 1, TO_DATE('30/11/2022', 'DD/MM/YYYY'), 'mesa', 'Mueble', 15, 'Aprobado');

INSERT INTO MaterialDonation (idDonor, idArea, dateDonation, comments, type, amount, status)
VALUES (7, 3, TO_DATE('26/10/2022', 'DD/MM/YYYY'), 'Juguetes para niños en buen estado', 'Juguetes', 50, 'Pendiente');

INSERT INTO MaterialDonation (idDonor, idArea, dateDonation, comments, type, amount, status)
VALUES (8, 3, TO_DATE('05/01/2023', 'DD/MM/YYYY'), 'Ropas en buen estado para niños y niñas', 'Ropa', 15, 'Pendiente');

INSERT INTO MaterialDonation (idDonor, idArea, dateDonation, comments, type, amount, status)
VALUES (9, 4, TO_DATE('18/03/2023', 'DD/MM/YYYY'), 'sillas', 'Mueble', 25, 'Aprobado');

INSERT INTO MaterialDonation (idDonor, idArea, dateDonation, comments, type, amount, status)
VALUES (10, 4, TO_DATE('11/09/2022', 'DD/MM/YYYY'), 'camas', 'Mueble', 2, 'Aprobado');

INSERT INTO Necessity (idArea, idMonetaryDonation, description, dateRequest, estimatedCost)
VALUES (1, 1, 'Alimentos', TO_DATE('15/01/2023', 'DD/MM/YYYY'), 1000.00);

INSERT INTO Necessity (idArea, idMonetaryDonation, description, dateRequest, estimatedCost)
VALUES (2, 3, 'Capacitacion', TO_DATE('20/02/2023', 'DD/MM/YYYY'), 500.50);

INSERT INTO Necessity (idArea, idMonetaryDonation, description, dateRequest, estimatedCost)
VALUES (3, 3, 'Capacitacion', TO_DATE('10/03/2023', 'DD/MM/YYYY'), 750.25);

INSERT INTO Necessity (idArea, idMonetaryDonation, description, dateRequest, estimatedCost)
VALUES (4, 4, 'Gasto funcionamiento', TO_DATE('05/04/2023', 'DD/MM/YYYY'), 300.75);

INSERT INTO Necessity (idArea, idMonetaryDonation, description, dateRequest, estimatedCost)
VALUES (5, 1, 'Alimentos', TO_DATE('12/05/2023', 'DD/MM/YYYY'), 900.00);

INSERT INTO Necessity (idArea, idMonetaryDonation, description, dateRequest, estimatedCost)
VALUES (6, 3, 'Materiales de trabajo', TO_DATE('01/06/2023', 'DD/MM/YYYY'), 250.50);

INSERT INTO Necessity (idArea, idMonetaryDonation, description, dateRequest, estimatedCost)
VALUES (7, 3, 'Capacitacion', TO_DATE('08/07/2023', 'DD/MM/YYYY'), 1200.00);

INSERT INTO Necessity (idArea, idMonetaryDonation, description, dateRequest, estimatedCost)
VALUES (8, 4, 'Gasto funcionamiento', TO_DATE('15/08/2023', 'DD/MM/YYYY'), 800.25);

INSERT INTO Necessity (idArea, idMonetaryDonation, description, dateRequest, estimatedCost)
VALUES (9, 1, 'Alimentos', TO_DATE('25/09/2023', 'DD/MM/YYYY'), 400.50);

INSERT INTO Necessity (idArea, idMonetaryDonation, description, dateRequest, estimatedCost)
VALUES (10, 2, 'Gasto funcionamiento', TO_DATE('30/10/2023', 'DD/MM/YYYY'), 1500.0);