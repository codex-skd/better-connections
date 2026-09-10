# Changelog — Better Connections (NeoForge)

## [0.0.0-beta.2] - 2026-09-10

Sin cambios funcionales: el comportamiento de conexión es idéntico al de `0.0.0-beta.1`.

### Change

- **Licencia**: el mod pasa de `All Rights Reserved` a **AGPL-3.0-only**, para cumplir con la
  licencia del original BetterWalls (declarada AGPL-3.0 en sus páginas de Modrinth y CurseForge).
  Añadidos `LICENSE` (texto completo AGPL-3.0) y `NOTICE` (atribución a Lemonnik6484 / JX_Snack,
  origen del port y discrepancia conocida con el fichero `LICENSE` de su GitHub). El JAR ahora
  incluye `LICENSE` y `NOTICE` en `META-INF/`; el metadato del mod declara `license = "AGPL-3.0-only"`.
- **`project_description.md`**: reescrita con el formato visual estándar de los mods SKD (cabecera
  con emoji + badges de shields.io, Overview a dos columnas con el logo de Codex, secciones
  Features / Mod Structure / Requirements / Available Versions / How to Use / Credits &amp; License,
  pie con el logo). Añadida la tabla *Available Versions* con las tres ramas (26.1.2, 26.2, 1.21.1).
- **`docs/curseforge/versions/`**: eliminadas las release notes de la línea 26.2 (`1.0.0`–`1.1.0`),
  que no pertenecen a la rama 1.21.1.
- Pendiente manual: alinear el campo de licencia del proyecto en la web de CurseForge a AGPLv3.

### JAR

- `better_connections-1.21.1-neoforge-21.1.249-0.0.0-beta.2.jar`


## [0.0.0-beta.1] - 2026-09-10

### Feature

- **Port a Minecraft 1.21.1 / NeoForge 21.1.249**: nueva rama `minecraft/1.21.1/neoforge-21.1.249/production`, partiendo de la 26.2 (`v1.1.0`).
- Misma funcionalidad que las versiones 26.1.2 / 26.2: las vallas, los muros y los barrotes de hierro se conectan entre sí y con carteles de pared / puertas de valla.
- Mixins sin cambios de lógica: `FenceBlockMixin`, `PaneBlockMixin`, `WallBlockMixin`.

### Change

- **Andamiaje de build para 1.21.1**: `gradle.properties` (`minecraft_version=1.21.1`, `neo_version=21.1.249`, `loader_version_range=[4,)`, mappings de Parchment `1.21.1 / 2024.11.17`); `build.gradle` toolchain de Java 21 y bloque `parchment`.
- **Plantilla `neoforge.mods.toml`**: añadidas las claves `modLoader="javafml"` y `loaderVersion` que FML 1.21.1 exige (la plantilla de 26.2 las omitía).
- **`better_connections.mixins.json`**: sin clave `refmap` — NeoForge 1.21.1 aplica los mixins con nombres oficiales sin refmap.
- **Documentación**: `docs/WORKFLOW_BETTER_CONNECTIONS_26-2.md` → `docs/WORKFLOW_BETTER_CONNECTIONS_1-21-1.md`; README y `project_description` con los nuevos requisitos.
- **Nombre de JAR**: `better_connections-1.21.1-neoforge-21.1.249-0.0.0-beta.1.jar`.

### Verificación

- `./gradlew.bat build` correcto.
- `./gradlew.bat runServer` arranca hasta `Done!` sin errores; log confirma los 3 mixins aplicados sobre `FenceBlock`, `IronBarsBlock` y `WallBlock`. Sin verificación visual in-game.

## [1.1.0] - 2026-08-19

### Change

- **Actualización de NeoForge**: actualizado de 26.2.0.45-beta a 26.2.0.57.
- **Nombre de JAR con versión del cargador**: el artefacto ahora se compila como `better_connections-26.2-neoforge-26.2.0.57-1.1.0.jar`.
- **Documentación del workflow**: actualizada `docs/WORKFLOW_BETTER_CONNECTIONS_26-2.md` para reflejar la nueva rama de trabajo.

## [1.0.3] - 2026-08-18

### Change

- **Actualización de NeoForge**: actualizado de 26.2.0.37-beta a 26.2.0.45-beta.
- **Nombre de JAR con versión del cargador**: el artefacto ahora se compila como `better_connections-26.2-neoforge-26.2.0.45-beta-1.0.3.jar`.
- **Documentación del workflow**: actualizada `docs/WORKFLOW_BETTER_CONNECTIONS_26-2.md` para reflejar la nueva rama de trabajo.

## [1.0.2] - 2026-08-12

### Change

- **Nombre de JAR con versión del cargador**: el artefacto ahora se compila como `better_connections-26.2-neoforge-26.2.0.37-beta-1.0.2.jar` (se añade la versión de cargador/NeoForge al nombre del archivo). Empaquetado y documentación; sin cambios de funcionalidad.

## 1.0.0 — 2026-07-27

- Primer release estable para Minecraft 26.2 / NeoForge 26.2.0.32-beta
- Fences, Iron Bars y Walls se conectan entre sí
- Mixins: `FenceBlockMixin`, `PaneBlockMixin`, `WallBlockMixin`

## 0.0.0-beta.1 — 2026-07-27

- Port a Minecraft 26.2 / NeoForge 26.2.0.32-beta
- Misma funcionalidad que la versión 26.1.2
- Fences, Iron Bars y Walls se conectan entre sí
- Mixins: `FenceBlockMixin`, `PaneBlockMixin`, `WallBlockMixin`

## 1.0.0 — 2026-07-21

- Primer release estable
- Fences, Iron Bars y Walls se conectan entre sí
- Compatible con NeoForge 26.1.2.78+

## 0.0.0-beta.2 — 2026-07-21

- Soporte para NeoForge 26.1.2.78 en adelante

## 0.0.0-beta.1 — 2026-07-21

- Port desde BetterWalls (Fabric) a NeoForge 26.1.2
- Fences, Iron Bars y Walls se conectan entre sí
- Mixins: `FenceBlockMixin`, `PaneBlockMixin`, `WallBlockMixin`---

## [1.0.1] - 2026-08-05

### Change

- **Recompilado contra NeoForge `26.2.0.37-beta`**: bump de `neo_version` en `gradle.properties` (`26.2.0.32-beta` -> `26.2.0.37-beta`). Verificado con `runServer` (arranque sin errores).

## [angelog — Better Connections (NeoForge)

## 1.0.0 — 2026-07-27

- Primer release estable para Minecraft 26.2 / NeoForge 26.2.0.32-beta
- Fences, Iron Bars y Walls se conectan entre sí
- Mixins: `FenceBlockMixin`, `PaneBlockMixin`, `WallBlockMixin`

## 0.0.0-beta.1 — 2026-07-27

- Port a Minecraft 26.2 / NeoForge 26.2.0.32-beta
- Misma funcionalidad que la versión 26.1.2
- Fences, Iron Bars y Walls se conectan entre sí
- Mixins: `FenceBlockMixin`, `PaneBlockMixin`, `WallBlockMixin`

## 1.0.0 — 2026-07-21

- Primer release estable
- Fences, Iron Bars y Walls se conectan entre sí
- Compatible con NeoForge 26.1.2.78+

## 0.0.0-beta.2 — 2026-07-21

- Soporte para NeoForge 26.1.2.78 en adelante

## 0.0.0-beta.1 — 2026-07-21

- Port desde BetterWalls (Fabric) a NeoForge 26.1.2
- Fences, Iron Bars y Walls se conectan entre sí
- Mixins: `FenceBlockMixin`, `PaneBlockMixin`, `WallBlockMixin`
