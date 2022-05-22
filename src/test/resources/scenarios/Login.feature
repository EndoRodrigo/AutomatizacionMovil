Feature: Inicio de Sesion

Scenario: Verificacion de las credenciales de un usuario

Given se inicia la app bolivar conmigo
When ingrese el correo electronico del usuario y la contrsena
And inicie la sesion
Then Se muestra un sppiner mientras realiza la validacion de los datos
And la app le permira ver el home principal de la app si los datos son correctos