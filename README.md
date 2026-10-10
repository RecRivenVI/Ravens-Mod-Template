# Raven's Mod Template

Minecraft Java 版模组模板，在同一仓库中并列维护多个 Minecraft 版本与加载器的源码。它为编程 Agent 编写：带编号的仓库规范写在 [AGENTS.md](AGENTS.md)，Codex 直接读取，Claude Code 通过 `CLAUDE.md` 读取；随附的检查在本地与 GitHub Actions 中执行这些规则，并按规则编号报告每条发现。每个版本都可以在仓库内启动客户端、第二个多人客户端与独立服务端。模板自带的模组只在初始化时输出一行日志：

```text
Raven's Mod Template loaded
```

本仓库当前构建以下 Target。由模板创建的项目自行决定支持哪些版本，并按文档中的规程增删 Target。

| Target | 加载器版本 | Java |
| --- | --- | --- |
| `1.20.1-forge` | Forge 47.4.26 | 17 |
| `1.21.1-neoforge` | NeoForge 21.1.257 | 21 |
| `26.1.2-neoforge` | NeoForge 26.1.2.115 | 25 |
| `26.3-neoforge` | NeoForge 26.3.0.64-beta | 25 |
| `26.3-fabric` | Fabric Loader 0.19.5 | 25 |

## 快速开始

开始一个新模组时，用 GitHub 的 **Use this template** 按钮创建仓库，再按[由模板创建新模组](documents/development/procedure-derive_project.md)操作。

Gradle 守护进程需要 JDK 25，各 Target 所需的 JDK 由工具链自动选择或下载，其他工具都由 Gradle 下载。在仓库根目录执行：

```powershell
.\gradlew.bat check
.\gradlew.bat :version:26.3-neoforge:runClient
```

Unix 使用 `./gradlew`。构建产物位于 `versions/<target>/build/libs/`，文件名为 `ravens_mod_template-<target>-<version>.jar`。独立服务端只有在你阅读 [Minecraft EULA](https://aka.ms/MinecraftEULA)、接受后在仓库根目录的 `local.toml` 中写入 `eula = true` 之后才会运行。

## 文档

| 读者 | 入口 |
| --- | --- |
| 玩家 | [安装](documents/usage/installation-basics.md)、[更新日志](documents/release/changelog-v1.md) |
| 开发者 | [开发环境](documents/development/setup-environment.md)、[日常工作流程](documents/development/workflow-daily.md)、[由模板创建新模组](documents/development/procedure-derive_project.md)、[升级模板](documents/development/procedure-upgrade_template.md) |
| 工作原理 | [构建架构](documents/design/architecture-build.md)、[合规检查](documents/design/mechanism-compliance.md)、[配置参考](documents/reference/configuration-repository.md)、[验证格式](documents/reference/format-validation.md) |
| Agent | [AGENTS.md](AGENTS.md) |

## 许可

模板采用 [MIT 许可](LICENSE)，许可原文为英文。由模板创建的项目可以为自己的代码采用任何许可，来自模板的文件保留模板的 MIT 许可声明。第三方文件保留各自的许可，见 [NOTICE](NOTICE)。
