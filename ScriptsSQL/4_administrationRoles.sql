ALTER SESSION SET "_ORACLE_SCRIPT" = true;

DROP ROLE Shelter_Manager;
DROP ROLE Shelter_Human_Resources;
DROP ROLE Shelter_Finance;
DROP ROLE Shelter_Procurement_Area;

/*
ROL DE ADMINISTRADOR DEL ALBERGUE
*/

CREATE ROLE Shelter_Manager NOT IDENTIFIED;
GRANT CREATE SESSION TO Shelter_Manager;
GRANT CREATE TABLE TO Shelter_Manager;
GRANT CREATE VIEW TO Shelter_Manager;
GRANT CREATE PROCEDURE TO Shelter_Manager;
GRANT CREATE SEQUENCE TO Shelter_Manager;
GRANT CREATE USER TO Shelter_Manager;
GRANT CREATE ROLE TO Shelter_Manager;
GRANT DROP USER TO Shelter_Manager;
GRANT GRANT ANY ROLE TO Shelter_Manager;

GRANT DROP ANY TABLE TO Shelter_Manager;
GRANT DROP ANY ROLE TO Shelter_Manager;

GRANT SELECT ON Attorney TO Shelter_Manager;
GRANT SELECT ON Clinic_History TO Shelter_Manager;
GRANT SELECT ON Patient TO Shelter_Manager;
GRANT SELECT ON Medical_Exam TO Shelter_Manager;
GRANT SELECT ON Area TO Shelter_Manager;
GRANT SELECT ON Employee TO Shelter_Manager;
GRANT SELECT ON Volunteer TO Shelter_Manager;
GRANT SELECT ON VolunteerPatient TO Shelter_Manager;
GRANT SELECT ON Supplier TO Shelter_Manager;
GRANT SELECT ON Purchase TO Shelter_Manager;
GRANT SELECT ON Donor TO Shelter_Manager;
GRANT SELECT ON MonetaryDonation TO Shelter_Manager;
GRANT SELECT ON MaterialDonation TO Shelter_Manager;
GRANT SELECT ON Necessity TO Shelter_Manager;

GRANT INSERT ON Attorney TO Shelter_Manager;
GRANT INSERT ON Clinic_History TO Shelter_Manager;
GRANT INSERT ON Patient TO Shelter_Manager;
GRANT INSERT ON Medical_Exam TO Shelter_Manager;
GRANT INSERT ON Area TO Shelter_Manager;
GRANT INSERT ON Employee TO Shelter_Manager;
GRANT INSERT ON Volunteer TO Shelter_Manager;
GRANT INSERT ON VolunteerPatient TO Shelter_Manager;
GRANT INSERT ON Supplier TO Shelter_Manager;
GRANT INSERT ON Purchase TO Shelter_Manager;
GRANT INSERT ON Donor TO Shelter_Manager;
GRANT INSERT ON MonetaryDonation TO Shelter_Manager;
GRANT INSERT ON MaterialDonation TO Shelter_Manager;
GRANT INSERT ON Necessity TO Shelter_Manager;

GRANT UPDATE ON Attorney TO Shelter_Manager;
GRANT UPDATE ON Clinic_History TO Shelter_Manager;
GRANT UPDATE ON Patient TO Shelter_Manager;
GRANT UPDATE ON Medical_Exam TO Shelter_Manager;
GRANT UPDATE ON Area TO Shelter_Manager;
GRANT UPDATE ON Employee TO Shelter_Manager;
GRANT UPDATE ON Volunteer TO Shelter_Manager;
GRANT UPDATE ON VolunteerPatient TO Shelter_Manager;
GRANT UPDATE ON Supplier TO Shelter_Manager;
GRANT UPDATE ON Purchase TO Shelter_Manager;
GRANT UPDATE ON Donor TO Shelter_Manager;
GRANT UPDATE ON MonetaryDonation TO Shelter_Manager;
GRANT UPDATE ON MaterialDonation TO Shelter_Manager;
GRANT UPDATE ON Necessity TO Shelter_Manager;

GRANT DELETE ON Attorney TO Shelter_Manager;
GRANT DELETE ON Clinic_History TO Shelter_Manager;
GRANT DELETE ON Patient TO Shelter_Manager;
GRANT DELETE ON Medical_Exam TO Shelter_Manager;
GRANT DELETE ON Area TO Shelter_Manager;
GRANT DELETE ON Employee TO Shelter_Manager;
GRANT DELETE ON Volunteer TO Shelter_Manager;
GRANT DELETE ON VolunteerPatient TO Shelter_Manager;
GRANT DELETE ON Supplier TO Shelter_Manager;
GRANT DELETE ON Purchase TO Shelter_Manager;
GRANT DELETE ON Donor TO Shelter_Manager;
GRANT DELETE ON MonetaryDonation TO Shelter_Manager;
GRANT DELETE ON MaterialDonation TO Shelter_Manager;
GRANT DELETE ON Necessity TO Shelter_Manager;

GRANT EXECUTE ON obtener_cantidad_empleados_por_area TO Shelter_Manager;
GRANT EXECUTE ON display_patient_history TO Shelter_Manager;
GRANT EXECUTE ON display_medical_exams TO Shelter_Manager;
GRANT EXECUTE ON display_employees_in_area TO Shelter_Manager;

GRANT EXECUTE ON obtener_cantidad_pacientes TO Shelter_Manager;
GRANT EXECUTE ON obtener_cantidad_examenes TO Shelter_Manager;
GRANT EXECUTE ON obtener_cantidad_voluntarios TO Shelter_Manager;
GRANT EXECUTE ON obtener_cantidad_proveedores TO Shelter_Manager;
GRANT EXECUTE ON obtener_cantidad_donaciones_monetarias TO Shelter_Manager;
GRANT EXECUTE ON obtener_monto_donaciones_monetarias TO Shelter_Manager;
GRANT EXECUTE ON obtener_cantidad_donaciones_materiales TO Shelter_Manager;


/*
Rol de Recursos Humanos
*/

CREATE ROLE Shelter_Human_Resources NOT IDENTIFIED;
GRANT CREATE SESSION TO Shelter_Human_Resources;

GRANT SELECT ON Attorney TO Shelter_Human_Resources;
GRANT SELECT ON Clinic_History TO Shelter_Human_Resources;
GRANT SELECT ON Patient TO Shelter_Human_Resources;
GRANT SELECT ON Medical_Exam TO Shelter_Human_Resources;
GRANT SELECT ON Area TO Shelter_Human_Resources;
GRANT SELECT ON Employee TO Shelter_Human_Resources;
GRANT SELECT ON Volunteer TO Shelter_Human_Resources;
GRANT SELECT ON VolunteerPatient TO Shelter_Human_Resources;

GRANT INSERT ON Attorney TO Shelter_Human_Resources;
GRANT INSERT ON Clinic_History TO Shelter_Human_Resources;
GRANT INSERT ON Patient TO Shelter_Human_Resources;
GRANT INSERT ON Medical_Exam TO Shelter_Human_Resources;
GRANT INSERT ON Area TO Shelter_Human_Resources;
GRANT INSERT ON Employee TO Shelter_Human_Resources;
GRANT INSERT ON Volunteer TO Shelter_Human_Resources;
GRANT INSERT ON VolunteerPatient TO Shelter_Human_Resources;

GRANT UPDATE ON Attorney TO Shelter_Human_Resources;
GRANT UPDATE ON Clinic_History TO Shelter_Human_Resources;
GRANT UPDATE ON Patient TO Shelter_Human_Resources;
GRANT UPDATE ON Medical_Exam TO Shelter_Human_Resources;
GRANT UPDATE ON Area TO Shelter_Human_Resources;
GRANT UPDATE ON Employee TO Shelter_Human_Resources;
GRANT UPDATE ON Volunteer TO Shelter_Human_Resources;
GRANT UPDATE ON VolunteerPatient TO Shelter_Human_Resources;

GRANT DELETE ON Attorney TO Shelter_Human_Resources;
GRANT DELETE ON Clinic_History TO Shelter_Human_Resources;
GRANT DELETE ON Patient TO Shelter_Human_Resources;
GRANT DELETE ON Medical_Exam TO Shelter_Human_Resources;
GRANT DELETE ON Area TO Shelter_Human_Resources;
GRANT DELETE ON Employee TO Shelter_Human_Resources;
GRANT DELETE ON Volunteer TO Shelter_Human_Resources;
GRANT DELETE ON VolunteerPatient TO Shelter_Human_Resources;

GRANT EXECUTE ON obtener_cantidad_empleados_por_area TO Shelter_Human_Resources;
GRANT EXECUTE ON display_patient_history TO Shelter_Human_Resources;
GRANT EXECUTE ON display_medical_exams TO Shelter_Human_Resources;
GRANT EXECUTE ON display_employees_in_area TO Shelter_Human_Resources;

GRANT EXECUTE ON obtener_cantidad_pacientes TO Shelter_Human_Resources;
GRANT EXECUTE ON obtener_cantidad_examenes TO Shelter_Human_Resources;
GRANT EXECUTE ON obtener_cantidad_voluntarios TO Shelter_Human_Resources;
GRANT EXECUTE ON obtener_cantidad_proveedores TO Shelter_Human_Resources;
GRANT EXECUTE ON obtener_cantidad_donaciones_monetarias TO Shelter_Human_Resources;
GRANT EXECUTE ON obtener_monto_donaciones_monetarias TO Shelter_Human_Resources;
GRANT EXECUTE ON obtener_cantidad_donaciones_materiales TO Shelter_Human_Resources;

/*
Rol de Finanzas
*/

CREATE ROLE Shelter_Finance NOT IDENTIFIED;
GRANT CREATE SESSION TO Shelter_Finance;

GRANT SELECT ON Area TO Shelter_Finance;
GRANT SELECT ON Employee TO Shelter_Finance;
GRANT SELECT ON Supplier TO Shelter_Finance;
GRANT SELECT ON Purchase TO Shelter_Finance;
GRANT SELECT ON Donor TO Shelter_Finance;
GRANT SELECT ON MonetaryDonation TO Shelter_Finance;
GRANT SELECT ON MaterialDonation TO Shelter_Finance;
GRANT SELECT ON Necessity TO Shelter_Finance;

GRANT INSERT ON Area TO Shelter_Finance;
GRANT INSERT ON Employee TO Shelter_Finance;
GRANT INSERT ON Supplier TO Shelter_Finance;
GRANT INSERT ON Purchase TO Shelter_Finance;
GRANT INSERT ON Donor TO Shelter_Finance;
GRANT INSERT ON MonetaryDonation TO Shelter_Finance;
GRANT INSERT ON MaterialDonation TO Shelter_Finance;
GRANT INSERT ON Necessity TO Shelter_Finance;

GRANT UPDATE ON Area TO Shelter_Finance;
GRANT UPDATE ON Employee TO Shelter_Finance;
GRANT UPDATE ON Supplier TO Shelter_Finance;
GRANT UPDATE ON Purchase TO Shelter_Finance;
GRANT UPDATE ON Donor TO Shelter_Finance;
GRANT UPDATE ON MonetaryDonation TO Shelter_Finance;
GRANT UPDATE ON MaterialDonation TO Shelter_Finance;
GRANT UPDATE ON Necessity TO Shelter_Finance;

GRANT DELETE ON Area TO Shelter_Finance;
GRANT DELETE ON Employee TO Shelter_Finance;
GRANT DELETE ON Supplier TO Shelter_Finance;
GRANT DELETE ON Purchase TO Shelter_Finance;
GRANT DELETE ON Donor TO Shelter_Finance;
GRANT DELETE ON MonetaryDonation TO Shelter_Finance;
GRANT DELETE ON MaterialDonation TO Shelter_Finance;
GRANT DELETE ON Necessity TO Shelter_Finance;

GRANT EXECUTE ON obtener_cantidad_empleados_por_area TO Shelter_Finance;
GRANT EXECUTE ON display_employees_in_area TO Shelter_Finance;

GRANT EXECUTE ON obtener_cantidad_pacientes TO Shelter_Finance;
GRANT EXECUTE ON obtener_cantidad_examenes TO Shelter_Finance;
GRANT EXECUTE ON obtener_cantidad_voluntarios TO Shelter_Finance;
GRANT EXECUTE ON obtener_cantidad_proveedores TO Shelter_Finance;
GRANT EXECUTE ON obtener_cantidad_donaciones_monetarias TO Shelter_Finance;
GRANT EXECUTE ON obtener_monto_donaciones_monetarias TO Shelter_Finance;
GRANT EXECUTE ON obtener_cantidad_donaciones_materiales TO Shelter_Finance;

/*
Rol de Área de Adquisiciones
*/

CREATE ROLE Shelter_Procurement_Area NOT IDENTIFIED;
GRANT CREATE SESSION TO Shelter_Procurement_Area;

GRANT SELECT ON Area TO Shelter_Procurement_Area;
GRANT SELECT ON Employee TO Shelter_Procurement_Area;
GRANT SELECT ON Supplier TO Shelter_Procurement_Area;
GRANT SELECT ON Purchase TO Shelter_Procurement_Area;
GRANT SELECT ON Donor TO Shelter_Procurement_Area;
GRANT SELECT ON MonetaryDonation TO Shelter_Procurement_Area;
GRANT SELECT ON MaterialDonation TO Shelter_Procurement_Area;
GRANT SELECT ON Necessity TO Shelter_Procurement_Area;

GRANT INSERT ON Area TO Shelter_Procurement_Area;
GRANT INSERT ON Employee TO Shelter_Procurement_Area;
GRANT INSERT ON Supplier TO Shelter_Procurement_Area;
GRANT INSERT ON Purchase TO Shelter_Procurement_Area;
GRANT INSERT ON Donor TO Shelter_Procurement_Area;
GRANT INSERT ON MonetaryDonation TO Shelter_Procurement_Area;
GRANT INSERT ON MaterialDonation TO Shelter_Procurement_Area;
GRANT INSERT ON Necessity TO Shelter_Procurement_Area;

GRANT UPDATE ON Area TO Shelter_Procurement_Area;
GRANT UPDATE ON Employee TO Shelter_Procurement_Area;
GRANT UPDATE ON Supplier TO Shelter_Procurement_Area;
GRANT UPDATE ON Purchase TO Shelter_Procurement_Area;
GRANT UPDATE ON Donor TO Shelter_Procurement_Area;
GRANT UPDATE ON MonetaryDonation TO Shelter_Procurement_Area;
GRANT UPDATE ON MaterialDonation TO Shelter_Procurement_Area;
GRANT UPDATE ON Necessity TO Shelter_Procurement_Area;

GRANT DELETE ON Area TO Shelter_Procurement_Area;
GRANT DELETE ON Employee TO Shelter_Procurement_Area;
GRANT DELETE ON Supplier TO Shelter_Procurement_Area;
GRANT DELETE ON Purchase TO Shelter_Procurement_Area;
GRANT DELETE ON Donor TO Shelter_Procurement_Area;
GRANT DELETE ON MonetaryDonation TO Shelter_Procurement_Area;
GRANT DELETE ON MaterialDonation TO Shelter_Procurement_Area;
GRANT DELETE ON Necessity TO Shelter_Procurement_Area;

GRANT EXECUTE ON obtener_cantidad_empleados_por_area TO Shelter_Procurement_Area;
GRANT EXECUTE ON display_employees_in_area TO Shelter_Procurement_Area;

GRANT EXECUTE ON obtener_cantidad_pacientes TO Shelter_Procurement_Area;
GRANT EXECUTE ON obtener_cantidad_examenes TO Shelter_Procurement_Area;
GRANT EXECUTE ON obtener_cantidad_voluntarios TO Shelter_Procurement_Area;
GRANT EXECUTE ON obtener_cantidad_proveedores TO Shelter_Procurement_Area;
GRANT EXECUTE ON obtener_cantidad_donaciones_monetarias TO Shelter_Procurement_Area;
GRANT EXECUTE ON obtener_monto_donaciones_monetarias TO Shelter_Procurement_Area;
GRANT EXECUTE ON obtener_cantidad_donaciones_materiales TO Shelter_Procurement_Area;

/*Observando los roles creados*/

SELECT * FROM dba_roles WHERE ROLE LIKE 'SHELTER%' ORDER BY ROLE;

/*Observando los roles correspondientes al usuario actual*/
SELECT USERNAME, GRANTED_ROLE
FROM USER_ROLE_PRIVS;

/*CREANDO USUARIOS*/
DROP USER JUAN;
CREATE USER JUAN IDENTIFIED BY 1234;
GRANT Shelter_Manager TO JUAN;

DROP USER FRANCISCO;
CREATE USER FRANCISCO IDENTIFIED BY 1234;
GRANT Shelter_Procurement_Area TO FRANCISCO;