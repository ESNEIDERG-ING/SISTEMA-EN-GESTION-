HU-01: Registro de Agricultores 
Historia de Usuario: 
Como Agricultor, quiero registrarme en la plataforma para ofrecer mis productos agrícolas. 
Priorización MoSCoW: Must Have 
Story Points: 5 
Escenario BDD: 
● Given: El usuario ingresa al módulo de registro. 
● When: Envía sus datos personales, ubicación y número de identificación válidos. 
● Then: El sistema registra al agricultor correctamente y confirma la creación de la 
cuenta.


HU-02: Publicación de Productos 
Historia de Usuario: 
Como agricultor, quiero publicar mis cosechas para que sean visibles a los comerciantes 
urbanos. 
Priorización MoSCoW: Must Have 
Story Points: 8 
Escenario BDD: 
● Given: Un agricultor se encuentra autenticado en la plataforma. 
● When: Registra un producto indicando tipo, cantidad, precio y fecha de cosecha. 
● Then: El sistema valida la información y publica el producto en el catálogo. 


HU-03: Precios Regionales 
Historia de Usuario: 
Como Usuario, quiero ver los precios promedio del Valle del Cauca para negociar mejor mis 
cosechas o compras. 
Story Points: 5 
Escenario BDD: 
● Given: Existen transacciones registradas de un determinado producto. 
● When: El usuario consulta los precios regionales. 
● Then: El sistema calcula y muestra el precio promedio correspondiente en pesos 
colombianos. 


HU-04: Categorías y Municipios 
Como Comerciante, quiero filtrar el catálogo por municipio de 
origen y categoría de producto para encontrar ofertas 
específicas en el Valle del Cauca. 
Story Points: 3 
Escenario BDD: 
● Given: Existen productos registrados en diferentes municipios y categorías. 
● When: El comerciante selecciona un municipio y una categoría. 
● Then: El sistema muestra únicamente los productos que cumplen con los filtros 
seleccionados. 


HU-05: Contacto Directo y Gestión de Compra 
Como Comerciante, quiero enviar un mensaje de intención de compra al agricultor para 
iniciar una negociación directa sobre un lote. 
Story Points: 5 
Escenario BDD: 
● Given: Un comerciante autenticado está consultando un producto publicado. 
● When: Envía una intención de compra indicando la cantidad y un mensaje. 
● Then: El sistema registra la solicitud y notifica al agricultor. 

AQUÍ MIRAMOS LOS PEDIDOS Y STOCK 

HU-06: Gestión del Carrito de Compras 
Si queremos agregar productos de distintas fincas a un carrito de compras para consolidar 
un solo pedido agrícola. 
Story Points: 8 
Escenario BDD: 
● Given: Un comerciante autenticado consulta productos disponibles. 
● When: Agrega productos y cantidades al carrito. 
● Then: El sistema verifica el stock y actualiza el carrito con el subtotal 
correspondiente. 


HU-07: Número de Orden de Compra 
Vamos a añadir el carrito para generar una orden de compra formal para formalizar la 
transacción sin intermediarios. 
Story Points: 8 
Escenario BDD: 
● Given: El comerciante tiene un carrito con productos disponibles. 
● When: Confirma el carrito y los datos de entrega. 
● Then: El sistema genera una orden de compra y reserva temporalmente las 
cantidades solicitadas. 


HU-08: Confirmación y Alistamiento 
Marcar una orden de compra como alistada para indicar que la cosecha está recolectada y 
empacada. 
Story Points: 3 
Escenario BDD: 
● Given: Existe una orden en estado pendiente. 
● When: El agricultor confirma que los productos fueron recolectados y empacados. 
● Then: El sistema cambia el estado de la orden a "Alistado" y notifica al comprador. 


HU-09: Programación Ruta de Despacho 
Quiero programar la fecha y el vehículo de transporte de la ruta de despacho para coordinar 
la entrega eficiente del pedido. 
Story Points: 5 
Escenario BDD: 
● Given: Una orden se encuentra en estado "Alistado". 
● When: El agricultor registra el vehículo, conductor y fecha estimada de llegada. 
● Then: El sistema registra la información logística y cambia el estado del pedido a "En 
Tránsito". 


HU-10: Trazabilidad del Pedido 
Quiero consultar la trazabilidad y ubicación de mi despacho para preparar la recepción en 
mi punto de venta. 
Story Points: 5 
Escenario BDD: 
● Given: Existe un pedido en tránsito con información de despacho registrada. 
● When: El comerciante consulta el seguimiento del pedido. 
● Then: El sistema muestra el estado actual, recorrido, fechas e información del 
transporte. 


HU-11: Recepción y Calificación 
Confirmación en la recepción del pedido y calificar la calidad del producto recibido para 
alimentar la reputación del agricultor en la red. 
Story Points: 3 
Escenario BDD: 
● Given: El pedido se encuentra en proceso de entrega. 
● When: El comerciante confirma la recepción y registra una calificación. 
● Then: El sistema marca el pedido como completado y registra la valoración 
realizada. 


HU-12: Registro y Gestión de las Fincas 
yo quiero registrar mis fincas especificando municipio, vereda y hectáreas para respaldar el 
origen de las cosechas. 
Story Points: 5 
Escenario BDD: 
● Given: El agricultor está autenticado en la plataforma. 
● When: Registra una finca con su información de ubicación y extensión. 
● Then: El sistema almacena la información y la vincula con el perfil del agricultor.


HU-13: Cancelación de Pedidos 
Cancelar una orden si ocurre una pérdida imprevista de cosechas para evitar compromisos 
logísticos incompletos. 
Story Points: 3 
Escenario BDD: 
● Given: Existe una orden en estado "Pendiente". 
● When: El agricultor informa que no puede cumplir con el pedido debido a una 
pérdida de cosecha. 
● Then: El sistema cancela la orden, libera el stock reservado y notifica al comprador. 


HU-14: Reporte de Ventas e Histórico 
Quiero generar un consolidado de mis ventas acumuladas por mes para analizar la 
rentabilidad de mi producción agrícola. 
Story Points: 8 
Escenario BDD: 
● Given: El agricultor tiene transacciones completadas registradas. 
● When: Solicita un reporte de ventas para un período determinado. 
● Then: El sistema genera un consolidado con las cantidades vendidas y las 
ganancias obtenidas. 


HU-15: Auditoría y gestión del Inventario 
Como Administrador del Sistema, quiero auditar los cambios de disponibilidad en el stock de 
los lotes para garantizar la integridad de la oferta pública. 
Story Points: 5 
Escenario BDD: 
● Given: Se realiza una modificación en la cantidad disponible de un lote. 
● When: El sistema procesa la actualización del inventario. 
● Then: Se registra automáticamente la modificación, incluyendo usuario, producto, 
cantidad modificada y fecha.
