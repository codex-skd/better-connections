# Graph Report - G:\Proyectos\Mods_Minecraft\better_connections\26.2  (2026-07-28)

## Corpus Check
- cluster-only mode — file stats not available

## Summary
- 40 nodes · 50 edges · 9 communities (7 shown, 2 thin omitted)
- Extraction: 100% EXTRACTED · 0% INFERRED · 0% AMBIGUOUS
- Token cost: 0 input · 0 output

## Community Hubs (Navigation)
- FenceBlockMixin.java
- WallBlockMixin.java
- PaneBlockMixin.java
- BetterConnections
- gradlew
- BetterConnectionsClient
- Config.java

## God Nodes (most connected - your core abstractions)
1. `BetterConnections` - 4 edges
2. `BetterConnectionsClient` - 3 edges
3. `FenceBlockMixin` - 3 edges
4. `PaneBlockMixin` - 3 edges
5. `WallBlockMixin` - 3 edges
6. `Config` - 1 edges

## Surprising Connections (you probably didn't know these)
- None detected - all connections are within the same source files.

## Import Cycles
- None detected.

## Communities (9 total, 2 thin omitted)

### Community 0 - "FenceBlockMixin.java"
Cohesion: 0.43
Nodes (6): FenceBlockMixin, BlockState, CallbackInfoReturnable, Direction, Inject, Mixin

### Community 1 - "WallBlockMixin.java"
Cohesion: 0.43
Nodes (6): BlockState, CallbackInfoReturnable, Direction, Inject, Mixin, WallBlockMixin

### Community 2 - "PaneBlockMixin.java"
Cohesion: 0.48
Nodes (5): BlockState, CallbackInfoReturnable, Inject, Mixin, PaneBlockMixin

### Community 3 - "BetterConnections"
Cohesion: 0.60
Nodes (3): Logger, BetterConnections, Mod

### Community 4 - "gradlew"
Cohesion: 0.83
Nodes (3): gradlew script, die(), warn()

## Knowledge Gaps
- **1 isolated node(s):** `Config`
  These have ≤1 connection - possible missing edges or undocumented components.
- **2 thin communities (<3 nodes) omitted from report** — run `graphify query` to explore isolated nodes.

## Suggested Questions
_Questions this graph is uniquely positioned to answer:_

- **What connects `Config` to the rest of the system?**
  _1 weakly-connected nodes found - possible documentation gaps or missing edges._