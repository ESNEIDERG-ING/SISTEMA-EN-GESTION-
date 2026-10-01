# API - Sistema en Gestión

## Descripción

La API del proyecto Sistema en Gestión permitirá la comunicación entre la aplicación y los servicios encargados de procesar y administrar la información del sistema.

## Objetivo

Proporcionar una estructura organizada para que la aplicación pueda realizar operaciones sobre los recursos definidos en el proyecto.

## Convenciones

Las solicitudes utilizarán métodos HTTP de acuerdo con la operación que se desea realizar:

| Método | Operación |
|---|---|
| GET | Consultar información |
| POST | Crear información |
| PUT | Actualizar información |
| DELETE | Eliminar información |

## Recursos

Los recursos de la API serán definidos de acuerdo con las funcionalidades establecidas en el backlog del proyecto.

Ejemplos de recursos:

```text
/api/usuarios
/api/productos
/api/roles