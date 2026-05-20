
# AutoSprint Mod

## Description
AutoSprint is a Minecraft Fabric mod that adds an automatic sprinting feature. With this mod, you can toggle auto-sprint on and off with a single key press, allowing you to run continuously without holding down the sprint key.
## Features
- Toggle auto-sprint with the V key (default)
- Works correctly both on land and in water
- Automatically disables when sneaking
- Automatically disables when affected by blindness effect
- Compatible with Minecraft versions 1.16.x to 1.21.x


## Installation
1. Install [Fabric Loader](https://fabricmc.net/use/installer/)
2. Install [Fabric API](https://www.curseforge.com/minecraft/mc-mods/fabric-api) for your Minecraft version
3. Place the `autosprint-[version].jar` file in your `mods` folder
4. Launch Minecraft

## Building from Source

To build the mod from source:

1. Clone or download this repository
2. Make sure you have JDK 8+ installed
3. Navigate to the project directory
4. Run the command:
   ```
   ./gradlew build
   ```
   On Windows, you can also use:
   ```
   gradlew build
   ```
5. The compiled JAR file will be in the `build/libs/` directory

## Usage
- Press **V** (default key) to toggle auto-sprint on/off
- When auto-sprint is enabled, you will automatically sprint when moving forward
- Auto-sprint works on land and in water
- Auto-sprint automatically disables when you sneak or stop moving forward

## Configuration
The default toggle key is V, but this can be changed in the game's controls menu under the "AutoSprint" category.

## Compatibility
- Minecraft versions: 1.16.x - 1.21.x
- Requires Fabric Loader and Fabric API
- Should work alongside most other mods

## Troubleshooting
If you experience any issues:
1. Make sure you have the latest version of Fabric API installed
2. Try changing the keybind in the controls menu
3. Check that no other mods conflict with movement controls

## License
This mod is licensed under the MIT License.
