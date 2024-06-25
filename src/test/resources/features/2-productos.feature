#language: es
  @Suite @ComprarProductos
  Característica: CP02 - Validar carrito de compras

    Antecedentes: Realizar 3 validaciones en el carrito de compras

      Dado el usuario navega al sitio web
      Cuando ingresa credenciales validas

      @ListarProductos
      Escenario: 1 - Listar los productos en el carrito de compras
        Y agrega productos al carrito de compras
        Y da click en el icono del carrito
        Entonces el sistema deberia listar los productos agregados en el carrito de compras

      @CompraCarritoVacio
      Escenario: 2 - Cuando la cesta este vacia de productos, no procesar la compra
          Y da click en el icono del carrito
          Entonces el sistema deberia mostrar la cesta sin productos

      @CompraExitosa
      Escenario: 3 - Cuando se quiera procesar la compra, se mostrara un mensaje de compra exitosa
        Y agrega productos al carrito de compras
        Y da click en el icono del carrito
        Cuando completa todo el registro de la orden
        Entonces el sistema deberia procesar la compra
