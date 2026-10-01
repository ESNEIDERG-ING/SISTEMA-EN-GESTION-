# Arquitectura del proyecto Sistema en Gestión

## Descripción

Sistema en Gestión utilizará una arquitectura organizada por componentes y responsabilidades, buscando mantener el código modular, mantenible y fácil de ampliar.

## Capas principales

La estructura del sistema se organizará en diferentes capas:

### Presentación

Es la capa encargada de la interacción con el usuario. Contiene las interfaces, formularios, vistas y componentes necesarios para utilizar el sistema.

### Lógica de negocio

Contiene las reglas y procesos principales del sistema. Esta capa se encarga de procesar las operaciones y aplicar las reglas definidas en los requerimientos.

### Acceso a datos

Se encarga de la comunicación con la base de datos y de las operaciones relacionadas con almacenamiento, consulta, actualización y eliminación de información.

### Base de datos

Almacena de manera estructurada la información utilizada por el sistema.

## Organización

El proyecto debe mantener una separación clara de responsabilidades para evitar que diferentes componentes tengan funciones innecesarias o mezcladas.

La estructura podrá evolucionar conforme se incorporen nuevas funcionalidades.

## Principios

- Separación de responsabilidades.
- Modularidad.
- Reutilización de componentes.
- Código mantenible.
- Bajo acoplamiento.
- Alta cohesión.
- Documentación de componentes importantes.
- Control de versiones mediante Git.

## Flujo general

```text
Usuario
   ↓
Interfaz del sistema
   ↓
Lógica de negocio
   ↓
Acceso a datos
   ↓
Base de datos