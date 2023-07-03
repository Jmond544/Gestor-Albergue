CREATE TABLE Attorney(
    idAttorney NUMBER(8) GENERATED BY DEFAULT AS IDENTITY,
    dniAttorney CHAR(8) UNIQUE,
    namesAttorney VARCHAR2(30) NOT NULL,
    surnamesAttorney VARCHAR2(30) NOT NULL,
    employmentSituation VARCHAR2(4) NOT NULL,
    civilStatus VARCHAR2(2) NOT NULL,
    socialConditions VARCHAR2(2) NOT NULL,
    levelStudy VARCHAR2(2) NOT NULL,
    CONSTRAINT pk_Attorney PRIMARY KEY (idAttorney),
    CONSTRAINT ck_civilStatus CHECK (civilStatus IN ('S','C','V','D')),
    CONSTRAINT ck_employmentSituation CHECK (employmentSituation IN ('EMP','DES')),
    CONSTRAINT ck_socialConditions CHECK (socialConditions IN ('A','B','C')),
    CONSTRAINT ck_levelStudy CHECK (levelStudy IN ('EB','BS', 'MS', 'PH'))
);

/*
CONSTRAINT ck_civilStatus CHECK (civilStatus IN ('S','C','V','D')):
    'S' (Soltero) 'C' (Casado) 'V' (viudo) 'D' (divorciado)

CONSTRAINT ck_socialConditions CHECK (socialConditions IN ('A','B','C')):
    'A', 'B' o 'C'.

CONSTRAINT ck_levelStudy CHECK (levelStudy IN ('EB', 'BS', 'MS', 'PH')):
    'EB' (Educacion básica), 'BS' (licenciatura), 'MS' (maestría) o 'PH' (doctorado).

CONSTRAINT ck_employmentSituation CHECK (employmentSituation IN ('EMP','DES')):
    'EMP' (empleado), 'DES' (desempleado)
*/

CREATE TABLE Clinic_History(
    idClinic_History NUMBER(8) GENERATED BY DEFAULT AS IDENTITY,
    updatedClinic_History VARCHAR2(3) NOT NULL,
    CONSTRAINT pk_Clinic_History PRIMARY KEY(idClinic_History),
    CONSTRAINT chk_updatedClinic_History CHECK(updatedClinic_History IN ('Yes', 'No'))
);

CREATE TABLE Patient(
    idPatient NUMBER(8) GENERATED BY DEFAULT AS IDENTITY,
    idAttorney NUMBER(8) NOT NULL,
    idClinic_History NUMBER(8) NOT NULL,
    dniPatient CHAR(8) NOT NULL,
    namesPatient VARCHAR2(30) NOT NULL,
    surnamesPatient VARCHAR2(30) NOT NULL,
    agePatient INT NOT NULL,
    diagnosis VARCHAR(25) NOT NULL,
    CONSTRAINT pk_Patient PRIMARY KEY(idPatient),
    CONSTRAINT fk_patient_attorney FOREIGN KEY(idAttorney)
    REFERENCES Attorney(idAttorney),
    CONSTRAINT fk_patient_clinic_history FOREIGN KEY(idClinic_History)
    REFERENCES Clinic_History(idClinic_History),
    CONSTRAINT chk_agePatient CHECK(agePatient >= 0 AND agePatient <= 120)
);

CREATE TABLE Medical_Exam (
    idMedical_Exam NUMBER(8) GENERATED BY DEFAULT AS IDENTITY,
    idPatient NUMBER(8) NOT NULL,
    typeExam VARCHAR2(25) NOT NULL,
    dateExam DATE NOT NULL,
    dateResults DATE NOT NULL,
    results VARCHAR2(50) NOT NULL,
    CONSTRAINT pk_Medical_Exam PRIMARY KEY (idMedical_Exam),
    CONSTRAINT fk_medical_exam_patient FOREIGN KEY (idPatient)
        REFERENCES Patient(idPatient),
    CONSTRAINT chk_dateExam CHECK (dateExam >= TO_DATE('01/01/2023', 'DD/MM/YYYY')),
    CONSTRAINT chk_dateResults CHECK (dateResults >= dateExam)
);


CREATE TABLE Area(
    idArea NUMBER(8) GENERATED BY DEFAULT AS IDENTITY,
    idSupervisor NUMBER(8) NOT NULL,
    nameArea VARCHAR2(30) NOT NULL,
    descriptionArea VARCHAR2(50) NOT NULL,
    budgetArea DECIMAL(8, 2) NOT NULL,
    CONSTRAINT pk_Area PRIMARY KEY(idArea),
    CONSTRAINT chk_budgetArea CHECK (budgetArea > 0)
);

CREATE TABLE Employee(
    idEmployee NUMBER(8) GENERATED BY DEFAULT AS IDENTITY,
    idArea NUMBER(8) NOT NULL,
    surnamesEmployee VARCHAR2(25) NOT NULL,
    userName VARCHAR2(25) NOT NULL,
    password VARCHAR2(25) NOT NULL,
    mailContact VARCHAR2(25) NOT NULL,
    cellPhoneNumber VARCHAR2(25) NOT NULL,
    address VARCHAR2(50) NOT NULL,
    dateStartContract DATE NOT NULL,
    dateEndContract DATE NOT NULL,
    positionEmployee VARCHAR2(25) NOT NULL,
    salary DECIMAL(8, 2) NOT NULL,
    benefits VARCHAR2(50) NOT NULL,
    CONSTRAINT pk_Employee PRIMARY KEY(idEmployee),
    CONSTRAINT fk_employee_area FOREIGN KEY(idArea)
    REFERENCES Area(idArea),
    CONSTRAINT chk_mialContact CHECK (mailContact LIKE '%.com'),
    CONSTRAINT chk_dateStartContract CHECK(dateStartContract >= TO_DATE('01/01/2000','DD/MM/YYYY')),
    CONSTRAINT chk_dateEndContract CHECK(dateEndContract >= dateStartContract),
    CONSTRAINT chk_salary CHECK (salary > 0)
);

-- despues
ALTER TABLE Area
ADD CONSTRAINT fk_area_supervisor FOREIGN KEY(idSupervisor)
    REFERENCES Employee(idEmployee);

CREATE TABLE Volunteer(
    idVolunteer NUMBER(8) GENERATED BY DEFAULT AS IDENTITY,
    idArea NUMBER(8) NOT NULL,
    dniVolunter CHAR(8) UNIQUE,
    namesVolunteer VARCHAR2(25) NOT NULL,
    surnamesVolunteer VARCHAR2(25) NOT NULL,
    mailContactVolunteer VARCHAR2(30) NOT NULL,
    cellPhoneNumberVolunteer CHAR(9) NOT NULL,
    addressVolunteer VARCHAR(50) NOT NULL,
    dateStart DATE NOT NULL,
    dateEnd DATE NOT NULL,
    skills VARCHAR2(50) NOT NULL,
    experience VARCHAR2(50) NOT NULL,
    hoursAvailability VARCHAR2(50) NOT NULL,
    CONSTRAINT pk_Volunteer PRIMARY KEY(idVolunteer),
    CONSTRAINT fk_volunteer_area FOREIGN KEY(idArea)
    REFERENCES Area(idArea),
    CONSTRAINT chk_mailContactVolunteer CHECK (mailContactVolunteer LIKE '%.com'),
    CONSTRAINT chk_dateStart CHECK(dateStart >= TO_DATE('01/01/2000','DD/MM/YYYY')),
    CONSTRAINT chk_dateEnd CHECK(dateEnd >= dateStart)
);

CREATE TABLE VolunteerPatient(
    idVolunteer NUMBER(8),
    idPatient NUMBER(8),
    CONSTRAINT pk_VolunteerPatient PRIMARY KEY (idVolunteer,idPatient),
    CONSTRAINT fk_Relation_Volunteer FOREIGN KEY (idVolunteer) REFERENCES Volunteer(idVolunteer),
    CONSTRAINT fk_Relation_Patient FOREIGN KEY (idPatient) REFERENCES Patient(idPatient)
);

CREATE TABLE Supplier(
    idSupplier NUMBER(8) GENERATED BY DEFAULT AS IDENTITY,
    name VARCHAR2(20) NOT NULL,
    mailContact VARCHAR2(30) NOT NULL,
    cellPhoneNumber CHAR(9) NOT NULL,
    address VARCHAR2(50) NOT NULL,
    typeProduct VARCHAR2(15) NOT NULL,
    CONSTRAINT pk_Supplier PRIMARY KEY (idSupplier),
    CONSTRAINT ck_typeProduct CHECK (typeProduct IN ('Consumo','Material','Salud','Servicio'))
);

CREATE TABLE Purchase(
    idPurchase NUMBER(8) GENERATED BY DEFAULT AS IDENTITY,
    idArea NUMBER(8) NOT NULL,
    idSupplier NUMBER(8) NOT NULL,
    nameProduct VARCHAR2(20) NOT NULL,
    descriptionProduct VARCHAR2(30) NOT NULL,
    type VARCHAR2(15) NOT NULL,
    amount DECIMAL(6,2) NOT NULL,
    unitAmount DECIMAL(6,2) NOT NULL,
    CONSTRAINT pk_Purchase PRIMARY KEY (idPurchase),
    CONSTRAINT fk_Purchase_Area FOREIGN KEY (idArea) REFERENCES Area(idArea),
    CONSTRAINT fk_Purchase_Supplier FOREIGN KEY (idSupplier) REFERENCES Supplier(idSupplier),
    CONSTRAINT ck_type CHECK (type IN ('Consumo','Material','Salud','Servicio')),
    CONSTRAINT ck_amount CHECK (amount >= 0),
    CONSTRAINT ck_unitAmount CHECK (unitAmount >= 0)
);


CREATE TABLE Donor(
    idDonor NUMBER(8) GENERATED BY DEFAULT AS IDENTITY,
    nameDonor VARCHAR2(25),
    nicknameDonor VARCHAR2(25),
    mailContact VARCHAR2(30) NOT NULL,
    cellPhoneNumber CHAR(9) NOT NULL,
    Hero VARCHAR2(4) NOT NULL,
    categoryHero VARCHAR2(15),
    CONSTRAINT pk_Donor PRIMARY KEY (idDonor),
    CONSTRAINT ck_Hero_Donor CHECK(Hero IN ('Yes', 'No'))
);

CREATE TABLE MonetaryDonation(
    idMonetaryDonation NUMBER(8) GENERATED BY DEFAULT AS IDENTITY,
    idDonor NUMBER(8) NOT NULL,
    dateDonation DATE NOT NULL,
    methodDonation VARCHAR2(20) NOT NULL,
    amount DECIMAL(6,2) NOT NULL,
    comments VARCHAR2(40),
    status VARCHAR2(20) NOT NULL,
    CONSTRAINT pk_MonetaryDonation PRIMARY KEY (idMonetaryDonation),
    CONSTRAINT fk_MonetaryDonation_Donor FOREIGN KEY (idDonor) REFERENCES Donor(idDonor),
    CONSTRAINT ck_MonetaryDonation_methodDonation CHECK (methodDonation IN ('Efectivo','Cheque','T_Debito','T_Credito','Pago Móvil')),
    CONSTRAINT ck_MonetaryDonation_amount CHECK (amount >= 0),
    CONSTRAINT ck_MonetaryDonation_status CHECK (status IN ('Pendiente','Aprobado','Rechazado'))
);

/*
ck_amount: Esta restricción asegura que el valor del campo amount sea mayor o igual a cero, evitando donaciones con cantidades negativas.
ck_status: Esta restricción limita el valor del campo status a las opciones permitidas: 'Pendiente', 'Aprobado' o 'Rechazado'. Esto garantiza que el estado de la donación sea válido en la tabla.
*/

CREATE TABLE MaterialDonation(
    idDonationMaterial NUMBER(8) GENERATED BY DEFAULT AS IDENTITY,
    idDonor NUMBER(8) NOT NULL,
    idArea NUMBER(8) NOT NULL,
    dateDonation DATE NOT NULL,
    comments VARCHAR2(40) NOT NULL,
    type VARCHAR2(15) NOT NULL,
    amount DECIMAL(6,2) NOT NULL,
    status VARCHAR2(20) NOT NULL,
    CONSTRAINT pk_MaterialDonation PRIMARY KEY (idDonationMaterial),
    CONSTRAINT fk_MaterialDonation_Area FOREIGN KEY(idArea) REFERENCES Area(idArea),
    CONSTRAINT fk_MaterialDonation_Donor FOREIGN KEY (idDonor) REFERENCES Donor(idDonor),
    CONSTRAINT ck_MaterialDonation_Amount CHECK (amount > 0),
    CONSTRAINT ck_MaterialDonation_status CHECK (status IN ('Pendiente','Aprobado','Rechazado'))
);

CREATE TABLE Necessity(
    idNecessity NUMBER(8) GENERATED BY DEFAULT AS IDENTITY,
    idArea NUMBER(8) NOT NULL,
    idMonetaryDonation NUMBER(8) NOT NULL,
    description VARCHAR2(50) NOT NULL,
    dateRequest DATE NOT NULL,
    estimatedCost DECIMAL(10,2) NOT NULL,
    CONSTRAINT pk_Necessity PRIMARY KEY(idNecessity),
    CONSTRAINT fk_Necessity_Area FOREIGN KEY (idArea) REFERENCES Area(idArea),
    CONSTRAINT fk_Necessity_MonetaryDontion FOREIGN KEY (idMonetaryDonation) REFERENCES MonetaryDonation(idMonetaryDonation),
    CONSTRAINT chk_estimatedCost_positive CHECK (estimatedCost > 0)
);

SELECT * FROM ALL_TABLES WHERE OWNER = 'ALBERGUE';