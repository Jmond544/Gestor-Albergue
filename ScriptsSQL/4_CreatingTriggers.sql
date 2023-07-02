-- ignorar, no funciona nada de aquí :c
/*
1. Trigger "create_user_trigger":

   Este trigger se dispara después de insertar una fila en la tabla `Employee`. Su propósito es crear un usuario en la base de datos utilizando los valores de `userName` y `password` de la fila recién insertada. A continuación, otorga ciertos privilegios al nuevo usuario. La secuencia de acciones es la siguiente:

   - Obtiene los valores de `userName` y `password` de la fila insertada.
   - Utiliza una sentencia `SELECT` para obtener el nombre del rol correspondiente de la tabla `Area` utilizando el valor de `idArea`.
   - Crea un nuevo usuario en la base de datos utilizando el `userName` y `password` obtenidos.
   - Otorga el privilegio de conexión (`CREATE SESSION`) al nuevo usuario.
   - Otorga los permisos de `SELECT`, `INSERT`, `UPDATE` y `DELETE` en la tabla `Employee` al nuevo usuario.
   - Otorga el rol obtenido al nuevo usuario utilizando la sentencia `GRANT`.

   En resumen, este trigger crea un nuevo usuario con el `userName` y `password` de la fila insertada en la tabla `Employee` y le otorga ciertos privilegios y un rol específico.
*/

DROP TRIGGER create_user_trigger;

CREATE OR REPLACE TRIGGER create_user_trigger
AFTER INSERT ON Employee
FOR EACH ROW
BEGIN
    EXECUTE IMMEDIATE 'CREATE USER ' || :new.userName || ' IDENTIFIED BY ' || :new.password;
    
    EXECUTE IMMEDIATE 'GRANT ' || (SELECT nameArea FROM Area WHERE idArea = :new.idArea) || ' TO ' || :new.userName;
END;
/





/*
2. Trigger "delete_user_trigger":

   Este trigger se dispara antes de eliminar una fila de la tabla `Employee`. Su objetivo es eliminar el usuario asociado a esa fila utilizando el nombre de usuario (`userName`) que se encuentra en la fila que se va a eliminar. La secuencia de acciones es la siguiente:

   - Obtiene el nombre de usuario (`userName`) de la fila que se va a eliminar.
   - Utiliza una sentencia `EXECUTE IMMEDIATE` para ejecutar una instrucción SQL dinámica que elimina el usuario correspondiente utilizando el nombre de usuario capturado.

   En resumen, este trigger elimina el usuario asociado a la fila de la tabla `Employee` que se está eliminando.
*/

CREATE OR REPLACE TRIGGER delete_user_trigger
BEFORE DELETE ON Employee
FOR EACH ROW
DECLARE
    v_username VARCHAR2(25);
BEGIN
    -- Obtener el nombre de usuario del registro que se está eliminando
    v_username := :OLD.userName;

    -- Eliminar el usuario correspondiente
    EXECUTE IMMEDIATE 'DROP USER ' || v_username;
EXCEPTION
    WHEN OTHERS THEN
        NULL; -- Opcional: manejar o registrar cualquier error que ocurra durante la eliminación del usuario
END;
/
