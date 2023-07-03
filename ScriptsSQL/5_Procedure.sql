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

CREATE OR REPLACE FUNCTION obtener_cantidad_examenes RETURN NUMBER AS
  total_examenes NUMBER;
BEGIN
  SELECT COUNT(*) INTO total_examenes
  FROM Medical_Exam;
  
  RETURN total_examenes;
END;
/

CREATE OR REPLACE FUNCTION obtener_cantidad_voluntarios RETURN NUMBER AS
  total_voluntarios NUMBER;
BEGIN
  SELECT COUNT(*) INTO total_voluntarios
  FROM Volunteer;
  
  RETURN total_voluntarios;
END;
/

CREATE OR REPLACE FUNCTION obtener_cantidad_proveedores RETURN NUMBER AS
  total_proveedores NUMBER;
BEGIN
  SELECT COUNT(*) INTO total_proveedores
  FROM Supplier;
  
  RETURN total_proveedores;
END;
/

CREATE OR REPLACE FUNCTION obtener_cantidad_donaciones_monetarias RETURN NUMBER AS
  total_donaciones_monetarias NUMBER;
BEGIN
  SELECT COUNT(*) INTO total_donaciones_monetarias
  FROM MonetaryDonation;
  
  RETURN total_donaciones_monetarias;
END;
/

CREATE OR REPLACE FUNCTION obtener_monto_donaciones_monetarias RETURN DECIMAL AS
  total_donaciones_monetarias DECIMAL(10, 2);
BEGIN
  SELECT SUM(amount) INTO total_donaciones_monetarias
  FROM MonetaryDonation;
  
  RETURN total_donaciones_monetarias;
END;
/

CREATE OR REPLACE FUNCTION obtener_cantidad_donaciones_materiales RETURN NUMBER AS
  total_donaciones_materiales NUMBER;
BEGIN
  SELECT COUNT(*) INTO total_donaciones_materiales
  FROM MaterialDonation;
  
  RETURN total_donaciones_materiales;
END;
/


/*
PROCEDIMIENTOS
*/

CREATE OR REPLACE PROCEDURE obtener_cantidad_empleados_por_area AS
BEGIN
  FOR rec IN (SELECT a.nameArea, COUNT(e.idEmployee) AS total_empleados
              FROM Area a
              LEFT JOIN Employee e ON a.idArea = e.idArea
              GROUP BY a.nameArea)
  LOOP
    DBMS_OUTPUT.PUT_LINE('Área: ' || rec.nameArea || ', Cantidad de empleados: ' || rec.total_empleados);
  END LOOP;
END;
/
