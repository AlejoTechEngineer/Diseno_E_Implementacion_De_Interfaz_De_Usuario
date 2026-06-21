<div align="center">

# Diseño e Implementación de Interfaz de Usuario — PedidoMedicamentos

![HCI](https://img.shields.io/badge/HCI-UI%20Design-6A0DAD?style=for-the-badge)
![UX](https://img.shields.io/badge/UX-Wireframing-FF6B6B?style=for-the-badge)

> Diseño e implementación de interfaz gráfica de usuario para un sistema de pedido de medicamentos.

## Descripción

</div>

---

Proyecto de diseño e implementación de GUI para el módulo **PedidoMedicamentos** de un sistema de salud. Se aplican principios de **HCI (Human-Computer Interaction)**: análisis de usuarios, definición de flujos de interacción, diseño de estructura de ventanas, prototipado y desarrollo de la interfaz funcional.

## Contenido del repositorio

| Archivo/Carpeta | Descripción |
|---|---|
| `PedidoMedicamentos/` | Código fuente de la aplicación |
| `Diagrama De Estructura De La Ventana*.docx/pdf` | Diagrama estructural de la UI |
| `Diseño E Implementación*.pdf` | Informe completo del diseño |
| `Desarrollo De Proyecto*.pdf` | Documentación del proyecto |

## Principios de diseño aplicados

- Análisis de tareas y definición de flujos de usuario
- Diseño de estructura de ventanas (Window Structure Diagram)
- Consistencia visual y uso de patrones de interfaz estándar
- Retroalimentación visual al usuario en cada operación

## Contexto académico

**Asignatura:** Interacción Persona-Ordenador · **Institución:** Ingeniería Informática
**Autor:** Alejandro De Mendoza — Ingeniero Informático · Especialista Ingeniería de Software

---

## Arquitectura

```mermaid
flowchart TD
    A[Analisis de usuarios y tareas] --> B[Definicion de flujos de interaccion]
    B --> C[Diagrama de estructura de ventana - DOCX/PDF]
    C --> D[Prototipo de UI - PedidoMedicamentos/]
    D --> E{Operacion del usuario}
    E --> F[Seleccionar medicamento]
    E --> G[Ingresar cantidad]
    E --> H[Confirmar pedido]
    F & G & H --> I[Retroalimentacion visual al usuario]
    I --> J{Pedido valido?}
    J -- No --> E
    J -- Si --> K[Pedido registrado y confirmado]
```

## Autor

**Alejandro De Mendoza**  
Ingeniero Informático · Especialista en IA · Especialista en Ingeniería de Software · Máster en Arquitectura de Software

[![GitHub](https://img.shields.io/badge/GitHub-AlejoTechEngineer-181717?style=for-the-badge&logo=github)](https://github.com/AlejoTechEngineer)
