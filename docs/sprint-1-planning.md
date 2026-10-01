# Sprint 1 Planning

## Sprint Goal

Desarrollar y validar la base funcional de Sistema en Gestión mediante Java 17 y Spring Boot, implementando historias de usuario priorizadas y verificando su comportamiento mediante pruebas automatizadas con JUnit 5.

## Duración del Sprint

Sprint 1.

## Capacidad del Sprint

**10 Story Points**

## Historias seleccionadas

| Historia de Usuario | Prioridad | Story Points |
|---|---|---:|
| HU-01 - Registro de Agricultores | Must Have | 5 |
| HU-04 - Categorías y Municipios | Must Have | 3 |
| HU-11 - Recepción y Calificación | Could Have | 2 |
| **Total** | | **10** |

## Descomposición técnica

### HU-01 - Registro de Agricultores

**Objetivo:** implementar el registro de agricultores mediante una API REST.

Tareas técnicas:

- Configurar Java 17.
- Configurar proyecto Spring Boot.
- Crear estructura de paquetes.
- Crear entidad Agricultor.
- Crear repositorio mediante Spring Data JPA.
- Implementar servicio de registro.
- Crear controlador REST.
- Implementar validaciones de datos.
- Crear pruebas automatizadas con JUnit 5.
- Verificar criterios BDD.

### HU-04 - Categorías y Municipios

**Objetivo:** permitir la consulta y filtrado de productos por municipio y categoría.

Tareas técnicas:

- Crear modelos necesarios para productos, municipios y categorías.
- Implementar lógica de filtrado.
- Crear endpoint REST.
- Implementar validaciones.
- Crear pruebas automatizadas con JUnit 5.
- Verificar los criterios BDD.

### HU-11 - Recepción y Calificación

**Objetivo:** permitir registrar la recepción de un pedido y su correspondiente calificación.

Tareas técnicas:

- Crear modelo para la valoración.
- Implementar lógica para registrar la recepción.
- Implementar lógica para registrar la calificación.
- Crear endpoint REST.
- Validar los datos recibidos.
- Crear pruebas automatizadas con JUnit 5.
- Verificar los criterios BDD.

## Relación con ISO/IEC 25010

| Característica | Aplicación en el Sprint |
|---|---|
| Adecuación funcional | Las funcionalidades implementadas deben cumplir los criterios BDD de las historias seleccionadas. |
| Eficiencia de desempeño | Los endpoints deben procesar las solicitudes sin operaciones innecesarias. |
| Compatibilidad | El proyecto utiliza Java 17, Spring Boot y Maven. |
| Usabilidad | Las respuestas de la API deben ser claras y coherentes. |
| Fiabilidad | Se utilizan pruebas automatizadas para verificar el comportamiento esperado. |
| Seguridad | Se validan los datos recibidos antes de procesarlos. |
| Mantenibilidad | Se separan responsabilidades entre entidades, repositorios, servicios y controladores. |
| Portabilidad | La aplicación utiliza Java 17 y Maven Wrapper para facilitar su ejecución en diferentes entornos. |

## Traducción de BDD a pruebas automatizadas

Los escenarios BDD de las historias seleccionadas serán traducidos a pruebas automatizadas utilizando **JUnit 5**.

### HU-01

- **Given:** el usuario ingresa al módulo de registro.
- **When:** envía datos personales, ubicación y número de identificación válidos.
- **Then:** el sistema registra al agricultor y confirma la creación de la cuenta.

La prueba automatizada deberá verificar que los datos válidos permitan crear correctamente un agricultor.

### HU-04

- **Given:** existen productos registrados en diferentes municipios y categorías.
- **When:** el comerciante selecciona un municipio y una categoría.
- **Then:** el sistema muestra únicamente los productos que cumplen los filtros.

La prueba automatizada deberá verificar que el filtrado devuelva únicamente los productos correspondientes.

### HU-11

- **Given:** el pedido se encuentra en proceso de entrega.
- **When:** el comerciante confirma la recepción y registra una calificación.
- **Then:** el sistema marca el pedido como completado y registra la valoración.

La prueba automatizada deberá verificar el cambio de estado y el registro de la calificación.

## Definition of Done

Una historia será considerada terminada cuando:

- El código esté implementado.
- Los criterios BDD estén cumplidos.
- Las pruebas automatizadas hayan sido ejecutadas correctamente.
- No existan errores críticos conocidos.
- El código haya pasado revisión.
- La documentación correspondiente esté actualizada.
- La funcionalidad esté integrada en la rama correspondiente.
- El código pueda ejecutarse correctamente utilizando Java 17.

## Resultado esperado del Sprint

Al finalizar el Sprint 1 se espera contar con una base funcional desarrollada con Java 17 y Spring Boot, con las historias HU-01, HU-04 y HU-11 trabajadas dentro de una capacidad total de **10 Story Points**, junto con pruebas automatizadas en JUnit 5 que permitan verificar los criterios BDD definidos.