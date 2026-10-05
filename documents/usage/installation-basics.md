# 安装

适用于 Minecraft Java 版 1.20.1 Forge、1.21.1 NeoForge、26.1.2 NeoForge、26.3 NeoForge 与 26.3 Fabric。

Raven's Mod Template 在游戏启动时写入一行日志 `Raven's Mod Template loaded`，不添加物品、方块或设置。你可以用它确认模组加载器工作正常。

## 选择文件

每个文件只适用于一种游戏版本和加载器：

| 游戏版本 | 加载器 | 文件 |
| --- | --- | --- |
| 1.20.1 | Forge 47.4.26 或更高 | `ravens_mod_template-1.20.1-forge-1.0.0.jar` |
| 1.21.1 | NeoForge 21.1.256 或更高 | `ravens_mod_template-1.21.1-neoforge-1.0.0.jar` |
| 26.1.2 | NeoForge 26.1.2.114 或更高 | `ravens_mod_template-26.1.2-neoforge-1.0.0.jar` |
| 26.3 | NeoForge 26.3.0.58-beta 或更高 | `ravens_mod_template-26.3-neoforge-1.0.0.jar` |
| 26.3 | Fabric Loader 0.19.5 或更高 | `ravens_mod_template-26.3-fabric-1.0.0.jar` |

## 安装步骤

1. 用启动器安装对应版本的加载器，并用它启动一次游戏。
2. 关闭游戏，打开游戏目录中的 `mods` 文件夹。
3. 把选好的文件放入 `mods` 文件夹，然后启动游戏。
4. 确认安装结果：
   - Forge 与 NeoForge：在主菜单点击 **模组**（Mods），列表中出现 Raven's Mod Template。
   - Fabric：游戏没有内置模组列表。打开游戏目录中的 `logs/latest.log`，能找到 `Raven's Mod Template loaded`。

## 在服务器上使用

客户端与服务器都需要安装同一个文件。服主把文件放入服务器目录的 `mods` 文件夹，然后重启服务器。
