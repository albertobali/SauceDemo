#language: es
@Suite @Login
  Característica: CP01 - Validar inicio de sesion

    Antecedentes: Validar el inicio de sesion con credenciales validas e invalidas

      Dado el usuario navega al sitio web

      @LoginCorrecto
      Escenario: 1 - Validar con credenciales correctas
        Cuando ingresa credenciales validas
        Entonces la aplicacion deberia mostrar el modulo principal de productos

      @LoginIncorrecto
      Escenario: 2 - Validar con credenciales incorrectas
        Cuando ingresa credneciales invalidas
        Entonces la aplicacion deberia mostrar un mensaje de error

