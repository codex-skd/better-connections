<h1 align="center">Better Connections</h1>
<p align="center"><em>Fences, walls, and iron bars &mdash; now connected.</em></p>
<br>
<hr>
<br>
<h2>Overview</h2>
<p>
Better Connections is a lightweight, client-and-server NeoForge mod that makes fences, walls, and
iron bars visually connect to each other instead of leaving an ugly gap where two different block
types meet. Build a fence that runs straight into a wall, cap an iron-bar window with a fence
gate, or line a wall with wall signs &mdash; every joint closes up cleanly.
</p>
<p>
Connections are decided by block tags (<code>minecraft:fences</code>, <code>minecraft:walls</code>,
<code>minecraft:fence_gates</code>, <code>minecraft:wall_signs</code>) plus the vanilla iron-bars
block type, so <strong>modded</strong> fences, walls, gates, and bars are picked up automatically
as long as they are tagged the way vanilla expects &mdash; no per-mod patches, no config to touch.
</p>
<p>
The change is purely visual. Hitboxes, collision, redstone, and mob pathing are untouched, there
is no measurable performance cost (three small mixins on the vanilla connection checks), and it is
safe to add to or remove from an existing world at any time.
</p>
<br>
<h2>Features</h2>
<h3>Fences</h3>
<p>
Fences connect to walls, other fences, iron bars, and wall signs. No more floating fence post
sitting a pixel away from the wall it should be joining.
</p>
<h3>Iron Bars</h3>
<p>
Iron bars (and glass panes / modded blocks that behave like them) connect to fences, fence gates,
and wall signs &mdash; ideal for windows, railings, and mixed-material barriers.
</p>
<h3>Walls</h3>
<p>
Walls connect to fences and wall signs, on top of the wall / iron-bar / fence-gate connections
they already make in vanilla. Hybrid fence-and-wall runs finally touch.
</p>
<h3>Modded blocks</h3>
<p>
Any fence, wall, fence gate, or iron-bars-style block from another mod is included automatically
when it uses the standard block tags. Better Connections adds the compatibility rules once, on the
vanilla logic, rather than listing blocks one by one.
</p>
<br>
<h2>Requirements</h2>
<table>
<tr><td><strong>Minecraft</strong></td><td>1.21.1</td></tr>
<tr><td><strong>NeoForge</strong></td><td>21.1.249+</td></tr>
<tr><td><strong>Side</strong></td><td>Client &amp; Server &mdash; install on both (in multiplayer every player needs it)</td></tr>
<tr><td><strong>Dependencies</strong></td><td>None</td></tr>
</table>
<br>
<h2>Installation</h2>
<ol>
<li>Install NeoForge 21.1.249 or newer for Minecraft 1.21.1</li>
<li>Download the JAR file</li>
<li>Place it in your <code>mods</code> folder</li>
<li>Launch the game &mdash; there is nothing to configure</li>
</ol>
<br>
<h2>Attribution &amp; License</h2>
<p>
Better Connections is a NeoForge port of
<a href="https://modrinth.com/mod/betterwalls">BetterWalls</a> by <strong>Lemonnik6484</strong>
and <strong>JX_Snack</strong> (originally a Fabric mod), extended with the modded-block and
wall-sign compatibility described above.
</p>
<p>
Released under the <strong>GNU Affero General Public License v3.0 (AGPL-3.0)</strong>, matching the
upstream project. Full source:
<a href="https://gitlab.com/stalking-dragons/minecraft/better-connections">gitlab.com/stalking-dragons/minecraft/better-connections</a>.
</p>
<br>
<hr>
<br>
<p align="center">
<img src="https://media.forgecdn.net/avatars/1619735/logo.png" alt="Better Connections logo" width="64" height="64"><br>
<strong>Better Connections</strong><br>
<em>Connect your world.</em><br>
<br>
Based on <a href="https://modrinth.com/mod/betterwalls">BetterWalls</a> by Lemonnik6484 &amp; JX_Snack
</p>
