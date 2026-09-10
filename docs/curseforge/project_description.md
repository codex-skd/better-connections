<h1 align="center">&#128279; Better Connections</h1>

<p align="center"><strong>Fences, walls and iron bars connect to each other &mdash; and to every modded block that uses the vanilla tags.</strong></p>

<p align="center">
<img src="https://img.shields.io/badge/loader-NeoForge-orange?style=plastic&logo=curseforge" alt="NeoForge">
<img src="https://img.shields.io/badge/minecraft-26.1.2%20%7C%2026.2%20%7C%201.21.1-blue?style=plastic" alt="Minecraft 26.1.2, 26.2 and 1.21.1">
<img src="https://img.shields.io/badge/side-client%20%2B%20server-brightgreen?style=plastic" alt="Client and Server">
<img src="https://img.shields.io/badge/license-AGPL--3.0-lightgrey?style=plastic" alt="AGPL-3.0">
</p>

<br>

---

<br>

<h2>&#10024; Overview</h2>

<table>
<tr>
<td width="65%">
<p>Better Connections closes the ugly gap left where a fence meets a wall, or an iron-bar window meets a fence gate. Fences, walls and iron bars now join each other &mdash; and wall signs &mdash; into one continuous run. The connection rules are driven by block tags (<code>minecraft:fences</code>, <code>minecraft:walls</code>, <code>minecraft:fence_gates</code>, <code>minecraft:wall_signs</code>) plus the vanilla iron-bars block type, so <strong>modded</strong> fences, walls, gates and bars are picked up automatically when they are tagged the way vanilla expects &mdash; no per-mod patches, nothing to configure.</p>

<p>A NeoForge port of <a href="https://modrinth.com/mod/betterwalls"><strong>BetterWalls</strong></a> by <em>Lemonnik6484</em> and <em>JX_Snack</em> (originally a Fabric mod), reworked and extended with the modded-block and wall-sign compatibility by <strong>Stalking Dragons</strong>. Distributed under the same license (AGPL-3.0). The change is purely visual &mdash; hitboxes, collision, redstone and mob pathing are untouched &mdash; and it is safe to add to or remove from an existing world at any time. Not affiliated with or endorsed by the original authors.</p>
</td>
<td width="35%" align="center">
<a href="https://codex.skdragons.com/" target="_blank"><img src="https://node-files.skdragons.com/uploads/MINECRAFT/Codex/logo_codex_stalking_dragons.png" alt="Codex Stalking Dragons" width="160"></a>
</td>
</tr>
</table>

<br>

<h2>&#127919; Features</h2>

<h3>&#129717; Fences</h3>
<p>Fences connect to walls, other fences, iron bars and wall signs. No more floating fence post sitting a pixel away from the wall it should be joining.</p>

<h3>&#9939;&#65039; Iron Bars</h3>
<p>Iron bars (and blocks that behave like them) connect to fences, fence gates and wall signs &mdash; ideal for windows, railings and mixed-material barriers.</p>

<h3>&#129521; Walls</h3>
<p>Walls connect to fences and wall signs, on top of the wall / iron-bar / fence-gate connections they already make in vanilla. Hybrid fence-and-wall runs finally touch.</p>

<h3>&#129513; Modded blocks</h3>
<p>Any fence, wall, fence gate or iron-bars-style block from another mod is included automatically when it uses the standard block tags. The compatibility rule is added once, on the vanilla connection logic, instead of listing blocks one by one.</p>

<h3>&#9889; Zero cost, no dependencies</h3>
<p>Three small mixins on the vanilla connection checks. No config file, no commands, no runtime overhead, nothing else required.</p>

<br>

<h2>&#129521; Mod Structure</h2>

<table>
<tr><th align="left">Area</th><th align="left">What it provides</th></tr>
<tr><td><code>FenceBlockMixin</code></td><td>Extends <code>FenceBlock#connectsTo</code> so fences also connect to walls, iron bars and wall signs.</td></tr>
<tr><td><code>PaneBlockMixin</code></td><td>Extends <code>IronBarsBlock#attachsTo</code> so iron bars also connect to fences, fence gates and wall signs.</td></tr>
<tr><td><code>WallBlockMixin</code></td><td>Extends <code>WallBlock#connectsTo</code> so walls also connect to fences and wall signs.</td></tr>
<tr><td><code>BetterConnections</code></td><td>The mod entrypoint. No registries, no events, no config.</td></tr>
</table>

<br>

<h2>&#128203; Requirements</h2>

<table>
<tr><td><strong>Minecraft / NeoForge / Java</strong></td><td>see <em>Available Versions</em> below</td></tr>
<tr><td><strong>Dependencies</strong></td><td>None</td></tr>
<tr><td><strong>Side</strong></td><td>Client and Server (required on both)</td></tr>
</table>

<br>

<h2>&#128230; Available Versions</h2>

<table>
<tr><th align="left">Minecraft</th><th align="left">NeoForge</th><th align="left">Java</th><th align="left">Latest build</th><th align="left">Status</th></tr>
<tr><td>26.1.2</td><td>26.1.2.84+</td><td>25</td><td><code>1.0.1</code></td><td>Stable</td></tr>
<tr><td>26.2</td><td>26.2.0.57+</td><td>25</td><td><code>1.1.0</code></td><td>Stable</td></tr>
<tr><td>1.21.1</td><td>21.1.249+</td><td>21</td><td><code>0.0.0-beta.2</code></td><td>Beta</td></tr>
</table>

<p><em>All versions share this CurseForge project. Pick the file that matches your Minecraft version.</em></p>

<br>

<h2>&#127918; How to Use</h2>

<ol>
<li>Install NeoForge for your Minecraft version (see the table above).</li>
<li>Place Better Connections in the <code>mods</code> folder &mdash; on the server <strong>and</strong> on every client in multiplayer.</li>
<li>Launch the game. Connections apply immediately; there is nothing to configure.</li>
</ol>

<br>

---

<br>

<h2>&#128591; Credits &amp; License</h2>

<p>Better Connections is a NeoForge port of <a href="https://modrinth.com/mod/betterwalls">BetterWalls</a> by <strong>Lemonnik6484</strong> and <strong>JX_Snack</strong> (Fabric), reworked and extended by <strong>Stalking Dragons</strong>. Not affiliated with or endorsed by the original authors.</p>

<p><strong>License:</strong> <strong>GNU AGPL v3.0</strong> (AGPL-3.0-only), the same license under which BetterWalls is published on Modrinth and CurseForge. Under its copyleft terms this port stays under the AGPL, keeps the original BetterWalls copyright, and its complete corresponding source is published at <a href="https://gitlab.com/stalking-dragons/minecraft/better-connections">gitlab.com/stalking-dragons/minecraft/better-connections</a>. The full licence text ships in the jar (<code>META-INF/LICENSE</code>) and in the repository <code>LICENSE</code> file.</p>

<br>
<br>

<p align="center">
  <a href="https://codex.skdragons.com/" target="_blank">
    <img src="https://node-files.skdragons.com/uploads/MINECRAFT/Codex/logo_codex_stalking_dragons.png" alt="Codex Stalking Dragons" width="200">
  </a>
  <br>
  <a href="https://codex.skdragons.com/">https://codex.skdragons.com/</a>
  <br>
  <em>Codex Stalking Dragons &mdash; Minecraft Modding</em>
</p>
