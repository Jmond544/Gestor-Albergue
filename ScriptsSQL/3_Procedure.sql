/*
FUNCIONES
*/

CREATE OR REPLACE FUNCTION obtener_cantidad_pacientes RETURN NUMBER AS
  total_pacientes NUMBER;
BEGIN
  SELECT COUNT(*) INTO total_pacientes
  FROM Patient;
  
  RETURN total_pacientes;
END;
/
SELECT obtener_cantidad_pacientes() AS cantidad_pacientes FROM DUAL;
/

CREATE OR REPLACE FUNCTION obtener_cantidad_examenes RETURN NUMBER AS
  total_examenes NUMBER;
BEGIN
  SELECT COUNT(*) INTO total_examenes
  FROM Medical_Exam;
  
  RETURN total_examenes;
END;
/
SELECT obtener_cantidad_examenes() AS cantidad_examenes FROM DUAL;
/

CREATE OR REPLACE FUNCTION obtener_cantidad_voluntarios RETURN NUMBER AS
  total_voluntarios NUMBER;
BEGIN
  SELECT COUNT(*) INTO total_voluntarios
  FROM Volunteer;
  
  RETURN total_voluntarios;
END;
/
SELECT obtener_cantidad_voluntarios() AS cantidad_voluntarios FROM DUAL;
/

CREATE OR REPLACE FUNCTION obtener_cantidad_proveedores RETURN NUMBER AS
  total_proveedores NUMBER;
BEGIN
  SELECT COUNT(*) INTO total_proveedores
  FROM Supplier;
  
  RETURN total_proveedores;
END;
/
SELECT obtener_cantidad_proveedores() AS cantidad_proveedores FROM DUAL;
/

CREATE OR REPLACE FUNCTION obtener_cantidad_donaciones_monetarias RETURN NUMBER AS
  total_donaciones_monetarias NUMBER;
BEGIN
  SELECT COUNT(*) INTO total_donaciones_monetarias
  FROM MonetaryDonation;
  
  RETURN total_donaciones_monetarias;
END;
/
SELECT obtener_cantidad_donaciones_monetarias() AS cantidad_donaciones_monetarias FROM DUAL;
/

CREATE OR REPLACE FUNCTION obtener_monto_donaciones_monetarias RETURN DECIMAL AS
  total_donaciones_monetarias DECIMAL(10, 2);
BEGIN
  SELECT SUM(amount) INTO total_donaciones_monetarias
  FROM MonetaryDonation;
  
  RETURN total_donaciones_monetarias;
END;
/
SELECT obtener_monto_donaciones_monetarias() AS monto_donaciones_monetarias FROM DUAL;
/

CREATE OR REPLACE FUNCTION obtener_cantidad_donaciones_materiales RETURN NUMBER AS
  total_donaciones_materiales NUMBER;
BEGIN
  SELECT COUNT(*) INTO total_donaciones_materiales
  FROM MaterialDonation;
  
  RETURN total_donaciones_materiales;
END;
/
SELECT obtener_cantidad_donaciones_materiales() AS cantidad_donaciones_materiales FROM DUAL;
/

/*
PROCEDIMIENTOS
*/

CREATE OR REPLACE PROCEDURE obtener_cantidad_empleados_por_area AS
BEGIN
  FOR rec IN (SELECT a.nameArea, COUNT(e.idEmployee) AS total_empleados
              FROM Area a
              INNER JOIN Employee e ON a.idArea = e.idArea
              GROUP BY a.nameArea)
  LOOP
    DBMS_OUTPUT.PUT_LINE('Área: ' || rec.nameArea || ', Cantidad de empleados: ' || rec.total_empleados);
  END LOOP;
END;
/
EXECUTE obtener_cantidad_empleados_por_area;
/

CREATE OR REPLACE PROCEDURE display_patient_history(p_idPatient IN NUMBER)
IS
   v_patient Patient%ROWTYPE;
   v_attorney Attorney%ROWTYPE;
   v_clinic_history Clinic_History%ROWTYPE;
BEGIN
   SELECT *
   INTO v_patient
   FROM Patient
   WHERE idPatient = p_idPatient;
   
   SELECT *
   INTO v_attorney
   FROM Attorney
   WHERE idAttorney = v_patient.idAttorney;
   
   SELECT *
   INTO v_clinic_history
   FROM Clinic_History
   WHERE idClinic_History = v_patient.idClinic_History;
   
   DBMS_OUTPUT.PUT_LINE('Patient ID: ' || v_patient.idPatient);
   DBMS_OUTPUT.PUT_LINE('Attorney: ' || v_attorney.namesAttorney || ' ' || v_attorney.surnamesAttorney);
   DBMS_OUTPUT.PUT_LINE('Clinic History Updated: ' || v_clinic_history.updatedClinic_History);
   
EXCEPTION
   WHEN NO_DATA_FOUND THEN
      DBMS_OUTPUT.PUT_LINE('Patient not found.');
END;
/
EXECUTE display_patient_history(1);
/

CREATE OR REPLACE PROCEDURE display_medical_exams(p_idPatient IN NUMBER)
IS
BEGIN
   FOR exam IN (SELECT * FROM Medical_Exam WHERE idPatient = p_idPatient)
   LOOP
      DBMS_OUTPUT.PUT_LINE('Exam ID: ' || exam.idMedical_Exam || ', Type: ' || exam.typeExam || ', Date: ' || exam.dateExam);
   END LOOP;
END;
/
EXECUTE display_medical_exams(1);
/

CREATE OR REPLACE PROCEDURE display_employees_in_area(p_idArea IN NUMBER)
IS
BEGIN
   FOR employee IN (SELECT * FROM Employee WHERE idArea = p_idArea)
   LOOP
      DBMS_OUTPUT.PUT_LINE('Employee ID: ' || employee.idEmployee || ', Surnames: ' || employee.surnamesEmployee || ', Position: ' || employee.positionEmployee);
   END LOOP;
END;
/
EXECUTE display_employees_in_area(1);
