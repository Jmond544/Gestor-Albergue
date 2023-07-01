DROP TABLE Necessity;
DROP TABLE MaterialDonation;
DROP TABLE MonetaryDonation;
DROP TABLE Donor;
DROP TABLE Purchase;
DROP TABLE Supplier;
DROP TABLE VolunteerPatient;
DROP TABLE Volunteer;
DROP TABLE Medical_Exam;
DROP TABLE Patient;
DROP TABLE Clinic_History;
DROP TABLE Attorney;

ALTER TABLE Area
DROP CONSTRAINT fk_area_supervisor;

ALTER TABLE Employee
DROP CONSTRAINT fk_employee_area;

DROP TABLE Employee;
DROP TABLE Area;