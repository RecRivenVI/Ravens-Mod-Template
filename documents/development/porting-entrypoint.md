# 入口移植

产品只有一个入口类，初始化时输出 `Raven's Mod Template loaded`。每个 Target 用自己加载器的原生 API 实现入口，不共享源码，也不使用条件编译（T-04）。

## 入口

| Target | 入口写法 |
| --- | --- |
| `1.20.1-forge` | `net.minecraftforge.fml.common.Mod` 注解，在无参构造函数中初始化 |
| `1.21.1-neoforge`、`26.1.2-neoforge`、`26.3-neoforge` | `net.neoforged.fml.common.Mod` 注解，在无参构造函数中初始化 |
| `26.3-fabric` | 实现 `net.fabricmc.api.ModInitializer`，在 `onInitialize` 中初始化；类名登记在 `fabric.mod.json` 的 `entrypoints.main` |

各入口都通过 SLF4J 输出日志，日志名取模组 ID。模组 ID 来自 `src/main/templates/` 中的 `ModIdentity`，它在编译前从 `mod_id` 展开，入口源码因此不写模组 ID。

## 元数据

| Target | 文件 | 与其他 Target 的差异 |
| --- | --- | --- |
| `1.20.1-forge` | `META-INF/mods.toml` | 需要 `modLoader` 与 `loaderVersion`；依赖用 `mandatory = true`；写 `displayTest`；另有 `pack.mcmeta` 声明资源包格式 |
| `1.21.1-neoforge` | `META-INF/neoforge.mods.toml` | 需要 `modLoader` 与 `loaderVersion`；依赖用 `type = "required"` |
| `26.1.2-neoforge`、`26.3-neoforge` | `META-INF/neoforge.mods.toml` | 不写 `modLoader` 与 `loaderVersion`；依赖用 `type = "required"` |
| `26.3-fabric` | `fabric.mod.json` | 依赖写在 `depends` 中；`environment` 决定运行端 |

版本要求与模组身份都用占位符从 `gradle.properties`、`target.properties` 与 Target 名称取值，字段对应见 [format-metadata](../reference/format-metadata.md)。
